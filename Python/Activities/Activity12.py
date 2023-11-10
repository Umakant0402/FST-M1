def calculateSum(num):
    if num:
        return num + calculateSum(num - 1)
    else:
        return num


print(calculateSum(10))
