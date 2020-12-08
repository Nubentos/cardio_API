'use strict';

exports.ascvdGET = function(args, res, next) {
  /**
   * Risk of atherosclerotic cardiovascular disease.
   *
   * age Integer Current Age, enter a value between 20-79 years
   * gender String Gender:  * male.  * female. 
   * systolic Integer Systolic Blood Pressure (mm Hg) : Value must be between 90-200
   * total_cholesterol String Total Cholesterol (mmol/L) : Value must be between 130 - 320
   * hdl Integer HDL Cholesterol (mmol/L) : Value must be between 20 - 100
   * diabetic Boolean History of Diabetes? : True | False (optional)
   * smoker Boolean Smoker?  * True: Smokes every day. * False: Never, ocasionally and/or has been asbstinents for at least 7 days in a row.  (optional)
   * hypertensive Boolean On Hypertension Treatment?   * True   * False (optional)
   * race String Race  * White (white)  *  African American (aa) (optional)
   * returns resultIrc
   **/
  var examples = {};
  examples['application/json'] = {
  "compute_lifetime_risk" : 27,
  "compute_optimal_lifetime" : 8,
  "compute_ten_year_risk_reduction" : 0.9,
  "compute_ten_year_score" : 1.7
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

