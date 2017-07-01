package eu.laramartin.uianimationsamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String transitionType = intent.getStringExtra("transitionType");

        switch (transitionType) {
            case "slideUp":
                setTheme(R.style.AppTheme_SlideUp);
                break;
            default:
                break;
        }

        setContentView(R.layout.activity_b);
    }
}
