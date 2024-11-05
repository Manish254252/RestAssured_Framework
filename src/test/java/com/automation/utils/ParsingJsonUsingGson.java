package com.automation.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ParsingJsonUsingGson {
    public static void main(String[] args) throws Exception {
        String content = RestAssuredUtils.getDataFromJsonFile("Json_Gson_Example.json");
        JsonElement jsonElement = JsonParser.parseString(content);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        System.out.println(jsonObject.get("bookstoreid").getAsInt());
        System.out.println(jsonObject.get("bookstorename").getAsString());
        JsonArray jsonArray = jsonObject.get("books").getAsJsonArray();
        for (int i = 0; i < jsonArray.size(); i++) {
            System.out.println("========= Book #"+i+ "=======");
            System.out.println(jsonArray.get(i).getAsJsonObject().get("title").getAsString());
            System.out.println(jsonArray.get(i).getAsJsonObject().get("price"));
            System.out.println(jsonArray.get(i).getAsJsonObject().get("isAvailable"));
        }
    }
}
