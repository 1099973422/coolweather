package android.coolweather.temp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by temp on 2018/11/9.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public  class Update{
        @SerializedName("loc")
                public String updateTime;
    }

}
