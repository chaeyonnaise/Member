package p1;

public class Member_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("tiger", "12345", "홍길동", 27, "hong@abc.com");
		System.out.println("->"+ m1.getId() + "" + m1.getName());
		
		
		
		Member m2 = new Member();
		
		m2.setId("lion");
		m2.setPw("54321");
		m2.setName("이순신");
		m2.setAge(62);
		m2.setMail("lee@abc.com");
		
		System.out.println("->"+ m2.getId() + "" + m2.getName());

	
	}

}
