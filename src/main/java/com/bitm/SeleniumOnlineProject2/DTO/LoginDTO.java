package com.bitm.SeleniumOnlineProject2.DTO;

public class LoginDTO {
	private String Usarname;
	private String Password;
	
	
	public String getUsarname() {
		return Usarname;
	}
	public void setUsarname(String usarname) {
		Usarname = usarname;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "LoginDTO [Usarname=" + Usarname + ", Password=" + Password + "]";
	}

}
