package com.flj.latte.ec.main.develop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.diabin.latte.ec.R;
import com.flj.latte.bottom.BottomItemDelegate;

/**
 * Created by wp on 2018/5/22.
 */

public class DevelopDelegate extends BottomItemDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_develop;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {

    }
}