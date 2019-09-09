package testProject;

public class Grandeur {
	public String color;
	public String gear;
	public int price;
	
	public Grandeur() { // 생성자
		// 첫 글자가 대문자이고 메서드의 이름이 class의 이름과 동일
		// 생성자 외부에서 이 클래스를 이용해서 객체를 만들때 이 클래스의 가장 먼저 호출되는 부분 얘에 의해서 메모리에 객체가 올라감
		// 생성을 할 때 필요한 내용을 기술하면 된다.
		// 필요한 내용이 없으면 비워놔도 상관없음.
		System.out.println("Grandeur Construnctor");
	}
	
	public void run() {
		System.out.println(" -- run() -- ");
	}
	
	public void stop() {
		System.out.println(" -- stop() -- ");
	}
	
	public void info() {
		System.out.println(" -- info() -- ");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
}
