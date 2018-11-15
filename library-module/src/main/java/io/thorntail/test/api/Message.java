package io.thorntail.test.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

	@JsonProperty("msg")
	private String message;

	public Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
