package method_shadowing;

public class CarDriver {
	public static void main(String[] args) {
		Vehicle v1=new ElectricCar();
		System.out.println(v1.i);
		System.out.println(v1.j);
		v1.run();
		
		Car c1=new ElectricCar();
		c1.run();
		System.out.println(c1.i);
		System.out.println(c1.j);
		
		
		
		
	}

}
