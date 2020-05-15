package com.cheikh.lazywaimai.ui.adapter;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.cheikh.lazywaimai.R;
import com.cheikh.lazywaimai.base.BaseAdapter;
import com.cheikh.lazywaimai.model.bean.ShoppingEntity;
import com.cheikh.lazywaimai.ui.adapter.holder.ShoppingCartItemViewHolder;

/**
 * author: cheikh.wang on 16/11/24
 * email: wanghonghi@126.com
 */
public class ShoppingCartListAdapter extends BaseAdapter<ShoppingEntity> {

    @Override
    public int getViewLayoutId(int viewType) {
        return R.layout.layout_shopping_cart_item;
    }

    @Override
    public ShoppingCartItemViewHolder createViewHolder(View view, int viewType) {
        return new ShoppingCartItemViewHolder(view);
    }

    @Override
    public void bindViewHolder(RecyclerView.ViewHolder holder, ShoppingEntity entity, int position) {
        if (holder instanceof ShoppingCartItemViewHolder) {
            ((ShoppingCartItemViewHolder) holder).bind(entity);
        }
    }
}