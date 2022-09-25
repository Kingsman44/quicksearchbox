package com.google.apps.tiktok.tracing;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: com.google.apps.tiktok.tracing.dg */
/* compiled from: PG */
public final class C47769dg implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    final /* synthetic */ C47770dh f123758a;

    /* renamed from: b */
    private final GestureDetector.OnGestureListener f123759b;

    /* renamed from: c */
    private final GestureDetector.OnDoubleTapListener f123760c;

    /* renamed from: d */
    private final String f123761d = "Backspace gesture listener";

    public C47769dg(C47770dh dhVar, GestureDetector.OnGestureListener onGestureListener, GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f123758a = dhVar;
        this.f123759b = onGestureListener;
        this.f123760c = onDoubleTapListener;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (C47831fm.m85027v()) {
            return this.f123760c.onDoubleTap(motionEvent);
        }
        C47538ax c = this.f123758a.mo51613c(this.f123761d);
        try {
            boolean onDoubleTap = this.f123760c.onDoubleTap(motionEvent);
            if (c != null) {
                c.close();
            }
            return onDoubleTap;
        } catch (Throwable th) {
            C47768df.m84917a(th, th);
        }
        throw th;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (C47831fm.m85027v()) {
            return this.f123760c.onDoubleTapEvent(motionEvent);
        }
        C47538ax c = this.f123758a.mo51613c(this.f123761d);
        try {
            boolean onDoubleTapEvent = this.f123760c.onDoubleTapEvent(motionEvent);
            if (c != null) {
                c.close();
            }
            return onDoubleTapEvent;
        } catch (Throwable th) {
            C47768df.m84917a(th, th);
        }
        throw th;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (C47831fm.m85027v()) {
            return this.f123759b.onDown(motionEvent);
        }
        C47538ax c = this.f123758a.mo51613c(this.f123761d);
        try {
            boolean onDown = this.f123759b.onDown(motionEvent);
            if (c != null) {
                c.close();
            }
            return onDown;
        } catch (Throwable th) {
            C47768df.m84917a(th, th);
        }
        throw th;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (C47831fm.m85027v()) {
            return this.f123759b.onFling(motionEvent, motionEvent2, f, f2);
        }
        C47538ax c = this.f123758a.mo51613c(this.f123761d);
        try {
            boolean onFling = this.f123759b.onFling(motionEvent, motionEvent2, f, f2);
            if (c != null) {
                c.close();
            }
            return onFling;
        } catch (Throwable th) {
            C47768df.m84917a(th, th);
        }
        throw th;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (C47831fm.m85027v()) {
            this.f123759b.onLongPress(motionEvent);
            return;
        }
        C47538ax c = this.f123758a.mo51613c(this.f123761d);
        try {
            this.f123759b.onLongPress(motionEvent);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47768df.m84917a(th, th);
        }
        throw th;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (C47831fm.m85027v()) {
            return this.f123759b.onScroll(motionEvent, motionEvent2, f, f2);
        }
        C47538ax c = this.f123758a.mo51613c(this.f123761d);
        try {
            boolean onScroll = this.f123759b.onScroll(motionEvent, motionEvent2, f, f2);
            if (c != null) {
                c.close();
            }
            return onScroll;
        } catch (Throwable th) {
            C47768df.m84917a(th, th);
        }
        throw th;
    }

    public final void onShowPress(MotionEvent motionEvent) {
        if (C47831fm.m85027v()) {
            this.f123759b.onShowPress(motionEvent);
            return;
        }
        C47538ax c = this.f123758a.mo51613c(this.f123761d);
        try {
            this.f123759b.onShowPress(motionEvent);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47768df.m84917a(th, th);
        }
        throw th;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (C47831fm.m85027v()) {
            return this.f123760c.onSingleTapConfirmed(motionEvent);
        }
        C47538ax c = this.f123758a.mo51613c(this.f123761d);
        try {
            boolean onSingleTapConfirmed = this.f123760c.onSingleTapConfirmed(motionEvent);
            if (c != null) {
                c.close();
            }
            return onSingleTapConfirmed;
        } catch (Throwable th) {
            C47768df.m84917a(th, th);
        }
        throw th;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (C47831fm.m85027v()) {
            return this.f123759b.onSingleTapUp(motionEvent);
        }
        C47538ax c = this.f123758a.mo51613c(this.f123761d);
        try {
            boolean onSingleTapUp = this.f123759b.onSingleTapUp(motionEvent);
            if (c != null) {
                c.close();
            }
            return onSingleTapUp;
        } catch (Throwable th) {
            C47768df.m84917a(th, th);
        }
        throw th;
    }
}
