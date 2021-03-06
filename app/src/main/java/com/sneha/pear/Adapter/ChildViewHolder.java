package com.sneha.pear.Adapter;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

/**
 * ViewHolder for a child list
 * item.
 * <p>
 * The user should extend this class and implement as they wish for their
 * child list item.
 *
 * @author Ryan Brooks
 * @version 1.0
 * @since 5/27/2015
 */
public class ChildViewHolder extends RecyclerView.ViewHolder {

    /**
     * Default constructor.
     *
     * @param itemView The {@link View} being hosted in this ViewHolder
     */
    public ChildViewHolder(View itemView) {
        super(itemView);
    }
}