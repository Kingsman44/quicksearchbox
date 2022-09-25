package com.google.p4449cd.p4453d;

import com.google.common.base.C58838bb;

/* renamed from: com.google.cd.d.d */
/* compiled from: PG */
public final class C57958d {

    /* renamed from: a */
    public final C57957c f155001a;

    /* renamed from: b */
    public final Long f155002b;

    /* renamed from: c */
    public final Long f155003c;

    /* renamed from: d */
    public final Long f155004d;

    /* renamed from: e */
    private final Object f155005e;

    /* renamed from: f */
    private final Class f155006f;

    public C57958d(C57957c cVar, Object obj, Class cls, Long l, Long l2, Long l3) {
        boolean z = false;
        C58838bb.m90868c(!cVar.f155000f || obj != null);
        C58838bb.m90868c((cVar.f155000f || cls != null) ? true : z);
        this.f155001a = cVar;
        this.f155005e = obj;
        this.f155006f = cls;
        this.f155002b = l;
        this.f155003c = l2;
        this.f155004d = l3;
    }

    /* renamed from: a */
    public final Class mo54563a() {
        C58838bb.m90866a(this.f155006f, "Method should only be called with auxiliary tasks.");
        return this.f155006f;
    }

    /* renamed from: b */
    public final Object mo54564b() {
        C58838bb.m90866a(this.f155005e, "Method should only be called with producer tasks.");
        return this.f155005e;
    }
}
