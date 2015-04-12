function HotPansController($scope, $http) {
	//$http.get('http://localhost:8080/api/breads').
	$http.get('https://intense-basin-2782.herokuapp.com/api/breads').
	success(function(data, status, headers, config) {
		$scope.breads = data;
	});
}

function AddBreadController($scope, $http){
	var bread = {};

	$scope.addBread = function(){
		bread.breadName = $scope.bread.breadName;
		bread.price = $scope.bread.price;
		console.log(bread.breadName);
		console.log(bread.price);
		$http({
			method : 'POST',
			//url : 'http://localhost:8080/api/breads',
			url : 'https://intense-basin-2782.herokuapp.com/api/breads',
			data : bread
		}).success(function(data) {
			//成功
			console.log("★成功");
			location.reload();
		}).error(function(data) {
			//失敗
			console.log("★失敗");
			alert("Error!! Please try again later.");
		});
	}
}