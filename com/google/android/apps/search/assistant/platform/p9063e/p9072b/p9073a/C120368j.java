package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.j */
/* compiled from: PG */
final class C120368j extends C120245cc {

    /* renamed from: a */
    public final C120811d f334862a;

    /* renamed from: b */
    public final boolean f334863b;

    public C120368j(C120811d dVar, boolean z) {
        if (dVar != null) {
            this.f334862a = dVar;
            this.f334863b = z;
            return;
        }
        throw new NullPointerException("Null prefetchRequest");
    }

    /* renamed from: a */
    public final C120811d mo104705a() {
        return this.f334862a;
    }

    /* renamed from: b */
    public final boolean mo104706b() {
        return this.f334863b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C120245cc) {
            C120245cc ccVar = (C120245cc) obj;
            return this.f334862a.equals(ccVar.mo104705a()) && this.f334863b == ccVar.mo104706b();
        }
    }

    public final int hashCode() {
        return ((this.f334862a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f334863b ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f334862a.toString();
        boolean z = this.f334863b;
        return "PrefetchRequestInfo{prefetchRequest=" + obj + ", isFinal=" + z + "}";
    }
}
