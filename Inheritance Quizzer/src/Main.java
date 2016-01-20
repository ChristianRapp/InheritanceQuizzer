import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.IOException;


public class Main
	{

	static String name = "";
	static int score =0;
	
	
		static ArrayList<Quiz> questions = new ArrayList<Quiz>();
		
		public static void main(String[] args) throws IOException
			{
			A a = new A();
			System.out.println(a.changeStr());
			
			   addQuestions();
			   mainMenu();
			   askQuestions();
				//B b = new B();
				//System.out.println(b.getANum());
			}
		
		public static void askQuestions()
		{
			Collections.shuffle(questions);
			
			for(Quiz fred: questions)
			{
				System.out.println(fred.getQuestion());
			}
			
		}
		
		public static void mainMenu() throws IOException
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Would you like to have you name(1) or remain anonymous(2)");
			switch(userInput.nextInt())
			{
			case 1:
				{
				System.out.println("What is your name?");
				name = userInput.nextLine();
				}
			case 2:	
				{
				name = "anonymous";
				}
			}
			
			System.out.println("Would you like to take the quiz(1) or check the high scores(2)?");
			switch(userInput.nextInt())
			{
			case 1:
				{
				System.out.println("What is your name?");
				}
			case 2:	
				{
				printScores();
				}
			}
		}
		
		public static void writeScores() throws FileNotFoundException, UnsupportedEncodingException
		{
			
			PrintWriter writer = new PrintWriter("Scores.txt", "UTF-8");
			writer.println(name + ":" + score);
			writer.close();
			
		}
		
		public static void printScores() throws IOException
		{
			BufferedReader file = new BufferedReader(new FileReader("Scores.txt"));  

			String line = null;
			
			while((line = file.readLine()) != null)
			{
				System.out.println(line);
			} 	
		}
		
		public static void addQuestions()
		{
			
			questions.add(new Quiz("A a = new B(); What will return if a.getANum() is called?",1,"5","Error","17","15"));
			
			questions.add(new Quiz("A a = new B(4); What will the value of num be?",2, "40","20","Error", "30"));
			
			questions.add(new Quiz("B b = new A(); What will return is b.getANum()",3, "Error", "15" , "17", "10"));
			
			questions.add(new Quiz("B b = new A(3); What will the value of num be?", 4,  "Error", "14", "15", "30"));
			
			questions.add(new Quiz("B b = new A(); What will b.changeStr return?", 5,  "Error", "STR2", "STR1", "STR"));
			
			questions.add(new Quiz("B b = new B(); What will b.getANum() return?", 6,  "17", "10", "5", "15"));

			
			questions.add(new Quiz("B b = new B(); What will b.changeStr() return?", 7,  "STR2", "STR1", "Error", "STR"));

			questions.add(new Quiz("B b = new B(2); What will b.getNumber() return?", 8,  "15", "20", "10", "5"));
			
			questions.add(new Quiz("A a = new A(); What will a.getANum() return?", 9,  "5", "10", "15", "1"));
			
			questions.add(new Quiz("A a = new A(): What will a.changeStr() return?", 10,  "STR1", "STR2", "Error", "STR"));
			
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
