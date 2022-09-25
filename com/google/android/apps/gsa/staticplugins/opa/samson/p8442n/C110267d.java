package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.d */
/* compiled from: PG */
public final /* synthetic */ class C110267d implements View.OnTouchListener {

    /* renamed from: a */
    public static final /* synthetic */ C110267d f307289a = new C110267d();

    private /* synthetic */ C110267d() {
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
