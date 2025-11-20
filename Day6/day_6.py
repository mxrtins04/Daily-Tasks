def permutation_function(word):
    count = len(word)
    num_of_permutations = len(word)
    while (num_of_permutations>1):
        num_of_permutations -= 1
        count = count * num_of_permutations
    return count



def returnAllPermutatuionsOfCapitalization(word):
    number_of_permutations = permutation_function(word)
    permutations = []
    while(number_of_permutations>0):
        lowercase_word = word.lower()
        for letter in lowercase_word:
            letter = letter.upper()
            if word in permutations:
                continue
            permutations.append(lowercase_word)
        number_of_permutations -= 1
    return permutations

list = returnAllPermutatuionsOfCapitalization('hello')
print(list)
print(permutation_function("abc"))