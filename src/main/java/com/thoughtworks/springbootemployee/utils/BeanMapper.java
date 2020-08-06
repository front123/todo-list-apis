package com.thoughtworks.springbootemployee.utils;

import com.thoughtworks.springbootemployee.dto.ItemRequestDto;
import com.thoughtworks.springbootemployee.dto.ItemResponseDto;
import com.thoughtworks.springbootemployee.entity.Item;
import org.springframework.beans.BeanUtils;

public class BeanMapper {

    public static ItemResponseDto toDtoResponse(Item item){
        ItemResponseDto itemResponseDto = new ItemResponseDto();
        BeanUtils.copyProperties(item, itemResponseDto);
        return itemResponseDto;
    }

    public static Item toItem(ItemRequestDto itemRequestDto){
        Item item = new Item();
        BeanUtils.copyProperties(itemRequestDto, item);
        return item;
    }

}
