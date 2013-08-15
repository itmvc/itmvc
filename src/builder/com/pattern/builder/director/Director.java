package com.pattern.builder.director;

import com.pattern.builder.builder.Builder;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct(String from, String to) {
		this.builder.buildForm(from);
		this.builder.buildTo(to);
		this.builder.buildSubject();
		this.builder.buildBody();
		this.builder.buildSendDate();
		this.builder.send();
	}
}
