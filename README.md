# Calculadora en Java

Proyecto de la actividad **4.1 Control de Versiones (Git-GitHub)** del módulo Entornos de Desarrollo.

## Funcionalidades

La aplicación implementa las cuatro operaciones básicas:

- Suma
- Resta
- Multiplicación
- División (con control de división entre cero)

## Estructura del proyecto

- `Calculadora.java`: lógica de operaciones y menú por consola.
- `CalculadoraTest.java`: pruebas unitarias con JUnit 4.
- `.github/workflows/tests.yml`: workflow de GitHub Actions para ejecutar tests automáticamente en cada `push`.

## Ejecución local

Compilar:

```bash
javac Calculadora.java
```

Ejecutar:

```bash
java Calculadora
```

## Tests

El proyecto usa **JUnit 4** para validar operaciones y casos de error.

## Trabajo colaborativo

El repositorio se organiza con:

- Rama principal: `main`
- Ramas de alumnos: `nombre-ekip` y `nombre-Javier`

Las funcionalidades desarrolladas en cada rama se integran en `main` mediante merge conservando historial.