package com.example.Employee.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Employee.bean.User;

@Service
public class UserServiceImp implements UserService {

	private static List<User> users;

	static {
		users = dummyUsers();
	}

	public List<User> getUser() {
		// TODO Auto-generated method stub
		return users;
	}

	public User findById(int id) {
		// TODO Auto-generated method stub
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public void createUser(User user) {
		// TODO Auto-generated method stub
		users.add(user);
	}

	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		Iterator<User> it = users.iterator();
		while (it.hasNext()) {
			User user = (User) it.next();
			if (user.getId() == id) {
				it.remove();
			}
		}
	}

	public void updatePartially(User currentUser, int id) {
		for (User user : users) {
			if (user.getId() == id) {
				if (currentUser.getCountry() != null) {
					user.setId(id);
					user.setCountry(currentUser.getCountry());
				}
				user.setName(user.getName());
				update(user);
			}
		}

	}

	public void update(User user) {
		// TODO Auto-generated method stub
		int index = users.indexOf(user);
		users.set(index, user);
	}

	private static List<User> dummyUsers() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		users.add(new User(14221, "John", "INDIA",10000));
		users.add(new User(14222, "Ben", "UK",20000));
		users.add(new User(14223, "Andrew", "INDIA",30000));
		users.add(new User(14224, "Samuael", "USA",40000));
		return users;
	}

	public User highSalary(List<User> userList) {
		int highSal=0;
		User ans=null;
		Iterator<User> its = userList.iterator();
		while (its.hasNext()) {
			User user = (User) its.next();
			if (user.getSalary()>highSal) {
				highSal=user.getSalary();
				ans=user;
			}
		}
		
		return ans;
	}
	
	public void createMultiple(List<User> multiple) {
		
		Iterator<User> itr = multiple.iterator();
		while (itr.hasNext()) {
			User user = (User) itr.next();
			users.add(user);
		}
	}

}
