import unittest
from fizzbuzz import fizzbuzz

class FizzBuzzTest(unittest.TestCase):
  def test_fizz(self):
    for i in [3, 6, 9]:
      assert fizzbuzz(i) == 'fizz'

  def test_buzz(self):
    for i in [5, 10, 20]:
      assert fizzbuzz(i) == 'buzz'

  def test_fizzbuzz(self):
    for i in [15, 30, 45]:
      assert fizzbuzz(i) == 'fizzbuzz'