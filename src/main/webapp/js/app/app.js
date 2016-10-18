(function(){
	angular.module('notebookMain', ['angularGrid','restangular'])
	.config(function(RestangularProvider) {
	    RestangularProvider.setBaseUrl(
	        '/MyDigitalNotebook'); 
	        // Note that we run everything on the localhost
	});
})();


