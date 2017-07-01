package eu.laramartin.uianimationsamples;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_UP;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int transitionType = intent.getIntExtra("transitionType", SLIDE_UP);

        switch (transitionType) {
            case SLIDE_UP:
                setTheme(R.style.AppTheme_SlideUp);
                break;
            default:
                break;
        }

        setContentView(R.layout.activity_b);
    }
}
