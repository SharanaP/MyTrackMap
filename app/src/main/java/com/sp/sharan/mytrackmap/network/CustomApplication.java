package com.sp.sharan.mytrackmap.network;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.sp.sharan.mytrackmap.Utils.VolleySingleton;

public class CustomApplication extends Application {
    private RequestQueue requestQueue;
    @Override
    public void onCreate() {
        super.onCreate();
        requestQueue = VolleySingleton.getInstance(getApplicationContext()).getRequestQueue();
    }
    public RequestQueue getVolleyRequestQueue(){
        return requestQueue;
    }
}
