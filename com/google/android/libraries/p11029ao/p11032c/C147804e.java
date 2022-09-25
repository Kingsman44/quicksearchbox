package com.google.android.libraries.p11029ao.p11032c;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.ao.c.e */
/* compiled from: PG */
public final class C147804e {

    /* renamed from: a */
    public final C58480gp f398776a = C58485gu.m89837e();

    /* renamed from: b */
    public Boolean f398777b;

    /* renamed from: c */
    public boolean f398778c = false;

    /* renamed from: a */
    public final C147805f mo124473a() {
        C58838bb.m90866a(this.f398777b, "Must call internal() or external() when building a SourcePolicy.");
        return new C147805f(this.f398777b.booleanValue(), this.f398778c, this.f398776a.mo55394f());
    }

    /* renamed from: b */
    public final void mo124474b() {
        C58838bb.m90884s(this.f398777b == null, "A SourcePolicy can only set internal() or external() once.");
        this.f398777b = false;
    }
}
