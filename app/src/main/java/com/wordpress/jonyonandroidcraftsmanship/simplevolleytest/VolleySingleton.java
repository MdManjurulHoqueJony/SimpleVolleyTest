package com.wordpress.jonyonandroidcraftsmanship.simplevolleytest;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Administrator on 3/10/2016.
 */
public class VolleySingleton {
    private static VolleySingleton sInstance=null;
    private RequestQueue requestQueue=null;

    public VolleySingleton() {
        requestQueue= Volley.newRequestQueue(MyApplication.getAppContext());
    }

    public static VolleySingleton getInstance(){
        if (sInstance==null){
            sInstance=new VolleySingleton();
        }
        return sInstance;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
