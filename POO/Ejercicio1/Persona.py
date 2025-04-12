class Persona:
    def __init__(self, nombre, ciudad, edad):
        self.nombre = nombre
        self.ciudad = ciudad
        self.edad = edad

    def saludo(self):
        print(f"Hola, soy {self.nombre} y vivo en la ciudad de {self.ciudad}")

    def es_mayor(self):
        if self.edad > 18:
            print(f"{self.nombre} es mayor de edad tiene {self.edad} años")
        else:
            print(f"{self.nombre} no es mayor de edad tiene {self.edad} años")


# Parte principal (equivalente a main en Java)
if __name__ == "__main__":
    p1 = Persona("Juana", "Sucre", 25)
    p2 = Persona("Mery", "Cordova", 15)
    p3 = Persona("Pablo", "Montevideo", 24)

   
    p1.saludo()
    p2.saludo()
    p3.saludo()

 
    p1.es_mayor()
    p2.es_mayor()
    p3.es_mayor()