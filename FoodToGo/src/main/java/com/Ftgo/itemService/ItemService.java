package com.Ftgo.itemService;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ftgo.entity.Item;
import com.Ftgo.itemrepository.itemJparRepo;
import com.order.dto.Itemdto;

@Service
public class ItemService {

	@Autowired 
	itemJparRepo repo;
	public Object getFoodItem(String FoodName){
		return repo.getByItemName(FoodName);
	}
	
	public void createNewFoodItem(Itemdto item) {
		Item itm=new Item();
		BeanUtils.copyProperties(item, itm);
		repo.save(itm);
		BeanUtils.copyProperties(itm, item);
		//return item;
		
	}
}
