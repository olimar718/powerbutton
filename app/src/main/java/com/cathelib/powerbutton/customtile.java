package com.cathelib.powerbutton;

import android.service.quicksettings.TileService;
import android.view.KeyEvent;
import android.widget.Toast;

import java.io.IOException;

public class customtile extends TileService{

    @Override
    public void onClick() {
        super.onClick();
        //Toast.makeText(this, "toast", Toast.LENGTH_SHORT).show();
        try {
            Runtime.getRuntime().exec("su -c input keyevent KEYCODE_BACK");
            Thread.sleep(500);
            Runtime.getRuntime().exec("su -c input keyevent --longpress 26");
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
        }
    }
}
