package com.java.pracjson;

import java.util.ArrayList;
import java.util.List;

public class User {

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	private int userId = 541253;
	private String name = "Bruce";
	@SuppressWarnings("serial")
	private List<String> address = new ArrayList<String>() {

		{
			add("39, Nehrucolony");
			add("M.L.Puram");
			add("Pollachi");
		}

	};

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", address="
				+ address + "]";
	}

}
