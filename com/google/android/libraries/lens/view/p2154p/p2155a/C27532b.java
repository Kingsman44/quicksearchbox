package com.google.android.libraries.lens.view.p2154p.p2155a;

import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.view.p.a.b */
/* compiled from: PG */
final class C27532b extends C27539i {

    /* renamed from: b */
    private final C62491dn f75308b;

    /* renamed from: c */
    private final C27540j f75309c;

    /* renamed from: d */
    private final float f75310d;

    public C27532b(C62491dn dnVar, C27540j jVar, float f) {
        this.f75308b = dnVar;
        this.f75309c = jVar;
        this.f75310d = f;
    }

    /* renamed from: a */
    public final float mo33078a() {
        return this.f75310d;
    }

    /* renamed from: b */
    public final C27540j mo33079b() {
        return this.f75309c;
    }

    /* renamed from: c */
    public final C62491dn mo33080c() {
        return this.f75308b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27539i) {
            C27539i iVar = (C27539i) obj;
            return this.f75308b.equals(iVar.mo33080c()) && this.f75309c.equals(iVar.mo33079b()) && Float.floatToIntBits(this.f75310d) == Float.floatToIntBits(iVar.mo33078a());
        }
    }

    public final int hashCode() {
        return ((((this.f75308b.hashCode() ^ 1000003) * 1000003) ^ this.f75309c.hashCode()) * 1000003) ^ Float.floatToIntBits(this.f75310d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f75308b);
        String valueOf2 = String.valueOf(this.f75309c);
        float f = this.f75310d;
        return "QuadDetection{quad=" + valueOf + ", size=" + valueOf2 + ", confidence=" + f + "}";
    }
}
