package odev1;

public class Course {
	public Course() {
		System.out.println("Kurs olu�turludu");
	}
	public Course(int id,String courseName, String instructor) {
		this();
		this.id=id;
		this.courseName=courseName;
		this.instructor=instructor;
	}
	
	int id;
	String courseName;
	String instructor;

}
