package io.thorntail.test.lib;

import javax.ejb.Stateless;
import javax.inject.Inject;

import io.thorntail.test.api.Message;

@Stateless
public class Service {

	@Inject
	MessageProvider provider;

	public Message getMessage() {
		return provider.getMessage();
	}

}