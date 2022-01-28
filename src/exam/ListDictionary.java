package exam;

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class ListDictionary<K, V> implements Dictionary<K,V> {
    private List<K> keys;
    private List<V> values;

    public ListDictionary() {
       keys = new ArrayList<>();
       values = new ArrayList<>();
    }

    @Override
    public Option<V> get(K key) {
        int i = 0;

        i = keys.indexOf(key);

        if(i != -1) {
          return Option.some(values.get(i));
        } else return Option.none();
    }

    @Override
    public V get(K key, V defaultValue) {
        int i = 0;

        i = keys.indexOf(key);

        if(i != -1) {
            return values.get(i);
        } else return defaultValue;
    }

    @Override
    public boolean containsKey(K key) {
        return keys.indexOf(key) != 1;
    }

    @Override
    public boolean put(K key, V value) {
        int i = 0;

        i = keys.indexOf(key);

        if(i != -1) {
            values.set(i, value);
            return false;
        } else {
            keys.add(key);
            values.add(value);
            return true;
        }
    }

    @Override
    public boolean update(K key, V value) {
        int i = 0;

        i = keys.indexOf(key);

        if(i != -1) {
            values.set(i, value);
            return true;
        } else return false;

    }

    @Override
    public void clear(K key) {
        int i = 0;

        i = keys.indexOf(key);

        if(i != -1) {
            keys.remove(i);
            values.remove(i);
        }
    }

    @Override
    public Stream<K> keyStream() {
        return keys.stream();
    }

    @Override
    public Stream<V> valueStream() {
        return values.stream();
    }
}
