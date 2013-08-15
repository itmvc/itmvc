package com.pattern.builder.client;

import com.pattern.builder.builder.Builder;
import com.pattern.builder.concretebuilder.WelcomeBuilder;
import com.pattern.builder.director.Director;

public class Client {

	public static void main(String[] args) {
		Builder builder = new WelcomeBuilder();
		Director director = new Director(builder);
		director.construct("beijing","shanghai");
	}
}
