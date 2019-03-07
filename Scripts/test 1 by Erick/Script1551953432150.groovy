import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.costco.co.uk/')

WebUI.click(findTestObject('Object Repository/Page_Join the club  start saving  C/a_Membership'))

WebUI.click(findTestObject('Object Repository/Page_Costco UK Online Only Annual S/img'))

WebUI.click(findTestObject('Object Repository/Page_Costco Membership  Online Only/span_Step 1Membership Privileg'))

WebUI.click(findTestObject('Object Repository/Page_Costco Membership  Online Only/button_Continue to Sign Up'))

WebUI.setText(findTestObject('Object Repository/Page_Costco Membership  Online Only/input_First Name_firstName'), 'Jose')

WebUI.setText(findTestObject('Object Repository/Page_Costco Membership  Online Only/input_Last Name_lastName'), 'Perez')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Costco Membership  Online Only/select_GenderMaleFemaleNot Spe'), 
    'MALE', true)

WebUI.setText(findTestObject('Object Repository/Page_Costco Membership  Online Only/input_Postal Code_postalCode'), 'WC2N 5DU')

WebUI.click(findTestObject('Object Repository/Page_Costco Membership  Online Only/button_Find Address'))

WebUI.setText(findTestObject('Object Repository/Page_Costco Membership  Online Only/input_Email_email'), 'joseperez@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Costco Membership  Online Only/input_Confirm Email_emailConfi'), 'joseperez@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Costco Membership  Online Only/input_Password_password'), 
    'gwzJAdjefrq/vnF0wqqVMg==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Costco Membership  Online Only/input_Confirm Password_passwor'), 
    'gwzJAdjefrq/vnF0wqqVMg==')

WebUI.setText(findTestObject('Object Repository/Page_Costco Membership  Online Only/input_Mobile Phone_mobilePhone'), '00441254375')

WebUI.click(findTestObject('Object Repository/Page_Costco Membership  Online Only/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Cart/span_Remove'))

WebUI.click(findTestObject('Object Repository/Page_Cart/img'))

WebUI.closeBrowser()

