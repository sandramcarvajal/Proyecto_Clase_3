m = float(input("Ingrese la masa del objeto en kg: "))
v = float(input("Ingrese la velocidad del objeto en m/s: "))

#Se usa la formula 1/2 mv2
energia_cinetica = 0.5 * m * (v**2)

print(f"La energía cinética del objeto es: {energia_cinetica} Jules")
