package com.pattern.builder.concretebuilder;

import com.pattern.builder.builder.Builder;
import com.pattern.builder.product.WelcomeMessage;

public class WelcomeBuilder extends Builder {

	public WelcomeBuilder() {
		autoMessage = new WelcomeMessage();
	}
	@Override
	public void buildSubject() {
		// TODO Auto-generated method stub
		autoMessage.setSubject("welcome subject...");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		autoMessage.setBody("welcome body...");
	}

}
