import pytest

def test_sumOfList(input_list):
    sumOfList = 0
    for num in input_list:
        sumOfList += num
    assert sumOfList == 55
