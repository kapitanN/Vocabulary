app.factory("Word", function($resource){
  return $resource(":language/vocabulary", {language: '@language'});
})

app.controller('TableController', ['$scope', "Word", function($scope, Word) {
  $scope.language = 'English';
  $scope.words = [];
  // debugger
  var url = function() {
    return {language: $scope.language||'English'};
  }

  var update = function(res) {
    if($scope.words.length == 0) {
      $scope.words = Word.query(url());
    } else {
      $scope.words.push(res);
    }
  };

  update();
  $scope.addWord = function() {
    var word = new Word();
    word.foreign = $scope.foreign;
    word.translation = $scope.translation;
    word.$save(url(), function() {
      $scope.foreign = "";
      $scope.translation = "";
    }).then(update);

  };

  $scope.deleteWord = function(index) {
    var arr = $scope.words.splice(index, 1);
  };
}]);
