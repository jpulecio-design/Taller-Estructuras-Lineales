# Taller de Estructuras Lineales

Implementacion en Java de ejercicios con arreglos unidimensionales, matrices y ArrayLists, aplicando principios de Programacion Orientada a Objetos, Clean Code y principios SOLID.

---

## Estudiante

- Juan Andrés Pulecio

---

## Asignatura

-Estructura de datos

---

## Descripcion

Taller academico desarrollado en Java desde consola. Cubre estructuras de datos lineales: arreglos unidimensionales, matrices y ArrayLists. Los datos de relleno se generan aleatoriamente y el codigo esta organizado siguiendo principios DRY, YAGNI, KISS y SOLID, con separacion de responsabilidades en metodos de generacion, procesamiento e impresion.

---

## Estructura del proyecto
```
Taller-Estructuras-Lineales/
│
├── src/
│   ├── arraylist/
│   ├── arreglos/
│   ├── matrices/
│   └── App.java
│
├── PartidoLiga.txt
└── README.md
```

---

## Instrucciones para ejecutar

### Requisitos
- Java JDK 11 o superior
- VS Code con Extension Pack for Java

### Desde VS Code
1. Abre la carpeta del proyecto en VS Code
2. Abre `App.java`
3. Presiona **Run** (▶) o `Ctrl + F5`

### Desde consola
```bash
javac -d bin src/**/*.java src/App.java
java -cp bin App
```