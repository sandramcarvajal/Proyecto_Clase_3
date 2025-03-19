numero= int(input("Ingrese un número: "))

if numero % 2== 0:
    tipo = "par"

else:
    tipo = "impar"

if numero >= 0:
    signo = "positivo"

else:
    signo = "negativo"

print(f"El número {numero} es {tipo}-{signo}")