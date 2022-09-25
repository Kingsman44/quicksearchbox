package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.n */
/* compiled from: PG */
public abstract class C102372n implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    public final ScaleGestureDetector f285671a;

    /* renamed from: b */
    public final GestureDetector f285672b;

    /* renamed from: c */
    public final Scroller f285673c;

    /* renamed from: d */
    public int f285674d = 0;

    /* renamed from: e */
    public int f285675e = 0;

    /* renamed from: f */
    public final ValueAnimator f285676f;

    public C102372n(Context context) {
        this.f285673c = new Scroller(context);
        this.f285671a = new ScaleGestureDetector(context, this);
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.f285672b = gestureDetector;
        gestureDetector.setOnDoubleTapListener(this);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 1});
        this.f285676f = ofInt;
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new C102370l(this));
        ofInt.addListener(new C102371m(this));
    }

    /* renamed from: a */
    public abstract boolean mo93120a(float f, float f2);

    /* renamed from: b */
    public abstract boolean mo93121b(float f, float f2, float f3);

    /* renamed from: c */
    public abstract boolean mo93122c(float f, float f2);

    /* renamed from: d */
    public abstract boolean mo93123d();

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return mo93120a(motionEvent.getX(), motionEvent.getY());
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f285673c.forceFinished(true);
        this.f285673c.fling((int) motionEvent2.getX(), (int) motionEvent2.getY(), (int) (-f), (int) (-f2), LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE, LinearLayoutManager.INVALID_OFFSET, Integer.MAX_VALUE);
        this.f285676f.cancel();
        this.f285676f.setDuration((long) this.f285673c.getDuration());
        this.f285676f.start();
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return mo93121b(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return mo93122c(f, f2);
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.f285673c.isFinished()) {
            return false;
        }
        motionEvent.getX();
        motionEvent.getY();
        return mo93123d();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f285676f.cancel();
        }
        this.f285672b.onTouchEvent(motionEvent);
        return this.f285671a.onTouchEvent(motionEvent);
    }
}
