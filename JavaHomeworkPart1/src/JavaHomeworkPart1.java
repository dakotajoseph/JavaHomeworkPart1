public class JavaHomeworkPart1 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int grade = 80;
			
			if (grade >= 90 && grade<=100) {
				System.out.println ("Grade is an A.");
			}
			
			else if (grade >=80 && grade <90) {
				System.out.println ("Grade is a B.");
			}
			
			else if (grade >= 70 && grade <80) {
				System.out.println ("Grade is a C.");
			}
					
			else if (grade < 70) {
				System.out.println ("Failing Grade");
			}
			
			else {
				System.out.println ("Please enter a grade between 0-100.");
			}

	}

}
