package com.google.common.p4535g;

/* renamed from: com.google.common.g.y */
/* compiled from: PG */
final class C59231y extends C59228v {

    /* renamed from: b */
    public final C59226t f157340b;

    public C59231y(C59219m mVar, C59226t tVar) {
        super(mVar);
        this.f157340b = tVar;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f157336a.compareTo(((C59228v) obj).f157336a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59231y) {
            C59231y yVar = (C59231y) obj;
            if (!this.f157340b.equals(yVar.f157340b) || !this.f157336a.equals(yVar.f157336a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f157340b.hashCode() * 31) + this.f157336a.hashCode();
    }
}
