package eu.laramartin.uianimationsamples;

import android.app.ActivityOptions;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_DOWN;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_LEFT;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_RIGHT;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_UP;

public class MainActivity extends AppCompatActivity implements ClickAdapter {

    @BindView(R.id.grid)
    RecyclerView recyclerView;

    private GridAdapter adapter;
    private int[] animationsList = {SLIDE_UP, SLIDE_DOWN, SLIDE_LEFT, SLIDE_RIGHT};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new GridAdapter(animationsList, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClickAdapterItem(View view, int animationType) {
        ActivityOptions activityOptions = ActivityOptions
                .makeSceneTransitionAnimation(this
//                        , view, "slide"
                );
        startActivity(ActivityB.createIntent(this, animationType), activityOptions.toBundle());
    }
}
