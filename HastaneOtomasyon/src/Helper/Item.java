package Helper;

public class Item { //class Item
	private int key; //elaman 1 - key
	private String value; //elemans 2 - value.
	
	public Item(int key, String value) //Kurucu metod.
	{
		super();
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	
	
	public String toString() {
		return this.value;
	}
}