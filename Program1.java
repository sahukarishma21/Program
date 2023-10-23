function reverseWordsInSentence(sentence) {
    let words = sentence.split(' ');
    let reversedWords = [];
    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        let reversedWord = reverseWord(word);
        reversedWords.push(reversedWord);
    }
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    return word.split('').reverse().join('');
}
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
