package q02_advanced.question03;

public class Coupon {
	private int id;
	private double discountRate;
	private String description;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate セットする discountRate
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description セットする description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 */
	public Coupon() {
	}

	/**
	 * @param id
	 * @param discountRate
	 * @param description
	 */
	public Coupon(int id, double discountRate, String description) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = description;
	}

	public static Coupon getInstance(int id, double discountRate, String description) {
		//staticでthisは使えない！！！！！！
		Coupon coupon = new Coupon();

		coupon.setId(id);
		coupon.setDiscountRate(discountRate);
		coupon.setDescription(description);
		//箱作って１個ずつ中身を入れて、それを戻り値で返す
		return coupon;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id +
				", discountRate=" + discountRate +
				", description=" + description + "]";

	}

}
