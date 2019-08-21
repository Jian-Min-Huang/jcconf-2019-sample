package org.yfr.web.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

@FeignClient(name = "FourPartyFundApi", url = "${ly3kt.game.host}")
public interface ItemApi {

    ResponseEntity<String> parse();

}
