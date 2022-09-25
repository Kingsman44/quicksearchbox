package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.bq */
/* compiled from: PG */
public final /* synthetic */ class C110358bq implements View.OnTouchListener {

    /* renamed from: a */
    public static final /* synthetic */ C110358bq f307583a = new C110358bq();

    private /* synthetic */ C110358bq() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        if (motionEvent.getAction() != 0 || (parent = view.getParent()) == null) {
            return false;
        }
        parent.requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
