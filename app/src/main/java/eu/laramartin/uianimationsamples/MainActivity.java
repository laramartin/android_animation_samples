package eu.laramartin.uianimationsamples;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements ClickAdapter {

    @BindView(R.id.grid)
    RecyclerView recyclerView;

    private GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new GridAdapter(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onClickAdapterItem(View view) {
        ActivityOptions activityOptions = ActivityOptions
                .makeSceneTransitionAnimation(this
//                        , view, "slide"
                );
        Intent intent = new Intent(this, ActivityB.class);
        intent.putExtra("transitionType", "slideUp");
        startActivity(intent, activityOptions.toBundle());
    }
}
