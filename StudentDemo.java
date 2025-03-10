class Student {
	private String name;
	private int id;
	private double gpa;
	private static int studentCount;

	public Student(String name, int id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
		studentCount++;
	}
	
	public void displayStudentInfo(){
	    System.out.println("Student Id: " + id + ", Student Name: " + name + ", GPA: " + gpa);
	}
	
	public static void displayStudentCount() {
	    System.out.println("Total Students: "+ studentCount);
	}
}

public class StudentDemo {
	public static void main(String[] args) {
	    Student student1 = new Student("Bryce", 23, 3.43);
	    Student student2 = new Student("Anrie", 15, 3.03);
	    Student student3 = new Student("Bombales", 13, 4.77);
	    student1.displayStudentInfo();
	    student2.displayStudentInfo();
	    student3.displayStudentInfo();
	    
	    Student.displayStudentCount();
	}
}