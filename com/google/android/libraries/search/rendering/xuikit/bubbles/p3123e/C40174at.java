package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.at */
/* compiled from: PG */
public final class C40174at {

    /* renamed from: a */
    public static final C59071e f105544a = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.bubbles.e.at");

    /* renamed from: b */
    public VelocityTracker f105545b;

    /* renamed from: c */
    private boolean f105546c = false;

    /* renamed from: a */
    public final void mo42294a() {
        if (this.f105545b == null) {
            ((C59052c) ((C59052c) f105544a.mo56225c()).mo56372aa(53259)).mo56386p("Missing call for VelocityUtil.init()");
            mo42297d();
        }
        if (!this.f105546c) {
            this.f105545b.computeCurrentVelocity(1000);
            this.f105546c = true;
        }
    }

    /* renamed from: b */
    public final void mo42295b() {
        VelocityTracker velocityTracker = this.f105545b;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f105545b = null;
            this.f105546c = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo42296c(MotionEvent motionEvent) {
        if (this.f105545b == null) {
            ((C59052c) ((C59052c) f105544a.mo56225c()).mo56372aa(53260)).mo56386p("Missing call for VelocityUtil.init()");
            mo42297d();
        }
        this.f105546c = false;
        this.f105545b.addMovement(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo42297d() {
        VelocityTracker velocityTracker = this.f105545b;
        if (velocityTracker == null) {
            this.f105545b = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        this.f105546c = false;
    }
}
