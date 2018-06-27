/*package com.thinkxfactor.zomatoplus.controller;
import java.util.List;

import java.util.ArrayList;

import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.models.User;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
import com.thinkxfactor.zomatoplus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
import java.util.List;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 3a60b1650377c214b6a105c85438bfddc1f8158d

import com.thinkxfactor.zomatoplus.models.User;




@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

<<<<<<< HEAD
	@GetMapping("/getUser")
	public User login(@RequestParam("name") String name,@RequestParam("password") String password) {
		return userRepository.findByNameAndPassword(name,password);
=======
	@GetMapping("/login")
	public User userLogin(@RequestParam("username") String username,
			@RequestParam("password") String password	) {
		User usr=new User();
		usr.setUsername(username);
		usr.setPassword(password);
		return usr ;
	}
	
	@GetMapping("/all")
	public List<User> userList() {
		List<User> users=new ArrayList<>();
		User usr1,usr2,usr3;
		usr1= new User("arya","abc123");
		usr2=new User("joey","xyz122");
		usr3= new User("chandler","bing");
		users.add(usr1);
		users.add(usr2);
		users.add(usr3);
		return users;
>>>>>>> 3a60b1650377c214b6a105c85438bfddc1f8158d
	}
	@PostMapping("/create")
	public User userCreate(@RequestBody User user)
	{
		System.out.println(user.toString());
		return user;
	}
}
*/
package com.thinkxfactor.zomatoplus.controller;


<<<<<<< HEAD
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		User persistedUser=userRepository.save(user);
		return persistedUser;
	}
	
	
	@GetMapping("/getAll")
	public List<User> getAll(){
		List<User> listofusers=userRepository.findAll();
		return listofusers;
=======
import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;


@RestController
@RequestMapping("/user")
public class UserController {

@PostMapping("/login")
	public User userLogin(@RequestBody User user) {
		User usr = new User();
		usr.setUsername(user.getUsername());
		usr.setPassword(user.getPassword());
		return user;
	}

	@GetMapping("/all")
	public List<User> userList() {
		List<User> user = new ArrayList<>();
		User usr1, usr2, usr3;
		usr1 = new User("Swarnava","Saha");
		usr2 = new User("Sidhartha","Mitra");
		usr3 = new User("Agnibha","Chakrabarti");
		user.add(usr1);
		user.add(usr2);
		user.add(usr3);
		return user;
	}
	
	@PostMapping("/create")
	public User getUser(@RequestBody User user) {
		System.out.println(user.toString());
		return user;
>>>>>>> 3a60b1650377c214b6a105c85438bfddc1f8158d
	}

}

