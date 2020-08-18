# TestMasiv-Roulette
It is a repository that contains the tecnichal test of Masiv, it's a betting roulette.

para este proyecto se utilizo mongoDB como gestor de bases de datos, spring boot para el back end y angular para el fron end.

observaciones:

1- el proyecto se realizo de manera local, por lo cual se utilizo un servidor de bases de datos local, sin embargo en spring boot
se utilizaron las configuraciones por defecto generadas por la dependencia de mongoDB por lo cual es unicamente necesario levantar
un servidor mongoDB local y la aplicacion utilizara la Collection test como base de datos.

2- para la conexion REST spring boot utiliza el puerto 8080, especificamente la direccion http://localhost:8080/roulettes/ a partir
de la cual se consumen los servicios REST en el fronend.


notas del autor:

No se logra completar todos los endpoints especificados en la prueba debido a retrasos por falta de conocimiento en la gestion de 
bases de datos no relacionales y el manejo de spring con mongoDB. //No es una excusa valida pero es importante especificarlo para
aprendizaje.

