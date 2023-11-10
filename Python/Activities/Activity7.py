mylist = list((input("Enter the comma seperated values: ")).split(", "))
sum = 0
for item in mylist:
    sum += int(item)
print("Sum of the elements is: " + str(sum))
