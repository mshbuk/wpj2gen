package exam;

import java.util.HashSet;
import java.util.stream.Stream;
import java.util.Set;

public class SetDictionary<K, V> implements Dictionary<K,V> {
    private Set<Pair<K,V>> entries;

    public SetDictionary() {
        entries = new HashSet<>();
    }

    @Override
    public Option<V> get(K key) {
        for(Pair<K,V> pair:entries) {
            if(pair.first.equals(key)) {
                return Option.some(pair.second);
            }
        }
        return Option.none();
    }

    @Override
    public V get(K key, V defaultValue) {
        for(Pair<K,V> pair:entries) {
            if(pair.first.equals(key)){
                return pair.second;
            }
        }
        return defaultValue;
    }

    @Override
    public boolean containsKey(K key) {
        for(Pair<K,V> pair:entries) {
            if(pair.first.equals(key)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean put(K key, V value) {
        for(Pair<K,V> pair:entries) {
            if(pair.first.equals(key)){
                pair.second = value;
                return false;
            }
        }
        entries.add(new Pair<>(key,value));
        return true;
    }

    @Override
    public boolean update(K key, V value) {
        for(Pair<K,V> pair:entries) {
            if(pair.first.equals(key)){
                pair.second = value;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear(K key) {
        for(Pair<K,V> pair:entries) {
            if(pair.first.equals(key)){
                entries.remove(pair);
            }
        }
    }

    @Override
    public Stream<K> keyStream() {
        return entries.stream().map((pair)-> pair.first);
    }

    @Override
    public Stream<V> valueStream() {
        return entries.stream().map((pair)->pair.second);
    }
}
