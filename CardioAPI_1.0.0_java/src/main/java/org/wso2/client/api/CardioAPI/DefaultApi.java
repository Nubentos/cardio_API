/*
 * CARDIOAPI
 * Cardio API is a risk calculator API intended to help users find an estimate for their cardiovascular risk according to the 2013 ACC/AHA Guideline on the Assessment of Cardiovascular Risk and the 2013 ACC/AHA Guideline on the Treatment of Blood Cholesterol to Reduce Atherosclerotic Cardiovascular Risk in Adults. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.client.api.CardioAPI;

import org.wso2.client.api.ApiCallback;
import org.wso2.client.api.ApiClient;
import org.wso2.client.api.ApiException;
import org.wso2.client.api.ApiResponse;
import org.wso2.client.api.Configuration;
import org.wso2.client.api.Pair;
import org.wso2.client.api.ProgressRequestBody;
import org.wso2.client.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.client.model.CardioAPI.ResultIrc;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for ascvdGet
     * @param age Current Age, enter a value between 20-79 years (required)
     * @param gender Gender:  * male.  * female.  (required)
     * @param systolic Systolic Blood Pressure (mm Hg) : Value must be between 90-200 (required)
     * @param totalCholesterol Total Cholesterol (mmol/L) : Value must be between 130 - 320 (required)
     * @param hdl HDL Cholesterol (mmol/L) : Value must be between 20 - 100 (required)
     * @param diabetic History of Diabetes? : True | False (optional)
     * @param smoker Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row.  (optional)
     * @param hypertensive On Hypertension Treatment?   * True   * False (optional)
     * @param race Race  * White (white)  *  African American (aa) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ascvdGetCall(Integer age, String gender, Integer systolic, String totalCholesterol, Integer hdl, Boolean diabetic, Boolean smoker, Boolean hypertensive, String race, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ascvd";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (age != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "age", age));
        if (gender != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "gender", gender));
        if (systolic != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "systolic", systolic));
        if (totalCholesterol != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "total_cholesterol", totalCholesterol));
        if (hdl != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "hdl", hdl));
        if (diabetic != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "diabetic", diabetic));
        if (smoker != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "smoker", smoker));
        if (hypertensive != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "hypertensive", hypertensive));
        if (race != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "race", race));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ascvdGetValidateBeforeCall(Integer age, String gender, Integer systolic, String totalCholesterol, Integer hdl, Boolean diabetic, Boolean smoker, Boolean hypertensive, String race, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'age' is set
        if (age == null) {
            throw new ApiException("Missing the required parameter 'age' when calling ascvdGet(Async)");
        }
        
        // verify the required parameter 'gender' is set
        if (gender == null) {
            throw new ApiException("Missing the required parameter 'gender' when calling ascvdGet(Async)");
        }
        
        // verify the required parameter 'systolic' is set
        if (systolic == null) {
            throw new ApiException("Missing the required parameter 'systolic' when calling ascvdGet(Async)");
        }
        
        // verify the required parameter 'totalCholesterol' is set
        if (totalCholesterol == null) {
            throw new ApiException("Missing the required parameter 'totalCholesterol' when calling ascvdGet(Async)");
        }
        
        // verify the required parameter 'hdl' is set
        if (hdl == null) {
            throw new ApiException("Missing the required parameter 'hdl' when calling ascvdGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = ascvdGetCall(age, gender, systolic, totalCholesterol, hdl, diabetic, smoker, hypertensive, race, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Risk of atherosclerotic cardiovascular disease.
     * 
     * @param age Current Age, enter a value between 20-79 years (required)
     * @param gender Gender:  * male.  * female.  (required)
     * @param systolic Systolic Blood Pressure (mm Hg) : Value must be between 90-200 (required)
     * @param totalCholesterol Total Cholesterol (mmol/L) : Value must be between 130 - 320 (required)
     * @param hdl HDL Cholesterol (mmol/L) : Value must be between 20 - 100 (required)
     * @param diabetic History of Diabetes? : True | False (optional)
     * @param smoker Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row.  (optional)
     * @param hypertensive On Hypertension Treatment?   * True   * False (optional)
     * @param race Race  * White (white)  *  African American (aa) (optional)
     * @return ResultIrc
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResultIrc ascvdGet(Integer age, String gender, Integer systolic, String totalCholesterol, Integer hdl, Boolean diabetic, Boolean smoker, Boolean hypertensive, String race) throws ApiException {
        ApiResponse<ResultIrc> resp = ascvdGetWithHttpInfo(age, gender, systolic, totalCholesterol, hdl, diabetic, smoker, hypertensive, race);
        return resp.getData();
    }

    /**
     * Risk of atherosclerotic cardiovascular disease.
     * 
     * @param age Current Age, enter a value between 20-79 years (required)
     * @param gender Gender:  * male.  * female.  (required)
     * @param systolic Systolic Blood Pressure (mm Hg) : Value must be between 90-200 (required)
     * @param totalCholesterol Total Cholesterol (mmol/L) : Value must be between 130 - 320 (required)
     * @param hdl HDL Cholesterol (mmol/L) : Value must be between 20 - 100 (required)
     * @param diabetic History of Diabetes? : True | False (optional)
     * @param smoker Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row.  (optional)
     * @param hypertensive On Hypertension Treatment?   * True   * False (optional)
     * @param race Race  * White (white)  *  African American (aa) (optional)
     * @return ApiResponse&lt;ResultIrc&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResultIrc> ascvdGetWithHttpInfo(Integer age, String gender, Integer systolic, String totalCholesterol, Integer hdl, Boolean diabetic, Boolean smoker, Boolean hypertensive, String race) throws ApiException {
        com.squareup.okhttp.Call call = ascvdGetValidateBeforeCall(age, gender, systolic, totalCholesterol, hdl, diabetic, smoker, hypertensive, race, null, null);
        Type localVarReturnType = new TypeToken<ResultIrc>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Risk of atherosclerotic cardiovascular disease. (asynchronously)
     * 
     * @param age Current Age, enter a value between 20-79 years (required)
     * @param gender Gender:  * male.  * female.  (required)
     * @param systolic Systolic Blood Pressure (mm Hg) : Value must be between 90-200 (required)
     * @param totalCholesterol Total Cholesterol (mmol/L) : Value must be between 130 - 320 (required)
     * @param hdl HDL Cholesterol (mmol/L) : Value must be between 20 - 100 (required)
     * @param diabetic History of Diabetes? : True | False (optional)
     * @param smoker Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row.  (optional)
     * @param hypertensive On Hypertension Treatment?   * True   * False (optional)
     * @param race Race  * White (white)  *  African American (aa) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ascvdGetAsync(Integer age, String gender, Integer systolic, String totalCholesterol, Integer hdl, Boolean diabetic, Boolean smoker, Boolean hypertensive, String race, final ApiCallback<ResultIrc> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = ascvdGetValidateBeforeCall(age, gender, systolic, totalCholesterol, hdl, diabetic, smoker, hypertensive, race, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultIrc>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
