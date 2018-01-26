package com.talk2amareswaran.projects.google_pub_sub_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.talk2amareswaran.projects.google_pub_sub_app.GooglePubSubAppApplication.PubsubOutboundGateway;

@RestController
public class GooglePubSubController {

	@Autowired
	PubsubOutboundGateway messageGatewuy;

	@RequestMapping(value = "/publish", method = RequestMethod.POST)
	public String publishMessage(@RequestBody MyAppGCPMessage message) {
		messageGatewuy.sendToPubsub(message.toString());
		return "Message published to Google Pub/Sub successfully";
	}
}
