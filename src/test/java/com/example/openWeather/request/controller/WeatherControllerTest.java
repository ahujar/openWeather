package com.example.openWeather.request.controller;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class WeatherControllerTest {

    @Mock
    WeatherController weatherController;

    JSONObject londonWeatherDetails;

    @Before
    public void setUp() throws Exception {
        londonWeatherDetails = new JSONObject().put("london", "london");
    }

    @Test
    public void getWeatherDetails() throws Exception{

        //Mockito.when(weatherController.getWeatherDetails("london","b6907d289e10d714a6e88b30761fae22")).thenReturn(londonWeatherDetails.toString());
        //String weatherDetails = weatherController.getWeatherDetails("london","b6907d289e10d714a6e88b30761fae22");
        //assertEquals(weatherDetails,londonWeatherDetails.toString());
    }
}