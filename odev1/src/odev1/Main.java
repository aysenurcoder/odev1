package odev1;

public class Main {

	public static void main(String[] args) {
		Course course1=new Course(1,"C# + Angular","Engin Demiroğ");
		Course course2=new Course(2,"Java + React","Engin Demiroğ");
		
		Course[] courses = {course1, course2};
		
		for(Course course : courses) {
			System.out.println(course.instructor + " " + course.courseName);
		}
		System.out.println("kurs sayısı: "+courses.length);
		
		CourseManager  courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course1);
		courseManager.add(course2);
		
	}

}
