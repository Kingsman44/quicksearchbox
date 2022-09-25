package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abg */
/* compiled from: PG */
public final class abg {

    /* renamed from: a */
    public final int f20184a;

    /* renamed from: b */
    public final C6899ef[] f20185b;

    /* renamed from: c */
    public final abb f20186c;

    /* renamed from: d */
    public final Object f20187d;

    public abg(C6899ef[] efVarArr, aba[] abaArr, Object obj) {
        this.f20185b = efVarArr;
        this.f20186c = new abb(abaArr);
        this.f20187d = obj;
        this.f20184a = efVarArr.length;
    }

    /* renamed from: a */
    public final boolean mo14382a(int i) {
        return this.f20185b[i] != null;
    }

    /* renamed from: b */
    public final boolean mo14383b(abg abg, int i) {
        if (abg != null && aeu.m18533c(this.f20185b[i], abg.f20185b[i]) && aeu.m18533c(this.f20186c.mo14373a(i), abg.f20186c.mo14373a(i))) {
            return true;
        }
        return false;
    }
}
