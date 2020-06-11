package com.vans.inventory;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class InventoryEndpoints {

    private final InventoryService inventoryService;

    public InventoryEndpoints(InventoryService inventoryService){
        this.inventoryService = inventoryService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> list() {
        return ok(inventoryService.list());
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Integer> get(
            @PathVariable("id") Integer componentId
    ) {
        return ok(inventoryService.getComponentDetails(componentId));
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> add() {
        return ok(inventoryService.add());
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> update(
            @PathVariable("id") Integer componentId
    ) {
        return ok(inventoryService.update(componentId));
    }
    
}