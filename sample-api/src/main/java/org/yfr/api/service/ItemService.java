package org.yfr.api.service;

import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface ItemService {

    ResponseEntity<String> parse() throws Exception;

    ResponseEntity<String> findByCode(String code) throws Exception;
}
