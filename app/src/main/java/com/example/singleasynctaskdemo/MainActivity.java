package com.example.singleasynctaskdemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements AsyncRequest.OnAsyncRequestComplete {

    String apiURL = "http://1.sell.do/mobile/create.json";
    ArrayList<NameValuePair> params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get params
        params=getParams();

        AsyncRequest getPosts = new AsyncRequest(this, "POST", params);
        getPosts.execute(apiURL);
    }

    @Override
    public void asyncResponse(String response) {
        Log.e("app","Res...is...."+response.toString());
        startActivity(new Intent(getApplicationContext(),GetMethodActivity.class));

    }

    private ArrayList<NameValuePair> getParams() {
        // define and ArrayList whose elements are of type NameValuePair
        ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("user[email]", "johnson@amuratech.com"));
        params.add(new BasicNameValuePair("user[password]", "amura123"));
        return params;
        }

}
