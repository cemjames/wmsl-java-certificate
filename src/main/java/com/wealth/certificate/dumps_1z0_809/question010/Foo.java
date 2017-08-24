package com.wealth.certificate.dumps_1z0_809.question010;

public class Foo<K, V> {

	private K key;
	private V value;

	public Foo (K key, V value){
		this.key = key;
		this.value = value;
	} 

	public static <T> Foo<T, T> twice (T value){
		return new Foo<T, T> (value, value); 
	}

	public K getKey () {
		return key;
	}

	public V getValue () {
		return value;
	}

	public static void main(String[] args) {
		//A
		Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100);
		System.out.println("A "+ mark.key+" "+mark.value);
		//B
		Foo<String, String> pair = Foo.<String>twice ("Hello World!");
		System.out.println("B "+ pair.key+" "+pair.value);
		
//		Foo<Integer, Integer> pair2 = Foo.<Integer>twice(30);
//		System.out.println("BB "+ pair2.key+" "+pair2.value);

		//C
		Foo<?, ?> percentage = new Foo <> (97, 32);
		System.out.println("C "+ percentage.key+" "+percentage.value);

		//D
		Foo<String, String> grade = new Foo <> ("John", "A");
		System.out.println("D "+ grade.key+" "+grade.value);

	}

}
