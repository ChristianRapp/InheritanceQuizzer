import java.util.*;

	public class Quiz
		{
		private String question;
		private int questionNumber;
		//private boolean trueOrFalse;
		//private boolean isTOrF;
		private String correctAnswer;
		private String answer2;
		private String answer3;
		private String answer4;
		
		
		public Quiz(String q,int qn, String c1, String a2, String a3, String a4)
			{
			question = q;
			questionNumber = qn;
			correctAnswer = c1;
			answer2 = a2;
			answer3 = a3;
			answer4 = a4;
			}


		public String getQuestion() {
			return question;
		}


		public void setQuestion(String question) {
			this.question = question;
		}


		public int getQuestionNumber() {
			return questionNumber;
		}


		public void setQuestionNumber(int questionNumber) {
			this.questionNumber = questionNumber;
		}


		public String getCorrectAnswer() {
			return correctAnswer;
		}


		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}


		public String getAnswer2() {
			return answer2;
		}


		public void setAnswer2(String answer2) {
			this.answer2 = answer2;
		}


		public String getAnswer3() {
			return answer3;
		}


		public void setAnswer3(String answer3) {
			this.answer3 = answer3;
		}


		public String getAnswer4() {
			return answer4;
		}


		public void setAnswer4(String answer4) {
			this.answer4 = answer4;
		}
		
		
		
		
		}
