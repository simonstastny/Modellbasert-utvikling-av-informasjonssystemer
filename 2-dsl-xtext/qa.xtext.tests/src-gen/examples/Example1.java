package examples;
public class Example1 implements Runnable {
	
	private tdt4250.io.AbstractIO io = new tdt4250.io.ConsoleIO();
	
	public void run() {
		{
					Boolean answerValue = null;
					while (answerValue == null || (! evalResult(answerValue))) {
						answerValue = io.inputBoolean("Are you ready", "yes", "no");
					}
					}
		io.println("Section Math");
		{
					Double answerValue = null;
					while (answerValue == null || (! evalResult(answerValue >= 4.0 - 0.0 && answerValue <= 4.0 + 0.0))) {
						answerValue = io.inputDouble("What is 2 + 2");
					}
					}
		{
					Double answerValue = null;
					while (answerValue == null || (! evalResult(answerValue >= 0.0 - 0.0 && answerValue <= 0.0 + 0.0))) {
						answerValue = io.inputDouble("What is 2 - 2");
					}
					}
		{
					Double answerValue = null;
					while (answerValue == null || (! evalResult(answerValue >= Math.sqrt(2) - 0.0010 && answerValue <= Math.sqrt(2) + 0.0010))) {
						answerValue = io.inputDouble("What is the square root of 2");
					}
					}
		
		io.println("Section Geography");
		{
					Integer answerValue = null;
					while (answerValue == null || (! evalResult(answerValue.equals(3)))) {
						answerValue = io.inputOption("Where is Norway", "In the middle of somewhere", "In the middle of anywhere", "In the middle of nowhere");
					}
					}
		{
					String answerValue = null;
					while (answerValue == null || (! evalResult(answerValue.equals("Oslo")))) {
						answerValue = io.inputString("What is the capitol of Norway");
					}
					}
	}

	public Boolean evalResult(Boolean result) {
		if (result == null) {
			return false;
		}
		io.println(result ? "Correct!" : "Wrong, try again!");
		return result;
	}

	public static void main(String[] args) {
		new Example1().run();
	}
}
