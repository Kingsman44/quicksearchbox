package com.google.android.libraries.home.coreui.devicetile;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.ScaleAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bw */
/* compiled from: PG */
final class C23704bw implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C23707bz f64829a;

    /* renamed from: b */
    final /* synthetic */ GestureDetector f64830b;

    /* renamed from: c */
    final /* synthetic */ C23702bu f64831c;

    public C23704bw(C23707bz bzVar, GestureDetector gestureDetector, C23702bu buVar) {
        this.f64829a = bzVar;
        this.f64830b = gestureDetector;
        this.f64831c = buVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C69664n.m101061g(view, "v");
        C69664n.m101061g(motionEvent, "e");
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
            C23707bz bzVar = this.f64829a;
            if (!bzVar.f64845k) {
                view.setPressed(true);
                bzVar.f64845k = true;
                ConstraintLayout constraintLayout = ((C23674at) bzVar.mo29054f()).f64761l;
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.97f, 1.0f, 0.97f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setFillAfter(true);
                scaleAnimation.setDuration(50);
                constraintLayout.startAnimation(scaleAnimation);
            }
        }
        if (motionEvent.getAction() == 1) {
            C23707bz bzVar2 = this.f64829a;
            if (bzVar2.f64845k) {
                view.setPressed(false);
                bzVar2.f64845k = false;
                ConstraintLayout constraintLayout2 = ((C23674at) bzVar2.mo29054f()).f64761l;
                ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.97f, 1.0f, 0.97f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation2.setFillAfter(true);
                scaleAnimation2.setDuration(250);
                constraintLayout2.startAnimation(scaleAnimation2);
            }
        }
        if (!this.f64830b.onTouchEvent(motionEvent) && motionEvent.getAction() == 1 && this.f64831c.f64825a) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            this.f64831c.f64825a = false;
            this.f64829a.mo29055g();
        }
        return false;
    }
}
