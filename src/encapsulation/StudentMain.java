package encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.getName();
		System.out.println(student1.getName());
		
		
		System.out.println(student1.getAge());
		
		//uodating age
		student1.setAge(10);
		System.out.println(student1.getAge());

	}

}
