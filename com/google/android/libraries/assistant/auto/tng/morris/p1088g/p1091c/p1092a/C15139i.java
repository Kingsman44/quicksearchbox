package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.a.i */
/* compiled from: PG */
public final class C15139i {

    /* renamed from: a */
    private static final C59071e f45427a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.c.a.i");

    /* renamed from: b */
    private VelocityTracker f45428b;

    /* renamed from: c */
    private boolean f45429c = false;

    /* renamed from: f */
    private final void m31708f() {
        if (this.f45428b == null) {
            ((C59052c) ((C59052c) f45427a.mo56226d()).mo56372aa(45998)).mo56386p("Missing call for VelocityUtil.init()");
            mo22008e();
        }
        if (!this.f45429c) {
            VelocityTracker velocityTracker = this.f45428b;
            velocityTracker.getClass();
            velocityTracker.computeCurrentVelocity(1000);
            this.f45429c = true;
        }
    }

    /* renamed from: a */
    public final float mo22004a() {
        if (this.f45428b == null) {
            ((C59052c) ((C59052c) f45427a.mo56226d()).mo56372aa(45996)).mo56386p("Missing call for VelocityUtil.init()");
            return 0.0f;
        }
        m31708f();
        VelocityTracker velocityTracker = this.f45428b;
        velocityTracker.getClass();
        return velocityTracker.getXVelocity();
    }

    /* renamed from: b */
    public final float mo22005b() {
        if (this.f45428b == null) {
            ((C59052c) ((C59052c) f45427a.mo56226d()).mo56372aa(45997)).mo56386p("Missing call for VelocityUtil.init()");
            return 0.0f;
        }
        m31708f();
        VelocityTracker velocityTracker = this.f45428b;
        velocityTracker.getClass();
        return velocityTracker.getYVelocity();
    }

    /* renamed from: c */
    public final void mo22006c() {
        VelocityTracker velocityTracker = this.f45428b;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f45428b = null;
            this.f45429c = false;
        }
    }

    /* renamed from: d */
    public final void mo22007d(MotionEvent motionEvent) {
        if (this.f45428b == null) {
            ((C59052c) ((C59052c) f45427a.mo56226d()).mo56372aa(45999)).mo56386p("Missing call for VelocityUtil.init()");
            mo22008e();
        }
        this.f45429c = false;
        VelocityTracker velocityTracker = this.f45428b;
        velocityTracker.getClass();
        velocityTracker.addMovement(motionEvent);
    }

    /* renamed from: e */
    public final void mo22008e() {
        VelocityTracker velocityTracker = this.f45428b;
        if (velocityTracker == null) {
            this.f45428b = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        this.f45429c = false;
    }
}
