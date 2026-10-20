# Lab — Binary file I/O

**Sources:** [`Problem1.java`](../lab_binary/lab_binary/src/lab_binary/Problem1.java), [`Problem2.java`](../lab_binary/lab_binary/src/lab_binary/Problem2.java), [`person.java`](../lab_binary/lab_binary/src/lab_binary/person.java) (includes `Writer`)  
**Course:** COSC 111 (EMU) · **Author:** Julio Barros

## Problem 1 — average of doubles (`numbers.dat`)

Reads sequential `double` values with `ObjectInputStream` until `EOFException`:

```java
ObjectInputStream inputStream = new ObjectInputStream(
    new FileInputStream("numbers.dat"));
while (true) {
    try {
        input = inputStream.readDouble();
        sum += input;
        count++;
    } catch (EOFException e) {
        break;
    }
}
double avg = sum / count;
```

Place a valid `numbers.dat` binary file in the working directory before running.

## Problem 2 — serialize `Person` records

`Problem2` builds five `Person` objects, saves the array to **`person.dat`**, clears memory, reloads, and prints:

```java
writer.add(new Person("Oliver", "Queen", 34));
// ...
writer.saveData();
writer.eraseData();
writer.loadData();
writer.printData();
```

`Person` implements `Serializable`; `Writer` uses `ObjectOutputStream` / `ObjectInputStream`.

## Run

Import `lab_binary/lab_binary`, run `Problem1` or `Problem2` with working directory set to the project folder (so `.dat` files resolve).
