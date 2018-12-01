package com.projektokomanda.atsparumosalciuiskaiciuokle.model;

public class Data {
	
	private double m0;
	private double m1;
	private double m2;
	private double m3;
	private double m4;
	private double m5;
	private double m6;
	
	private double hmin;
	private double hmax;
	
	private double aa;
	private double av;
	private double ba;
	private double bv;
	private double h1;
	private double h2;
	
	public Data(double m0, double m1, double m2, double m3, double m4, double m5, double m6, double hmin, double hmax,
			double aa, double ba) {
		this.m0 = m0;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
		this.m6 = m6;
		this.hmin = hmin;
		this.hmax = hmax;
		this.aa = aa;
		this.ba = ba;
	}

	public Data(double m0, double m1, double m2, double m4, double m5, double m6, double hmin, double hmax, double aa,
			double av, double ba, double bv, double h1, double h2) {
		this.m0 = m0;
		this.m1 = m1;
		this.m2 = m2;
		this.m4 = m4;
		this.m5 = m5;
		this.m6 = m6;
		this.hmin = hmin;
		this.hmax = hmax;
		this.aa = aa;
		this.av = av;
		this.ba = ba;
		this.bv = bv;
		this.h1 = h1;
		this.h2 = h2;
	}

	public double getM0() {
		return m0;
	}

	public void setM0(double m0) {
		this.m0 = m0;
	}

	public double getM1() {
		return m1;
	}

	public void setM1(double m1) {
		this.m1 = m1;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getM3() {
		return m3;
	}

	public void setM3(double m3) {
		this.m3 = m3;
	}

	public double getM4() {
		return m4;
	}

	public void setM4(double m4) {
		this.m4 = m4;
	}

	public double getM5() {
		return m5;
	}

	public void setM5(double m5) {
		this.m5 = m5;
	}

	public double getM6() {
		return m6;
	}

	public void setM6(double m6) {
		this.m6 = m6;
	}

	public double getHmin() {
		return hmin;
	}

	public void setHmin(double hmin) {
		this.hmin = hmin;
	}

	public double getHmax() {
		return hmax;
	}

	public void setHmax(double hmax) {
		this.hmax = hmax;
	}

	public double getAa() {
		return aa;
	}

	public void setAa(double aa) {
		this.aa = aa;
	}

	public double getAv() {
		return av;
	}

	public void setAv(double av) {
		this.av = av;
	}

	public double getBa() {
		return ba;
	}

	public void setBa(double ba) {
		this.ba = ba;
	}

	public double getBv() {
		return bv;
	}

	public void setBv(double bv) {
		this.bv = bv;
	}

	public double getH1() {
		return h1;
	}

	public void setH1(double h1) {
		this.h1 = h1;
	}

	public double getH2() {
		return h2;
	}

	public void setH2(double h2) {
		this.h2 = h2;
	}
	
}
