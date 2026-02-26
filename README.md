# -Queue-de-canciones-tarea

Esta tarea esta divida en dos modulos:

##umg.edu.gt.data-structure.queue: Libreria que contiene la implementacion de la coal enlazada.
##queueHandler: Aplicacion que consume la librerai y que esta ejecuta la simulacion de la cancion.

--------------------------------------------
  Separé la implemtentacion de la estructua de datos en una libreria independiente la de data structure y la aplicacion de queueHandler consume la libreria como dependencia maven en el repositorio local.
  En esta implemente:
  1.Cambio clase node <T>
  2. clase queueLinked<T>
  3. clase song 
  4. sistema de prioridad de dos colas la priority y la normal 
------------------------------------------------------------------------------

## Cómo compilar la librería
Desde la carpeta del proyecto data structure ejecuto el comando en el cmd: mvn clean install, esto realiza limpieza del proyecto, la compilacionn, la genereacion del archivo .jar y la instalacion en el reposito local m2
-----------------------------------------------------------------

##Cómo instalar en local
La intalacin en local se realiza al aejecutar en la terminal mvn clean install el archivo JAR se guarda en el m2.

##Cómo compilar el handler
para esto desde la carpeta del proyecto queueHandler ejecute en cdm el comando mvn clean package que esto genrea el .JAR ejecutbale del sistema.

--------------------------------------------------------------------

#Cómo ejecutar desde consola
-Para esto una vez generado el ajr ubicarse dentro de la carpeta target del hanlder y ejecute el comndo java -jar queueHandler-0.0.1-SNAPSHOT.jar.

---------------------------------------------------------------------

##Explicación del diseño
--Para el sistema utilizo dos colas enlazadas que son:
.highPriority
.normalPriority

Al momento de agregar una cancion eso me sirve para separa las priodirades siendo 1 Alta y 2 normal como lo decia en las instrucciones.

*Durante la reproduccion siempre se vacia primero la cola de highPriority y luego se procesan las cnaciones de prioridad normal gracias a este metodo pues se me garantiza que la simulacion de canciones mas importantes se reproduzcan de primero.
-------------------------------------------------------------------------------

##Decisiones técnicas
  -Se implemento una cola enlazada manual en lugar de usar estructuras de java como se dice en las intrucciones.
  -Utilice un nodo generico demoninado con T como se pedia para permitir una reutilziacion de esta.
  -Se mantuvo los punteos head y tail para lograr las operacione o(1) en los metodos enqueue(añadir ) y en el dequeue(eliminar)
  -La sepracion de logica en los modulos como la de SONG, MAIN y la de playlist.
  --------------------------------------------------------------------------

  ##¿Cómo implementaste la prioridad?
  Bueno pues la prioridad la implemente modificando la estrucutra interna de la cola, en su lugar cree dos colas independientes que son:
  --cola de prioridad alta = highPriority 
  --cola de priotidad normal = normalPriority.
   Para esto tambien coloque dos ciclso un if y otro while, el if lo que hace es separar las cnaciones dependiendo de su prioridad siendo delegado 1 como alto y 2 como normal quedando algo asi: if (s1.getPriority()==1) 
			highPriority.enqueue(s1);
		else 
			normalPriority.enqueue(s1);
		if (s2.getPriority() == 1)
		    highPriority.enqueue(s2);
		else
		    normalPriority.enqueue(s2); 
        y asi me tocaria con cada cancionq que yo qusiera agregar.

##Cómo manejaste la simulación de duración

La duracion de cada cancion la siumel Thread.sleep que se nos dio en las intrucciones con un valor de 1000 ya que eso representa 1 segundo por loq eu investigue esto genera una pausa de un segundo y utilize un ciclo for para simualr el tiempo total de repodurccion. 



  









