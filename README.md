# DWJ0025_JAVA_PEOPLE
El Instituto de Capacitación “Java People” te encarga un sistema de control de calificaciones de sus estudiantes

a)	Registro de estudiante, considerando los siguientes datos: rut, apellidos, nombres, género y fono
b)	Registro de calificaciones, considerando los siguientes datos: nombre del curso, calificación obtenida y número de evaluación
c)	El sistema debe permitir, además:
	Modificar una calificación 
	Entregar un reporte de las calificaciones de un estudiante con su promedio
	Entregar un reporte de las calificaciones en una asignatura seleccionada
Se pide:
a)	Crear un proyecto Java EE, con sus módulos war y ejb
b)	En el módulo ejb:
	Crear proyecto JEE con módulos war y ejb
	Crear session bean stateful, stateless o singleton
	Crear la interface en el módulo EJB con los métodos a implementar
	Implementar (sobrescribir) los métodos declarados en la interface 
	Modelo de datos correspondientes
c)	En el módulo war:
	Crear el (o los) JSP que correspondan para un buen funcionamiento de la aplicación
	Crear el (o los) Servlet que correspondan para interactuar con los JSP 
	Establecer la comunicación hacia el (los) módulos ejb (@EJB)
	Crear conexión hacia la BD correspondiente
d)	Debe validar entre otros aspectos los campos vacíos.
e)	Además:
	Debes crear un modelo E-R con las tablas: estudiante, calificación y asignatura, con sus correspondientes relaciones
	Usar motor de BD MySQL 
	En anexo encontrarás sugerencias de páginas a crear
 
Anexo: Sugerencias de páginas a desarrollar
Página principal:
 
•	El botón “agregar” registra un estudiante en la BD
•	El botón “Mostrar” de mostrar una página como la siguiente:
 
•	El link “Agregar nota” debe permitir ingresar una nota del estudiante seleccionado (página que debes crear)
•	El link “Consultar” debe permitir mostrar las calificaciones del estudiante seleccionado, como por ejemplo así:
 
•	El link “Modificar” debe permitir cambiar la nota seleccionada
•	No olvidar agregar las opciones para mostrar las calificaciones de un curso determinado y las de un estudiante con su promedio
