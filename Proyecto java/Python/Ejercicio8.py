texto= input("Ingrese un texto: ")
texto = texto.lower().replace(" ", "")

if texto == "".join(reversed(texto)):
    print("Es un palindromo")

else:
    print("No es palindromo")

