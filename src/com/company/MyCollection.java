package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyCollection extends BaseCollection {

	@Override
	public Iterator<String> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<String>{

		private Integer index = 0;
		private Integer teste = 1;
		private Integer count = 0;

		public boolean hasNext(){
			return index < data.size();
		}

		@Override
		public String next() {
			count++;

			if (count == data.size())
				index = data.size();

			if (count % 2 == 1 && count != data.size()) {
				return data.get(index++);
			}
			else
				return data.get(data.size()-teste++);
		}

		@Override
		public void remove() {
			data.remove(index--);
		}

	}
}
