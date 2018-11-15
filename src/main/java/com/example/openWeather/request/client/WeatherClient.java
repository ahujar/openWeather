package com.example.openWeather.request.client;

import org.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "OpenWeatherApi", url = "https://samples.openweathermap.org/data/2.5/weather")
public interface WeatherClient {

    @RequestMapping(method = RequestMethod.GET, produces  = {
            MediaType.APPLICATION_JSON_VALUE
    })
    JSONObject getWeatherDetails(@RequestParam("q") String cityName, @RequestParam("appid") String appkey);
}
