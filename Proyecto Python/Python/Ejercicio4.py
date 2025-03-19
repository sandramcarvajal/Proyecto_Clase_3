segundos= int(input("Ingrese una cantidad de segundos: "))

horas= segundos//3600
minutos=(segundos%3600)//60
seg=segundos%60

print(f"{horas}: {minutos}: {seg}")



