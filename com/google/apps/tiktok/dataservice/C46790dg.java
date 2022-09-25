package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58838bb;

/* renamed from: com.google.apps.tiktok.dataservice.dg */
/* compiled from: PG */
abstract class C46790dg {
    /* renamed from: a */
    public abstract int mo50716a();

    /* renamed from: b */
    public abstract long mo50717b();

    /* renamed from: c */
    public abstract long mo50718c();

    /* renamed from: d */
    public abstract C46689ag mo50719d();

    /* renamed from: e */
    public abstract C46763cg mo50720e();

    /* renamed from: f */
    public abstract C46769cm mo50722f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C46790dg mo50803g(C46689ag agVar, long j) {
        C58838bb.m90884s(mo50718c() != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        return new C46683aa(agVar, mo50718c() + 1, C46763cg.m83309b(), C46769cm.m83317b(), 0, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo50804h(C46790dg dgVar) {
        C58838bb.m90883r(mo50718c() != Long.MIN_VALUE);
        C58838bb.m90883r(!equals(dgVar) || this == dgVar);
        long c = mo50718c();
        C46683aa aaVar = (C46683aa) dgVar;
        long j = aaVar.f121962b;
        if (c >= j) {
            if (mo50718c() != j) {
                return false;
            }
            if (mo50720e().mo50776a() >= ((C46879s) aaVar.f121963c).f122317a) {
                if (mo50722f().mo50781a() < ((C46880t) aaVar.f121964d).f122318a) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo50805i() {
        return mo50716a() > 3;
    }
}
