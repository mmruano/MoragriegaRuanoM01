EJERCICIO 1

Deberás recrear en android la aplicación del contador que se os proporciona.
El diseño se os pasará por figma (abajo teneis el enlace).
En este primer ejercicio solo debes hacer la parte visual, nada de lógica.
Asegurate de que el resultado final sea identico al proporcionado, en tu criterio queda elegir el o los tipos de layouts que utilizarás.
Mediante figma obtén el tipo de fuente, colores etc que debes utilizar en tu aplicación.

Este figma está compuesto por seis elementos, tres cuadros de textos y tres botones:



Utilizando Android Studio, creamos un proyecto vacío con la versión SDK API 22.


Este es el layout con los elementos:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/f41e1fcd-e1cf-4ad2-bc35-4e45bdbff21b)


El primer elemento es un textView con constrains en las cuatros direcciones para que sea más fácil de manipular los espacios entre sí:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/671e80a7-940d-4293-88e6-6b1683597894)


El segundo elemento es un editTextNumber que es un cuadro de texto específico para valores int:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/8b1d2376-b881-4645-84fc-cde23a5b7933)


Los siguientes elementos son tres botones, todas con constrains, todas sujetas entre sí excepto las que
están cerca de las paredes que están sujetas a ellas mismas:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/9529458f-fe5f-43da-835c-1953944cf243)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/31b8efd2-5d49-4379-be65-7de31ccede63)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/026d321a-cda3-47a1-aca6-e9defec171f6)


Y el último elemento es otro textView con constrains a los lados para que este centrado y simplemente con un texto:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/bab352b8-d4b4-4214-be44-fda222026840)
