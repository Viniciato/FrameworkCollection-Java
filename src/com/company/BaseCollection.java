package com.company;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Colecao base para o exercicio, nao deve ser alterada.
 * @author andres
 *
 */
public abstract class BaseCollection implements Collection<String>{

	protected ArrayList<String> data;
	
	public BaseCollection(){
		data = new ArrayList<String>();
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public boolean isEmpty() {
		return data.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return data.contains(o);
	}

	@Override
	public Object[] toArray() {
		return data.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return data.toArray(a);
	}

	@Override
	public boolean add(String e) {
		return data.add(e);
	}

	@Override
	public boolean remove(Object o) {
		return data.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return data.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends String> c) {
		return data.addAll(c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return data.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return data.retainAll(c);
	}

	@Override
	public void clear() {
		data.clear();
	}
	
	@Override
	public String toString() {
		return data.toString();
	}
}

