package com.google.android.gms.car.p10760f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.car.C143109au;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.bt */
/* compiled from: PG */
public final class C143286bt {

    /* renamed from: a */
    public C143287bu f388498a;

    /* renamed from: b */
    public C143287bu f388499b;

    /* renamed from: c */
    public C143287bu f388500c;

    /* renamed from: d */
    public C143287bu f388501d;

    /* renamed from: e */
    public int f388502e;

    /* renamed from: f */
    private boolean f388503f;

    /* renamed from: e */
    private final boolean m232463e(int i) {
        return (i & this.f388502e) != 0;
    }

    /* renamed from: f */
    private static void m232464f(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    /* renamed from: a */
    public final void mo118336a(View view) {
        if (!(view instanceof FrameLayout)) {
            throw new IllegalArgumentException("addTrampolines must be invoked on a ViewGroup");
        } else if (this.f388498a == null && this.f388499b == null && this.f388500c == null && this.f388501d == null) {
            FrameLayout frameLayout = (FrameLayout) view;
            C143287bu buVar = new C143287bu(frameLayout.getContext());
            buVar.setLayoutParams(new FrameLayout.LayoutParams(1, -1, 3));
            frameLayout.addView(buVar);
            C143287bu buVar2 = new C143287bu(frameLayout.getContext());
            buVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, 1, 48));
            frameLayout.addView(buVar2);
            C143287bu buVar3 = new C143287bu(frameLayout.getContext());
            buVar3.setLayoutParams(new FrameLayout.LayoutParams(1, -1, 5));
            frameLayout.addView(buVar3);
            C143287bu buVar4 = new C143287bu(frameLayout.getContext());
            buVar4.setLayoutParams(new FrameLayout.LayoutParams(-1, 1, 80));
            frameLayout.addView(buVar4);
            this.f388498a = buVar;
            this.f388499b = buVar2;
            this.f388500c = buVar3;
            this.f388501d = buVar4;
            mo118339d();
        } else {
            throw new IllegalStateException("Call to addTrampolines when trampolines already exist");
        }
    }

    /* renamed from: b */
    public final void mo118337b() {
        C143287bu buVar = this.f388498a;
        if (buVar != null) {
            m232464f(buVar);
            this.f388498a = null;
        }
        C143287bu buVar2 = this.f388499b;
        if (buVar2 != null) {
            m232464f(buVar2);
            this.f388499b = null;
        }
        C143287bu buVar3 = this.f388500c;
        if (buVar3 != null) {
            m232464f(buVar3);
            this.f388500c = null;
        }
        C143287bu buVar4 = this.f388501d;
        if (buVar4 != null) {
            m232464f(buVar4);
            this.f388501d = null;
        }
    }

    /* renamed from: c */
    public final void mo118338c(boolean z) {
        this.f388503f = z;
        if (this.f388498a != null && this.f388499b != null && this.f388500c != null && this.f388501d != null) {
            mo118339d();
        } else if (C143109au.m232164a("CAR.PROJECTION", 3)) {
            C143316a.m232511a("CAR.PROJECTION", (Throwable) null, "Call to setTrampolinesActive prior to addTrampolines");
        }
    }

    /* renamed from: d */
    public final void mo118339d() {
        boolean z = true;
        this.f388498a.setFocusable(this.f388503f && m232463e(1));
        this.f388499b.setFocusable(this.f388503f && m232463e(2));
        this.f388500c.setFocusable(this.f388503f && m232463e(4));
        C143287bu buVar = this.f388501d;
        if (!this.f388503f || !m232463e(8)) {
            z = false;
        }
        buVar.setFocusable(z);
    }
}
