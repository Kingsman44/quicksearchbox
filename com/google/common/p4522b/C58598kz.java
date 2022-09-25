package com.google.common.p4522b;

import com.google.common.base.C58815af;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import com.google.common.base.C58890d;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.common.b.kz */
/* compiled from: PG */
public final class C58598kz {

    /* renamed from: a */
    boolean f156297a;

    /* renamed from: b */
    int f156298b = -1;

    /* renamed from: c */
    int f156299c = -1;

    /* renamed from: d */
    C58615lp f156300d;

    /* renamed from: e */
    C58615lp f156301e;

    /* renamed from: f */
    C58815af f156302f;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo55622a() {
        int i = this.f156299c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo55623b() {
        int i = this.f156298b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58615lp mo55624c() {
        return (C58615lp) C58831av.m90830c(this.f156300d, C58615lp.STRONG);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C58615lp mo55625d() {
        return (C58615lp) C58831av.m90830c(this.f156301e, C58615lp.STRONG);
    }

    /* renamed from: e */
    public final ConcurrentMap mo55626e() {
        if (!this.f156297a) {
            return new ConcurrentHashMap(mo55623b(), 0.75f, mo55622a());
        }
        int i = C58635mi.f156352k;
        if (mo55624c() == C58615lp.STRONG && mo55625d() == C58615lp.STRONG) {
            return new C58635mi(this, C58616lq.f156333a);
        }
        if (mo55624c() == C58615lp.STRONG && mo55625d() == C58615lp.WEAK) {
            return new C58635mi(this, C58619lt.f156335a);
        }
        if (mo55624c() == C58615lp.WEAK && mo55625d() == C58615lp.STRONG) {
            return new C58635mi(this, C58624ly.f156339a);
        }
        if (mo55624c() == C58615lp.WEAK && mo55625d() == C58615lp.WEAK) {
            return new C58635mi(this, C58628mb.f156343a);
        }
        throw new AssertionError();
    }

    /* renamed from: f */
    public final void mo55627f(C58615lp lpVar) {
        C58615lp lpVar2 = this.f156300d;
        C58838bb.m90887v(lpVar2 == null, "Key strength was already set to %s", lpVar2);
        lpVar.getClass();
        this.f156300d = lpVar;
        if (lpVar != C58615lp.STRONG) {
            this.f156297a = true;
        }
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        int i = this.f156298b;
        if (i != -1) {
            b.mo56103c("initialCapacity", String.valueOf(i));
        }
        int i2 = this.f156299c;
        if (i2 != -1) {
            b.mo56103c("concurrencyLevel", String.valueOf(i2));
        }
        C58615lp lpVar = this.f156300d;
        if (lpVar != null) {
            b.mo56102b("keyStrength", C58890d.m90988c(lpVar.toString()));
        }
        C58615lp lpVar2 = this.f156301e;
        if (lpVar2 != null) {
            b.mo56102b("valueStrength", C58890d.m90988c(lpVar2.toString()));
        }
        if (this.f156302f != null) {
            b.mo56101a().f156625b = "keyEquivalence";
        }
        return b.toString();
    }
}
