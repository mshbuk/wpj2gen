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

    static <T> Object some(T value) {
        Option object = new Option(value);
        return object;
    }

    static <T> void none() {
        Option object = new Option(null);
    }

    Exception EmptyOptionException;

    public <T> Object get() throws Exception {
        if (isEmpty == true) {
            throw EmptyOptionException;
        }
        return value;
    }

    public T getORDefault(T defaultValue) {
        if (isEmpty == true) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public boolean isNone() {
        if(isEmpty == true){
            return true;
        } else {
            return false;
        }
    }
}
