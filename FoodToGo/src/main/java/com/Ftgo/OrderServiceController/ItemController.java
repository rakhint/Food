package com.Ftgo.OrderServiceController;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ftgo.entity.Item;
import com.Ftgo.itemService.ItemService;
//import com.Ftgo.itemrepository.itemJparRepo;
import com.order.dto.Itemdto;

@RestController
public class ItemController {
	
	@Autowired
	ItemService itemsrv;
	
	//@RequestMapping(value="/addItem/newItem",method=RequestMethod.POST)
//	public Itemdto addNewItem(@PathVariable("newItem") Itemdto newItem )
//	{
//		 newItem=itemsrv.createNewFoodItem(newItem);
//		 System.out.println("Item successfully added!!");
//		return newItem;
//	}
	
	@PostMapping(path="/addItem/newItem")
	public void addNewItem(@RequestBody Itemdto newItem )
	{
		 itemsrv.createNewFoodItem(newItem);
		 System.out.println("Item successfully added!!");
		//return newItem;
	}
	
	/*@RequestMapping(value="/rakhi/{id}",method=RequestMethod.DELETE)
	public void getItem(@PathVariable("id") long id)
	{
		repo.deleteById(id);
		
	}*/
	@GetMapping("/item/itemName")
	@ResponseBody
	public  Object getprod(@RequestParam String itemName) {
		System.out.println(itemName);
	return itemsrv.getFoodItem(itemName);
		
		
	}
	
//	public getItembyname(Item item) {
//		repo.getItem(itemname)
//	}
	
}
