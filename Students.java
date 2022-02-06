package week3.day1.assignment4;


	public class Students {
		  private void studentInfo(int id)
		   { 
		      System.out.println("student id "+70);
		   }
		   private void studentInfo(String id,String name)
		   { 
		      System.out.printf("student id and name"+80 + "priya");
		   }
		   
		private void studentInfo(String email,int phonenumber)
		   {
			   System.out.println("student email and phonenumber" +"priyalindany@gmail.com" + 123567890);
		   }
		  public static void main(String args[]) {
		Students s =new Students();
		s.studentInfo(70);
		s.studentInfo("80"," Priya");
		s.studentInfo("priyalindany@gmail.com", 1234567890);
		

		   }
		}
	
	