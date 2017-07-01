package eu.laramartin.uianimationsamples;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static eu.laramartin.uianimationsamples.AnimationType.FADE_IN;
import static eu.laramartin.uianimationsamples.AnimationType.FADE_OUT;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_DOWN;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_LEFT;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_RIGHT;
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
            case SLIDE_DOWN:
                setTheme(R.style.AppTheme_SlideDown);
                break;
            case SLIDE_LEFT:
                setTheme(R.style.AppTheme_SlideLeft);
                break;
            case SLIDE_RIGHT:
                setTheme(R.style.AppTheme_SlideRight);
                break;
            case FADE_IN:
                setTheme(R.style.AppTheme_FadeIn);
                break;
            case FADE_OUT:
                setTheme(R.style.AppTheme_FadeOut);
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
