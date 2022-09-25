package com.google.common.p4535g;

/* renamed from: com.google.common.g.dr */
/* compiled from: PG */
final class C59206dr {

    /* renamed from: a */
    final int f157278a;

    /* renamed from: b */
    final int f157279b;

    public C59206dr(int i, int i2) {
        this.f157278a = i;
        this.f157279b = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56575a(C59206dr drVar) {
        return this.f157278a == drVar.f157278a && this.f157279b == drVar.f157279b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C59206dr) && mo56575a((C59206dr) obj);
    }

    public final int hashCode() {
        return this.f157278a + this.f157279b;
    }
}
