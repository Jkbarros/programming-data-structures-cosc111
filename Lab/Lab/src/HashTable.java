public class HashTable {
        // defining a String array and an integer as instance variables
        private String table[];
        private int size;

        // constructor to initialize an array of size 100 (change as needed)
        public HashTable() {
                table = new String[100];
                size = 0;
        }

        // private method to compute the hash of a String
        private int hash(String s) {
                int sum = 0;
                // adding ASCII values of each char in s
                for (int i = 0; i < s.length(); i++) {
                        sum += s.charAt(i);
                }
                // returning remainder of operation sum/table.length, to return a valid position
                // on table array
                return sum % table.length;
        }

        // method to add a String to the table
        public void put(String s) {
                // if array is full, returning
                if (size == table.length)
                        return;

                // else hashing and finding possible index to add s
                int index = hash(s);
                // looping as long as this value at position is not null
                while (table[index] != null) {
                        // if value at this pos equals s, returning (duplicate, not added again)
                        if (table[index].equals(s)) {
                                return;
                        }
                        // else advancing to next index and wrapping around if needed
                        index = (index + 1) % table.length;
                }
                // adding s at index pos
                table[index] = s;
        }

        // method to check if s is on the table
        public boolean containsString(String s) {
                // finding possible index
                int index = hash(s);
                // looping as long as value at index is not null
                while (table[index] != null) {
                        // if value equals s, returning true.
                        if (table[index].equals(s)) {
                                return true;
                        }
                        // else advancing to next index and wrapping around if needed
                        index = (index + 1) % table.length;
                }
                // not found. returning false
                return false;
        }

}