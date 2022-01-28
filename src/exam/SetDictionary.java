package exam;

import java.util.stream.Stream;

public class SetDictionary<K, V> implements Dictionary<K,V> {

    @Override
    public Option<V> get(K key) {
        return null;
    }

    @Override
    public V get(K key, V defaultValue) {
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public boolean put(K key, V value) {
        return false;
    }

    @Override
    public boolean update(K key, V value) {
        return false;
    }

    @Override
    public void clear(K key) {

    }

    @Override
    public Stream<K> keyStream() {
        return null;
    }

    @Override
    public Stream<V> valueStream() {
        return null;
    }
}
