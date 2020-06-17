'use strict';

var url = require('url');


var Default = require('./DefaultService');


module.exports.ascvdGET = function ascvdGET (req, res, next) {
  Default.ascvdGET(req.swagger.params, res, next);
};
