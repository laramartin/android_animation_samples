package eu.laramartin.uianimationsamples;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridAdapterViewHolder> {

    private final ClickAdapter clickAdapter;

    public GridAdapter(ClickAdapter clickAdapter) {
        this.clickAdapter = clickAdapter;
    }

    @Override
    public GridAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.grid_item, parent, false);
        GridAdapterViewHolder viewHolder = new GridAdapterViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(GridAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 14;
    }

    public class GridAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public GridAdapterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickAdapter.onClickAdapterItem(view);
        }
    }
}
