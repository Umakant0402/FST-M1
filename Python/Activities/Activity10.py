t = tuple((input("Enter the comma separated values: ")).split(", "))
for num in t:
    if int(num) % 5 == 0:
        print(num)
