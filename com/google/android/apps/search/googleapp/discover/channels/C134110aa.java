package com.google.android.apps.search.googleapp.discover.channels;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.aa */
/* compiled from: PG */
public final /* synthetic */ class C134110aa implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ View f365318a;

    /* renamed from: b */
    public final /* synthetic */ View f365319b;

    public /* synthetic */ C134110aa(View view, View view2) {
        this.f365318a = view;
        this.f365319b = view2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f365318a.dispatchTouchEvent(motionEvent) || this.f365319b.dispatchTouchEvent(motionEvent);
    }
}
