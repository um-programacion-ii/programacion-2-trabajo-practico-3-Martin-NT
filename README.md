[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/jpLeSJQi)
# Sistema de Gestión de Biblioteca - Práctica de Testing

![Java](https://img.shields.io/badge/Java-21-orange)
![JUnit5](https://img.shields.io/badge/JUnit-5.9.2-green)
![Mockito](https://img.shields.io/badge/Mockito-5.3.1-blue)
![Maven](https://img.shields.io/badge/Maven-3.9.0-red)

## Tiempo Estimado y Recomendaciones
- **Tiempo estimado de realización:** 15 horas
- **Recomendación:** Se sugiere leer la consigna completa antes de comenzar con el desarrollo para tener una visión general del proyecto y planificar adecuadamente el trabajo.

## Identificación del Alumno
- **Nombre:** Martin
- **Apellido:** Navarro Teixidor
- **Legajo:** 62181

# 📘 Documentación del Sistema
## 📚 Clases / Componentes
Models
- Libro: Representa un libro dentro del sistema. 
- Catalogo: Gestiona el listado de libros disponibles en la biblioteca.
- Prestamo: Representa el acto de préstamo de un libro.
- SistemaPrestamos: Se encarga de la lógica de préstamos.
- Usuario: Representa a una persona que utiliza la biblioteca.
- Gestionusuarios: Administra los usuarios registrados y sus préstamos. 

Enums
- Estado: Contiene los estados del Libro (DISPONIBLE-PRESTADO)

## ✅ Tests - Pruebas

- LibroTest
    - Verifica que se puede crear un libro válido con sus datos correctamente asignados.
    - Verifica que se puede cambiar el estado del libro (por ejemplo, de DISPONIBLE a PRESTADO).
    
- CatalogoTest
    - Verifica que un libro existente se puede buscar por ISBN correctamente.
    - Verifica que buscar un libro con un ISBN inexistente devuelve null.
    - Verifica que se obtengan todos los libros disponibles
    - Verifica que se pueden obtener todos los libros que están en estado PRESTADO.
    - Verifica que el catálogo retorna correctamente todos los libros agregados.
    - Verifica que se puede agregar un libro al catálogo y queda registrado.

- PrestamoTest
    - Verifica que un libro disponible se puede prestar y su estado cambia a PRESTADO.
    - Verifica que un libro prestado se puede devolver y su estado vuelve a DISPONIBLE.
    - Verifica que no se puede devolver un libro que no fue prestado (estado inválido).
    - Verifica que no se puede devolver un libro inexistente (no está en el catálogo).
    - Verifica que no se puede devolver un libro que ya fue devuelto.
    - Verifica que no se puede prestar un libro que ya está prestado.
    - Verifica que no se puede prestar un libro que no existe en el catálogo.
    
- UsuarioTest
    - Verifica que un préstamo se registra correctamente y se actualiza el historial del usuario.
    - Verifica que se lanza una excepción si el usuario no existe al registrar un préstamo.
    - Verifica que se lanza una excepción si el libro no está disponible para préstamo.

## 📘 Documentación de los cambios realizados
- Etapa 1 - Configuración Inicial y Pruebas Básicas
    - Se agregaron los templates de Issues y Pull Request
    - Atributos: isbn , titulo, autor y estado.
    - Enum estado con DISPONIBLE Y PRESTADO
    - Se inicializa en el estado DISPONIBLE.
    - Se usa lombok
    
- Etapa 2 - Implementación del Catálogo
    - Método para agregar libros al catálogo.
    - Método para buscar libros por ISBN.
    - Método para obtener todos los libros, los disponibles y los prestados.
    - Se usa lombok
    
- Etapa 3 - Sistema de Préstamos
    - Atributos: fechaPrestamo y libroPrestado en clase Prestamo.
    - Método para prestar un libro si está disponible en SistemaPrestamos.
    - Método para devolver un libro si está prestado en SistemaPrestamos.
    - Se usa lombok
    
- Etapa 4 - Sistema de Usuarios
    - Atributos: nombre, apellido, historialPrestamos en clase Usuario
    - Método para registrar nuevos usuarios en GestionUsuarios.
    - Método para buscar usuarios por nombre y apellido en GestionUsuarios.
    - Método para registrar préstamos para un usuario, actualizando su historial en GestionUsuarios.
    - Se usa lombok

## 💻 Evidencia de que las pruebas pasan correctamente

### 📘 LibroTest
![Pruebas de Libro](assets/libro_test.png)

### 📚 CatalogoTest
![Pruebas de Catálogo](assets/catalogo_test.png)

### 🔄 PrestamoTest
![Pruebas de Préstamo](assets/prestamo_test.png)

### 👤 UsuarioTest
![Pruebas de Usuario](assets/usuario_test.png)

## 🤖 Uso de IA
Se uso Inteligencia artificial para fijar conceptos y aprender:

- Hacer bien el archivo pom.xml con las propiedades y dependencias necesarias.
- Ver como era aplicable el uso de mock.
- Uso de assertThrows en tests

## Importante
- La rama `main` está protegida y no se pueden hacer commits directos sobre ella
- Todo el trabajo debe realizarse en ramas feature siguiendo el patrón `feature/issue-numero-descripcion`
- Los cambios deben ser enviados mediante Pull Requests
- Cada Pull Request debe estar asociado a un Issue específico

## Objetivo
Este proyecto tiene como objetivo que los estudiantes practiquen y desarrollen habilidades en testing unitario utilizando JUnit5 y Mockito en Java. A través de la implementación de un sistema de gestión de biblioteca, los estudiantes aprenderán a escribir pruebas unitarias efectivas y a utilizar mocks para simular dependencias.

## Requisitos Previos
- Java 21 o superior
- Maven
- Conocimientos básicos de Java y programación orientada a objetos

## Estructura del Proyecto
El proyecto está dividido en etapas incrementales, cada una enfocada en diferentes aspectos del testing. Cada etapa corresponde a un milestone en GitHub.

### Milestone 1: Configuración Inicial y Pruebas Básicas
**Objetivos de Aprendizaje:**
- Familiarizarse con la configuración de un proyecto Maven
- Aprender a escribir pruebas unitarias básicas con JUnit5
- Entender el concepto de assertions y su uso

**Issues Sugeridos:**
1. #1 Configuración inicial del proyecto Maven
2. #2 Implementación de la clase Libro
3. #3 Pruebas unitarias básicas para Libro

**Tareas:**
1. Configurar el proyecto Maven con las dependencias necesarias
2. Implementar la clase `Libro` con los siguientes atributos:
   - ISBN (String)
   - Título (String)
   - Autor (String)
   - Estado (Enum: DISPONIBLE, PRESTADO)
3. Escribir pruebas unitarias para:
   - Creación de un libro con datos válidos
   - Cambio de estado del libro

**Ejemplo de Guía:**
```java
@Test
void testCrearLibroValido() {
    Libro libro = new Libro("978-3-16-148410-0", "Clean Code", "Robert C. Martin");
    assertEquals("978-3-16-148410-0", libro.getIsbn());
    assertEquals("Clean Code", libro.getTitulo());
    assertEquals("Robert C. Martin", libro.getAutor());
    assertEquals(Estado.DISPONIBLE, libro.getEstado());
}
```

### Milestone 2: Implementación del Catálogo
**Objetivos de Aprendizaje:**
- Practicar el uso de colecciones en Java
- Aprender a escribir pruebas para métodos que manejan colecciones

**Issues Sugeridos:**
1. #4 Implementación de la clase Catalogo
2. #5 Pruebas para métodos de búsqueda

**Tareas:**
1. Implementar la clase `Catalogo` con los siguientes métodos:
   - Agregar libro
   - Buscar libro por ISBN
   - Obtener todos los libros disponibles
2. Escribir pruebas unitarias que incluyan:
   - Pruebas con múltiples libros
   - Búsquedas exitosas y fallidas

**Ejemplo de Guía:**
```java
@BeforeEach
void setUp() {
    catalogo = new Catalogo();
    libro1 = new Libro("978-3-16-148410-0", "Clean Code", "Robert C. Martin");
    libro2 = new Libro("978-0-13-235088-4", "Clean Architecture", "Robert C. Martin");
    catalogo.agregarLibro(libro1);
    catalogo.agregarLibro(libro2);
}

@Test
void testBuscarPorIsbn() {
    Libro libro = catalogo.buscarPorIsbn("978-3-16-148410-0");
    assertNotNull(libro);
    assertEquals("Clean Code", libro.getTitulo());
}
```

### Milestone 3: Sistema de Préstamos
**Objetivos de Aprendizaje:**
- Aprender a usar Mockito para simular dependencias
- Practicar el uso de mocks en pruebas unitarias

**Issues Sugeridos:**
1. #6 Implementación de la clase Prestamo
2. #7 Implementación de SistemaPrestamos
3. #8 Pruebas con mocks

**Tareas:**
1. Implementar las clases:
   - `Prestamo` (fecha de préstamo, libro)
   - `SistemaPrestamos` (gestión de préstamos)
2. Escribir pruebas que utilicen mocks para:
   - Simular el catálogo de libros
   - Probar el flujo de préstamo

**Ejemplo de Guía:**
```java
@Mock
private Catalogo catalogo;

@InjectMocks
private SistemaPrestamos sistemaPrestamos;

@Test
void testPrestarLibro() {
    Libro libro = new Libro("978-3-16-148410-0", "Clean Code", "Robert C. Martin");
    when(catalogo.buscarPorIsbn("978-3-16-148410-0")).thenReturn(libro);
    
    Prestamo prestamo = sistemaPrestamos.prestarLibro("978-3-16-148410-0");
    
    assertNotNull(prestamo);
    verify(catalogo).buscarPorIsbn("978-3-16-148410-0");
    assertEquals(Estado.PRESTADO, libro.getEstado());
}
```

### Milestone 4: Sistema de Usuarios
**Objetivos de Aprendizaje:**
- Practicar el uso de múltiples mocks en una prueba
- Aprender a manejar excepciones en pruebas

**Issues Sugeridos:**
1. #9 Implementación de la clase Usuario
2. #10 Implementación de GestionUsuarios
3. #11 Pruebas con múltiples mocks

**Tareas:**
1. Implementar las clases:
   - `Usuario` (nombre, historial de préstamos)
   - `GestionUsuarios` (registro de usuarios)
2. Escribir pruebas que:
   - Utilicen múltiples mocks
   - Prueben el manejo de excepciones

**Ejemplo de Guía:**
```java
@Mock
private Catalogo catalogo;

@Mock
private SistemaPrestamos sistemaPrestamos;

@InjectMocks
private GestionUsuarios gestionUsuarios;

@Test
void testRegistrarPrestamo() {
    Usuario usuario = new Usuario("usuario1");
    Libro libro = new Libro("978-3-16-148410-0", "Clean Code", "Robert C. Martin");
    
    when(catalogo.buscarPorIsbn("978-3-16-148410-0")).thenReturn(libro);
    when(sistemaPrestamos.prestarLibro("978-3-16-148410-0"))
        .thenReturn(new Prestamo(libro));
    
    gestionUsuarios.registrarPrestamo("usuario1", "978-3-16-148410-0");
    
    verify(sistemaPrestamos).prestarLibro("978-3-16-148410-0");
    assertEquals(1, usuario.getHistorialPrestamos().size());
}
```

## Entregables
Cada etapa debe ser entregada a través de un Pull Request que incluya:
1. Código fuente implementado
2. Pruebas unitarias correspondientes
3. Documentación de los cambios realizados
4. Evidencia de que las pruebas pasan correctamente

## Consideraciones Éticas sobre el Uso de IA
El uso de Inteligencia Artificial (IA) como herramienta de asistencia en el desarrollo de software es una práctica cada vez más común. Sin embargo, es importante considerar los siguientes aspectos éticos:

1. **Transparencia y Honestidad**
   - Declarar el uso de IA en el desarrollo del trabajo
   - Documentar cómo se utilizó la IA como herramienta de asistencia
   - No presentar código generado por IA como propio sin revisión y comprensión

2. **Aprendizaje y Comprensión**
   - La IA debe ser utilizada como una herramienta de aprendizaje, no como un reemplazo del pensamiento crítico
   - Es fundamental entender el código generado y las pruebas implementadas
   - El estudiante debe ser capaz de explicar y justificar las decisiones tomadas

3. **Responsabilidad**
   - El estudiante es responsable final de la calidad y corrección del código
   - Las pruebas deben ser verificadas y validadas personalmente
   - El código debe ser revisado y comprendido antes de su entrega

4. **Uso Apropiado**
   - La IA debe ser utilizada para asistir en el aprendizaje, no para evadir el proceso de desarrollo
   - Las consultas a la IA deben ser específicas y enfocadas en el aprendizaje
   - No se debe depender exclusivamente de la IA para resolver problemas

5. **Integridad Académica**
   - El trabajo final debe reflejar el aprendizaje y comprensión del estudiante
   - La IA es una herramienta de asistencia, no un sustituto del aprendizaje
   - Se espera que el estudiante demuestre su comprensión de los conceptos a través de su implementación

## Recursos Adicionales
- [Documentación de JUnit5](https://junit.org/junit5/docs/current/user-guide/)
- [Documentación de Mockito](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html)
- [Guía de Maven](https://maven.apache.org/guides/)
