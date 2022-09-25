package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7608d;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.d.c */
/* compiled from: PG */
public final /* synthetic */ class C97197c implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ Runnable f271559a;

    public /* synthetic */ C97197c(Runnable runnable) {
        this.f271559a = runnable;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Runnable runnable = this.f271559a;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        runnable.run();
        return false;
    }
}
