package problem1;

	/**
	 * Vehicle class
	 */
	public class Vehicle {
	        // instance variables
	        private String manufacturerName;
	        private int noOfCylinders;
	        private Person owner;

	        /**
	         * no argument constructor
	         */
	        public Vehicle() {
	                this.manufacturerName = "";
	                this.noOfCylinders = 4;
	                this.owner = new Person();
	        }

	        /**
	         * Parameterized constructor
	         * 
	         * @param manufacturerName
	         * @param noOfCylinders
	         */
	        public Vehicle(String manufacturerName, int noOfCylinders, Person owner) {
	                this.manufacturerName = manufacturerName;
	                this.setNoOfCylinders(noOfCylinders);
	                this.owner = owner;
	        }

	        /**
	         * @return the manufacturerName
	         */
	        public String getManufacturerName() {
	                return manufacturerName;
	        }

	        /**
	         * @param manufacturerName the manufacturerName to set
	         */
	        public void setManufacturerName(String manufacturerName) {
	                this.manufacturerName = manufacturerName;
	        }

	        /**
	         * @return the noOfCylinders
	         */
	        public int getNoOfCylinders() {
	                return noOfCylinders;
	        }

	        /**
	         * @param noOfCyinders the noOfCyinders to set
	         */
	        public void setNoOfCylinders(int noOfCylinders) {
	                // typically 4-6
	                if (noOfCylinders >= 4 && noOfCylinders <= 6)
	                        this.noOfCylinders = noOfCylinders;
	                else
	                        this.noOfCylinders = 4;
	        }

	        /**
	         * @return the owner
	         */
	        public Person getOwner() {
	                return owner;
	        }

	        /**
	         * @param owner the owner to set
	         */
	        public void setOwner(Person owner) {
	                this.owner = owner;
	        }

	        /**
	         * returns the String representation
	         */
	        @Override
	        public String toString() {
	                return owner.toString() + ", " + manufacturerName + ", " + noOfCylinders;
	        }

	}

