package example;

public class Constructor {
	// Include the following class variables:
	// * make
	// * model
	// * numberOfDoors
	// * topSpeed
	// * price
	// All class variables should be declared case sensitive
	//
	// Write four constructors:
	// * The first constructor(with all parameters)
	// * A secondary constructor that does not include numberOfDoors, which should
	// default to 4
	// * A third constructor that does not include make and model; both default to
	// "unknown"
	// * A fourth constructor that does not include topSpeed and price; default to
	// 90 and 0 respectively.
	//
	// 2. Test your code with the Main.java class:
	// Create several Car objects using all Constructors and print their
	// fields/states to make sure it's correct. print your objects with variables in
	// your output each object
	String make;
	String model;
	int numberOfDoors;
	int toSpeed;
	double price;

	public Constructor(String a, String b, int c, int d, double e) {
		this.make=a;
		this.model=b;
		this.numberOfDoors=c;
		this.toSpeed=d;
		this.price=e;
		
	}

	public Constructor(String a, String b, int d, double e) {
		this.make=a;
		this.model=b;
		this.numberOfDoors=4;
		this.toSpeed=d;
		this.price=e;

	}

	public Constructor(int c, int d, double e) {
		this.make="unknown";
		this.model="unknown";
		this.numberOfDoors=c;
		this.toSpeed=d;
		this.price=e;
	}

	public Constructor(String a, String b, int c) {
		this.make=a;
		this.model=b;
		this.numberOfDoors=c;
		this.toSpeed=90;
		this.price=0.0;
	}
	
	public static void main(String[]args) {
		Constructor car1=new Constructor("Toyato","Corolla",4,120,20000);
		Constructor car2=new Constructor("Mazda","CX9",130,30000);
		Constructor car3=new Constructor(4,120,20000);
		Constructor car4=new Constructor("Honda","Civic",4);
		
		
		System.out.println("Make="+car1.make+", model="+car1.model+",number of doors="+car1.numberOfDoors+",speed="+car1.toSpeed+" ,price="+car1.price);
		System.out.println("Make="+car2.make+", model="+car2.model+",number of doors="+car2.numberOfDoors+",speed="+car2.toSpeed+" ,price="+car2.price);
		System.out.println("Make="+car3.make+", model="+car3.model+",number of doors="+car3.numberOfDoors+",speed="+car3.toSpeed+" ,price="+car3.price);
		System.out.println("Make="+car4.make+", model="+car4.model+",number of doors="+car4.numberOfDoors+",speed="+car4.toSpeed+" ,price="+car4.price);
	}

}
