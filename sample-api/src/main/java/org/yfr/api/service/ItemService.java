package org.yfr.api.service;

import org.springframework.http.ResponseEntity;

public interface ItemService {

    ResponseEntity<String> parse() throws RuntimeException;

}
