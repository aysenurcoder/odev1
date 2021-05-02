package odev1;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"C# + Angular","Engin Demiro�");
		Course course2=new Course(2,"Java + React","Engin Demiro�");
		
		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			System.out.println(course.instructor + " " + course.courseName);
		}
		System.out.println("kurs say�s�: "+courses.length);
		
		CourseManager  courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.add(course2);
		
	}

}
