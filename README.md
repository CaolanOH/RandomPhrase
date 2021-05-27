# RandomPhrase
This is a random phrase generator.

## How it works
This program creates three lists of words. One word is randomly picked from each of the three lists. The result is printed out. 

1. Three String arrays are created. These contain the words that will be used. 
2. We need to know how many words are in each list or the 'length' of these arrays. array.length() is used to find this out.
3. random() is multuplied by the length of each array. The results must be an integer so it is put in a cast. This returns an integer that is a random number within the arrays indexes.
4.  The phrase is printed out by concatonating all three arrays with the index of each random number.
