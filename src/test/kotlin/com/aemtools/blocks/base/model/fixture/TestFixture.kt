package com.aemtools.blocks.base.model.fixture

import com.aemtools.blocks.base.model.IFileFixtureDescriptor
import com.aemtools.blocks.base.model.JavaClassFileFixtureDescriptor
import com.aemtools.blocks.base.model.TextFileFixtureDescriptor
import com.aemtools.blocks.base.model.assertion.AssertionContext
import com.aemtools.blocks.base.model.assertion.IAssertionContext
import com.intellij.testFramework.fixtures.JavaCodeInsightTestFixture
import java.util.*

/**
 * @author Dmytro Troynikov
 */
open class TestFixture(val fixture: JavaCodeInsightTestFixture)
    : ITestFixture, ITestFixtureInternal{
    override fun assertionContext(): IAssertionContext {
        checkInitialized()
        return AssertionContext(fixture)
    }
    protected val files: ArrayList<IFileFixtureDescriptor> = ArrayList()
    protected var verificationFunction: IAssertionContext.() -> Unit = {}
    protected var initialized: Boolean = false

    override fun verify(verification: IAssertionContext.() -> Unit) {
        verificationFunction = verification
    }

    override fun test() {
        checkInitialized()

        verificationFunction.invoke(assertionContext())
    }

    override fun init() {
        initialized = true
        files.forEach { it.initialize() }
    }

    override fun addHtml(name: String, text: String) {
        files.add(TextFileFixtureDescriptor(name, text, fixture))
    }

    override fun addClass(name: String, text: String) {
        files.add(JavaClassFileFixtureDescriptor(name, text, fixture))
    }

    protected fun checkInitialized() {
        assert(initialized, {"Current fixture is not initialized"})
    }
}