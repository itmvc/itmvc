package com.pattern.builder.builder;

import java.util.Date;

import com.pattern.builder.product.AutoMessage;

public abstract class Builder {

	protected AutoMessage autoMessage;
	public abstract void buildSubject();
	public abstract void buildBody();
	
	public void buildForm(String from) {
		autoMessage.setFrom(from);
	}
	
	public void buildTo(String to) {
		autoMessage.setTo(to);
	}
	
	public void buildSendDate() {
		autoMessage.setSendDate(new Date());
	}
	
	public void send() {
		autoMessage.send();
	}
}
