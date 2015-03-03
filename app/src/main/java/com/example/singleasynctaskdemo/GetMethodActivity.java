package com.example.singleasynctaskdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;


public class GetMethodActivity extends ActionBarActivity {


    String apiURL = "http://1.sell.do/mobile/create.json";
    ArrayList<NameValuePair> params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_get_method);
        //get params....
        params=getParams();

    }
    private ArrayList<NameValuePair> getParams() {
        // define and ArrayList whose elements are of type NameValuePair
        ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();

        params.add(new BasicNameValuePair("user[email]", "johnson@amuratech.com"));
        params.add(new BasicNameValuePair("user[password]", "amura123"));
        return params;
    }


}
