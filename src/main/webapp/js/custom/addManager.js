function openAddManager() {
    var addManagerElement = document.getElementById("add-manager");
    addManagerElement.classList.add("max");
    addManagerElement.classList.remove("min");
}

function closeAddManager() {
	var originalWordElement = document.getElementById("originalWord");
	originalWordElement.value = '';
	var translationElement = document.getElementById("translation");
	translationElement.value = '';
    var addManagerElement = document.getElementById("add-manager");
    addManagerElement.classList.add("min");
    addManagerElement.classList.remove("max");
}

