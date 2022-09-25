package com.google.android.libraries.lens.common.p2002e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* renamed from: com.google.android.libraries.lens.common.e.c */
/* compiled from: PG */
final class C24109c extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a */
    final /* synthetic */ C24112f f65817a;

    public C24109c(C24112f fVar) {
        this.f65817a = fVar;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.f65817a.f65840j != C24111e.FIRST_TAP) {
            return true;
        }
        this.f65817a.mo29516b(C24111e.DOUBLE_TAP);
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f65817a.mo29516b(C24111e.FLING);
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.f65817a.mo29516b(C24111e.LONG_PRESS);
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f65817a.mo29516b(C24111e.ZOOM);
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float a = this.f65817a.mo29515a(motionEvent2, 0);
        float a2 = this.f65817a.mo29515a(motionEvent2, 1);
        C24112f fVar = this.f65817a;
        float f3 = (float) fVar.f65835e;
        if (a > f3 && a > a2) {
            fVar.mo29516b(C24111e.DRAG_X);
        } else if (a2 <= f3 || a2 <= a * 3.0f) {
            float a3 = fVar.mo29515a(motionEvent2, -1);
            C24112f fVar2 = this.f65817a;
            if (a3 > ((float) fVar2.f65835e)) {
                fVar2.mo29516b(C24111e.DRAG);
            }
        } else {
            fVar.mo29516b(C24111e.DRAG_Y);
        }
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.f65817a.mo29516b(C24111e.SINGLE_TAP);
        this.f65817a.f65841k = false;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.f65817a.mo29516b(C24111e.FIRST_TAP);
        return true;
    }
}
