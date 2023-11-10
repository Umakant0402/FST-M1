fruit = {
    "apple": 10,
    "orange": 20,
    "banana": 30
}
check = input("Enter the fruit to check : ").lower()
if check in fruit:
    print(check + " is available")
else:
    print(check + " is not available")
