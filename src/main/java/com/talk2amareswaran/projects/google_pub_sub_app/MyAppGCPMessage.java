package com.talk2amareswaran.projects.google_pub_sub_app;

public class MyAppGCPMessage {

	private String id;
	private String name;
	private String emailid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "MyAppGCPMessage [id=" + id + ", name=" + name + ", emailid=" + emailid + "]";
	}

}
