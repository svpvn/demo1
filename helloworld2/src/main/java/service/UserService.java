package service;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserService {
	public static List<User> list= new ArrayList<>();
	public void Create(User user) {
		list.add(user);
	}
	public List<User> getAll(){
		return list;
	}
}
