import java.util.*;
public class Main
	{

		static ArrayList questions = new ArrayList<Quiz>();
		
		public static void main(String[] args)
			{
				A a = new B(4);
				System.out.println(a.getNum());
			}
		
		public void addQuestions()
		{
			
			questions.add(new Quiz("A a = new B(); What will return if a.getANum() is called?",1,false,"5","10","17","15"));
			
			questions.add(new Quiz("A a = new B(4); What will the value of num be?",2, false, "40","20","25", "30"));
			
			questions.add(new Quiz("B b = new A(); What will return is b.getANum()",3, false, "17", "15" , "Error", "10"));
			
			questions.add(new Quiz(" ", 4, false, "", "", "", ""));
			
		}
		

	}
