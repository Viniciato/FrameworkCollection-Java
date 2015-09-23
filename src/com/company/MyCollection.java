package com.company;

import java.util.Iterator;

public class MyCollection extends BaseCollection {

	@Override
	public Iterator<String> iterator() {
		return new MyIterator();
	}

	private class MyIterator implements Iterator<String>{

		private boolean useCount2 = false;
		private int count1 = 1;
		private int count2 = 0;

		public boolean hasNext(){
			return count1 + count2 < data.size() + 1;
		}

		@Override
		public String next() {
			useCount2 = !useCount2;
			if (useCount2) {
				return data.get(count2++);
			}
			else
				return data.get(data.size()-count1++);
		}

		@Override
		public void remove() {
			if (useCount2){
				data.remove(count2 - 1);
				count2--;
			}
			else{
				data.remove(data.size() - count1 + 1);
				count1++;
			}
	}
}
}
