package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Iterator;

/* renamed from: com.google.common.b.dn */
/* compiled from: PG */
final class C58397dn extends C58434ex {

    /* renamed from: a */
    final /* synthetic */ Iterator f155996a;

    /* renamed from: b */
    final /* synthetic */ C58400dq f155997b;

    /* renamed from: c */
    private C58691ok f155998c;

    public C58397dn(C58400dq dqVar, Iterator it) {
        this.f155997b = dqVar;
        this.f155996a = it;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Iterator mo55144b() {
        return this.f155996a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hU */
    public final /* synthetic */ Object mo5948hU() {
        return this.f155996a;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C58691ok okVar = (C58691ok) super.next();
        this.f155998c = okVar;
        return okVar;
    }

    public final void remove() {
        C58838bb.m90884s(this.f155998c != null, "no calls to next() since the last call to remove()");
        this.f155997b.mo54928h(this.f155998c.mo55768b(), 0);
        this.f155998c = null;
    }
}
