package problem1;

	/**
	 * Truck class inherits from Vehicle
	 */
	public class Truck extends Vehicle {
	        // instance variables
	        private double loadCapacityInTons;
	        private int towingCapacity;

	        /**
	         * Parameterized constructor
	         * 
	         * @param manufacturerName
	         * @param noOfCylinders
	         * @param owner
	         * @param loadCapacityInTons
	         * @param towingCapacity
	         */
	        public Truck(String manufacturerName, int noOfCylinders, Person owner, double loadCapacityInTons,
	                        int towingCapacity) {
	                // call to super class constructor
	                super(manufacturerName, noOfCylinders, owner);
	                this.loadCapacityInTons = loadCapacityInTons;
	                this.towingCapacity = towingCapacity;
	        }

	        /**
	         * @return the loadCapacityInTons
	         */
	        public double getLoadCapacityInTons() {
	                return loadCapacityInTons;
	        }

	        /**
	         * @param loadCapacityInTons the loadCapacityInTons to set
	         */
	        public void setLoadCapacityInTons(double loadCapacityInTons) {
	                this.loadCapacityInTons = loadCapacityInTons;
	        }

	        /**
	         * @return the towingCapacity
	         */
	        public int getTowingCapacity() {
	                return towingCapacity;
	        }

	        /**
	         * @param towingCapacity the towingCapacity to set
	         */
	        public void setTowingCapacity(int towingCapacity) {
	                this.towingCapacity = towingCapacity;
	        }

	        /**
	         * returns the String representation
	         */
	        @Override
	        public String toString() {
	                return super.toString() + ", " + loadCapacityInTons + ", " + towingCapacity;
	        }

	}
