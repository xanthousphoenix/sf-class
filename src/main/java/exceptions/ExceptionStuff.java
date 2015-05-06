package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class BrokenStuffException extends Exception {

	public BrokenStuffException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BrokenStuffException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BrokenStuffException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BrokenStuffException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BrokenStuffException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
public class ExceptionStuff {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("stuff.txt"));
		     PrintWriter pr = new PrintWriter(new FileWriter("copy.txt"));) {
			if (Math.random() > 0.5) {
				throw new BrokenStuffException();
			}
		} catch (IOException | BrokenStuffException e) {
			e.printStackTrace();
		}
		
	}

}
