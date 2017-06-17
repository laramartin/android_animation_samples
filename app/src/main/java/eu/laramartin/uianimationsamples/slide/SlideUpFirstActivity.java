package eu.laramartin.uianimationsamples.slide;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import eu.laramartin.uianimationsamples.ClickAdapter;
import eu.laramartin.uianimationsamples.FirstActivityAdapter;
import eu.laramartin.uianimationsamples.R;

public class SlideUpFirstActivity extends AppCompatActivity implements ClickAdapter {

    @BindView(R.id.slide_up_first_grid)
    RecyclerView recyclerView;

    private FirstActivityAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_up_first);

        ButterKnife.bind(this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new FirstActivityAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClickAdapterItem(View view) {
        ActivityOptions activityOptions = ActivityOptions
                .makeSceneTransitionAnimation(this
//                        , view, "slide"
                );
        startActivity(new Intent(this, SlideUpSecondActivity.class), activityOptions.toBundle());
//        startActivity(new Intent(this, SlideUpSecondActivity.class));
    }
}
