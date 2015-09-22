package com.company;

import java.util.Iterator;

public class MyCollection extends BaseCollection {

	@Override
	public Iterator<String> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<String>{

		private Integer index = 0;
		private Integer count1= 1;
		private Integer count2 = 0;

		public boolean hasNext(){
			return count1 + count2 < data.size()+1;
		}

		@Override
		public String next() {
			index++;
			if (index % 2 == 1) {
				return data.get(count2++);
			}
			else
				return data.get(data.size()-count1++);
		}

		@Override
		public void remove() {
			if (index % 2 == 0)
				data.remove(count2--);
			else
				data.remove(data.size()-count1--);
			index++;
	}
}
}
