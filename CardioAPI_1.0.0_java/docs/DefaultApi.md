# DefaultApi

All URIs are relative to *https://gateway.dev.nubentos.com/nubentos.com/cardioapi/0.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ascvdGet**](DefaultApi.md#ascvdGet) | **GET** /ascvd | Risk of atherosclerotic cardiovascular disease.


<a name="ascvdGet"></a>
# **ascvdGet**
> ResultIrc ascvdGet(age, gender, systolic, totalCholesterol, hdl, diabetic, smoker, hypertensive, race)

Risk of atherosclerotic cardiovascular disease.

### Example
```java
// Import classes:
//import org.wso2.client.api.ApiException;
//import org.wso2.client.api.CardioAPI.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer age = 56; // Integer | Current Age, enter a value between 20-79 years
String gender = "gender_example"; // String | Gender:  * male.  * female. 
Integer systolic = 56; // Integer | Systolic Blood Pressure (mm Hg) : Value must be between 90-200
String totalCholesterol = "totalCholesterol_example"; // String | Total Cholesterol (mmol/L) : Value must be between 130 - 320
Integer hdl = 56; // Integer | HDL Cholesterol (mmol/L) : Value must be between 20 - 100
Boolean diabetic = true; // Boolean | History of Diabetes? : True | False
Boolean smoker = true; // Boolean | Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row. 
Boolean hypertensive = true; // Boolean | On Hypertension Treatment?   * True   * False
String race = "race_example"; // String | Race  * White (white)  *  African American (aa)
try {
    ResultIrc result = apiInstance.ascvdGet(age, gender, systolic, totalCholesterol, hdl, diabetic, smoker, hypertensive, race);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ascvdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **age** | **Integer**| Current Age, enter a value between 20-79 years |
 **gender** | **String**| Gender:  * male.  * female.  | [enum: male, female]
 **systolic** | **Integer**| Systolic Blood Pressure (mm Hg) : Value must be between 90-200 |
 **totalCholesterol** | **String**| Total Cholesterol (mmol/L) : Value must be between 130 - 320 |
 **hdl** | **Integer**| HDL Cholesterol (mmol/L) : Value must be between 20 - 100 |
 **diabetic** | **Boolean**| History of Diabetes? : True | False | [optional]
 **smoker** | **Boolean**| Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row.  | [optional]
 **hypertensive** | **Boolean**| On Hypertension Treatment?   * True   * False | [optional]
 **race** | **String**| Race  * White (white)  *  African American (aa) | [optional] [enum: white, aa]

### Return type

[**ResultIrc**](ResultIrc.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

