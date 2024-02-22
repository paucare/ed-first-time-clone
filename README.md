# Proyecto: App abierta por primera vez
App que muestra distintos mensajes si es la primera vez que se abre o si ya se ha abierto 5 veces.

Esta app es introductoria a los test unitarios.

## Test Unitarios
Los tests unitarios son una metodología de pruebas en el desarrollo de software que consiste en verificar la correcta ejecución y comportamiento de una parte específica de un programa, conocida como "unidad". Esta unidad puede ser una función, un método, un procedimiento, un módulo o cualquier otro bloque de código que pueda ser probado de manera aislada.

El objetivo de los tests unitarios es asegurar que cada unidad funcione correctamente por separado antes de integrarla con otras partes del sistema. Esto ayuda a identificar y solucionar errores en las fases tempranas del desarrollo, lo cual puede ahorrar mucho tiempo y recursos en etapas posteriores.

Los tests unitarios se caracterizan por:

1. **Automatización**: Se escriben y ejecutan a través de herramientas y frameworks de pruebas específicos para cada lenguaje de programación, como JUnit para Java, NUnit para .NET, PyTest para Python, etc.
2. **Aislamiento**: Cada test unitario debe ser independiente de los demás para evitar que el resultado de una prueba afecte a otra. Esto a menudo requiere simular (mocking o stubbing) las dependencias externas de la unidad, como bases de datos o servicios web.
3. **Repetibilidad**: Deben poder ejecutarse en cualquier momento y en cualquier entorno, siempre con el mismo resultado si no ha habido cambios en el código.
4. **Especificidad**: Cada prueba debe enfocarse en un aspecto concreto de la unidad, lo que permite identificar rápidamente la causa de cualquier fallo.

Implementar tests unitarios conlleva varios beneficios, como mejorar la calidad del código, facilitar los cambios y las actualizaciones al código base, documentar el comportamiento de las unidades y apoyar las prácticas de desarrollo ágil, como la integración continua (CI) y el despliegue continuo (CD).

Sin embargo, escribir buenos tests unitarios también requiere un esfuerzo adicional al principio y una curva de aprendizaje para saber cómo diseñar las unidades de manera que sean fácilmente testeables, además de conocer el uso efectivo de los frameworks de pruebas.
