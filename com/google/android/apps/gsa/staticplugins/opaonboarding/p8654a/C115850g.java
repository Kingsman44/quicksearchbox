package com.google.android.apps.gsa.staticplugins.opaonboarding.p8654a;

import com.google.android.apps.gsa.opaonboarding.C83908bn;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.a.g */
/* compiled from: PG */
public final class C115850g {

    /* renamed from: a */
    public final C58833ax f321253a;

    public C115850g(C58833ax axVar) {
        this.f321253a = axVar;
    }

    /* renamed from: a */
    public final String mo102283a() {
        C58838bb.m90884s(mo102285c(), "Child user ID is not available outside parent-facing flows");
        String c = ((C83908bn) this.f321253a.mo56107c()).mo77322c();
        C58838bb.m90866a(c, "No child user ID");
        return c;
    }

    /* renamed from: b */
    public final boolean mo102284b() {
        C58833ax axVar = this.f321253a;
        return axVar.mo56113h() && ((C83908bn) axVar.mo56107c()).mo77320a() == 0;
    }

    /* renamed from: c */
    public final boolean mo102285c() {
        C58833ax axVar = this.f321253a;
        return axVar.mo56113h() && ((C83908bn) axVar.mo56107c()).mo77320a() == 1;
    }
}
