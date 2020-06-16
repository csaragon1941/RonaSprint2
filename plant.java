
public class plant {
	private String typePlant;
	private int num;
	
	public plant(String typePlant) {
		this.typePlant = typePlant;
		
	}
	
	public plant() {
		typePlant = "Cactus";
		num = 2;
		
	}
	
	public String getTypePlant() {
		return typePlant;
		
	}
	
	public void setTypePlant(String typePlant) {
		this.typePlant = typePlant;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num; 
	}
}
