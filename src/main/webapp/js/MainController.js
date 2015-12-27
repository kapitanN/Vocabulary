app.controller('MainController', ['$scope', function($scope) { 
  $scope.title = 'Your Vocabulary'; 
  $scope.language = 'English';
  $scope.words = {
    name: 'The Book of Trees',
    price: 19,
    pubdate: new Date('2014', '03', '08')
  };
}]);