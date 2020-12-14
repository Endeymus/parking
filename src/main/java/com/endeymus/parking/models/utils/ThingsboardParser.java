package com.endeymus.parking.models.utils;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ThingsboardParser {

    private String getContent(String key) {
        String json = "";
        String url = String.format("https://demo.thingsboard.io/api/v1/%s/attributes?clientKeys=status",
                key);
        try {
            json = Jsoup.connect(url).ignoreContentType(true).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    public boolean getStatus(String key) {
        String content = getContent(key);

        if (!content.isEmpty()) {
            JSONObject json = new JSONObject(content);
            return json.getJSONObject("client").getBoolean("status");
        }
        return false;
    }

}
