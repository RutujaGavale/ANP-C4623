//Printing Student Data Using Getter And Setter Methods
package corejava;

class Student
{
	//creating the fields of student data
	private int id;
	private String name;
	private int age;
	//Creating Getter And Setter Methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
