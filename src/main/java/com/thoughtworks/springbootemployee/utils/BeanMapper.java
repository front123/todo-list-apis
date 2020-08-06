package com.thoughtworks.springbootemployee.utils;

import com.thoughtworks.springbootemployee.dto.ItemDtoRequest;
import com.thoughtworks.springbootemployee.dto.ItemDtoResponse;
import com.thoughtworks.springbootemployee.entity.Item;
import org.springframework.beans.BeanUtils;

public class BeanMapper {

    public ItemDtoResponse toDtoResponse(Item item){
        ItemDtoResponse itemDtoResponse = new ItemDtoResponse();
        BeanUtils.copyProperties(item, itemDtoResponse);
        return itemDtoResponse;
    }

    public Item toItem(ItemDtoRequest itemDtoRequest){
        Item item = new Item();
        BeanUtils.copyProperties(itemDtoRequest, item);
        return item;
    }

}
