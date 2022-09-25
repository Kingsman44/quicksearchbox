package com.google.android.apps.gsa.search.core.service.p6852g;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a */
/* compiled from: PG */
public final class C86699a extends C86725e {

    /* renamed from: a */
    public final C86724d f234194a;

    /* renamed from: b */
    public final long f234195b;

    public C86699a(C86724d dVar, long j) {
        if (dVar != null) {
            this.f234194a = dVar;
            this.f234195b = j;
            return;
        }
        throw new NullPointerException("Null userScenario");
    }

    /* renamed from: a */
    public final long mo80306a() {
        return this.f234195b;
    }

    /* renamed from: b */
    public final C86724d mo80307b() {
        return this.f234194a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C86725e) {
            C86725e eVar = (C86725e) obj;
            return this.f234194a.equals(eVar.mo80307b()) && this.f234195b == eVar.mo80306a();
        }
    }

    public final int hashCode() {
        int hashCode = this.f234194a.hashCode();
        long j = this.f234195b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f234194a.toString();
        long j = this.f234195b;
        return "UserScenarioChange{userScenario=" + obj + ", timestampMs=" + j + "}";
    }
}
