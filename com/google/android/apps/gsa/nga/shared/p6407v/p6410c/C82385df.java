package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.df */
/* compiled from: PG */
final class C82385df extends C82614ls {

    /* renamed from: a */
    private final String f225083a;

    /* renamed from: b */
    private final int f225084b;

    /* renamed from: c */
    private final int f225085c;

    public C82385df(String str, int i, int i2) {
        this.f225083a = str;
        this.f225084b = i;
        this.f225085c = i2;
    }

    /* renamed from: b */
    public final int mo75970b() {
        return this.f225084b;
    }

    /* renamed from: c */
    public final int mo75971c() {
        return this.f225085c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225083a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82614ls) {
            C82614ls lsVar = (C82614ls) obj;
            return this.f225083a.equals(lsVar.mo75583d()) && this.f225084b == lsVar.mo75970b() && this.f225085c == lsVar.mo75971c();
        }
    }

    public final int hashCode() {
        return ((((this.f225083a.hashCode() ^ 1000003) * 1000003) ^ this.f225084b) * 1000003) ^ this.f225085c;
    }

    public final String toString() {
        String str = this.f225083a;
        int i = this.f225084b;
        int i2 = this.f225085c;
        return "NgaLockscreenArbitrationEvent{token=" + str + ", fulfiller=" + i + ", lockscreenResult=" + i2 + "}";
    }
}
