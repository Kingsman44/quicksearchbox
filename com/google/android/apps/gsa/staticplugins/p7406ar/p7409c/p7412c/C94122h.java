package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7412c;

import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.c.h */
/* compiled from: PG */
final class C94122h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    final /* synthetic */ C94124j f262948a;

    /* renamed from: b */
    private final float f262949b;

    /* renamed from: c */
    private final float f262950c;

    /* renamed from: d */
    private final float f262951d;

    /* renamed from: e */
    private float f262952e;

    public C94122h(C94124j jVar) {
        this.f262948a = jVar;
        this.f262949b = TypedValue.applyDimension(1, 500.0f, jVar.f262958c);
        this.f262951d = (jVar.f262960e + ((float) jVar.f262958c.heightPixels)) / 2.0f;
        this.f262950c = jVar.f262960e / 2.0f;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f262952e = (float) this.f262948a.f262961f.getLayoutParams().height;
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float rawY = (motionEvent2.getRawY() - motionEvent.getRawY()) / (((float) (motionEvent2.getEventTime() - motionEvent2.getDownTime())) * 0.001f);
        float f3 = this.f262949b;
        if (rawY > f3) {
            this.f262948a.f262957b.mo88323e();
            return true;
        } else if (rawY >= (-f3)) {
            return true;
        } else {
            this.f262948a.mo88336e();
            return true;
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f262948a.f262963h) {
            return true;
        }
        int rawY = (int) (this.f262952e + (motionEvent.getRawY() - motionEvent2.getRawY()));
        this.f262948a.f262961f.getLayoutParams().height = rawY;
        this.f262948a.f262961f.requestLayout();
        float f3 = (float) rawY;
        if (f3 < this.f262950c) {
            this.f262948a.f262957b.mo88323e();
        }
        if (f3 > this.f262951d) {
            this.f262948a.mo88336e();
        }
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f262948a.f262957b.mo88323e();
        return true;
    }
}
