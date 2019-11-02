package com.subum.vo;

public class MovieVO {
	String MOVIE_NAME, DIRECTOR, TYPE;

	public MovieVO(String mOVIE_NAME, String dIRECTOR, String tYPE) {
		super();
		MOVIE_NAME = mOVIE_NAME;
		DIRECTOR = dIRECTOR;
		TYPE = tYPE;
	}

	public String getMOVIE_NAME() {
		return MOVIE_NAME;
	}

	public void setMOVIE_NAME(String mOVIE_NAME) {
		MOVIE_NAME = mOVIE_NAME;
	}

	public String getDIRECTOR() {
		return DIRECTOR;
	}

	public void setDIRECTOR(String dIRECTOR) {
		DIRECTOR = dIRECTOR;
	}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}

	
	
	
}
