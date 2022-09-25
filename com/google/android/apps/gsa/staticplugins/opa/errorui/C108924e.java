package com.google.android.apps.gsa.staticplugins.opa.errorui;

import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.e */
/* compiled from: PG */
public final class C108924e extends C84036z implements C83956t {

    /* renamed from: a */
    public final C83893b f302851a;

    /* renamed from: b */
    public final C113787bc f302852b;

    public C108924e(C83893b bVar, C113787bc bcVar) {
        this.f302851a = bVar;
        this.f302852b = bcVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        boolean z = true;
        if (!this.f302851a.mo77281d() && !this.f302851a.mo77278a().mo56113h()) {
            z = false;
        }
        C58838bb.m90884s(z, "AccountMode is FIXED but no account was provided!");
        if (this.f302852b.mo100630j()) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89846n(new C108897d(this));
    }
}
