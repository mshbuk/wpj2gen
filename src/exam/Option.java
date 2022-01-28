package exam;

public class Option<T> {

    private T value;
    private boolean isEmpty;

    private Option(T value) {
        isEmpty = true;
        this.value = value;
    }

    private Option() {
        isEmpty = true;
    }

    public static <T> Option some(T value) {
        Option object = new Option<>(value);
        return object;
    }

    public static Option none() {
        Option object = new Option<>(null);
        return object;
    }

    EmptyOptionException e = new EmptyOptionException();

    public <T> Object get() throws RuntimeException {
        if (isEmpty == true) {
            throw e;
        } else return value;
    }

    public T getORDefault(T defaultValue) {
        if (isEmpty == true) {
            return defaultValue;
        } else return value;
    }

    public boolean isNone() {
        if(isEmpty == true){
            return true;
        } else return false;
    }
}
