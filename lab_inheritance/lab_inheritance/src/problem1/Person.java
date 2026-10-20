package problem1;



public class Person {
        // instance variables
        private String name;

        /**
         * no argument constructor
         */
        public Person() {
                this.name = "";
        }

        /**
         * one argument constructor
         * 
         * @param name
         */
        public Person(String name) {
                this.name = name;
        }

        public Person(Person p) {
                this.name = p.name;
        }

        /**
         * getter of name
         * 
         * @return the name
         */
        public String getName() {
                return name;
        }

        /**
         * setter of name
         * 
         * @param name the name to set
         */
        public void setName(String name) {
                this.name = name;
        }

        /**
         * toString method
         */
        @Override
        public String toString() {
                return name;
        }

        /**
         * equals method
         */
        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                Person other = (Person) obj;
                if (name == null) {
                        if (other.name != null)
                                return false;
                } else if (!name.equals(other.name))
                        return false;
                return true;
        }

}