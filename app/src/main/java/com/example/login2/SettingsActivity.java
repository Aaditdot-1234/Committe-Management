package com.example.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.SwitchCompat;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ImageView backArrowImageView = findViewById(R.id.back_arrow);
        ImageView nightModeImageView = findViewById(R.id.nightMode);
        ImageView notificationImageView = findViewById(R.id.notification);
        ImageView privateAccImageView = findViewById(R.id.private_acc);
        ImageView securityIconImageView = findViewById(R.id.security_icon);
        ImageView textSizeIconImageView = findViewById(R.id.text_size_icon);
        ImageView languagesIconImageView = findViewById(R.id.languages_icon);
        ImageView logOutIconImageView = findViewById(R.id.log_out_icon);

        SwitchCompat nightModeSwitch = findViewById(R.id.night_mode_switch);
        SwitchCompat notificationSwitch = findViewById(R.id.notification_switch);
        SwitchCompat privateAccSwitch = findViewById(R.id.private_acc_switch);

        backArrowImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        nightModeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Night Mode Clicked");
            }
        });

        notificationImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Notifications Clicked");
            }
        });

        privateAccImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Private Account Clicked");
            }
        });

        securityIconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Security and Privacy Clicked");
            }
        });

        textSizeIconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Text Size Clicked");
            }
        });

        languagesIconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Languages Clicked");
            }
        });

        logOutIconImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SettingsActivity.this, MainActivity.class));
            }
        });

        // Add OnCheckedChangeListener for each SwitchCompat
        nightModeSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            showToast("Night Mode Switch " + (isChecked ? "On" : "Off"));
            // Add your code to handle the night mode switch change here
        });

        notificationSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            showToast("Notifications Switch " + (isChecked ? "On" : "Off"));
            // Add your code to handle the notifications switch change here
        });

        privateAccSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            showToast("Private Account Switch " + (isChecked ? "On" : "Off"));
            // Add your code to handle the private account switch change here
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
