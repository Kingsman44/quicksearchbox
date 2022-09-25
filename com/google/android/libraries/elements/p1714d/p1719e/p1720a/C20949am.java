package com.google.android.libraries.elements.p1714d.p1719e.p1720a;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.elements.d.e.a.am */
/* compiled from: PG */
final class C20949am implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ View f58737a;

    /* renamed from: b */
    final /* synthetic */ C20951ao f58738b;

    public C20949am(C20951ao aoVar, View view) {
        this.f58738b = aoVar;
        this.f58737a = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f58738b.mo26077f();
        this.f58737a.setOnTouchListener((View.OnTouchListener) null);
        return false;
    }
}
