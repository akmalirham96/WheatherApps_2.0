package com.hts.snora.wheatherapps.Retrofit;

import com.hts.snora.wheatherapps.Modul.WeatherResult;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public abstract class IOpenWeatherMap {

    @GET("weather")
    abstract Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                          @Query("lon") String lng,
                                                          @Query("appid") String appid,
                                                          @Query("units") String unit);
}
