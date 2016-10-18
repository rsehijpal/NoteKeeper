
(function(){
	angular.module('notebookMain').controller('displayNotes', ['$scope','Restangular', function($scope, restangular ){
		$scope.name = "Ritika";
		restangular.all('/api/note').getList().then(function(result) {
	        $scope.notes = result;
	    });
	}]);
})();
