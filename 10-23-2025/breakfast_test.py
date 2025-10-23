import unittest
from breakfast import *

class BreakfastTest(unittest.TestCase):
	def test_that_it_converts_an_alphabet_to_uppercase(self):
		actual = convert_to_uppercase("a")
		expected = "A"
		
		self.assertEqual(actual, expected)

	def test_that_it_doesnt_affect_alphabets_that_are_already_in_uppercase(self):
		actual = convert_to_uppercase("A")
		expected = "A"
		self.assertEqual(actual,expected)
	
	def test_that_it_returns_its_output_in_uppercase_even_when_the_inputs_in_mixed_cases(self):
		actual = convert_to_uppercase("ANbsH")
		expected = "ANBSH"
		self.assertEqual(actual,expected)

	def test_that_it_returns_all_its_output_in_uppercase_even_when_there_is_space_in_the_string(self):

		actual = convert_to_uppercase("andy is a golden retriever")
		expected = "ANDY IS A GOLDEN RETRIEVER"
		self.assertEqual(actual,expected)
