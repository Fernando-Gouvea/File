package entities;

public class product {
	private String name;
	private Double price;
	private Integer unity;
	
	public product() {
		
	}
	
	
	public product(String name, String price, String unity) {
		
		this.name = name;
		this.price = Double.parseDouble(price);
		this.unity = Integer.parseInt(unity);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getUnity() {
		return unity;
	}


	public void setUnity(Integer unity) {
		this.unity = unity;
	}

	public Double soma(Double price, Integer unity) {
		return price * unity;
	}

	@Override
	public String toString() {
		return name + "," + soma(price, unity);
	}
	
	
	
	

}
