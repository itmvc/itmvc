package com.pattern.builder.concretebuilder;

import com.pattern.builder.builder.Builder;
import com.pattern.builder.product.GoodByeMessage;

public class GoodByeBuilder extends Builder {
	
	public GoodByeBuilder() {
		autoMessage = new GoodByeMessage();
	}
	@Override
	public void buildSubject() {
		// TODO Auto-generated method stub
		autoMessage.setSubject("GoodBye subject...");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		autoMessage.setBody("GoodBye body...");
	}

}
