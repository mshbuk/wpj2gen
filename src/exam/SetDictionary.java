package exam;

import java.util.stream.Stream;

public class SetDictionary<K, V> implements Dictionary{

    @Override
    public Option get(Object key) {
        return null;
    }

    @Override
    public Object get(Object key, Object defaultValue) {
        return null;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean put(Object key, Object value) {
        return false;
    }

    @Override
    public boolean update(Object key, Object value) {
        return false;
    }

    @Override
    public void clear(Object key) {

    }

    @Override
    public Stream keyStream() {
        return null;
    }

    @Override
    public Stream valueStream() {
        return null;
    }
}
