package com.aemtools.lang.jcrproperty.colorscheme

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors as dc
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey as r

/**
 * @author Dmytro Primshyts
 */
object JpColors {
  val TYPE = r("JP_TYPE", dc.STATIC_FIELD)
  val DELIMITER = r("JP_DELIMITER", dc.COMMA)
  val BRACES = r("JP_BRACES", dc.STATIC_FIELD)
  val BRACKETS = r("JP_BRACKETS", dc.COMMA)
  val VALUE = r("JP_VALUE", dc.STRING)
}
