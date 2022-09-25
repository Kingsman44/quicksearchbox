package com.facebook.litho;

import com.facebook.litho.p323b.C6118b;

/* renamed from: com.facebook.litho.hs */
/* compiled from: PG */
public final class C6394hs extends C6407q {
    @C6118b

    /* renamed from: a */
    C6407q f18919a;

    private C6394hs() {
        super("Wrapper");
    }

    /* renamed from: b */
    public static C6393hr m17136b(C6411u uVar) {
        C6393hr hrVar = new C6393hr();
        hrVar.mo13405e(uVar, new C6394hs());
        return hrVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        return mo13057a((C6407q) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C6407q mo12835c(C6411u uVar) {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C6181da mo12836d(C6411u uVar) {
        C6407q qVar = this.f18919a;
        return qVar == null ? C6411u.f19008a : C6184dd.m16302a(uVar, qVar, false, false, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo13269e() {
        return true;
    }

    /* renamed from: f */
    public final boolean mo13115f(C6407q qVar) {
        if (this == qVar) {
            return true;
        }
        if (qVar == null || getClass() != qVar.getClass()) {
            return false;
        }
        C6394hs hsVar = (C6394hs) qVar;
        if (this.f18989l == hsVar.f18989l) {
            return true;
        }
        C6407q qVar2 = this.f18919a;
        return qVar2 == null ? hsVar.f18919a == null : qVar2.mo13057a(hsVar.f18919a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C6407q mo13406i() {
        return this.f18919a;
    }
}
