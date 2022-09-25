package com.google.apps.p3589d.p3600k;

/* renamed from: com.google.apps.d.k.a */
/* compiled from: PG */
final class C45936a extends C45940e {

    /* renamed from: a */
    private final int f120721a;

    /* renamed from: b */
    private final int f120722b;

    /* renamed from: c */
    private final int f120723c;

    /* renamed from: d */
    private final int f120724d;

    public C45936a(int i, int i2, int i3, int i4) {
        this.f120721a = i;
        this.f120722b = i2;
        this.f120723c = i3;
        this.f120724d = i4;
    }

    /* renamed from: a */
    public final int mo50035a() {
        return this.f120724d;
    }

    /* renamed from: b */
    public final int mo50036b() {
        return this.f120723c;
    }

    /* renamed from: c */
    public final int mo50037c() {
        return this.f120722b;
    }

    /* renamed from: d */
    public final int mo50038d() {
        return this.f120721a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45940e) {
            C45940e eVar = (C45940e) obj;
            return this.f120721a == eVar.mo50038d() && this.f120722b == eVar.mo50037c() && this.f120723c == eVar.mo50036b() && this.f120724d == eVar.mo50035a();
        }
    }

    public final int hashCode() {
        return ((((((this.f120721a ^ 1000003) * 1000003) ^ this.f120722b) * 1000003) ^ this.f120723c) * 1000003) ^ this.f120724d;
    }

    public final String toString() {
        int i = this.f120721a;
        int i2 = this.f120722b;
        int i3 = this.f120723c;
        int i4 = this.f120724d;
        return "Rgba{red=" + i + ", green=" + i2 + ", blue=" + i3 + ", alpha=" + i4 + "}";
    }
}
