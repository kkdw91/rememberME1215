package rememberme.io.rememberme.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.File;

import rememberme.io.rememberme.Network.ApplicationController;
import rememberme.io.rememberme.R;
import rememberme.io.rememberme.User.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        File root = new File(ApplicationController.getInstance().rootPath);
        if(root.mkdirs()){
            Log.i("Splash", "make root directory!");
        } else {
            Log.i("Splash", "already exist directory!");
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        }, 1500);

    }
}
