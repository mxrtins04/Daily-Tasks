def reverse_sentence(sentence):
	result = ""
	words = sentence.split(" ")
	for count in range(len(words)):
		reverse = " "
		word = words[count]
		result = word + reverse
	return result

sentence = input("Enter a sentence: ")
print(reverse_sentence(sentence))