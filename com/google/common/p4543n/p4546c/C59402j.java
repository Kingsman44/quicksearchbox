package com.google.common.p4543n.p4546c;

import java.util.Arrays;

/* renamed from: com.google.common.n.c.j */
/* compiled from: PG */
public final class C59402j extends C59407o {

    /* renamed from: a */
    private final C59407o f157608a;

    /* renamed from: b */
    private final C59407o f157609b;

    /* renamed from: c */
    private final int f157610c;

    public C59402j(C59407o oVar, C59407o oVar2) {
        this.f157608a = oVar;
        this.f157609b = oVar2;
        this.f157610c = ((C59403k) oVar).f157611a;
    }

    /* renamed from: a */
    public final long mo56909a(int i) {
        int i2 = this.f157610c;
        if (i < i2) {
            return this.f157608a.mo56909a(i);
        }
        return this.f157609b.mo56909a((i + 1) - i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59402j) {
            C59402j jVar = (C59402j) obj;
            if (!this.f157608a.equals(jVar.f157608a) || !this.f157609b.equals(jVar.f157609b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f157608a, this.f157609b});
    }
}
