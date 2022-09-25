package com.google.android.libraries.home.coreui.p1951b.p1952a;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.home.coreui.b.a.a */
/* compiled from: PG */
public final class C23635a extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    private static final C59071e f64654a = C59071e.m91332i("com.google.android.libraries.home.coreui.b.a.a");

    /* renamed from: b */
    private final GestureDetector.SimpleOnGestureListener f64655b;

    public C23635a(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f64655b = simpleOnGestureListener;
    }

    public final boolean onContextClick(MotionEvent motionEvent) {
        return this.f64655b.onContextClick(motionEvent);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return this.f64655b.onDoubleTap(motionEvent);
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return this.f64655b.onDoubleTapEvent(motionEvent);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return this.f64655b.onDown(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f64655b.onFling(motionEvent, motionEvent2, f, f2);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.f64655b.onLongPress(motionEvent);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent != null && motionEvent2 != null) {
            return this.f64655b.onScroll(motionEvent, motionEvent2, f, f2);
        }
        C59052c cVar = (C59052c) f64654a.mo56226d();
        cVar.mo56374ac(1, TimeUnit.SECONDS);
        ((C59052c) cVar.mo56372aa(48665)).mo56386p("Ignoring onScroll() with missing MotionEvent.");
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
        this.f64655b.onShowPress(motionEvent);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return this.f64655b.onSingleTapConfirmed(motionEvent);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f64655b.onSingleTapUp(motionEvent);
    }
}
