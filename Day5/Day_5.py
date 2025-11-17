idiot1_response = 2
idiot2_response = 5

def categorize_user_input(idiot1_response, idiot2_response):
	if idiot1_response % 2 == 0:
		idiot1_response = "even"
	else: 
		idiot1_response = "odd"
			
	if idiot2_response % 2 == 0:
		idiot2_response = "even"
	else: 
		idiot2_response = "odd"
	return(idiot1_response, idiot2_response)

"""def put_categorized_user_input_into_a_list(idiot1_response, idiot2_response):
	categorize_user_input(idiot1_response, idiot2_response)
	comparism_list = [idiot1_response, idiot2_response]
	return comparism_list """

def put_categorized_user_input_into_a_list(idiot1_response, idiot2_response):
	comparism_list = [idiot1_response, idiot2_response]
	return comparism_list

def analyze_the_love_situation(comparism_list):
	if comparism_list[0] ==  comparism_list[1]:
		return True
	else:
		return False
	