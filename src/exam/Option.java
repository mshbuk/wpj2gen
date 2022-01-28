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

    public Option get() throws EmptyOptionException {
        if isEmpty == true {
            throw EmptyOptionException;
        }
        return value;
    }
}
