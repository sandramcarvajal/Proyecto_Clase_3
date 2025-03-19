nota1= float(input("Ingrese la primera nota: "))
nota2= float(input("Ingrsee la segunda nota: "))
nota3= float(input("Ingrese la tercera nota: "))
nota4= float(input("Ingrese la cuarta nota: "))
nota5= float(input("ingrese la quinta nota: "))

#Se uso variables para calculo de peso de cada nota
n1= nota1*0.15
n2= nota2*0.20
n3= nota3*0.15
n4= nota4*0.30
n5= nota5*0.20

#suma el calculo de la nota final
nota_final= n1+n2+n3+n4+n5

#Se usa condiciones para evaluar la nota final
if nota_final > 4.5:
    print(f"Su nota final es: {nota_final:.2f} Felicitaciones por tu excelente desempeño")

elif nota_final >= 3:
    print(f"Su nota final es: {nota_final:.2f} Aprobo. Buen trabajo")

elif nota_final < 2:
    print(f"Su nota final es: {nota_final:.2f} No puede habilitar")

else:
    print(f"Su nota final es: {nota_final:.2f} Reprobo. No obtuviste el resultado esperado")

