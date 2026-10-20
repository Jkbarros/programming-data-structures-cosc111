package problem1;


	class Payment 
	{
	    private double amount;  // instance variable amount

	    // default constructor to initialize amount with 0
	    public Payment(){
	        amount = 0.0;
	    }

	    // constructor to initialize amount with user given amount
	    public Payment(double amount) {
	        this.amount = amount;
	    }

	    // getter
	    public double getAmount() {
	        return amount;
	    }

	    // setter
	    public void setAmount(double amount) {
	        this.amount = amount;
	    }

	    // paymentDetails() method
	    public void paymentDetails() {
	        System.out.println("The amount of Payment is $"+amount);
	    }
	}

	// CashPayment Class derived form Payment
	class CashPayment extends Payment{

	    // default constructor which call super class default constructor
	    public CashPayment() {
	        super();
	    }

	    // parameterized constructor
	    public CashPayment(double amount) {
	        super(amount); // calling super class parameterized constructor
	    }

	    // paymentDetails() method
	    public void paymentDetails() {
	        System.out.println("Payment through Cash amount is $"+super.getAmount());
	    }
	}

	// driver class
	class Main {
	    public static void main(String[] args) {
	        // creating objects and calling paymentDetails methods
	        Payment p = new Payment(100);
	        p.paymentDetails();

	        CashPayment cp = new CashPayment(500);
	        cp.paymentDetails();
	    }
	}