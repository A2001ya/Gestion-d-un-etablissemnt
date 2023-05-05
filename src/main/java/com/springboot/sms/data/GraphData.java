package com.springboot.sms.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GraphData {
	//Oussama EL Idrissi
	private String libelle;
	private long count;

	public GraphData(String libelle, long count) {
		this.libelle = libelle;
		this.count = count;
	}
}
