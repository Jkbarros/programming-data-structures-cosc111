# Lab — Hash table (open addressing)

**Source:** [`Lab/Lab/src/HashTable.java`](../Lab/Lab/src/HashTable.java)  
**Course:** COSC 111 - Programming and Data Structures (EMU) · **Author:** Julio Barros

## Behavior

- Fixed-size `String[]` (default length **100**).
- **Hash function:** sum of ASCII codes of each character, modulo table length.
- **Collision resolution:** linear probing with wrap-around (`(index + 1) % length`).
- **`put(String s)`** — skips duplicates; stops when table is full.
- **`containsString(String s)`** — probes until empty slot or match.

## Core logic

```java
private int hash(String s) {
    int sum = 0;
    for (int i = 0; i < s.length(); i++) {
        sum += s.charAt(i);
    }
    return sum % table.length;
}

public void put(String s) {
    int index = hash(s);
    while (table[index] != null) {
        if (table[index].equals(s)) return;
        index = (index + 1) % table.length;
    }
    table[index] = s;
}
```

## Run

Import `Lab/Lab` in Eclipse, create a small driver or use the course test harness, compile, and call `put` / `containsString` from `main`.
