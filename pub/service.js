app.service('myserv', function() {
          this.getServiceList = function () {
    return [{"serviceName":"defdemo.service.usecase6:mapCustomer","description":"Service to map input customer to output customer (also handles phone from contact)","serviceinputs":[{"inputName":"inputCustomer(defdemo.doc.usecase6.input:Customer)","inputType":"Document Reference","inputComments":"no comment","required":true,"wrapperType":"--"}],"serviceoutputs":[{"outputName":"outputCustomer(defdemo.doc.usecase6.output:Customer)","outputType":"Document Reference","outputComments":"no comment","required":true,"wrapperType":"--"}]},{"serviceName":"defdemo.service.usecase6:mapOrder","description":"Service to map a input SimpleOrder to an output SimpleOrder","serviceinputs":[{"inputName":"inputOrder(defdemo.doc.usecase6.input:SimpleOrder)","inputType":"Document Reference","inputComments":"no comment","required":true,"wrapperType":"--"}],"serviceoutputs":[{"outputName":"outputOrder(defdemo.doc.usecase6.output:SimpleOrder)","outputType":"Document Reference","outputComments":"no comment","required":true,"wrapperType":"--"}]},{"serviceName":"defdemo.service.usecase6:mapOrderRows","description":"map input OrderRows to output OrderRows","serviceinputs":[{"inputName":"inputOrderRows(defdemo.doc.usecase6.input:OrderRow)","inputType":"Document Reference List","inputComments":"no comment","required":true,"wrapperType":"--"}],"serviceoutputs":[{"outputName":"outputOrderRows(defdemo.doc.usecase6.output:OrderRow)","outputType":"Document Reference List","outputComments":"no comment","required":true,"wrapperType":"--"}]},{"serviceName":"defdemo.service.usecase6:mapProduct","description":"map input product to output product","serviceinputs":[{"inputName":"inputProduct(defdemo.doc.usecase6.input:Product)","inputType":"Document Reference","inputComments":"no comment","required":true,"wrapperType":"--"}],"serviceoutputs":[{"outputName":"outputProduct(defdemo.doc.usecase6.output:Product)","outputType":"Document Reference","outputComments":"no comment","required":true,"wrapperType":"--"}]},{"serviceName":"defdemo.service.usecase7.service:testService","description":"Service to test the transformation, reads file from c:\\dev","serviceinputs":[{"inputName":"use","inputType":"String","inputComments":"Input which transformation to run","required":true,"wrapperType":"--"}],"serviceoutputs":[]}];
}
this.getISEndpoint = function() { 
 return 'http://IBM-PW0319EE:5555/';
}
this.getAPIList = function() { 
 return [];
}
this.getCreatedTime = function() { 
 return "10-06-2025 16:36:08 CEST";
}
this.getPackageInfo = function(){
 return{"packageName":"DefDemo","createdDate":"09-06-2025 15:03:05 CEST","version":"1.0"};
}
});
