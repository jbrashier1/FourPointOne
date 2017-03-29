import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;
/**
 * Name: Jack Brashier
 * Date: 03/29/2017
 * Purpose: To demonstrate understanding of loops in Java.
 */
public class FourPointOne extends Application {
	@Override

	public void start(Stage primaryStage) {
	TextInputDialog nReader = new TextInputDialog("Enter a positive number:");
	nReader.setTitle("Loops");
	nReader.setHeaderText("N!, The sum of N odd numbers, and N Fibonacci numbers will return.");
	nReader.setContentText("N:");
	nReader.showAndWait();
	int n = Integer.parseInt(nReader.getResult());

	Alert results = new Alert(AlertType.INFORMATION);
	results.setTitle("Results");
	results.setHeaderText("Numbers found using " + n);
	
	// Factorial Loop
	int nFactorial = 1;
	int factLoopCount = n;
	do {
		nFactorial = (nFactorial * factLoopCount);
		factLoopCount--;
	} while (factLoopCount > 1);
	
	// Sum of Odds Loop
	int sumOfOdds = 0;
	int oddToAdd = 1;
	int oddLoopCount = n;
	do {
		sumOfOdds = sumOfOdds + oddToAdd;
		oddToAdd += 2;
		oddLoopCount--;			
	} while (oddLoopCount > 0);
	
	// Fibonacci Numbers
	int firstFib = 0;
	int secondFib = 1;
	int thirdFib;
	int fibLoopCount = n;
	String fibOutput = (Integer.toString(secondFib));
	do {
		thirdFib = firstFib + secondFib;
		firstFib = secondFib;
		secondFib = thirdFib;
		fibOutput = (fibOutput + "  " + thirdFib);
		fibLoopCount--;
	} while (fibLoopCount > 1);
	results.setContentText(n + "! is " + nFactorial + ", \nthe sum of the first " + n + " odd numbers is " + sumOfOdds + ", \nand the first " + n + " fibonacci numbers are " + fibOutput + ".");
	results.showAndWait(); 
	}	
}
