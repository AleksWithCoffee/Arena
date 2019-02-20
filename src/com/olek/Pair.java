package com.olek;




public final class Pair<T> {

	public final T first;
	public final T second;
	
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean equals(Object other) {
		boolean equal;
		if (other instanceof Pair) {
			Pair p = (Pair) other;
			equal = first.equals(p.first) && second.equals(p.second);
		} else {
			equal = false;
		}
		return equal;
	}
}
