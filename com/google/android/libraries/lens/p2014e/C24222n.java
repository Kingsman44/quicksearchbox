package com.google.android.libraries.lens.p2014e;

import com.google.lens.p4707j.C62496ds;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.lens.e.n */
/* compiled from: PG */
final class C24222n extends C24205ah {

    /* renamed from: a */
    private final C63088z f66256a;

    /* renamed from: b */
    private final C62496ds f66257b;

    public C24222n(C63088z zVar, C62496ds dsVar) {
        this.f66256a = zVar;
        this.f66257b = dsVar;
    }

    /* renamed from: a */
    public final C62496ds mo29691a() {
        return this.f66257b;
    }

    /* renamed from: b */
    public final C63088z mo29692b() {
        return this.f66256a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24205ah) {
            C24205ah ahVar = (C24205ah) obj;
            return this.f66256a.equals(ahVar.mo29692b()) && this.f66257b.equals(ahVar.mo29691a());
        }
    }

    public final int hashCode() {
        return ((this.f66256a.hashCode() ^ 1000003) * 1000003) ^ this.f66257b.hashCode();
    }

    public final String toString() {
        String obj = this.f66256a.toString();
        String obj2 = this.f66257b.toString();
        return "LensQueryMetadata{analyticsId=" + obj + ", prefetchMetadata=" + obj2 + "}";
    }
}
