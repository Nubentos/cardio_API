/**
 * CARDIOAPI
 * Cardio API is a risk calculator API intended to help users find an estimate for their cardiovascular risk according to the 2013 ACC/AHA Guideline on the Assessment of Cardiovascular Risk and the 2013 ACC/AHA Guideline on the Treatment of Blood Cholesterol to Reduce Atherosclerotic Cardiovascular Risk in Adults. 
 *
 * OpenAPI spec version: 1.0.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: unset
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'org.wso2.client.model.CardioAPI/ResultIrc'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../org.wso2.client.model.CardioAPI/ResultIrc'));
  } else {
    // Browser globals (root is window)
    if (!root.Cardioapi) {
      root.Cardioapi = {};
    }
    root.Cardioapi.DefaultApi = factory(root.Cardioapi.ApiClient, root.Cardioapi.ResultIrc);
  }
}(this, function(ApiClient, ResultIrc) {
  'use strict';

  /**
   * Default service.
   * @module org.wso2.client.api.CardioAPI/DefaultApi
   * @version 1.0.0
   */

  /**
   * Constructs a new DefaultApi. 
   * @alias module:org.wso2.client.api.CardioAPI/DefaultApi
   * @class
   * @param {module:ApiClient} apiClient Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the ascvdGet operation.
     * @callback module:org.wso2.client.api.CardioAPI/DefaultApi~ascvdGetCallback
     * @param {String} error Error message, if any.
     * @param {module:org.wso2.client.model.CardioAPI/ResultIrc} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Risk of atherosclerotic cardiovascular disease.
     * @param {Number} age Current Age, enter a value between 20-79 years
     * @param {module:org.wso2.client.model.CardioAPI/String} gender Gender:  * male.  * female. 
     * @param {Number} systolic Systolic Blood Pressure (mm Hg) : Value must be between 90-200
     * @param {String} totalCholesterol Total Cholesterol (mmol/L) : Value must be between 130 - 320
     * @param {Number} hdl HDL Cholesterol (mmol/L) : Value must be between 20 - 100
     * @param {Object} opts Optional parameters
     * @param {Boolean} opts.diabetic History of Diabetes? : True | False
     * @param {Boolean} opts.smoker Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row. 
     * @param {Boolean} opts.hypertensive On Hypertension Treatment?   * True   * False
     * @param {module:org.wso2.client.model.CardioAPI/String} opts.race Race  * White (white)  *  African American (aa)
     * @param {module:org.wso2.client.api.CardioAPI/DefaultApi~ascvdGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:org.wso2.client.model.CardioAPI/ResultIrc}
     */
    this.ascvdGet = function(age, gender, systolic, totalCholesterol, hdl, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'age' is set
      if (age === undefined || age === null) {
        throw new Error("Missing the required parameter 'age' when calling ascvdGet");
      }

      // verify the required parameter 'gender' is set
      if (gender === undefined || gender === null) {
        throw new Error("Missing the required parameter 'gender' when calling ascvdGet");
      }

      // verify the required parameter 'systolic' is set
      if (systolic === undefined || systolic === null) {
        throw new Error("Missing the required parameter 'systolic' when calling ascvdGet");
      }

      // verify the required parameter 'totalCholesterol' is set
      if (totalCholesterol === undefined || totalCholesterol === null) {
        throw new Error("Missing the required parameter 'totalCholesterol' when calling ascvdGet");
      }

      // verify the required parameter 'hdl' is set
      if (hdl === undefined || hdl === null) {
        throw new Error("Missing the required parameter 'hdl' when calling ascvdGet");
      }


      var pathParams = {
      };
      var queryParams = {
        'age': age,
        'gender': gender,
        'systolic': systolic,
        'total_cholesterol': totalCholesterol,
        'hdl': hdl,
        'diabetic': opts['diabetic'],
        'smoker': opts['smoker'],
        'hypertensive': opts['hypertensive'],
        'race': opts['race']
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = ResultIrc;

      return this.apiClient.callApi(
        '/ascvd', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
