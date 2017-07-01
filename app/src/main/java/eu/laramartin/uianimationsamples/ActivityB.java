package eu.laramartin.uianimationsamples;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_UP;

public class ActivityB extends AppCompatActivity {

    private static final String ANIMATION_EXTRA = "transitionType";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        int transitionType = intent.getIntExtra(ANIMATION_EXTRA, SLIDE_UP);

        switch (transitionType) {
            case SLIDE_UP:
                setTheme(R.style.AppTheme_SlideUp);
                break;
            default:
                break;
        }

        setContentView(R.layout.activity_b);
    }

    public static Intent createIntent(Context context, int animationType) {
        Intent intent = new Intent(context, ActivityB.class);
        intent.putExtra(ANIMATION_EXTRA, animationType);
        return intent;
    }
}
