package org.yfr.web.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yfr.api.ItemApi;

import javax.annotation.Resource;

@RestController
public class ItemController {

    @Resource
    private ItemApi itemApi;

    @GetMapping("/item")
    ResponseEntity<String> findByCode(@RequestParam("code") String code) throws Exception {
        return ResponseEntity.ok("web ver.2 -> " + itemApi.findByCode(code).getBody());
    }

}
