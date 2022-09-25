package com.google.android.apps.gsa.staticplugins.opa.p8316b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.b.a */
/* compiled from: PG */
public final class C107712a extends C107714c {

    /* renamed from: a */
    private final String f299742a;

    /* renamed from: b */
    private final long f299743b;

    public C107712a(String str, long j) {
        this.f299742a = str;
        this.f299743b = j;
    }

    /* renamed from: a */
    public final long mo96247a() {
        return this.f299743b;
    }

    /* renamed from: b */
    public final String mo96248b() {
        return this.f299742a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C107714c) {
            C107714c cVar = (C107714c) obj;
            return this.f299742a.equals(cVar.mo96248b()) && this.f299743b == cVar.mo96247a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f299742a.hashCode();
        long j = this.f299743b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.f299742a;
        long j = this.f299743b;
        return "Event{event=" + str + ", timestamp=" + j + "}";
    }
}
