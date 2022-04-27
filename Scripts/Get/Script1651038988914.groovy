import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.nio.file.WatchService

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper


ResponseObject createPatientResponse = WS.sendRequest(findTestObject('Get_Request'))

WS.verifyResponseStatusCode(createPatientResponse, 200)


String ID = WS.getElementPropertyValue(createPatientResponse, 'support.url')


//test