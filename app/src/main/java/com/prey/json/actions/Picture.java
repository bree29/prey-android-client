/*******************************************************************************
 * Created by Orlando Aliaga
 * Copyright 2015 Prey Inc. All rights reserved.
 * License: GPLv3
 * Full license at "/LICENSE"
 ******************************************************************************/
package com.prey.json.actions;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import android.content.Context;

import com.prey.actions.HttpDataService;
import com.prey.actions.observer.ActionResult;
import com.prey.actions.picture.PictureThread;
import com.prey.actions.picture.PictureUtil;
import com.prey.json.JsonAction;


public class Picture extends JsonAction {

    public List<HttpDataService> report(Context ctx, List<ActionResult> list, JSONObject parameters) {
        List<HttpDataService> listResult = super.report(ctx, list, parameters);
        return listResult;
    }


    public List<HttpDataService> get(Context ctx, List<ActionResult> list, JSONObject parameters) {
        List<HttpDataService> listResult = super.get(ctx, list, parameters);
        return listResult;
    }


    public HttpDataService run(Context ctx, List<ActionResult> list, JSONObject parameters) {
        return PictureUtil.getPicture(ctx);
    }

    public HttpDataService start(Context ctx, List<ActionResult> list, JSONObject parameters) {
        return PictureUtil.getPicture(ctx);
    }


    public List<HttpDataService> sms(Context ctx, List<ActionResult> list, JSONObject parameters) {
        new PictureThread(ctx).start();
        List<HttpDataService> listResult = new ArrayList<HttpDataService>();
        return listResult;
    }


}
