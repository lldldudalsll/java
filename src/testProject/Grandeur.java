package testProject;

public class Grandeur {
	public String color;
	public String gear;
	public int price;
	
	public Grandeur() { // ������
		// ù ���ڰ� �빮���̰� �޼����� �̸��� class�� �̸��� ����
		// ������ �ܺο��� �� Ŭ������ �̿��ؼ� ��ü�� ���鶧 �� Ŭ������ ���� ���� ȣ��Ǵ� �κ� �꿡 ���ؼ� �޸𸮿� ��ü�� �ö�
		// ������ �� �� �ʿ��� ������ ����ϸ� �ȴ�.
		// �ʿ��� ������ ������ ������� �������.
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
