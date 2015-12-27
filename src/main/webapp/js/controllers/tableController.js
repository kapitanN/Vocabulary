app.controller('TableController', ['$scope', function($scope) {
  $scope.language = 'English';
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
    var item = {
      originWord: document.getElementById("originalWord").value,
      translatedWord: document.getElementById("translation").value
    }
    $scope.words.push(item);
    document.getElementById("originalWord").value = "";
    document.getElementById("translation").value = "";
  };

  $scope.deleteWord = function(index) {
    var arr = $scope.words.splice(index, 1);
  };

}]);

/**
  Массив слов сортируется только на странице сайта, сам массив остается в старом порядке. 
  Из-за этого, при удалении из отсортированного словаря, удаляются не те слова.
*/