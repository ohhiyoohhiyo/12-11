package MyArray;

public class MyTools {
	int length; // 類別的全域變數，類別的屬性(成員)
	int weight;
	String color;
	MyTools(int length, int weigth, String color) { // 建構子，初始化類別屬性用
		this.length = length;
		this.weight = weight;
		this.color = color;
	}
	
	MyTools(int length, int weigth) { 
		this(length, weigth, "red");
	}
	
	public void getAdd( ) { // 類別的方法
		int abc = 100; // 區域變數
		System.out.println();
	}
}