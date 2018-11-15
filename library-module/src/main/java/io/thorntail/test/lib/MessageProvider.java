package io.thorntail.test.lib;

import io.thorntail.test.api.Message;

class MessageProvider {

	public Message getMessage() {
		return new Message("Hello");
	}

}