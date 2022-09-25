package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.as */
/* compiled from: PG */
public final class C97147as {

    /* renamed from: a */
    public static final C59071e f271454a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.as");

    /* renamed from: b */
    public VelocityTracker f271455b;

    /* renamed from: c */
    private boolean f271456c = false;

    /* renamed from: a */
    public final void mo90543a() {
        if (this.f271455b == null) {
            ((C59052c) ((C59052c) f271454a.mo56226d()).mo56372aa(18421)).mo56386p("Missing call for VelocityUtil.init()");
            int i = C90755l.f253831a;
            mo90546d();
        }
        if (!this.f271456c) {
            this.f271455b.computeCurrentVelocity(1000);
            this.f271456c = true;
        }
    }

    /* renamed from: b */
    public final void mo90544b() {
        VelocityTracker velocityTracker = this.f271455b;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f271455b = null;
            this.f271456c = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo90545c(MotionEvent motionEvent) {
        if (this.f271455b == null) {
            ((C59052c) ((C59052c) f271454a.mo56226d()).mo56372aa(18422)).mo56386p("Missing call for VelocityUtil.init()");
            int i = C90755l.f253831a;
            mo90546d();
        }
        this.f271456c = false;
        this.f271455b.addMovement(motionEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo90546d() {
        VelocityTracker velocityTracker = this.f271455b;
        if (velocityTracker == null) {
            this.f271455b = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        this.f271456c = false;
    }
}
