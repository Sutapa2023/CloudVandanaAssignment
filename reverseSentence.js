function reverseWords(sentence) {
    // Split the sentence into an array of words
    let words = sentence.split(' ');

    // Reverse each word in the array
    let reversedWords = words.map(word => reverseString(word));

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseString(str) {
    // Convert the string to an array of characters, reverse it, and join it back into a string
    return str.split('').reverse().join('');
}

// Example usage
let inputSentence = "This is a sunny day in JavaScript.";
let result = reverseWords(inputSentence);

console.log(result);

