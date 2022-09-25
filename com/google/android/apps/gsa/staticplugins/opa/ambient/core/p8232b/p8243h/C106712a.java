package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8243h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.h.a */
/* compiled from: PG */
public final class C106712a extends C106723c {

    /* renamed from: a */
    private final Object f297412a;

    /* renamed from: b */
    private final long f297413b;

    public C106712a(Object obj, long j) {
        if (obj != null) {
            this.f297412a = obj;
            this.f297413b = j;
            return;
        }
        throw new NullPointerException("Null readResult");
    }

    /* renamed from: a */
    public final long mo95619a() {
        return this.f297413b;
    }

    /* renamed from: b */
    public final Object mo95620b() {
        return this.f297412a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C106723c) {
            C106723c cVar = (C106723c) obj;
            return this.f297412a.equals(cVar.mo95620b()) && this.f297413b == cVar.mo95619a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f297412a.hashCode();
        long j = this.f297413b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f297412a.toString();
        long j = this.f297413b;
        return "ReadResultWithTimestamp{readResult=" + obj + ", timestampMicros=" + j + "}";
    }
}
