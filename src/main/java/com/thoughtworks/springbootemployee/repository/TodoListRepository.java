package com.thoughtworks.springbootemployee.repository;

import com.thoughtworks.springbootemployee.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends JpaRepository<Item,Integer> {
}
