app.factory("Word", function($resource){
  return $resource(":language/vocabulary", {language: '@language'});
})

app.controller('TableController', ['$scope', "Word", function($scope, Word) {
  $scope.language = 'English';
  // debugger
  $scope.words = [
  	{
  		originWord: 'car',
  		translatedWord: 'автомобиль'
  	},
  	{
  		originWord: 'language',
  		translatedWord: 'язык'
  	},
  	{
  		originWord: 'school',
  		translatedWord: 'школа'
  	},
  	{
  		originWord: 'seminar',
  		translatedWord: 'семинар'
  	},
  	{
  		originWord: 'world',
  		translatedWord: 'мир'
  	},
  	{
  		originWord: 'notebook',
  		translatedWord: 'блокнот'
  	},
  	{
  		originWord: 'teacher',
  		translatedWord: 'учитель'
  	},
  	{
  		originWord: 'movie',
  		translatedWord: 'фильм'
  	},
  	{
  		originWord: 'plural',
  		translatedWord: 'множество'
  	}
  ];

  $scope.addWord = function() {
    // var item = {
    //   originWord: document.getElementById("originalWord").value,
    //   translatedWord: document.getElementById("translation").value
    // }
    // $scope.words.push(item);
    // document.getElementById("originalWord").value = "";
    // document.getElementById("translation").value = "";
    var word = new Word();
    word.foreign = $scope.foreign;
    word.translation = $scope.translation;
    word.$save(url(), function() {
      $scope.foreign = "";
      $scope.translation = "";
      // update();
    });
  };

  $scope.deleteWord = function(index) {
    var arr = $scope.words.splice(index, 1);
  };

  var url = function() {
    return {language: $scope.language||'English'};
  }

  var update = function() {
    $scope.words = Word.query(url());
  };

}]);
