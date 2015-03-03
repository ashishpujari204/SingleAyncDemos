package com.example.singleasynctaskdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;


public class GetMethodActivity extends ActionBarActivity implements AsyncRequest.OnAsyncRequestComplete {


    String apiURL = "http://1.sell.do/client/constants.json";
    ArrayList<NameValuePair> params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_get_method);
        //get params....

        params=getParams();

        AsyncRequest getPosts = new AsyncRequest(this, "GET", params);
        getPosts.execute(apiURL);

    }
    private ArrayList<NameValuePair> getParams() {
        // define and ArrayList whose elements are of type NameValuePair
        ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("user_email", "johnson@amuratech.com"));
        params.add(new BasicNameValuePair("user_token", "Hh2fQ8gmZSamqWxzPTmo"));
        return params;
    }


    @Override
    public void asyncResponse(String response) {
        Log.e("app","Response for Constants..."+response.toString());
    }
}
