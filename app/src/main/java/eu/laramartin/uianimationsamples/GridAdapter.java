package eu.laramartin.uianimationsamples;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.ButterKnife;

import static eu.laramartin.uianimationsamples.AnimationType.FADE_IN;
import static eu.laramartin.uianimationsamples.AnimationType.FADE_OUT;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_DOWN;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_LEFT;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_RIGHT;
import static eu.laramartin.uianimationsamples.AnimationType.SLIDE_UP;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridAdapterViewHolder> {

    private final int[] animationsList;
    private final ClickAdapter clickAdapter;

    public GridAdapter(int[] animationsList, ClickAdapter clickAdapter) {
        this.animationsList = animationsList;
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
        holder.bind(animationsList[position]);
    }

    @Override
    public int getItemCount() {
        return animationsList.length;
    }

    public class GridAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public GridAdapterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            clickAdapter.onClickAdapterItem(view, animationsList[getAdapterPosition()]);
        }

        public void bind(int animationType) {
            switch (animationType) {
                case SLIDE_UP:
                    ((TextView) itemView).setText(R.string.slide_up);
                    break;
                case SLIDE_DOWN:
                    ((TextView) itemView).setText(R.string.slide_down);
                    break;
                case SLIDE_LEFT:
                    ((TextView) itemView).setText(R.string.slide_left);
                    break;
                case SLIDE_RIGHT:
                    ((TextView) itemView).setText(R.string.slide_right);
                    break;
                case FADE_IN:
                    ((TextView) itemView).setText(R.string.fade_in);
                    break;
                case FADE_OUT:
                    ((TextView) itemView).setText(R.string.fade_out);
                    break;
            }
        }
    }
}
