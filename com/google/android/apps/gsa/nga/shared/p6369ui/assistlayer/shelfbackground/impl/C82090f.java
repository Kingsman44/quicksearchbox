package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.f */
/* compiled from: PG */
final class C82090f extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: e */
    public static final /* synthetic */ int f224437e = 0;

    /* renamed from: a */
    public float f224438a;

    /* renamed from: b */
    public float f224439b;

    /* renamed from: c */
    public boolean f224440c;

    /* renamed from: d */
    public Supplier f224441d = C82089e.f224436a;

    /* renamed from: f */
    private Rect f224442f = new Rect();

    /* renamed from: g */
    private Optional f224443g = Optional.empty();

    /* renamed from: d */
    private final void m130373d() {
        this.f224438a = 0.0f;
        this.f224439b = 0.0f;
    }

    /* renamed from: e */
    private final void m130374e(float f, float f2) {
        if (this.f224440c) {
            this.f224440c = false;
            this.f224443g.ifPresent(new C82088d(f, f2));
        }
    }

    /* renamed from: f */
    private final boolean m130375f(MotionEvent motionEvent) {
        return !this.f224442f.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    /* renamed from: a */
    public final void mo75505a(C82091g gVar) {
        if (this.f224440c) {
            m130374e(this.f224439b, this.f224438a);
        }
        Optional ofNullable = Optional.ofNullable(gVar);
        this.f224443g = ofNullable;
        if (this.f224440c) {
            ofNullable.ifPresent(C82072b.f224350a);
        }
    }

    /* renamed from: b */
    public final void mo75506b() {
        if (this.f224440c) {
            m130374e(this.f224439b, this.f224438a);
            m130373d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo75507c(float f) {
        float f2 = this.f224438a + f;
        this.f224438a = f2;
        if (f2 == 0.0f) {
            m130373d();
            return false;
        }
        if (!this.f224440c) {
            this.f224440c = true;
            this.f224443g.ifPresent(C82072b.f224350a);
        }
        this.f224443g.ifPresent(new C82087c(f2));
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.f224442f = (Rect) this.f224441d.get();
        if (m130375f(motionEvent)) {
            return false;
        }
        m130373d();
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (m130375f(motionEvent)) {
            return false;
        }
        this.f224439b = f2;
        mo75506b();
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(motionEvent2.getRawY() - motionEvent.getRawY()) <= Math.abs(motionEvent2.getRawX() - motionEvent.getRawX())) {
            m130373d();
            return false;
        } else if (!m130375f(motionEvent)) {
            return mo75507c(f2);
        } else {
            m130373d();
            return false;
        }
    }
}
