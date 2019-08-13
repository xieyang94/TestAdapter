package com.xiey94.testadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Create by xiey on 2019/8/13.
 */
public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ChildViewHolder> {

    private List<ChildBean> data;

    public ChildAdapter(List<ChildBean> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_child, viewGroup, false);
        return new ChildViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, final int position) {
        holder.tv_content.setText(data.get(position).extra);
        if (data.get(position).isSelect) {
            holder.tv_content.setText("我被选中了！！！");
        } else {
            holder.tv_content.setText(data.get(position).extra);
        }

        holder.tv_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickListener != null) {
                    for (int i = 0; i < data.size(); i++) {
                        data.get(i).isSelect = position == i;
                    }
                    clickListener.onClick(v, position);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ChildViewHolder extends RecyclerView.ViewHolder {
        TextView tv_content;

        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_content = itemView.findViewById(R.id.tv_content);
        }
    }

    public interface onClickListener {
        void onClick(View view, int position);
    }

    private onClickListener clickListener;

    public void setClickListener(onClickListener clickListener) {
        this.clickListener = clickListener;
    }
}
