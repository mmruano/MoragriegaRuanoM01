EJERCICIO 1

Deberás recrear en android la aplicación del contador que se os proporciona.
El diseño se os pasará por figma (abajo teneis el enlace).
En este primer ejercicio solo debes hacer la parte visual, nada de lógica.
Asegurate de que el resultado final sea identico al proporcionado, en tu criterio queda elegir el o los tipos de layouts que utilizarás.
Mediante figma obtén el tipo de fuente, colores etc que debes utilizar en tu aplicación.

Este figma está compuesto por seis elementos, tres cuadros de textos y tres botones:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/86d1ec39-f798-470d-8476-77fdbce21aa8)


Utilizando Android Studio, creamos un proyecto vacío con la versión SDK API 22.

Este es el layout con los elementos:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/4450e5fd-314c-4c12-b8ed-45f0d4dc110c)


El primer elemento es un textView con constrains en las cuatros direcciones para que sea más fácil de manipular los espacios entre sí:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/a78ef702-4e0c-4cb1-bdfa-b94785619d9d)


El segundo elemento es un editTextNumber que es un cuadro de texto específico para valores int:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/87a25f22-ead4-4ec9-8859-a7ee22cda992)


Los siguientes elementos son tres botones, todas con constrains, todas sujetas entre sí excepto las que
están cerca de las paredes que están sujetas a ellas mismas:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/97a61b24-b47e-485b-b9e8-5f6843c772b9)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/cfe8df56-7498-4382-a9c1-afcefb364a94)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/1e3faffe-3141-4b82-9480-20ffd8f7bb8d)


Y el último elemento es otro textView con constrains a los lados para que este centrado y simplemente con un texto:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/a1b1a024-8758-425c-b167-47095ca476de)


-------------------------------------------------------

EJERCICIO 2

Crea la segunda pantalla en el mismo proyecto(investiga como). Deberás realizar un lógin tal y como se muestra en el figma,
en el caso de que el usuario y contraseña sean admin en el TextView de abajo saldrá “Usuario y contraseña correcta” en caso
contrario “Usuario o contraseña incorrecta”. Investigar por vuestra cuenta como iniciar la aplicación en la Activity login.
Pista → se configura en el AndroidManifest.xml. Una vez que iniciemos el login deberá pasar a la pantalla del contador pasando
el dato del nombre del usuario (aparecerá en la parte baja de la pantalla de contador donde ponía “by nombre_alumno”).

Este es el ejempo figma, compuesto por cinco elementos:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/77fbf334-9d20-4d6b-b937-08ab388b7d9e)


Este es el layout con los elementos:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/d09d126b-6a53-4b4f-b8a1-b50d0d6cd079)


El primer elemento es un textView con el texto LOGIN para indicar que tipo de pantalla es:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/53949092-7fb8-4e90-8e37-d6b7094dc4ce)


El segundo y tercer elemento son un nameText y un passwordText, que es un elemento específico para contraseñas:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/35a99bf9-6d1d-4201-a183-abaa86c33813)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/cd45c43f-aadf-498c-92b6-7c2ab33f1e90)


El cuarto elemento es un button que activa el evento para cambiar de pantalla una vez que se escriba el nombre y
contraseña correcto:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/b6e60323-9356-4141-a408-4fb2374c0b0f)


El último elemento es otro textView que funciona como notificacion para alertar al usuario que se ha introducido
el nombre y contraseña de forma correcta o incorrecta:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/dcad2673-6689-43a6-9376-b95829d2cf3d)


Para conseguir que la página de Login sea la primera en cargarse editamos la página de manifest y le ponemos la etiqueta intent-filter:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/f7a35048-b221-4768-a94c-8fb2247ca14a)


Ahora editamos el código del botón para que cambie de pantalla una vez pongamos el usuario y contraseña correcta:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/0866c7cd-b9b4-42a3-a007-9d9cb8e7a189)


-------------------------------------------------------

EJERCICIO 03

Cambia el proyecto para que el segundo activity en vez de ser el contador sea un activity con un FrameLayout en el que se verán los
diferentes fragments (mínimo home, contador, salir) y por otra parte una barra de navegación con la que podamos viajar entre los diferentes fragments.

Se empieza creando un nuevo activity que se llamará HomeActivity donde se pone un BottomNavigationView, que es una barra de navegación
en la que se utiliza para poder cambiar entre diferentes fragments, que son interfaces el cual el usuario puede interactuar:

Estos son los elementos que lo componen, un FrameLayout, un BottomNavigationView y un Fragment:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/7a8ea495-0229-4197-bf88-3312385bff56)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/bedab52c-af02-4c19-abf5-7541db3c6d78)

Se vería así:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/2bf69f48-cc3d-40df-9ff1-46c488342b52)


Ahora se crea un Android Resource Directory donde de tipo navigation cuyo nombre será nav_graph y donde se va a crear los fragments
que se utilizarán:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/b5fae43f-1524-4b81-8000-bcc0a3290a18)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/184bec63-e9ec-4cb3-9986-560b7b2b94da)


Ahora se creá otro Android Resource Directory de tipo menu donde se creará el archivo bottom_navigation_menu.xml, en ese archivo
se crearán todos los items que representarán los fragments:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/e062f597-0471-4920-a88b-1d2c7ec20d6d)


El código se vería algo así:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/13bee7d4-f787-4771-bca1-9b8602cb7818)


En el codigo del bottomnavigation hay que hacer una referencia del menu en la que se vería así:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/41f4bde1-fe6b-408a-8c77-2702126fd7f6)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/e63d52e2-8757-49ed-ba45-929c59bbe014)


Ahora solo hay modificar el código del HomeActivity para que cada vez que el usuario seleccione uno de los
items del bottomnavigation se cambie entre los diferentes fragments:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/dd932969-293f-455b-9139-192e1f7a88b7)


-------------------------------------------------------

EJERCICIO 04

Añade un Fragment mas que se llame API y sigue el tutorial (para la parte del consumo de la API) proporcionado para
consumir un API con android(en esta entrega no tendrás que reflejar los resultado en la interfaz gráfica, solo en el log).
Por otro lado crea un microservicio con una sola entidad.

Primero se crea la API para el proyecto el cúal utilizaremos para consumir en la Adroid App.

En la app se crea un fragmento que llamaremos apiFragment donde mostraremos los productos en una listView, en el código va lo
siguiente:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/74acfc3e-10cc-4522-9db2-28fb5dfa2460)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/dfbd4928-e4cd-4a18-a352-34527655ce62)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/51009561-263e-487f-8c9b-7606912d2783)


En el layout donde está el diseño hacemos lo siguiente:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/67930608-142c-472f-af55-62717e67f9b3)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/ad6b25c4-1b63-46cc-9d0c-c7369d62a04d)


Además se crea otro layout donde se diseñará como se mostrará los productos:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/3159a616-ee3c-47c1-83a5-bbbd28321dd2)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/acc46c46-d795-4cc8-b022-46b5e690cc62)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/80916513-1f7c-4381-a3ed-738bf639b73f)


Ahora en el Gradle Scripts hay que importar algunas librerias para que se pueda consumir la API:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/80788db4-6279-4e47-aee5-7244077290c9)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/f16746c5-71ca-421d-a0fa-f7eedd474d35)


Ahora se crea una carpeta en la que se meterá la clase de la API utiliza:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/28e96243-0bcb-4942-b218-02dee43eba86)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/dd9ffc7b-e62c-4ae9-9441-e84793040066)


Ahora se añade otra carpeta con una Interface en la que se pondrá el método para mostrar la lista:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/90369dd7-4132-4ff2-8288-1ffe2b573c51)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/09b0dfa6-86e1-4e58-be97-fba41ecb7636)


Y finalmente se añade otra carpeta de ProductorAdapter en la que se añaderá todos los métodos para mostrar
la información necesaria:

![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/8221e46d-97ba-4850-9275-45332383aafb)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/c6376e4b-ada5-4610-8a6e-b8526041139f)
![image](https://github.com/mmruano/MoragriegaRuanoM01/assets/146729468/b6a7bb0e-243d-41dd-baac-762a6c18437b)
