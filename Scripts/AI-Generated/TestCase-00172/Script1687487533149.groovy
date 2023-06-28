import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_javascript:alert(1)'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/javascript:alert(1)')

'step 2: Add visual checkpoint at Page_javascript:alert(1)'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00172_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
