package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ak */
/* compiled from: PG */
public final /* synthetic */ class C97139ak implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C97142an f271429a;

    /* renamed from: b */
    public final /* synthetic */ GestureDetector f271430b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f271431c;

    /* renamed from: d */
    public final /* synthetic */ C97212f f271432d;

    public /* synthetic */ C97139ak(C97142an anVar, GestureDetector gestureDetector, Runnable runnable, C97212f fVar) {
        this.f271429a = anVar;
        this.f271430b = gestureDetector;
        this.f271431c = runnable;
        this.f271432d = fVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C97142an anVar = this.f271429a;
        GestureDetector gestureDetector = this.f271430b;
        Runnable runnable = this.f271431c;
        C97212f fVar = this.f271432d;
        if (!gestureDetector.onTouchEvent(motionEvent) || Math.hypot((double) (motionEvent.getRawX() - anVar.f271436c.x), (double) (motionEvent.getRawY() - anVar.f271436c.y)) > ((double) TypedValue.applyDimension(1, 5.0f, anVar.f271435b.getResources().getDisplayMetrics()))) {
            fVar.f271606a.mo90602a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                anVar.mo90534a(motionEvent);
            } else if (actionMasked == 1) {
                if (!anVar.f271437d) {
                    ((C59052c) ((C59052c) C97142an.f271434a.mo56226d()).mo56372aa(18414)).mo56386p("onTouch: Two ACTION_UP events in a row");
                }
                anVar.f271437d = false;
            } else if (actionMasked != 2) {
                if (actionMasked != 4) {
                    anVar.f271437d = false;
                }
            } else if (!anVar.f271437d) {
                ((C59052c) ((C59052c) C97142an.f271434a.mo56226d()).mo56372aa(18415)).mo56386p("onTouch: ACTION_MOVE without ACTION_DOWN");
                anVar.mo90534a(motionEvent);
            }
        } else {
            view.performClick();
            runnable.run();
        }
        return true;
    }
}
