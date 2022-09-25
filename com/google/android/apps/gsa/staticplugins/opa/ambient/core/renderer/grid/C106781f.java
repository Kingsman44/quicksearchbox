package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.f */
/* compiled from: PG */
public final /* synthetic */ class C106781f implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ GestureDetector f297567a;

    public /* synthetic */ C106781f(GestureDetector gestureDetector) {
        this.f297567a = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f297567a.onTouchEvent(motionEvent);
    }
}
