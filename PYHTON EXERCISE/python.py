print("Hello World")
print("")
print("Welcome to Python programming!")
print("")
print("Lets try by calculating prime numbers!")
print("")
n = int(input("Enter a number: "))
print("")
for i in range(2, n):
    if n % i == 0:
        prima = False
        print(n, "is not a prime number.")
    else:
        prima = True
        print(n, "is a prime number.")
            
print("")
print("Thank you for using the prime number checker!")