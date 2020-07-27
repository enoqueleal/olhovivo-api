package br.com.sptrans.olhovivo.model;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Line {
	
	@JsonSetter("cl")
	private int codigoIdentificador;
	
	@JsonSetter("lc")
	private boolean linhaCircular;
	
	@JsonSetter("lt")
	private String letreiroParteUm;
	
	@JsonSetter("tl")
	private int letreiroParteDois;
	
	@JsonSetter("sl")
	private int sentido;
	
	@JsonSetter("tp")
	private String descritivoIda;
	
	@JsonSetter("ts")
	private String descritivoVolta;

	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public String getDescritivoIda() {
		return descritivoIda;
	}

	public String getDescritivoVolta() {
		return descritivoVolta;
	}

	public int getLetreiroParteDois() {
		return letreiroParteDois;
	}

	public String getLetreiroParteUm() {
		return letreiroParteUm;
	}

	public boolean getLinhaCircular() {
		return linhaCircular;
	}

	public int getSentido() {
		return sentido;
	}

	public void setCodigoIdentificador(int codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	public void setDescritivoIda(String descritivoIda) {
		this.descritivoIda = descritivoIda;
	}

	public void setDescritivoVolta(String descritivoVolta) {
		this.descritivoVolta = descritivoVolta;
	}

	public void setLetreiroParteDois(int letreiroParteDois) {
		this.letreiroParteDois = letreiroParteDois;
	}

	public void setLetreiroParteUm(String letreiroParteUm) {
		this.letreiroParteUm = letreiroParteUm;
	}

	public void setLinhaCircular(boolean linhaCircular) {
		this.linhaCircular = linhaCircular;
	}

	public void setSentido(int sentido) {
		this.sentido = sentido;
	}

}
