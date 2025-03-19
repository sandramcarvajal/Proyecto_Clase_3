x1= float(input("Ingrese el valor de x1: "))
x2= float(input("Ingrese el valor de y1: "))
y1= float(input("Ingrese el valor de x2: "))
y2= float(input("Ingrese el valor de y2: "))

#Para sacar la raiz utilizo **0.5 en la formula
distancia= ((x2 - x1) ** 2 + (y2 - y1) ** 2) ** 0.5

print(f"La distancia entre los puntos es: {distancia:.2f}")
