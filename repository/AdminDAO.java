package com.ananth.PubEntry.repository;

import com.ananth.PubEntry.dto.Admin;

public interface AdminDAO {

	public String saveAdmin(Admin admin);

	public Admin adminLogin(String userName, String passWord);

}
