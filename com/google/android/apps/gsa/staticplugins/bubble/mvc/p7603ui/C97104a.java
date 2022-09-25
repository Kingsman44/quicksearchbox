package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.a */
/* compiled from: PG */
public final /* synthetic */ class C97104a implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ GestureDetector f271312a;

    /* renamed from: b */
    public final /* synthetic */ C97233s f271313b;

    public /* synthetic */ C97104a(GestureDetector gestureDetector, C97233s sVar) {
        this.f271312a = gestureDetector;
        this.f271313b = sVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f271312a;
        C97233s sVar = this.f271313b;
        if (!gestureDetector.onTouchEvent(motionEvent)) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        sVar.f271639a.mo90526n();
        return true;
    }
}
