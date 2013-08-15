package com.pattern.builder.product;

import java.util.Date;

public abstract class AutoMessage {

	private String from;
	private String to;
	private String subject;
	private String body;
	private Date sendDate;
	
	public void send() {
		System.out.println("To:" + to);
		System.out.println("From:" + from);
		System.out.println("Subject:" + subject);
		System.out.println("Body:" + body);
		System.out.println("SendDate:" + sendDate);
	}
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getSendDate() {
		return sendDate;
	}
	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
}
