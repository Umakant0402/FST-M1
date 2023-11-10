mylist1 = list((input("Enter the comma separated values for list1: ")).split(", "))
mylist2 = list((input("Enter the comma separated values for list2: ")).split(", "))
mylist3 = []
for num in mylist1:
    if int(num) % 2 != 0:
        mylist3.append(num)
for num in mylist2:
    if int(num) % 2 == 0:
        mylist3.append(num)
print(mylist3)
