def calculateSum(numlist):
    sum = 0
    for num in numlist:
        sum += num
    return sum

numlist = [10, 23, 56, 78]
print(str(calculateSum(numlist)))
