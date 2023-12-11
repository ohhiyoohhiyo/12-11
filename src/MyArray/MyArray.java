package MyArray;

public class MyArray {

	public static void main(String[] args) {
		MyTools myTool = new MyTools(180, 80, "red");
		
		try {
			myTool.getAdd();
			System.out.println("執行try區塊");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("超出邊界!!");
			System.out.println(ex.toString());
		}
		finally {
			System.out.println("執行了finally");
		}
	}

}
