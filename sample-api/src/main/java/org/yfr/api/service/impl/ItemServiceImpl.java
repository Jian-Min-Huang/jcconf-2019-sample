package org.yfr.api.service.impl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.yfr.api.data.dao.ItemRepository;
import org.yfr.api.data.entity.Item;
import org.yfr.api.service.ItemService;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemRepository itemRepository;

    @Override
    public ResponseEntity<String> parse() throws RuntimeException {
        return null;
    }

    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("https://www.wantgoo.com/global/stockindex?StockNo=0000").get();
        Elements price = doc.select(".price");

        Item item = Item.builder()
                .code("0000")
                .name("加權指數")
                .date(LocalDateTime.now())
                .price(Float.parseFloat(((TextNode) price.get(0).childNodes().get(0)).text()))
                .build();

        System.out.println(item.toString());
    }

}
