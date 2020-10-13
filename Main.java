/**
 * a method named lastDigit that returns the last digit of an integer.
 * @author Ahmad Zeshan
 */
public class Main {

    
   public static int lastDigit(int userInt){
        //find the last digit of the number
				 int ans = userInt % 10;
				// return the last digit
				return ans;
	 }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   //store last num as the last digit of the given value 
	 int lastNum = lastDigit(38);
	 //print out the value to the user 
	 System.out.println(lastNum);
	}
}
