pares= 0
numeros_5= 0
total_numeros= 0

#Se usa while que se ejecuta hasta que se cumpla alguna condición
while pares < 100 and numeros_5 < 80:
    num= int(input("Ingrese un número positivo: "))

    if num < 0:
        print("Solo números positivos")
        continue

    total_numeros+= 1

    if num % 2 == 0:
        pares+= 1

    if "5" in str(num):
        numeros_5+= 1

print(f"Total de números ingresados: {total_numeros}")
print(f"Total de números pares: {pares}")
print(f"Total de números que contienen 5: {numeros_5}")