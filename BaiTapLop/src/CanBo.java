import java.io.Serializable;

public class CanBo implements Serializable{
	private String macanbo;
	public String getMacanbo() {
		return macanbo;
	}
	public void setMacanbo(String macanbo) {
		this.macanbo = macanbo;
	}
	public String getHotenn() {
		return hotenn;
	}
	public void setHotenn(String hotenn) {
		this.hotenn = hotenn;
	}
	public double getHesoluong() {
		return hesoluong;
	}
	public void setHesoluong(double hesoluong) {
		this.hesoluong = hesoluong;
	}
	private String hotenn;
	private double hesoluong;
	public CanBo(String macanbo, String hotenn, double hesoluong) {
		super();
		this.macanbo = macanbo;
		this.hotenn = hotenn;
		this.hesoluong = hesoluong;
	}
}
