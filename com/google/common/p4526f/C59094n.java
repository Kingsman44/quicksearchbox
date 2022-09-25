package com.google.common.p4526f;

/* renamed from: com.google.common.f.n */
/* compiled from: PG */
public final class C59094n extends C59095o {

    /* renamed from: b */
    private final String f157063b = "A";

    /* renamed from: c */
    private final String f157064c = "a";

    /* renamed from: d */
    private final int f157065d;

    /* renamed from: e */
    private final String f157066e;

    /* renamed from: f */
    private int f157067f = 0;

    public C59094n(int i) {
        this.f157065d = i;
        this.f157066e = "PG";
    }

    /* renamed from: a */
    public final int mo56238a() {
        return (char) this.f157065d;
    }

    /* renamed from: b */
    public final String mo56239b() {
        return this.f157063b.replace('/', '.');
    }

    /* renamed from: c */
    public final String mo56240c() {
        return this.f157066e;
    }

    /* renamed from: d */
    public final String mo56241d() {
        return this.f157064c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59094n) {
            C59094n nVar = (C59094n) obj;
            if (!this.f157063b.equals(nVar.f157063b) || !this.f157064c.equals(nVar.f157064c) || this.f157065d != nVar.f157065d) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f157067f;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((this.f157063b.hashCode() + 4867) * 31) + this.f157064c.hashCode()) * 31) + this.f157065d;
        this.f157067f = hashCode;
        return hashCode;
    }
}
