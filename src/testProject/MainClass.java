package testProject;

public class MainClass {
	public static void main(String[] args) { // jvm이 제일 먼저 실행하는 메인 메서드
		
		// 특수문자 
		
		/*
		 * System.out.println("Good\nMorning~"); System.out.println("Good\tMorning~");
		 * 
		 * double d = 1.123456;
		 * 
		 * System.out.printf("d = %f\n", d);
		 */
		Grandeur myCar1 = new Grandeur(); // new Grandeur() 하는 순간 생성자 호출
		myCar1.color = "Black";
		myCar1.gear = "Auto";
		myCar1.price = 30000000;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		Grandeur myCar2 = new Grandeur();
		myCar2.color = "Red";
		myCar2.gear = "Auto";
		myCar2.price = 28000000;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		Bicycle myBike = new Bicycle("Black", 3800000);
		myBike.info();
		
		myBike.color = "Red";
		myBike.info();
		
		// class에서 생성되는 객체는 모두 다 다른공간에 존재한다.
		// 그리고 그 객체를 가르키는건 reference라고 한다.
		// reference와 객체는 new constructor() 로 연결되있지만 reference = null로 관계를 끊을 수 있다. 
		// 그러면 reference의 주소가 가르키는 것이 없게 되고 gc가 돌면서 회수해 감으로써 연결이 끊기게 된다.
	}
	
}
