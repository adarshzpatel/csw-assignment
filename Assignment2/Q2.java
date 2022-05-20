package Assignment2;

import java.util.LinkedList;

class Student{
	String name;
	int age;
	int marks;
	
	Student(String _name,int _age,int _marks){
		this.name = _name;
		this.age = _age;
		this.marks = _marks;
	}
	
	public String toString() {
		return "{ Name : " + this.name + " | Age : " + this.age + " | Marks : " + this.marks + "}";
	}
	
}

class StudentData{
	private LinkedList<Student> studentList = new LinkedList<Student>();
	
	public void display() {
		System.out.println("Displaying Student List");
		System.out.println("[");
		for(Student stud:studentList) {
			System.out.println( " " + stud.toString() + ",");
		}
		System.out.println("]");
		System.out.println("----------------------------");
		System.out.println();
	}
	
	public void addStudent(String _name,int _age,int _marks) {
		//create a new student object from incoming data
		Student newStudent = new Student(_name,_age,_marks);
		// add the student object to the list ;
		studentList.add(newStudent);
		System.out.println(newStudent.toString() + " Added !");
		System.out.println("----------------------------");
		System.out.println();

	}
	
	public int search(Student _s) {
		for(Student s:studentList) {
			// check the contains of the object
			if(s.name == _s.name && s.age == _s.age && s.marks == _s.marks) {
				System.out.println("Student Exists!");
				System.out.println();
				//returning index of the object
				return studentList.indexOf(s);
			}
		}
		System.out.println("Student doesn't exist");
		System.out.println();

		return -1;
		
	}
	
	public int countStudents() {
		// returns the total count of students 
		return studentList.size();
		
	}
	
	public void removeStudent(Student stud) {
		// Takes a a student object and removes it from the list 
		int i = search(stud);
		
		if(i == -1) {			
			System.out.println("This student doesn't exist !!. ");
			return;
		}
		
		studentList.remove(i);
		System.out.println(stud.toString() + " removed from list .");
		System.out.println("----------------------------");
		System.out.println();

	}
	 
	
}

public class Q2 {
 
	public static void main(String[] args) {
		StudentData data = new StudentData();
		data.addStudent("Adarsh", 20, 100);
		data.addStudent("Nishikant", 19, 99);
		data.addStudent("Ayushmaan", 20, 98);
		data.display();
		System.out.println("Total number of students : " + data.countStudents());
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("Removing Student..");
		Student toDelete = new Student("Adarsh",20,100);
		data.removeStudent(toDelete);
		System.out.println("----------------------------");
		System.out.println();
		System.out.println("Removing Nonexistent Student..");
		Student toDelete2 = new Student("Rahul",20,100);
		data.removeStudent(toDelete2);
		
	}

}
