# org.wso2.client.CardioAPI

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.wso2</groupId>
    <artifactId>org.wso2.client.CardioAPI</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.wso2:org.wso2.client.CardioAPI:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/org.wso2.client.CardioAPI-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.wso2.client.api.*;
import org.wso2.client.api.auth.*;
import org.wso2.client.api.model.*;
import org.wso2.client.api.CardioAPI.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://apigw.nubentos.com/t/nubentos.com/cardioapi/0.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**ascvdGet**](docs/DefaultApi.md#ascvdGet) | **GET** /ascvd | Risk of atherosclerotic cardiovascular disease.


## Documentation for Models

 - [ResultIrc](docs/ResultIrc.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



