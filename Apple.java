//Created by Abigail Stalker

package labs;

public class Apple {
	private String type;
	private double weight;
	private double price;
	
	//default constructor
	public Apple() {
		this.type = "Gala";
		this.weight = 0.0;
		this.price = 0.0;
	}
	
	//parameterized constructor
	public Apple(String t,double w, double p){
		if((t.equals("Red Delicious"))||(t.equals("Golden Delicious"))||(t.equals("Gala"))||(t.equals("Granny Smith"))) {
			this.type = t;
		}else {
			this.type = "Gala";
		}
		
		if((weight<0.0)||(weight>2.0)) {
			this.weight = 0.0;
		}else {
			this.weight = w;
		}
	
		if(price<0) {
			this.price = 0.0;
		}else {
			this.price = p;
		}
	}
	
	//accessors
	public String getType() {
		return this.type;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	//mutators
	public void setType(String type) {
		if((this.type.equals("Red Delicious"))||(this.type.equals("Golden Delicious"))||(this.type.equals("Gala"))||(this.type.equals("Granny Smith"))) {
			this.type = type;
			return;
		}
		this.type = "Gala";
	}
	
	public void setWeight(double weight) {
		if((weight<0.0)||(weight>2.0)) {
			this.weight = 0.0;
			return;
		}
		this.weight = weight;
	
	}
	
	public void setPrice(double price) {
		if(price<0) {
			this.price = 0.0;
			return;
		}
		this.price = price;
	}
	
	//toString method
	public String toString() {
		return "Type: " + getType() + " Weight: " + getWeight() + " Price " + getPrice();
	}
	
	public boolean equals(Apple a) {
		return (a != null)&&(this.type.equals(a.getType())&&(this.weight== a.getWeight())&&(this.price == a.getPrice()));
	}

}
