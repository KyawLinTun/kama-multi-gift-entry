import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startExistingApplication('kama.co.jp.user.alpha')

Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), 'userlite@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView -  Password'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (1)'), 'Yayoi2020#', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - LOGIN (1)'), 0)

//tap gift entry
Mobile.tap(findTestObject('Object Repository/android.widget.TextView - 20220905'), 0)
Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (1)'), 0)
Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (2)'), 0)
Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)
//tap gift entry
Mobile.tap(findTestObject('Object Repository/MultiGiftEntry/android.widget.TextView - 20220906'), 0)
Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (1)'), 0)
Mobile.tap(findTestObject('Object Repository/android.view.ViewGroup (2)'), 0)
Mobile.tap(findTestObject('Object Repository/android.widget.Button - OK'), 0)


//Logout
Mobile.tap(findTestObject('Object Repository/MultiGiftEntry/android.widget.TextView - Account'), 0)
Mobile.tap(findTestObject('Object Repository/MultiGiftEntry/android.widget.TextView - Logout'), 0)

Mobile.closeApplication()

