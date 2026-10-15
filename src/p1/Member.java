package p1;

public class Member {
	private String id;
	private String pw;
	private String name;
	private int age;
	private String mail;
	
	public Member(){//생성자를 위한
	}
	
	public Member(String id, String pw, String name, int age, String mail) {//getter setter
		
		// TODO Auto-generated constructor stub
		this.id =id;
		this.pw =pw;
		this.name = name;
		this.age =  age;
		this.mail = mail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
