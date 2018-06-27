package com.thinkxfactor.zomatoplus.controller;

<<<<<<< HEAD
import java.util.List;

import com.thinkxfactor.zomatoplus.models.Items;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repository.ItemsRepository;
import com.thinkxfactor.zomatoplus.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
=======

import java.util.List;
import java.util.ArrayList;

>>>>>>> 3a60b1650377c214b6a105c85438bfddc1f8158d
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
=======
import com.thinkxfactor.zomatoplus.models.Item;
import com.thinkxfactor.zomatoplus.models.Restaurant;

>>>>>>> 3a60b1650377c214b6a105c85438bfddc1f8158d

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

<<<<<<< HEAD
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Autowired
	private ItemsRepository itemsRepository;

	@GetMapping("/getAll")
	public List<Restaurant> getAllRestaurant() {
		return restaurantRepository.findAll();
	}

	@PostMapping("/add")
	public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	@PostMapping("/addItems")
	public Items addItems(@RequestBody Items item) {
		return itemsRepository.save(item);
	}

	@GetMapping("/getItems")
	public List<Items> getItems(@RequestParam("restaurentId") long restaurentId) {
		return itemsRepository.findAllByRestaurantId(restaurentId);
	}


}
=======
public Restaurant tempRes;

@PostMapping("/create")
	public Restaurant createRes(@RequestBody Restaurant res) {
		Restaurant newRes = new Restaurant();
		newRes.setResName(res.getResName());
		newRes.setResNumber(res.getResNumber());
		newRes.setLocation(res.getLocation());
		newRes.setRating(res.getRating());
		newRes.setWebsite(res.getWebsite());
		tempRes = newRes;
		return newRes;
	}

@GetMapping("/getall")
public List<Restaurant> getAllRes() 
{
List allRes = new ArrayList<>();
    Restaurant res1,res2,res3;
    res1= new Restaurant("India","Khidirpur",4,9874563210,"www.india.com");
    res2=new Restaurant("Hatari","Rashbehari",5,1230456789,"www.hatari.com");
    res3=new Restaurant("Kimli","Gariahat",3,4567891023,"www.kimli.com");
	allRes.add(tempRes);
	allRes.add(res1);
	allRes.add(res2);
	allRes.add(res3);
    
    return allRes;
  }

@PostMapping("/create")
public Item addItem(@RequestBody Item item)
 {
		Item food = new Item();
		food.setFoodName(item.getFoodName());
		food.setFoodPrice(item.getFoodPrice());
		return food;
	}
}


>>>>>>> 3a60b1650377c214b6a105c85438bfddc1f8158d
