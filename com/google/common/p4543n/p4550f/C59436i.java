package com.google.common.p4543n.p4550f;

/* renamed from: com.google.common.n.f.i */
/* compiled from: PG */
public final class C59436i {

    /* renamed from: a */
    public final C59434g f157680a;

    /* renamed from: b */
    private final C59435h f157681b;

    public C59436i(C59435h hVar, C59434g gVar) {
        this.f157681b = hVar;
        this.f157680a = gVar;
    }

    /* renamed from: a */
    public final double mo56952a(int i) {
        if (i >= 0 && i < this.f157680a.mo56946b()) {
            return this.f157680a.f157666a[i + 1];
        }
        int b = this.f157680a.mo56946b();
        throw new IllegalArgumentException("Bucket index " + i + "out of range, number of buckets: " + b);
    }

    /* renamed from: b */
    public final double mo56953b(int i) {
        if (i >= 0 && i < this.f157680a.mo56946b()) {
            return this.f157680a.f157666a[i];
        }
        int b = this.f157680a.mo56946b();
        throw new IllegalArgumentException("Bucket index " + i + "out of range, number of buckets: " + b);
    }

    /* renamed from: c */
    public final boolean mo56954c(C59436i iVar) {
        if (this == iVar) {
            return true;
        }
        if (!this.f157681b.mo56949a(iVar.f157681b) || this.f157680a.mo56946b() != iVar.f157680a.mo56946b()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C59436i) && mo56954c((C59436i) obj);
    }

    public final int hashCode() {
        return this.f157681b.hashCode();
    }
}
