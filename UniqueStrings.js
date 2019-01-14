var string = "Hbdsad dfk";

//check if there are any matching touching pairs
function isUnique (string){
  var count = 0;
  newString = string.split('');
  for (var i = 0; i < newString.length-1; i++) {
    for (var x = 0; x < newString.lenght; x++){
      if (newString[i] === newString[x]){
        count+= 1;
      }
    }
  }
  return count;
}


//are there any unique characters (using additional memory)
