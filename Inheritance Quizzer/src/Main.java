import java.util.*;
public class Main
	{

		static ArrayList questions = new ArrayList<Quiz>();
		
		public static void main(String[] args)
			{
				B b = new B();
				System.out.println(b.getANum());
			}
		
		public void addQuestions()
		{
			
			questions.add(new Quiz("A a = new B(); What will return if a.getANum() is called?",1,"5","Error","17","15"));
			
			questions.add(new Quiz("A a = new B(4); What will the value of num be?",2, "40","20","Error", "30"));
			
			questions.add(new Quiz("B b = new A(); What will return is b.getANum()",3, "Error", "15" , "17", "10"));
			
			questions.add(new Quiz("B b = new A(3); What will the value of num be?", 4,  "Error", "14", "15", "30"));
			
			questions.add(new Quiz("B b = new B(); What will b.getANum() return?", 5,  "17", "10", "5", "15"));
			
			questions.add(new Quiz("", 6,  "", "", "", ""));
			
			questions.add(new Quiz("", 7,  "", "", "", ""));

			questions.add(new Quiz("", 8,  "", "", "", ""));
			
			questions.add(new Quiz("", 9,  "", "", "", ""));
			
			questions.add(new Quiz("", 10,  "", "", "", ""));
			
			questions.add(new Quiz("", 11,  "", "", "", ""));
			
			questions.add(new Quiz("", 12,  "", "", "", ""));
			
			questions.add(new Quiz("", 13,  "", "", "", ""));
			
			questions.add(new Quiz("", 14,  "", "", "", ""));
			
			questions.add(new Quiz("", 15,  "", "", "", ""));
			
			questions.add(new Quiz("", 16,  "", "", "", ""));
			
			questions.add(new Quiz("", 17,  "", "", "", ""));
			
			questions.add(new Quiz("", 18,  "", "", "", ""));
			
			questions.add(new Quiz("", 19,  "", "", "", ""));
			
			questions.add(new Quiz("", 20,  "", "", "", ""));
			
			questions.add(new Quiz("", 21,  "", "", "", ""));
			
			questions.add(new Quiz("", 22,  "", "", "", ""));
			
			questions.add(new Quiz("", 23,  "", "", "", ""));
			
			questions.add(new Quiz("", 24,  "", "", "", ""));
		}
		

	}
