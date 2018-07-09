package com.liyunlong.gankio.utils;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * {@link RecyclerView}的{@link RecyclerView.ViewHolder}实现类
 *
 * @author liyunlong
 * @date 2018/7/3 18:27
 */
public final class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private final Context mContext;
    private final ViewHolder mHolder;

    public static RecyclerViewHolder createViewHolder(Context context, @NonNull View itemView) {
        return new RecyclerViewHolder(context, itemView);
    }

    public static RecyclerViewHolder createViewHolder(Context context, @Nullable ViewGroup parent, @LayoutRes int layoutId) {
        View itemView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        return new RecyclerViewHolder(context, itemView);
    }

    private RecyclerViewHolder(Context context, @NonNull View itemView) {
        super(itemView);
        this.mContext = context;
        this.mHolder = ViewHolder.creat(this.itemView);
    }

    public Context getContext() {
        return mContext;
    }

    public View getItemView() {
        return itemView;
    }

    public ViewHolder getViewHolder() {
        return mHolder;
    }

}
