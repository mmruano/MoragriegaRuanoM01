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

-------------------------------------------------------

EJERCICIO 2

Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma,
en el caso de que el usuario y contraseña sean admin en el TextView de abajo saldrá “Usuario y contraseña correcta” en caso
contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login.
Pista → se configura en el AndroidManifest.xml. Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando
el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde ponía “by nombre_alumno”).

Este es el ejempo figma, compuesto por cinco elementos:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/6d3ec326-96f5-4049-b84a-91d74ca57d8f)


Este es el layout con los elementos:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/50bdd088-8ef4-4ef6-952b-40cd5512cf66)


El primer elemento es un textView con el texto LOGIN para indicar que tipo de pantalla es:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/1d2c2a4d-afac-49a0-bff6-1bec6d1b92d2)


El segundo y tercer elemento son un nameText y un passwordText, que es un elemento específico para contraseñas:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/b8f98e2f-0f82-4d25-9751-48fcc33bbecb)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/2f537b79-88e9-4461-a2c5-fbb2df39a7ef)


El cuarto elemento es un button que activa el evento para cambiar de pantalla una vez que se escriba el nombre y
contraseña correcto:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/a394a5c2-0745-4dd0-b8f9-b1756d44ed09)


El último elemento es otro textView que funciona como notificacion para alertar al usuario que se ha introducido
el nombre y contraseña de forma correcta o incorrecta:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/2f1c40c6-8ced-4b9a-abd3-e0c6af99d53d)


Para conseguir que la página de Login sea la primera en cargarse editamos la página de manifest y le ponemos la etiqueta intent-filter:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/77228731-f9e8-4dfc-839b-22a15ad0a976)


Ahora editamos el código del botón para que cambie de pantalla una vez pongamos el usuario y contraseña correcta:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/0163099e-2ccc-4537-b9a7-f66ac52fd920)
