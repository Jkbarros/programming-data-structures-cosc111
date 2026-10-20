# Project — JavaFX checkerboard (Exercise 14.6)

**Source:** [`Project Java.txt`](../Project%20Java.txt) (Liang textbook exercise)  
**Course:** COSC 111 (EMU) · **Author:** Julio Barros

Desktop JavaFX app that draws an **8×8 checkerboard** with alternating black and white `Rectangle` nodes on a `GridPane`.

```java
for (int i = 0; i < 8; i++) {
    for (int j = 0; j < 8; j++) {
        Rectangle r = new Rectangle(s, s, s, s);
        if (count % 2 == 0)
            r.setFill(Color.WHITE);
        pane.add(r, j, i);
        count++;
    }
}
```

## Run (JavaFX)

1. Add JavaFX SDK / module path to the Eclipse project (course setup).
2. Copy the class from `Project Java.txt` into `src` as `Exercise_14_06.java`.
3. Run the `Application` class (`start` method launches the stage).

This file is kept as `.txt` from the original export; the markdown here documents intent without duplicating the full listing.
