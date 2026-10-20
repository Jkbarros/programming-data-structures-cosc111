# Repository guide — COSC 111

Start with the **[labs catalog](labs-catalog.md)** for links to each lab write-up.

## Eclipse import paths

| Lab | Import this folder |
|-----|-------------------|
| Hash table | `Lab/Lab` |
| Binary I/O | `lab_binary/lab_binary` |
| Inheritance | `lab_inheritance/lab_inheritance` |
| Polymorphism | `lab_polymorphism/lab_polymorphism copy` |

Each folder contains `.project` and `.classpath` from the course export.

## File types

- **`src/**/*.java`** — source to read and run
- **`bin/**`** — precompiled `.class` from export (optional; recompile in IDE)
- **`Output.png`**, **`Project Java.txt`** — coursework artifacts at repo root

## Tips

- For binary labs, run with working directory = project root so `numbers.dat` / `person.dat` resolve.
- JavaFX project code lives in `Project Java.txt`; see [project-javafx-checkerboard.md](project-javafx-checkerboard.md).
