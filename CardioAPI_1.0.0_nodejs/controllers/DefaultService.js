'use strict';

exports.ascvdGET = function(args, res, next) {
  /**
   * parameters expected in the args:
  * age (Integer)
  * gender (String)
  * systolic (Integer)
  * total_cholesterol (String)
  * hdl (Integer)
  * diabetic (Boolean)
  * smoker (Boolean)
  * hypertensive (Boolean)
  * race (String)
  **/
    var examples = {};
  examples['application/json'] = {
  "compute_ten_year_score" : 1.3579000000000001069366817318950779736042022705078125,
  "compute_ten_year_risk_reduction" : 1.3579000000000001069366817318950779736042022705078125,
  "compute_lifetime_risk" : 1.3579000000000001069366817318950779736042022705078125,
  "compute_optimal_lifetime" : 1.3579000000000001069366817318950779736042022705078125
};
  if(Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  }
  else {
    res.end();
  }
  
}

