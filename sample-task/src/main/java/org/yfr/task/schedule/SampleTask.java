package org.yfr.task.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.yfr.api.ItemApi;

import javax.annotation.Resource;

@Slf4j
@Component
public class SampleTask {

    @Resource
    private ItemApi itemApi;

    @Scheduled(cron = "0 */1 * * * *")
    public void parseItem() {
        try {
            ResponseEntity<String> response = itemApi.parse();

            log.info("{}, {}", response.getStatusCode(), response.getBody());
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }

}
