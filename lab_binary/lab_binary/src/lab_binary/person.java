package lab_binary;

import java.io.Serializable;

public class Person implements Serializable {

private String fName, lName;

private int age;

public Person(String f, String l, int a)

{

fName = f;

lName = l;

age = a;

}

public String toString() {

return fName + " " + lName + " " + age;

}

}

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

public class Writer {

private static final String FILENAME = "person.dat";

public static final int MAXRECORDS = 100;

private int currNumRecords = 0;

Person[] data;

public void add(Person p) {

if (data == null)

data = new Person[MAXRECORDS];

data[currNumRecords] = p;

currNumRecords++;

}

public void saveData() {

try {

ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILENAME));

outputStream.writeObject(data);

outputStream.close();

} catch (IOException e) {

System.out.println("Error: " + e.getMessage());

}

}

public void eraseData() {

data = null;

}

public void loadData() {

try {

ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILENAME));

data = (Person[]) inputStream.readObject();

inputStream.close();

// Recalculate number of entries

int numEntries = 0;

for (Person p : data) {

if (p != null)

numEntries++;

}

currNumRecords = numEntries;

} catch (ClassNotFoundException e) {

System.out.println("Person class not found.");

} catch (IOException e) {

System.out.println("Error: " + e.getMessage());

}

}

public void printData() {

for (int i = 0; i < currNumRecords; i++) {

System.out.println(i);

System.out.println(data[i]);

}

}

}