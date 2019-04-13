package com.hearst.csms;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordEncrypt {
	public static void main(String[] args) {

		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);

		System.out.println("admin1234 - " + passwordEncoder.encode("admin1234"));
		System.out.println("private-client1234 - " + passwordEncoder.encode("private-client1234"));
		System.out.println("admin-client1234 - " + passwordEncoder.encode("admin-client1234"));

	}
}
