package org.yfr.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ItemApi", url = "${host.sample.api}")
public interface ItemApi {

    @PostMapping("/item")
    ResponseEntity<String> parse() throws Exception;

    @GetMapping("/item")
    ResponseEntity<String> findByCode(@RequestParam("code") String code) throws Exception;

}
