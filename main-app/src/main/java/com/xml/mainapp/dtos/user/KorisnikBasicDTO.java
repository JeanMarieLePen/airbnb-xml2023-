package com.xml.mainapp.dtos.user;


public class KorisnikBasicDTO {
	private Long id;
	private String email;
	private String korIme;
	private String ime;
	private String preizme;
	
	public KorisnikBasicDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKorIme() {
		return korIme;
	}

	public void setKorIme(String korIme) {
		this.korIme = korIme;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPreizme() {
		return preizme;
	}

	public void setPreizme(String preizme) {
		this.preizme = preizme;
	}

	
}
