import pytest


@pytest.mark.calculator
def test_addition():
    num1 = 20
    num2 = 10
    result = num1 + num2
    assert result == 30


@pytest.mark.calculator
def test_subtraction():
    num1 = 20
    num2 = 10
    result = num1 - num2
    assert result == 10


@pytest.mark.activity
def test_multiplication():
    num1 = 20
    num2 = 10
    result = num1 * num2
    assert result == 200


@pytest.mark.activity
def test_division():
    num1 = 20
    num2 = 10
    result = num1 / num2
    assert result == 2
