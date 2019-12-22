package org.yfr.task.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.yfr.web.api.ItemApi;

import javax.annotation.Resource;

@RestController
public class ItemController implements ItemApi {

    @Resource
    private ItemApi itemApi;

    @Override
    public ResponseEntity<String> parse() throws Exception {
        return itemApi.parse();
    }

}
