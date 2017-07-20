package com.in28minutes.login;

public class UserValidationService {
	public boolean isUserValid(String user,String password){
		if(user.equals("rishabh")&&password.equals("rishabh")){
			return true;
		}
		return false;
	}
}
