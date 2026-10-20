package lab_binary;

public class Problem2 {
        public static void main(String[] args) {
                // creating a Writer object
                Writer writer = new Writer();
                // adding 5 Person objects (you may change the name, age of each person
                // as you like)
                writer.add(new Person("Oliver", "Queen", 34));
                writer.add(new Person("John", "Doe", 32));
                writer.add(new Person("Kevin", "Hart", 39));
                writer.add(new Person("Adam", "Sandler", 52));
                writer.add(new Person("Will", "Jane", 50));
                // saving data to binary file
                writer.saveData();
                // deleting data from Person array in writer
                writer.eraseData();
                // loading back data from binary file to the array
                writer.loadData();
                // printing loaded data
                writer.printData();
        }
}

