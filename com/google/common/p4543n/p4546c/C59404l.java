package com.google.common.p4543n.p4546c;

/* renamed from: com.google.common.n.c.l */
/* compiled from: PG */
class C59404l extends C59407o {

    /* renamed from: a */
    final int f157614a;

    public C59404l(int i) {
        C59407o.m92312i(i);
        this.f157614a = i;
    }

    /* renamed from: a */
    public final long mo56909a(int i) {
        return mo56912b(i) ? 0 : -1;
    }

    /* renamed from: b */
    public final boolean mo56912b(int i) {
        C59407o.m92310g(i);
        return i < this.f157614a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C59404l) || this.f157614a != ((C59404l) obj).f157614a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f157614a;
    }
}
