import java.util.Arrays;

public class MyArray {
	private int capacity;
	private int length;
	private Object[] data;

	public MyArray() {
		capacity = 1;
		length = 0;
		data = new Object[1];
	}

	public Object get(int index) {
		return data[index];
	}

	public void set(Object item) {
		if (capacity == length) {
			data = Arrays.copyOf(data, capacity * 2);
			capacity = capacity * 2;
		}
		data[length] = item;
		length++;
	}

	public Object pop() {
		Object deleteItem = data[length - 1];
		data[length - 1] = null;
		length--;
		return deleteItem;
	}

	public Object delete(int index) {
		Object deleteItem = data[index];
		shift(index);
		return deleteItem;
	}

	public void shift(int index) {
		for (int i = index; i < length - 1; i++) {
			data[i] = data[i + 1];
		}
		data[length - 1] = null;
		length--;
	}

	public static void main(String[] args) {
		MyArray array = new MyArray();
		array.set("Nitish");
		array.set("Kumar");
		array.set("Khadaria");
		array.delete(1);
		array.set("Ji");
		array.pop();


		for (int i = 0; i < array.length; i++) {
			System.out.print(array.get(i) + " ");
		}

	}

}
