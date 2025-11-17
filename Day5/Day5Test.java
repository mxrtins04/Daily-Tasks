import unittest
from Task2 import *


class Test_task_2_functions(unittest.TestCase):
	def test_if_categorize_user_input_can_convert_input_to_correct_string(self):
		actual = categorize_user_input(1, 2)
		expected = ("odd", "even")
		self.assertEqual(actual, expected)

	def test_if_put_categorized_user_input_into_a_list_correct_values_in_list(self):
		actual = put_categorized_user_input_into_a_list("even", "odd")
		expected = ["even", "odd"]
	
		self.assertEqual(actual, expected)

		actual = put_categorized_user_input_into_a_list("odd", "odd")
		expected = ["odd", "odd"]
		
		self.assertEqual(actual, expected)		

		actual = put_categorized_user_input_into_a_list("odd", "even")
		expected = ["odd", "even"]

		self.assertEqual(actual, expected)

def test_if_analyze_the_love_situation_gives_correct_output(self):
		
		actual = analyze_the_love_situation(test_list = ["odd", "even"])
		expected = True
		self.assertEqual(actual, expected)
		
		actual = analyze_the_love_situation(test_list = ["odd", "odd"])
		expected = False
		self.assertEqual(actual, expected)

		actual = analyze_the_love_situation(test_list = ["even", "odd"])
		expected = True
		self.assertEqual(actual, expected)
		