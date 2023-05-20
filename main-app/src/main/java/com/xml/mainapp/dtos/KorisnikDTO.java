package com.xml.mainapp.dtos;

import java.io.Serializable;
import java.util.Collection;

import com.xml.mainapp.model.users.StatusNaloga;
import com.xml.mainapp.model.users.TipKorisnika;
import com.xml2023.mainapp.SmestajDTO;

public class KorisnikDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 935928709318268339L;
	
	private String id;
	private String lozinka;
    private String korIme;
    private String email;

    private String ime;
    private String prezime;
    private AdresaDTO adresa;
	
    private StatusNaloga statusNaloga;
    private TipKorisnika tipKorisnika;
    
    private Collection<String> slike;
    
    private boolean rezAutomatski;
	
	private boolean istaknuti;
	
//	private Collection<SmestajDTO> smestajList;
	private Collection<com.xml.mainapp.dtos.data.SmestajDTO> smestajList;
    
	public KorisnikDTO() {
		super();
	}
	
	
	
//	public Collection<SmestajDTO> getSmestajList() {
//		return smestajList;
//	}
//
//	public void setSmestajList(Collection<SmestajDTO> smestajList) {
//		this.smestajList = smestajList;
//	}

	public Collection<com.xml.mainapp.dtos.data.SmestajDTO> getSmestajList() {
		return smestajList;
	}


	public void setSmestajList(Collection<com.xml.mainapp.dtos.data.SmestajDTO> smestajList) {
		this.smestajList = smestajList;
	}


	public boolean isRezAutomatski() {
		return rezAutomatski;
	}

	public void setRezAutomatski(boolean rezAutomatski) {
		this.rezAutomatski = rezAutomatski;
	}

	public boolean isIstaknuti() {
		return istaknuti;
	}

	public void setIstaknuti(boolean istaknuti) {
		this.istaknuti = istaknuti;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public String getKorIme() {
		return korIme;
	}

	public void setKorIme(String korIme) {
		this.korIme = korIme;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	

	public AdresaDTO getAdresa() {
		return adresa;
	}

	public void setAdresa(AdresaDTO adresa) {
		this.adresa = adresa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public StatusNaloga getStatusNaloga() {
		return statusNaloga;
	}

	public void setStatusNaloga(StatusNaloga statusNaloga) {
		this.statusNaloga = statusNaloga;
	}

	public TipKorisnika getTipKorisnika() {
		return tipKorisnika;
	}

	public void setTipKorisnika(TipKorisnika tipKorisnika) {
		this.tipKorisnika = tipKorisnika;
	}

	public Collection<String> getSlike() {
		return slike;
	}

	public void setSlike(Collection<String> slike) {
		this.slike = slike;
	}

    
}
