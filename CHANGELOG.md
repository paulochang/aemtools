# Changelog
All notable changes to this project will be documented in this file.

## [1.0.2]
[1.0.2]: https://github.com/aemtools/aemtools/tree/v1.0.2
### Maintenance
- Fix deprecated issues

## [1.0.1]
[1.0.1]: https://github.com/aemtools/aemtools/tree/v1.0.1
### New features
- Add support of 2023.2 IDEA versions

## [1.0.0]
[1.0.0]: https://github.com/aemtools/aemtools/tree/v1.0.0
### New features
- Add AEM SDK dependency to plugin suggestions
- Add inspection for missed "cq" namespace in files with that namespace
- Mark AEM FileVault namespaces schema url as known
- Add .cfg.json OSGi config support

## [0.9.5]
[0.9.5]: https://github.com/aemtools/aemtools/tree/v0.9.5
### New features
- Add support of 2023+ IDEA versions

## [0.9.4]
[0.9.4]: https://github.com/aemtools/aemtools/tree/v0.9.4
### Bug fixes
- [Startup version discovery issue with pom.xml](https://github.com/aemtools/aemtools/issues/231)
- [AEM Project Configuration issue with manually selected HTL version](https://github.com/aemtools/aemtools/issues/228)
- [HTL file type recognition inside read action](https://github.com/aemtools/aemtools/issues/229)
- [Jcr Property Injector injects wrong xml attribute value range](https://github.com/aemtools/aemtools/issues/230)
- [HTL: template/use file searching using in-memory file object](https://github.com/aemtools/aemtools/issues/225)
- [Client Library: cannot rename files into client library definition](https://github.com/aemtools/aemtools/issues/227)

## [0.9.3] 
[0.9.3]: https://github.com/aemtools/aemtools/tree/v0.9.3
### New features
- [HTL: Add support for 1.4 grammar](https://github.com/aemtools/aemtools/issues/173)
- [HTL: Add versioning of HTL](https://github.com/aemtools/aemtools/issues/171)

### Bug fixes
- [IDE: Mark directory as HTL root doesn't work](https://github.com/aemtools/aemtools/issues/214)
- [Fixed unary operator recognition in the EL context option expression](https://github.com/aemtools/aemtools/issues/218)
- [Fixed error with annotating variable in the declaration](https://github.com/aemtools/aemtools/issues/181)

## [0.9.2] - 2022-07-04
[0.9.2]: https://github.com/aemtools/aemtools/tree/v0.9.2
### New features
- [IDE: resolve OSGi configs for declarative services (OSGi R6-R7 annotations)](https://github.com/aemtools/aemtools/issues/84)
- [OSGi: add metadata validation of OSGi Felix component annotation](https://github.com/aemtools/aemtools/issues/174)
- [OSGi: add gutter icon for Felix Properties annotation](https://github.com/aemtools/aemtools/issues/166)
- [IDE: add absolute path completion for js.txt and css.txt](https://github.com/aemtools/aemtools/issues/165)
- [HTL: Add support for "/libs/granite/sightly/templates/clientlib.html"](https://github.com/aemtools/aemtools/issues/133)
- [HTL: Improve completion for WCM API component](https://github.com/aemtools/aemtools/issues/172)
- [IDE: support of component declaration files](https://github.com/aemtools/aemtools/issues/83)
- [Support: Error reporting](https://github.com/aemtools/aemtools/issues/139)
- [JCR Property Language syntax error](https://github.com/aemtools/aemtools/issues/209)

### Bug fixes
- [Blocks xml file copy operation](https://github.com/aemtools/aemtools/issues/189)
- [Unsynchronized list of OSGI configs when they removed/added](https://github.com/aemtools/aemtools/issues/151)
- [Fixed HTL map object completion wrapped in separate class](https://github.com/aemtools/aemtools/issues/194)

## [0.9.1-hot-fix]
### Bug fixes
* [Blocks xml file copy operation](https://github.com/aemtools/aemtools/issues/189)

## [0.9.1] - 2022-04-14
[0.9.1]: https://github.com/aemtools/aemtools/tree/v0.9.1
### New features
- [Add support of 2021.1+ IDEA versions](https://github.com/aemtools/aemtools/issues/182)
- [HTL: Improve completion for i18n expressions](https://github.com/aemtools/aemtools/issues/111)
- [IDE: Support of _rep_policy.xml files](https://github.com/aemtools/aemtools/issues/116)
- [IDE: Support of _cq_editConfig.xml files](https://github.com/aemtools/aemtools/issues/82)
### Bug fixes
- [js.txt & css.txt duplicated reference to a file](https://github.com/aemtools/aemtools/releases?page=1#167)
- [IntelliJ 2018.3: Icons of file type "HTL" in wrong size!](https://github.com/aemtools/aemtools/issues/179)
- [OSGI config isn't show if it naming contains suffix that starts with dot instead dash](https://github.com/aemtools/aemtools/issues/163)
### Maintenance
- [Increase test coverage in common module](https://github.com/aemtools/aemtools/issues/72)

## [0.9.0-pre-release] - 2018-12-04
[0.9.0-pre-release]: https://github.com/aemtools/aemtools/releases/tag/v0.9.0.1
### Bug fixes
* [IntelliJ 2018.3: Icons of file type "HTL" in wrong size! ](#179)

## [0.9.0] - 2018-05-04
[0.9.0]: https://github.com/aemtools/aemtools/releases/tag/v0.9
### New features
* [Inspections: AEM-1 & AEM-2](https://github.com/aemtools/aemtools/issues/148)
* [Inspections: Unnecessary expression inspection](https://github.com/aemtools/aemtools/issues/150)
* [IDE: resolve OSGi properties (Felix)](https://github.com/aemtools/aemtools/issues/104)
* [IDE: "Associated OSGi service" gutter icon in OSGi configuration files](https://github.com/aemtools/aemtools/issues/125)
* [HTL: data-sly-attribute with `style` and `on*` attributes inspection](https://github.com/aemtools/aemtools/issues/107)
* [HTL: Highlight escape sequences in string literals](https://github.com/aemtools/aemtools/issues/149)
* [IDE: HTML Markup Language Color Settings Page](https://github.com/aemtools/aemtools/issues/134)
* [HTL: Add special highlighting for template parameters](https://github.com/aemtools/aemtools/issues/126)
* [AEM General: advising x-cq-linkchecker attribute for 'a' HTML tag](https://github.com/aemtools/aemtools/issues/124)
* [HTL: "Wrong quotes" annotation & quick fix](https://github.com/aemtools/aemtools/issues/153)
### Bug fixes
* [HTL Syntax is highlighted inside commented-out code](https://github.com/aemtools/aemtools/issues/147)
* [HTL: Logical operation is not parsed in options](https://github.com/aemtools/aemtools/issues/130)
* [HTL: data-sly-use with parameters breaks type resolution](https://github.com/aemtools/aemtools/issues/127)
### Maintenance
* [common: add detekt code analyzer tool to the project](https://github.com/aemtools/aemtools/issues/119)
* [common: update GrammarKit version](https://github.com/aemtools/aemtools/issues/110)

## [0.8.1] - 2017-09-10
[0.8.1]: https://github.com/aemtools/aemtools/releases/tag/v0.8.1
### New features
* [IDE: make jcr_root directory configurable](https://github.com/DmytroTroynikov/aemtools/issues/115)
* [HTL: quick fix action for unresolved variable](https://github.com/DmytroTroynikov/aemtools/issues/108)
* [`WIP` HTL: improve completion for i18n expressions](https://github.com/DmytroTroynikov/aemtools/issues/111)

### Bug fixes
* [HTL: Disable HTL features in non HTL files](https://github.com/DmytroTroynikov/aemtools/issues/117)

## [0.8.0] - 2017-08-14
[0.8.0]: https://github.com/aemtools/aemtools/releases/tag/v0.8
### New features
* [HTL/HTML: Rename refactoring](https://github.com/DmytroTroynikov/aemtools/issues/55)
* [HTL: Improve completion relevance](https://github.com/DmytroTroynikov/aemtools/issues/59)
* [HTL: highlight unused variables](https://github.com/DmytroTroynikov/aemtools/issues/55)
* [IDE: Add Webstorm support](https://github.com/DmytroTroynikov/aemtools/issues/105)
* [HTL: propose jsp files for data-sly-include](https://github.com/DmytroTroynikov/aemtools/issues/103)

### Bug fixes
* [IDE: OSGi configurations for configuration factories aren't handled by plugin](https://github.com/DmytroTroynikov/aemtools/issues/95)
* [HTML: Cannot resolve model class](https://github.com/DmytroTroynikov/aemtools/issues/96)
* [HTL: Incorrect grammar recognition within ternary operator](https://github.com/DmytroTroynikov/aemtools/issues/106)

## [0.7.0] - 2017-05-24
[0.7.0]: https://github.com/aemtools/aemtools/releases/tag/v0.7-rc1
### New features
*  [HTL: Resolve component's properties](https://github.com/DmytroTroynikov/aemtools/issues/4)
*  [HTL: References to component's properties](https://github.com/DmytroTroynikov/aemtools/issues/90)
*  [HTL: data-sly-call resolve imported templates](https://github.com/DmytroTroynikov/aemtools/issues/69)
*  [IDE: completion for js.txt & css.txt](https://github.com/DmytroTroynikov/aemtools/issues/77)
*  [IDE: reference resolution for js.txt & css.txt](https://github.com/DmytroTroynikov/aemtools/issues/75)
*  [HTL: Add structure view](https://github.com/DmytroTroynikov/aemtools/issues/74)
*  [IDE: resolve OSGi configs (Felix)](https://github.com/DmytroTroynikov/aemtools/issues/76)
*  [HTL: data-sly-resource reference resolution](https://github.com/DmytroTroynikov/aemtools/issues/86)
*  [HTL: data-sly-resource completion](https://github.com/DmytroTroynikov/aemtools/issues/30)
*  [HTL: data-sly-resource quick doc action](https://github.com/DmytroTroynikov/aemtools/issues/87)
*  [HTL: improve word selection inside of Htl string literals](https://github.com/DmytroTroynikov/aemtools/issues/88)

## [0.6.2] - 2017-05-07
[0.6.2]: https://github.com/aemtools/aemtools/releases/tag/v0.6.2
### New features
*  [IDE: completion for js.txt & css.txt](https://github.com/DmytroTroynikov/aemtools/issues/77)
*  [IDE: reference resolution for js.txt & css.txt](https://github.com/DmytroTroynikov/aemtools/issues/75)
*  [HTL: Add structure view](https://github.com/DmytroTroynikov/aemtools/issues/74)
*  [WIP: IDE: resolve OSGi configs](https://github.com/DmytroTroynikov/aemtools/issues/76)

## [0.6.1] - 2017-04-03
[0.6.1]: https://github.com/aemtools/aemtools/releases/tag/v0.6.1
### New features
- [HTL: Inspection: data-sly-include unnecessary EL](https://github.com/DmytroTroynikov/aemtools/issues/65)
- [HTL: Inspection: data-sly-use unnecessary EL](https://github.com/DmytroTroynikov/aemtools/issues/56)
- [HTL: data-sly-include resolve file name in EL](https://github.com/DmytroTroynikov/aemtools/issues/67)
- [HTL: data-sly-use resolve file name in EL](https://github.com/DmytroTroynikov/aemtools/issues/68)
### Bug fixes
- [HTL: Parser error on ternary operation with logical expression with more than 2 elements](https://github.com/DmytroTroynikov/aemtools/issues/64)
- [HTL: Context values completion doesn't work within an attribute](https://github.com/aemtools/aemtools/issues/66)
