package fixtures;

public abstract class Fixture {

	String name;
	String shortDescrip;
	String longDescrip;
	
	public Fixture(String name, String shortDesc, String longDesc) {
		super();
		this.name = name;
		this.shortDescrip = shortDesc;
		this.longDescrip = longDesc;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {			
		this.name = name;
	}
	public String getShort() {
		return shortDescrip;	
	}
	public void setShort(String shortDescrip) {
		this.shortDescrip = shortDescrip;
	}
	public String getLong() {
		return longDescrip;
	}
	public void setLongDesc(String longDescrip) {
		this.longDescrip = longDescrip;
	}	
}


