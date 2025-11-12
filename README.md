# Tarea28

Este proyecto es una simple aplicación cliente-servidor en Java.

## Funcionalidades

- El servidor puede manejar múltiples clientes simultáneamente.
- El cliente envía un mensaje al servidor.
- El servidor recibe el mensaje, le añade el prefijo "ECO: " y lo devuelve al cliente.
- La comunicación continúa hasta que el cliente envía el mensaje "adios".

## Como ejecutar la aplicación

1. Compila las clases de Java.
2. Ejecuta la clase `Servidor` para iniciar el servidor.
3. Ejecuta la clase `Cliente` para iniciar un cliente. Puedes iniciar múltiples clientes.

## Estructura del proyecto

- `src/Servidor.java`: Contiene el código para el servidor. Crea un `ServerSocket` y espera las conexiones de los clientes. Cuando un cliente se conecta, crea un hilo `GestorClientes` para manejar la comunicación con ese cliente.
- `src/GestorClientes.java`: Contiene el código para el hilo que maneja la comunicación con un cliente. Lee una línea del cliente, le añade "ECO: " al principio de la línea y la devuelve al cliente.
- `src/Cliente.java`: Contiene el código para el cliente. Se conecta al servidor, lee una línea de la consola, la envía al servidor, lee la respuesta del servidor y la imprime en la consola.