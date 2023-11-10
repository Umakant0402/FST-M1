import pytest


@pytest.fixture()
def input_list():
    data = []
    for i in range(0, 11):
        data.append(i)
    return data
