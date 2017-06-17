package eu.laramartin.uianimationsamples;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public class FirstActivityAdapter extends RecyclerView.Adapter<FirstActivityAdapter.FirstActivityAdapterViewHolder> {

    private final ClickAdapter clickAdapter;

    public FirstActivityAdapter(ClickAdapter clickAdapter) {
        this.clickAdapter = clickAdapter;
    }

    @Override
    public FirstActivityAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.grid_item, parent, false);
        FirstActivityAdapterViewHolder viewHolder = new FirstActivityAdapterViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(FirstActivityAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 14;
    }

    public class FirstActivityAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public FirstActivityAdapterViewHolder(View itemView) {
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
