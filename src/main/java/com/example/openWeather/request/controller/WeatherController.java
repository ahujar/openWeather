package com.example.openWeather.request.controller;

import com.example.openWeather.request.client.WeatherClient;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class WeatherController {

    private static final Logger logger = LoggerFactory.getLogger(WeatherController.class.getName());

    private WeatherClient client;

    @Autowired
    public WeatherController(WeatherClient client) {
        this.client = client;
    }

    @RequestMapping(value = "/weather/{city}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public JSONObject getWeatherDetails (@PathVariable("city") String cityName, @RequestParam("appid") String appId){

        logger.info("getting details for city :" +cityName);
        JSONObject weatherDetails = client.getWeatherDetails(cityName, appId);
        logger.info(weatherDetails.toString());
        return weatherDetails;
    }
}
