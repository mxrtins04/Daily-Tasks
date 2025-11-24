function countDistinct(input) {
	let result = 0;
	for(let count = 0; count < input.length; count++) {
		let numberOfMatches = 0;
		for(let count2 = 0; count2 < input.length; count2++) {
			if(input[count] == input[count2]) 
			numberOfMatches++;
			if( numberOfMatches == 1 )
				break;
		}	
			result += numberOfMatches;
	}
	return result;
}
console.log(countDistinct([1,1,2,5,3,3]))