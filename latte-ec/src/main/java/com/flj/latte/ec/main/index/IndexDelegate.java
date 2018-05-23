package com.flj.latte.ec.main.index;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.diabin.latte.ec.R;
import com.diabin.latte.ec.R2;
import com.flj.latte.bottom.BottomItemDelegate;
import com.flj.latte.ui.recycle.BseDecoration;
import com.flj.latte.ui.refresh.RefreshHandler;
import com.joanzapata.iconify.widget.IconTextView;

import butterknife.BindView;

/**
 * Created by wp on 2018/5/22.
 */

public class IndexDelegate extends BottomItemDelegate {
    @BindView(R2.id.rv_index)
    RecyclerView mRecyclerView = null;
    @BindView(R2.id.srl_index)
    SwipeRefreshLayout mSwipeRefreshLayout = null;
    @BindView(R2.id.tb_index)
    Toolbar mToolbar = null;
    @BindView(R2.id.et_search_view)
    AppCompatEditText mEditText = null;
    @BindView(R2.id.icon_index_message)
    IconTextView icon_message = null;
    @BindView(R2.id.icon_index_scan)
    IconTextView icon_scan = null;

    private RefreshHandler mRefreshHandler = null;

    private void initRefreshLayout() {
        mSwipeRefreshLayout.setColorSchemeResources(
                android.R.color.holo_blue_light,
                android.R.color.holo_red_light,
                android.R.color.holo_green_light
        );
        mSwipeRefreshLayout.setProgressViewOffset(true, 100, 200);
    }

    //设置recycleview布局
    private void initRecycleView() {
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.addItemDecoration(BseDecoration.create(Color.GRAY,2));
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
        mRefreshHandler = RefreshHandler.create(mSwipeRefreshLayout, mRecyclerView, new IndexDataConverter());
//        mRefreshHandler.firstPage("",getContext());
    }

    @Override
    public Object setLayout() {
        return R.layout.delegate_index;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        initRefreshLayout();
        initRecycleView();
    }


}
