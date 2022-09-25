package com.google.android.libraries.animation;

import android.view.animation.Interpolator;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58714pg;

/* renamed from: com.google.android.libraries.animation.t */
/* compiled from: PG */
public final class C147794t {

    /* renamed from: a */
    final C58714pg f398761a;

    /* renamed from: b */
    public Interpolator f398762b;

    /* renamed from: c */
    public C147788n f398763c;

    public C147794t(C58714pg pgVar) {
        this.f398761a = pgVar;
    }

    /* renamed from: b */
    public static C147794t m240888b(float f, float f2) {
        return new C147794t(C58714pg.m90504g(Float.valueOf(f), Float.valueOf(f2)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C147788n mo124467a() {
        C58838bb.m90869d(this.f398763c != null, "Either evaluator or constantValue has to be provided");
        C147788n nVar = this.f398763c;
        nVar.getClass();
        return new C147792r(this, new C147793s(((Float) this.f398761a.f156456b.mo55176b()).floatValue(), ((Float) this.f398761a.f156457c.mo55176b()).floatValue()), nVar);
    }

    /* renamed from: c */
    public final void mo124468c(Interpolator interpolator) {
        C58838bb.m90866a(interpolator, "interpolator can not be null");
        this.f398762b = interpolator;
    }
}
