package exception;

public class MyBusinessException extends Exception {

	public MyBusinessException() {
	}

	public MyBusinessException(String message) {
		super(message);
	}

	public MyBusinessException(Throwable cause) {
		super(cause);
	}

	public MyBusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public MyBusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
