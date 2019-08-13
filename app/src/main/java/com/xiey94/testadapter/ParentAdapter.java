package com.xiey94.testadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Create by xiey on 2019/8/13.
 */
public class ParentAdapter extends RecyclerView.Adapter<ParentAdapter.ParentViewHolder> {

    private List<ParentBean> data;
    Context context;
    WorkData workData;

    public ParentAdapter(Context context, List<ParentBean> data, WorkData workData) {
        this.data = data;
        this.context = context;
        this.workData = workData;
    }

    @NonNull
    @Override
    public ParentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_parent, viewGroup, false);
        return new ParentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentViewHolder holder, final int position) {
        holder.tv_title.setText(data.get(position).extra);


        LinearLayoutManager manager = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        holder.recycler_view.setLayoutManager(manager);

        final List<ChildBean> childBeans = data.get(position).childData;

        final ChildAdapter adapter = new ChildAdapter(childBeans);
        holder.recycler_view.setAdapter(adapter);

        adapter.setClickListener(new ChildAdapter.onClickListener() {
            @Override
            public void onClick(View view, int pos) {
                workData.lastParentIndex = workData.currentParentIndex;
                workData.currentParentIndex = position;
                workData.lastChild2Index = workData.currentChild2Index;
                workData.currentChild2Index = pos;
                workData.lastChild = workData.currentChild;
                workData.currentChild = WorkData.CHILD_1;


                if (workData.lastParentIndex >= 0 && workData.lastParentIndex != workData.currentParentIndex) {
                    if (WorkData.CHILD_1.equalsIgnoreCase(workData.lastChild)) {
                        //上一个是child1
                        for (ChildBean childDatum : data.get(workData.lastParentIndex).childData) {
                            childDatum.isSelect = false;
                        }
                    } else if (WorkData.CHILD_2.equalsIgnoreCase(workData.lastChild)) {
                        //上一个是child2
                        for (ChildBean2 childDatum : data.get(workData.lastParentIndex).childData2) {
                            childDatum.isSelect = false;
                        }
                    }

                }

                if (WorkData.CHILD_2.equalsIgnoreCase(workData.lastChild)) {
                    //上一个是child2
                    for (ChildBean2 childDatum : data.get(workData.lastParentIndex).childData2) {
                        childDatum.isSelect = false;
                    }
                }


                notifyDataSetChanged();

            }
        });

        /**************************************************************************************************************/

        LinearLayoutManager manager2 = new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        holder.recycler_view2.setLayoutManager(manager2);

        final List<ChildBean2> childBeans2 = data.get(position).childData2;

        final ChildAdapter2 adapter2 = new ChildAdapter2(childBeans2);
        holder.recycler_view2.setAdapter(adapter2);

        adapter2.setClickListener(new ChildAdapter2.onClickListener() {
            @Override
            public void onClick(View view, int pos) {
                workData.lastParentIndex = workData.currentParentIndex;
                workData.currentParentIndex = position;
                workData.lastChild2Index = workData.currentChild2Index;
                workData.currentChild2Index = pos;
                workData.lastChild = workData.currentChild;
                workData.currentChild = WorkData.CHILD_2;


                if (workData.lastParentIndex >= 0 && workData.lastParentIndex != workData.currentParentIndex) {
                    if (WorkData.CHILD_1.equalsIgnoreCase(workData.lastChild)) {
                        //上一个是child1
                        for (ChildBean childDatum : data.get(workData.lastParentIndex).childData) {
                            childDatum.isSelect = false;
                        }
                    } else if (WorkData.CHILD_2.equalsIgnoreCase(workData.lastChild)) {
                        //上一个是child2
                        for (ChildBean2 childDatum : data.get(workData.lastParentIndex).childData2) {
                            childDatum.isSelect = false;
                        }
                    }

                }

                if (WorkData.CHILD_1.equalsIgnoreCase(workData.lastChild)) {
                    //上一个是child1
                    for (ChildBean childDatum : data.get(workData.lastParentIndex).childData) {
                        childDatum.isSelect = false;
                    }
                }


                notifyDataSetChanged();

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ParentViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title;
        RecyclerView recycler_view;
        RecyclerView recycler_view2;

        public ParentViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            recycler_view = itemView.findViewById(R.id.recycler_view);
            recycler_view2 = itemView.findViewById(R.id.recycler_view2);
        }
    }

}
