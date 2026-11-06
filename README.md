# SistemaGestorPedidos
Sistema de Gestión de Pedidos en Java con Factory, Singleton, Observer y SOLID

# Sistema de Gestión de Pedidos

## Descripción del proyecto

Sistema de Gestión de Pedidos para una tienda en línea, desarrollado en Java como proyecto final de la materia Programación Orientada a Objetos.

El proyecto implementa los patrones de diseño Factory, Singleton y Observer, además de aplicar los principios SOLID para mejorar la organización, flexibilidad y mantenimiento del código.

## Tecnologías utilizadas

- Lenguaje de programación: Java.
- Entorno de desarrollo: Apache NetBeans IDE 31.
- JDK: 25.
- Control de versiones: Git.
- Repositorio: GitHub.

## Patrones de diseño implementados

### 1. Factory

Se utiliza la clase `PedidoFactory` para crear diferentes tipos de pedidos:

- PedidoNormal.
- PedidoUrgente.
- PedidoEspecial.

La fábrica utiliza creadores registrados mediante un HashMap.

### 2. Singleton

La clase `ConexionBD` controla la creación de una única instancia del componente de conexión.

**Nota:** La conexión a la base de datos está simulada mediante mensajes en consola. No se implementó una conexión real mediante JDBC.

### 3. Observer

La clase `Evento` administra los usuarios suscritos y envía notificaciones automáticamente cuando se registra un pedido.

Los usuarios pueden suscribirse y cancelar su suscripción.

## Principios SOLID

El proyecto considera los cinco principios SOLID:

- **SRP:** Responsabilidad Única.
- **OCP:** Abierto/Cerrado.
- **LSP:** Sustitución de Liskov.
- **ISP:** Segregación de Interfaces.
- **DIP:** Inversión de Dependencias.

Se utilizan clases e interfaces para separar responsabilidades y reducir el acoplamiento entre componentes.

## Estructura del proyecto

Las principales clases e interfaces son:

- `Main`: punto de entrada del programa.
- `Pedido`: clase abstracta de los pedidos.
- `PedidoNormal`, `PedidoUrgente` y `PedidoEspecial`: tipos de pedidos.
- `PedidoFactory`: creación de pedidos.
- `CreadorPedido`: interfaz para los creadores.
- `ConexionBD`: implementación del patrón Singleton.
- `Evento`: administración de notificaciones.
- `PublicadorEventos`: abstracción para publicar eventos.
- `Suscriptor`: interfaz para recibir notificaciones.
- `Usuario`: representa a los usuarios suscritos.
- `SistemaPedidos`: coordina el registro de pedidos y las notificaciones.

## Instrucciones para ejecutar

1. Descargar o clonar este repositorio.
2. Abrir Apache NetBeans IDE 31.
3. Seleccionar **File → Open Project**.
4. Buscar la carpeta del proyecto `SistemaGestionPedidos`.
5. Esperar a que NetBeans cargue el proyecto.
6. Abrir `Main.java`.
7. Ejecutar el proyecto con la tecla F6.

## Pruebas realizadas

Se realizaron pruebas para verificar:

- Creación de pedidos normales, urgentes y especiales.
- Comprobación de la instancia única de Singleton.
- Envío de notificaciones a usuarios suscritos.
- Cancelación de suscripciones.
- Compilación y ejecución del programa sin errores.

## Autor

Edgar Antonio Aguilar Contreras

Ingeniería en Sistemas Computacionales

Universidad EDEC

Materia: Programación Orientada a Objetos
