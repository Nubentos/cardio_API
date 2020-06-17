# Cardioapi.DefaultApi

All URIs are relative to *https://apigw.nubentos.com/t/nubentos.com/cardioapi/0.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ascvdGet**](DefaultApi.md#ascvdGet) | **GET** /ascvd | Risk of atherosclerotic cardiovascular disease.


<a name="ascvdGet"></a>
# **ascvdGet**
> ResultIrc ascvdGet(age, gender, systolic, totalCholesterol, hdl, opts)

Risk of atherosclerotic cardiovascular disease.

### Example
```javascript
var Cardioapi = require('cardioapi');

var apiInstance = new Cardioapi.DefaultApi();

var age = 56; // Integer | Current Age, enter a value between 20-79 years

var gender = "gender_example"; // String | Gender:  * male.  * female. 

var systolic = 56; // Integer | Systolic Blood Pressure (mm Hg) : Value must be between 90-200

var totalCholesterol = "totalCholesterol_example"; // String | Total Cholesterol (mmol/L) : Value must be between 130 - 320

var hdl = 56; // Integer | HDL Cholesterol (mmol/L) : Value must be between 20 - 100

var opts = { 
  'diabetic': true, // Boolean | History of Diabetes? : True | False
  'smoker': true, // Boolean | Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row. 
  'hypertensive': true, // Boolean | On Hypertension Treatment?   * True   * False
  'race': "race_example" // String | Race  * White (white)  *  African American (aa)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.ascvdGet(age, gender, systolic, totalCholesterol, hdl, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **age** | **Integer**| Current Age, enter a value between 20-79 years | 
 **gender** | **String**| Gender:  * male.  * female.  | 
 **systolic** | **Integer**| Systolic Blood Pressure (mm Hg) : Value must be between 90-200 | 
 **totalCholesterol** | **String**| Total Cholesterol (mmol/L) : Value must be between 130 - 320 | 
 **hdl** | **Integer**| HDL Cholesterol (mmol/L) : Value must be between 20 - 100 | 
 **diabetic** | **Boolean**| History of Diabetes? : True | False | [optional] 
 **smoker** | **Boolean**| Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row.  | [optional] 
 **hypertensive** | **Boolean**| On Hypertension Treatment?   * True   * False | [optional] 
 **race** | **String**| Race  * White (white)  *  African American (aa) | [optional] 

### Return type

[**ResultIrc**](ResultIrc.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

