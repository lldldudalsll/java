package testProject;

public class MainClass {
	public static void main(String[] args) { // jvm�� ���� ���� �����ϴ� ���� �޼���
		
		// Ư������ 
		
		/*
		 * System.out.println("Good\nMorning~"); System.out.println("Good\tMorning~");
		 * 
		 * double d = 1.123456;
		 * 
		 * System.out.printf("d = %f\n", d);
		 */
		Grandeur myCar1 = new Grandeur(); // new Grandeur() �ϴ� ���� ������ ȣ��
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
		
		// class���� �����Ǵ� ��ü�� ��� �� �ٸ������� �����Ѵ�.
		// �׸��� �� ��ü�� ����Ű�°� reference��� �Ѵ�.
		// reference�� ��ü�� new constructor() �� ����������� reference = null�� ���踦 ���� �� �ִ�. 
		// �׷��� reference�� �ּҰ� ����Ű�� ���� ���� �ǰ� gc�� ���鼭 ȸ���� �����ν� ������ ����� �ȴ�.
	}
	
}
