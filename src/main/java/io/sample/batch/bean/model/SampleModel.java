package io.sample.batch.bean.model;

import java.io.Serializable;

public class SampleModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String sample;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSample() {
		return sample;
	}
	public void setSample(String sample) {
		this.sample = sample;
	}

}
