app.service('myserv', function() {
          this.getServiceList = function () {
    return [{"serviceName":"defdemo.service.usecase6:mapCustomer","description":"Service to map input customer to output customer (also handles phone from contact)","serviceinputs":[{"inputName":"inputCustomer(defdemo.doc.usecase6.input:Customer)","inputType":"Document Reference","inputComments":"no comment","required":true,"wrapperType":"--"}],"serviceoutputs":[{"outputName":"outputCustomer(defdemo.doc.usecase6.output:Customer)","outputType":"Document Reference","outputComments":"no comment","required":true,"wrapperType":"--"}]},{"serviceName":"defdemo.service.usecase6:mapOrder","description":"Service to map a input SimpleOrder to an output SimpleOrder","serviceinputs":[{"inputName":"inputOrder(defdemo.doc.usecase6.input:SimpleOrder)","inputType":"Document Reference","inputComments":"no comment","required":true,"wrapperType":"--"}],"serviceoutputs":[{"outputName":"outputOrder(defdemo.doc.usecase6.output:SimpleOrder)","outputType":"Document Reference","outputComments":"no comment","required":true,"wrapperType":"--"}]}];
}
this.getISEndpoint = function() { 
 return 'http://IBM-PW0319EE:5555/';
}
this.getAPIList = function() { 
 return [];
}
this.getCreatedTime = function() { 
 return "10-06-2025 15:33:18 CEST";
}
this.getPackageInfo = function(){
 return{"packageName":"DefDemo","createdDate":"09-06-2025 15:03:05 CEST","version":"1.0"};
}
});
