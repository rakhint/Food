package com.Ftgo.itemrepository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Ftgo.entity.Item;
//import com.order.dto.Itemdto;

public interface itemJparRepo extends JpaRepository<Item, Long> {

	@Query(value="select item_name,itemPrice from item where item_name=?1",nativeQuery=true)
	public Object getByItemName(String FoodName);
}
