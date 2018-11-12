package android.coolweather.temp.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by temp on 2018/11/9.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }


}
