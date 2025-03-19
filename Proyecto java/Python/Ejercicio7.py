n1 = int(input("Ingrese el primer número: "))
n2 = int(input("Ingrese el segundo número: "))
n3 = int(input("Ingrese el tercer número: "))

#Se usa condicional y se verifica donde se cumple
if n1 < n2 < n3:
    print(f"Los numeros {n1}, {n2}, {n3} estan incrementando")

elif n1 > n2 > n3:
    print(f"Los números {n1}, {n2}, {n3} estan disminuyendo")

else:
    print(f"Los números {n1}, {n2}, {n3} ni se incrementa ni se disminuye")