package org.yfr.api.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.yfr.api.service.ItemService;
import org.yfr.web.api.ItemApi;

import javax.annotation.Resource;

@RestController
public class ItemController implements ItemApi {

    @Resource
    private ItemService itemService;

    @Override
    public ResponseEntity<String> parse() throws Exception {
        return itemService.parse();
    }

}
