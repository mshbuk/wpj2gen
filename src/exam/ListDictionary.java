package exam;

import java.util.List;
import java.util.stream.Stream;

public class ListDictionary<K, V> implements Dictionary {
    List<K> keys;
    List<V> values;

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
