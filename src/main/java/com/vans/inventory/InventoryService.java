package com.vans.inventory;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    public Integer getComponentDetails(Integer componentID){
       return componentID;
    }

    public String list(){
        return "List";
    }

    public String update(Integer componentID){
        return "update " + componentID;
     }
 
     public String add(){
         return "Add";
     }

}