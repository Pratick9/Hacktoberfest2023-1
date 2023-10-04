row = int(input("Enter the number of rows: "))
temp = 1
for i in range(row, 0, -1):
    for j in range(i - 1):
        print(" ", end=" ")
    for k in range(2 * temp - 1):
        print("*", end=" ")
    temp += 1
    print()
