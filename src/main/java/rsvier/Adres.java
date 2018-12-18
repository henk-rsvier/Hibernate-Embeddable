package rsvier;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Adres {
	
	private String straatnaam;
	@Column(nullable = true)
	int huisnummer;
	private String plaats;
	private Postcode postcode;

	public Adres() {}
	
	public Adres(String straatnaam, Integer huisnummer, String plaats, Postcode postcode) {
		this.straatnaam = straatnaam;
		this.huisnummer = huisnummer;
		this.plaats = plaats;
		this.postcode = postcode;
	}
	
	
}
