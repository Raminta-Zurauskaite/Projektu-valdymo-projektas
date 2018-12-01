package com.projektokomanda.atsparumosalciuiskaiciuokle.model;

public class Results {
	
	private double S;
	private double V;
	private double WE;
	private double WR;
	private double N;
	private double R;
	private double D;
	private double g1;
	private double G1;
	private double G2;
	private double FRE1;
	private double FRE2;
	private double ti;
	
	public Results() {
		
	}
	
	public Results(double s, double v, double wE, double wR, double n, double r, double d, double g1, double g12,
			double g2, double fRE1, double fRE2, double ti) {
		S = s;
		V = v;
		WE = wE;
		WR = wR;
		N = n;
		R = r;
		D = d;
		this.g1 = g1;
		G1 = g12;
		G2 = g2;
		FRE1 = fRE1;
		FRE2 = fRE2;
		this.ti = ti;
	}

	public double getS() {
		return S;
	}

	public void setS(double s) {
		S = s;
	}

	public double getV() {
		return V;
	}

	public void setV(double v) {
		V = v;
	}

	public double getWE() {
		return WE;
	}

	public void setWE(double wE) {
		WE = wE;
	}

	public double getWR() {
		return WR;
	}

	public void setWR(double wR) {
		WR = wR;
	}

	public double getN() {
		return N;
	}

	public void setN(double n) {
		N = n;
	}

	public double getR() {
		return R;
	}

	public void setR(double r) {
		R = r;
	}

	public double getD() {
		return D;
	}

	public void setD(double d) {
		D = d;
	}

	public double getg1() {
		return g1;
	}

	public void setg1(double g1) {
		this.g1 = g1;
	}

	public double getG1() {
		return G1;
	}

	public void setG1(double g1) {
		G1 = g1;
	}

	public double getG2() {
		return G2;
	}

	public void setG2(double g2) {
		G2 = g2;
	}

	public double getFRE1() {
		return FRE1;
	}

	public void setFRE1(double fRE1) {
		FRE1 = fRE1;
	}

	public double getFRE2() {
		return FRE2;
	}

	public void setFRE2(double fRE2) {
		FRE2 = fRE2;
	}

	public double getTi() {
		return ti;
	}

	public void setTi(double ti) {
		this.ti = ti;
	}
	
}
