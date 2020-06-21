package app.newsrocket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Default select home
        bottomNavigationView.setSelectedItemId(R.id.home);

        // Init navigation bar
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        return true;
                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(), Search.class));
                        overridePendingTransition(R.anim.slide_right, R.anim.slide_out_left);
                        return true;
                    case R.id.recent:
                        startActivity(new Intent(getApplicationContext(), Recent.class));
                        overridePendingTransition(R.anim.slide_right, R.anim.slide_out_left);
                        return true;
                }
                return false;
            }
        });
        
    }

    @Override
    public void finish() {
        super.finish();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        overridePendingTransition(R.anim.slide_left, R.anim.slide_out_right);
    }
}
