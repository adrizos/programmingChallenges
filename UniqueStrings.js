var string = "hello world";

console.log('The number of touchingPairs are: ' + touchingPairs(string));
console.log('There are repeating characters in this string? ' + uniqueStrings(string));

//check if there are any matching touching pairs
function touchingPairs (string){
  var count = 0;
  var newString = string.split('');
  for (var i = 0; i < newString.length-1; i++) {
    if (newString[i] === newString[i+1]) {
      //console.log("comparing " + newString[i] + " to " + newString[i+1]);
      count++;
    }
  }
  return count;
}


//are there any unique characters (using additional memory)
function uniqueStrings(string){
  var newString = string.split('');
  for (var i = 0; i < newString.length-1; i++){     //minus 1 here as the last element has nothing to else to compare to
    oneLessString = newString.shift();
    for (var x = 0; x < oneLessString.length; x++){
      console.log(newString[i] + ' , ' + oneLessString[x]);
      if (newString[i] == oneLessString[x]){
        return 1;
      }
    }
  }
  return -1;
}
