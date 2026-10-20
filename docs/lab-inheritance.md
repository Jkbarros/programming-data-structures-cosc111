# Lab — Inheritance

**Sources:** [`Vehicle.java`](../lab_inheritance/lab_inheritance/src/problem1/Vehicle.java), [`Truck.java`](../lab_inheritance/lab_inheritance/src/problem1/Truck.java), [`Person.java`](../lab_inheritance/lab_inheritance/src/problem1/Person.java), [`problem1.java`](../lab_inheritance/lab_inheritance/src/problem1/problem1.java)  
**Course:** COSC 111 (EMU) · **Author:** Julio Barros

## Vehicle hierarchy

- **`Vehicle`** — `manufacturerName`, `noOfCylinders` (clamped 4–6), composed **`Person` owner**.
- **`Truck extends Vehicle`** — adds `loadCapacityInTons` and `towingCapacity`; calls `super(...)` in constructor.
- **`toString()`** overridden on both classes for readable output.

```java
public class Truck extends Vehicle {
    public Truck(String manufacturerName, int noOfCylinders, Person owner,
                 double loadCapacityInTons, int towingCapacity) {
        super(manufacturerName, noOfCylinders, owner);
        this.loadCapacityInTons = loadCapacityInTons;
        this.towingCapacity = towingCapacity;
    }
}
```

## Payment hierarchy (same Eclipse project)

`problem1.java` also defines **`Payment`** and **`CashPayment extends Payment`**, demonstrating `super()` and overriding `paymentDetails()`:

```java
Payment p = new Payment(100);
p.paymentDetails();

CashPayment cp = new CashPayment(500);
cp.paymentDetails();
```

Run class **`Main`** inside `problem1.java` for the payment demo.
