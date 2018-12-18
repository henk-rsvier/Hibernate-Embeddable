package rsvier;

import javax.persistence.Embeddable;

@Embeddable
public class Postcode {
	private Integer getal;
	private String letters;
	
	public Postcode() {}
	
	public Postcode(Integer getal, String letters) {
		this.getal = getal;
		this.letters = letters;
	}
}
