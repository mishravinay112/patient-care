var isCompatible=function(){if(navigator.appVersion.indexOf('MSIE')!==-1&&parseFloat(navigator.appVersion.split('MSIE')[1])<6){return false;}return true;};var startUp=function(){mw.config=new mw.Map(true);mw.loader.addSource({"local":{"loadScript":"/load.php","apiScript":"/api.php"}});mw.loader.register([["site","1406752232",[],"site"],["noscript","1406752232",[],"noscript"],["startup","1475151728",[],"startup"],["user","1406752232",[],"user"],["user.groups","1406752232",[],"user"],["user.options","1475151728",[],"private"],["user.cssprefs","1475151728",["mediawiki.user"],"private"],["user.tokens","1406752232",[],"private"],["filepage","1406752232",[]],["skins.chick","1406752232",[]],["skins.cologneblue","1406752232",[]],["skins.modern","1406752232",[]],["skins.monobook","1406752232",[]],["skins.nostalgia","1406752232",[]],["skins.simple","1406752232",[]],["skins.standard","1406752232",[]],["skins.vector","1406752232",[]],["jquery","1406752232",[]],["jquery.appear","1406752232",[]],[
"jquery.arrowSteps","1406752232",[]],["jquery.async","1406752232",[]],["jquery.autoEllipsis","1406752232",["jquery.highlightText"]],["jquery.byteLength","1406752232",[]],["jquery.byteLimit","1406752232",["jquery.byteLength"]],["jquery.checkboxShiftClick","1406752232",[]],["jquery.client","1406752232",[]],["jquery.collapsibleTabs","1406752232",[]],["jquery.color","1406752232",["jquery.colorUtil"]],["jquery.colorUtil","1406752232",[]],["jquery.cookie","1406752232",[]],["jquery.delayedBind","1406752232",[]],["jquery.expandableField","1406752232",["jquery.delayedBind"]],["jquery.farbtastic","1406752232",["jquery.colorUtil"]],["jquery.footHovzer","1406752232",[]],["jquery.form","1406752232",[]],["jquery.getAttrs","1406752232",[]],["jquery.highlightText","1406752232",[]],["jquery.hoverIntent","1406752232",[]],["jquery.json","1406752232",[]],["jquery.localize","1406752232",[]],["jquery.makeCollapsible","1406752434",[]],["jquery.messageBox","1406752232",[]],["jquery.mockjax","1406752232",[]],[
"jquery.mw-jump","1406752232",[]],["jquery.mwExtension","1406752232",[]],["jquery.placeholder","1406752232",[]],["jquery.qunit","1406752232",[]],["jquery.qunit.completenessTest","1406752232",["jquery.qunit"]],["jquery.spinner","1406752232",[]],["jquery.suggestions","1406752232",["jquery.autoEllipsis"]],["jquery.tabIndex","1406752232",[]],["jquery.tablesorter","1406752232",[]],["jquery.textSelection","1406752232",[]],["jquery.validate","1406752232",[]],["jquery.xmldom","1406752232",[]],["jquery.tipsy","1406752232",[]],["jquery.ui.core","1406752232",["jquery"],"jquery.ui"],["jquery.ui.widget","1406752232",[],"jquery.ui"],["jquery.ui.mouse","1406752232",["jquery.ui.widget"],"jquery.ui"],["jquery.ui.position","1406752232",[],"jquery.ui"],["jquery.ui.draggable","1406752232",["jquery.ui.core","jquery.ui.mouse","jquery.ui.widget"],"jquery.ui"],["jquery.ui.droppable","1406752232",["jquery.ui.core","jquery.ui.mouse","jquery.ui.widget","jquery.ui.draggable"],"jquery.ui"],["jquery.ui.resizable",
"1406752232",["jquery.ui.core","jquery.ui.widget","jquery.ui.mouse"],"jquery.ui"],["jquery.ui.selectable","1406752232",["jquery.ui.core","jquery.ui.widget","jquery.ui.mouse"],"jquery.ui"],["jquery.ui.sortable","1406752232",["jquery.ui.core","jquery.ui.widget","jquery.ui.mouse"],"jquery.ui"],["jquery.ui.accordion","1406752232",["jquery.ui.core","jquery.ui.widget"],"jquery.ui"],["jquery.ui.autocomplete","1406752232",["jquery.ui.core","jquery.ui.widget","jquery.ui.position"],"jquery.ui"],["jquery.ui.button","1406752232",["jquery.ui.core","jquery.ui.widget"],"jquery.ui"],["jquery.ui.datepicker","1406752232",["jquery.ui.core"],"jquery.ui"],["jquery.ui.dialog","1406752232",["jquery.ui.core","jquery.ui.widget","jquery.ui.button","jquery.ui.draggable","jquery.ui.mouse","jquery.ui.position","jquery.ui.resizable"],"jquery.ui"],["jquery.ui.progressbar","1406752232",["jquery.ui.core","jquery.ui.widget"],"jquery.ui"],["jquery.ui.slider","1406752232",["jquery.ui.core","jquery.ui.widget",
"jquery.ui.mouse"],"jquery.ui"],["jquery.ui.tabs","1406752232",["jquery.ui.core","jquery.ui.widget"],"jquery.ui"],["jquery.effects.core","1406752232",["jquery"],"jquery.ui"],["jquery.effects.blind","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.bounce","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.clip","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.drop","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.explode","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.fade","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.fold","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.highlight","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.pulsate","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.scale","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.shake","1406752232",["jquery.effects.core"],"jquery.ui"],[
"jquery.effects.slide","1406752232",["jquery.effects.core"],"jquery.ui"],["jquery.effects.transfer","1406752232",["jquery.effects.core"],"jquery.ui"],["mediawiki","1406752232",[]],["mediawiki.api","1406752232",["mediawiki.util"]],["mediawiki.api.category","1406752232",["mediawiki.api","mediawiki.Title"]],["mediawiki.api.edit","1406752232",["mediawiki.api","mediawiki.Title"]],["mediawiki.api.parse","1406752232",["mediawiki.api"]],["mediawiki.api.titleblacklist","1406752232",["mediawiki.api","mediawiki.Title"]],["mediawiki.api.watch","1406752232",["mediawiki.api","mediawiki.user"]],["mediawiki.debug","1406752232",["jquery.footHovzer"]],["mediawiki.debug.init","1406752232",["mediawiki.debug"]],["mediawiki.feedback","1406752232",["mediawiki.api.edit","mediawiki.Title","mediawiki.jqueryMsg","jquery.ui.dialog"]],["mediawiki.htmlform","1406752232",[]],["mediawiki.Title","1406752232",["mediawiki.util"]],["mediawiki.Uri","1406752232",[]],["mediawiki.user","1406752232",["jquery.cookie"]],[
"mediawiki.util","1406752434",["jquery.client","jquery.cookie","jquery.messageBox","jquery.mwExtension"]],["mediawiki.action.edit","1406752232",["jquery.textSelection","jquery.byteLimit"]],["mediawiki.action.history","1406752232",["jquery.ui.button"],"mediawiki.action.history"],["mediawiki.action.history.diff","1406752232",[],"mediawiki.action.history"],["mediawiki.action.view.dblClickEdit","1406752232",["mediawiki.util"]],["mediawiki.action.view.metadata","1412551531",[]],["mediawiki.action.view.rightClickEdit","1406752232",[]],["mediawiki.action.watch.ajax","1406841636",["mediawiki.api.watch","mediawiki.util"]],["mediawiki.language","1406752232",[]],["mediawiki.jqueryMsg","1406752232",["mediawiki.language","mediawiki.util"]],["mediawiki.libs.jpegmeta","1406752232",[]],["mediawiki.page.ready","1406752232",["jquery.checkboxShiftClick","jquery.makeCollapsible","jquery.placeholder","jquery.mw-jump","mediawiki.util"]],["mediawiki.page.startup","1406752232",["jquery.client",
"mediawiki.util"]],["mediawiki.special","1406752232",[]],["mediawiki.special.block","1406752232",["mediawiki.util"]],["mediawiki.special.changeemail","1407492159",["mediawiki.util"]],["mediawiki.special.changeslist","1406752232",["jquery.makeCollapsible"]],["mediawiki.special.movePage","1406752232",["jquery.byteLimit"]],["mediawiki.special.preferences","1406752232",[]],["mediawiki.special.recentchanges","1406752232",["mediawiki.special"]],["mediawiki.special.search","1406752232",[]],["mediawiki.special.undelete","1406752232",[]],["mediawiki.special.upload","1433173984",["mediawiki.libs.jpegmeta","mediawiki.util"]],["mediawiki.special.javaScriptTest","1406752232",["jquery.qunit"]],["mediawiki.tests.qunit.testrunner","1406752232",["jquery.qunit","jquery.qunit.completenessTest","mediawiki.page.startup","mediawiki.page.ready"]],["mediawiki.legacy.ajax","1406752232",["mediawiki.util","mediawiki.legacy.wikibits"]],["mediawiki.legacy.commonPrint","1406752232",[]],["mediawiki.legacy.config",
"1406752232",["mediawiki.legacy.wikibits"]],["mediawiki.legacy.IEFixes","1406752232",["mediawiki.legacy.wikibits"]],["mediawiki.legacy.mwsuggest","1406752232",["mediawiki.legacy.wikibits"]],["mediawiki.legacy.preview","1406752232",["mediawiki.legacy.wikibits"]],["mediawiki.legacy.protect","1406752232",["mediawiki.legacy.wikibits","jquery.byteLimit"]],["mediawiki.legacy.shared","1406752232",[]],["mediawiki.legacy.oldshared","1406752232",[]],["mediawiki.legacy.upload","1406752232",["mediawiki.legacy.wikibits","mediawiki.util"]],["mediawiki.legacy.wikibits","1406752232",["mediawiki.util"]],["mediawiki.legacy.wikiprintable","1406752232",[]]]);mw.config.set({"wgLoadScript":"/load.php","debug":false,"skin":"monobook","stylepath":"/skins","wgUrlProtocols":"http\\:\\/\\/|https\\:\\/\\/|ftp\\:\\/\\/|irc\\:\\/\\/|ircs\\:\\/\\/|gopher\\:\\/\\/|telnet\\:\\/\\/|nntp\\:\\/\\/|worldwind\\:\\/\\/|mailto\\:|news\\:|svn\\:\\/\\/|git\\:\\/\\/|mms\\:\\/\\/|\\/\\/","wgArticlePath":"/index.php/$1",
"wgScriptPath":"","wgScriptExtension":".php","wgScript":"/index.php","wgVariantArticlePath":false,"wgActionPaths":{},"wgServer":"http://www.vistapedia.com","wgUserLanguage":"en","wgContentLanguage":"en","wgVersion":"1.19.0","wgEnableAPI":true,"wgEnableWriteAPI":true,"wgDefaultDateFormat":"dmy","wgMonthNames":["","January","February","March","April","May","June","July","August","September","October","November","December"],"wgMonthNamesShort":["","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"],"wgMainPageTitle":"Main Page","wgFormattedNamespaces":{"-2":"Media","-1":"Special","0":"","1":"Talk","2":"User","3":"User talk","4":"VistApedia","5":"VistApedia talk","6":"File","7":"File talk","8":"MediaWiki","9":"MediaWiki talk","10":"Template","11":"Template talk","12":"Help","13":"Help talk","14":"Category","15":"Category talk"},"wgNamespaceIds":{"media":-2,"special":-1,"":0,"talk":1,"user":2,"user_talk":3,"vistapedia":4,"vistapedia_talk":5,"file":6,"file_talk":7,
"mediawiki":8,"mediawiki_talk":9,"template":10,"template_talk":11,"help":12,"help_talk":13,"category":14,"category_talk":15,"image":6,"image_talk":7,"project":4,"project_talk":5},"wgSiteName":"VistApedia","wgFileExtensions":["png","gif","jpg","jpeg"],"wgDBname":"vistapedia","wgFileCanRotate":true,"wgAvailableSkins":{"nostalgia":"Nostalgia","chick":"Chick","standard":"Standard","cologneblue":"CologneBlue","modern":"Modern","simple":"Simple","myskin":"MySkin","vector":"Vector","monobook":"MonoBook"},"wgExtensionAssetsPath":"/extensions","wgCookiePrefix":"vistapedia","wgResourceLoaderMaxQueryLength":-1,"wgCaseSensitiveNamespaces":[]});};if(isCompatible()){document.write("\x3cscript src=\"/load.php?debug=false\x26amp;lang=en\x26amp;modules=jquery%2Cmediawiki\x26amp;only=scripts\x26amp;skin=monobook\x26amp;version=20130131T221009Z\"\x3e\x3c/script\x3e");}delete isCompatible;;

/* cache key: vistapedia:resourceloader:filter:minify-js:7:d492d34f86a269a1145a6c27daeba72e */
