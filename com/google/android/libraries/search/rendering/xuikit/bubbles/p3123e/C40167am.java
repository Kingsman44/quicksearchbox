package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.am */
/* compiled from: PG */
public final /* synthetic */ class C40167am implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C40170ap f105520a;

    /* renamed from: b */
    public final /* synthetic */ GestureDetector f105521b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f105522c;

    /* renamed from: d */
    public final /* synthetic */ C40228i f105523d;

    public /* synthetic */ C40167am(C40170ap apVar, GestureDetector gestureDetector, Runnable runnable, C40228i iVar) {
        this.f105520a = apVar;
        this.f105521b = gestureDetector;
        this.f105522c = runnable;
        this.f105523d = iVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C40170ap apVar = this.f105520a;
        GestureDetector gestureDetector = this.f105521b;
        Runnable runnable = this.f105522c;
        C40228i iVar = this.f105523d;
        if (!gestureDetector.onTouchEvent(motionEvent) || Math.hypot((double) (motionEvent.getRawX() - apVar.f105527c.x), (double) (motionEvent.getRawY() - apVar.f105527c.y)) > ((double) TypedValue.applyDimension(1, 5.0f, apVar.f105526b.getResources().getDisplayMetrics()))) {
            iVar.f105685a.mo42334a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                apVar.mo42288a(motionEvent);
            } else if (actionMasked == 1) {
                if (!apVar.f105528d) {
                    ((C59052c) ((C59052c) C40170ap.f105525a.mo56226d()).mo56372aa(53254)).mo56386p("onTouch: Two ACTION_UP events in a row");
                }
                apVar.f105528d = false;
            } else if (actionMasked != 2) {
                if (actionMasked != 4) {
                    apVar.f105528d = false;
                }
            } else if (!apVar.f105528d) {
                ((C59052c) ((C59052c) C40170ap.f105525a.mo56226d()).mo56372aa(53255)).mo56386p("onTouch: ACTION_MOVE without ACTION_DOWN");
                apVar.mo42288a(motionEvent);
            }
        } else {
            view.performClick();
            runnable.run();
        }
        return true;
    }
}
