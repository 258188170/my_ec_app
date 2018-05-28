package com.flj.latte.delegates.web.event;

import com.flj.latte.util.log.LatteLogger;

/**
 * Created by wp
 */

public class UndefineEvent extends Event {
    @Override
    public String execute(String params) {
        LatteLogger.e("UndefineEvent", params);
        return null;
    }
}