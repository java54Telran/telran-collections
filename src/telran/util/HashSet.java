package telran.util;

import java.util.Iterator;

public class HashSet<T> implements Set<T> {
	private static final int DEFAULT_HASH_TABLE_LENGTH = 16;
	private static final float DEFAULT_FACTOR = 0.75f;
	List<T> [] hashTable;
	int size;
	float factor;
	@SuppressWarnings("unchecked")
	public HashSet(int hashTableLength, float factor) {
		hashTable = new List[hashTableLength];
		this.factor = factor;
	}
	public HashSet() {
		this(DEFAULT_HASH_TABLE_LENGTH, DEFAULT_FACTOR);
	}
	@Override
	public boolean add(T obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(T pattern) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(T pattern) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T get(T pattern) {
		// TODO Auto-generated method stub
		return null;
	}

}
