package exam;

public class EmptyOptionException extends RuntimeException {

    public EmptyOptionException(String string) {
        super(string);
    }

    public EmptyOptionException() {
        super();
    }
}
