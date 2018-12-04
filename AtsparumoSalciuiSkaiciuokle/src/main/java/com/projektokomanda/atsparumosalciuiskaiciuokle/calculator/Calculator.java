package com.projektokomanda.atsparumosalciuiskaiciuokle.calculator;

import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Data;
import com.projektokomanda.atsparumosalciuiskaiciuokle.model.Results;

public class Calculator {
	
	private Results results = new Results();
	
	public void calculate(Data data) {
		results.setS(data.getAa() * data.getBa());
		
		if(data.getM3() == 0) {
			results.setV(((data.getAa() + data.getAv()) / 2) * ((data.getBa() + data.getBv()) / 2) * ((data.getH1() + data.getH2()) / 2));
		}
		else {
			results.setV((data.getM4() - data.getM3()) / 1);
		}
		
		results.setWe((data.getM0() / results.getV()) * ((data.getM1() - data.getM0()) / data.getM0()) * 100);
		
		results.setWr((data.getM0() / results.getV()) * ((data.getM4() - data.getM0()) / data.getM0()) * 100);
		
		results.setN((data.getHmax() - data.getHmin()) / data.getHmin());
		
		results.setR((1 - (results.getWe()/results.getWr())) * 100);
		
		results.setD((100 - results.getWe()) / results.getWr());
		
		results.setG1((data.getM2() - data.getM0()) / results.getS());
		
		results.setGg1((data.getM5() - data.getM0()) / results.getS());
		
		results.setGg2((data.getM6() - data.getM0()) / results.getS());
		
		if(results.getWe() <= 26) {
			results.setFre1(0.231 * ((Math.pow(results.getR(), 1.068) * Math.pow(results.getD(), 1.345) * Math.pow(results.getGg1(), 0.275) 
					* Math.pow(results.getGg2(), 0.663))) / (Math.pow(results.getN(), 0.285) * Math.pow(results.getG1(), 0.830)));
			
			results.setFre2(0.223 * ((Math.pow(results.getR(), 1.465) * Math.pow(results.getD(), 0.759) * Math.pow(results.getGg1(), 0.383) 
					* Math.pow(results.getGg2(), 0.852))) / (Math.pow(results.getN(), 0.168) * Math.pow(results.getG1(), 1.034)));
		}
		else {
			results.setFre1(0.051 * ((Math.pow(results.getR(), 1.642) * Math.pow(results.getD(), 2.332) * Math.pow(results.getGg1(), 0.383) 
					* Math.pow(results.getG1(), 0.852))) / (Math.pow(results.getN(), 0.334) * Math.pow(results.getGg2(), 1.145)));
			
			results.setFre2(0.063 * ((Math.pow(results.getR(), 1.813) * Math.pow(results.getD(), 2.135) * Math.pow(results.getGg1(), 0.179) 
					* Math.pow(results.getG1(), 1.134))) / (Math.pow(results.getN(), 0.395) * Math.pow(results.getGg2(), 0.517)));
		}
		
		results.setTi(Math.pow(Math.E, 3.31981 + 0.00524 * results.getFre1()));
	}
	
	public Results getResults() {
		return results;
	}
}
