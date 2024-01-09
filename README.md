EJERCICIO 1

Deberás recrear en android la aplicación del contador que se os proporciona.
El diseño se os pasará por figma (abajo teneis el enlace).
En este primer ejercicio solo debes hacer la parte visual, nada de lógica.
Asegurate de que el resultado final sea identico al proporcionado, en tu criterio queda elegir el o los tipos de layouts que utilizarás.
Mediante figma obtén el tipo de fuente, colores etc que debes utilizar en tu aplicación.

Este figma está compuesto por seis elementos, tres cuadros de textos y tres botones:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/86ca9c9e-582e-4ba3-8751-4c85e45dc012)


Utilizando Android Studio, creamos un proyecto vacío con la versión SDK API 22.


Este es el layout con los elementos:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/7e7fca5b-ea15-426c-9f98-374e02408150)


El primer elemento es un textView con constrains en las cuatros direcciones para que sea más fácil de manipular los espacios entre sí:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/9d89751c-e7b7-4f35-9564-5ccb85cdbe1b)


El segundo elemento es un editTextNumber que es un cuadro de texto específico para valores int:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/30e16c2a-395a-42e6-85ac-bb68c23b8dc9)


Los siguientes elementos son tres botones, todas con constrains, todas sujetas entre sí excepto las que
están cerca de las paredes que están sujetas a ellas mismas:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/0dd91915-5b35-4e4e-8878-abfc302fabfb)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/c78e6687-261b-46ca-8753-5f634ffc3012)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/db868b5e-04b3-4ad0-988f-b1e276e47b7f)


Y el último elemento es otro textView con constrains a los lados para que este centrado y simplemente con un texto:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/adbb718f-34e5-4c0a-aafd-7b0bc0be6a60)
