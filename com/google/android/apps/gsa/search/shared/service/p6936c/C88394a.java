package com.google.android.apps.gsa.search.shared.service.p6936c;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.a */
/* compiled from: PG */
public final class C88394a extends C88477c {

    /* renamed from: a */
    public final long f239012a;

    /* renamed from: b */
    public final String f239013b;

    public C88394a(long j, String str) {
        this.f239012a = j;
        this.f239013b = str;
    }

    /* renamed from: a */
    public final long mo81991a() {
        return this.f239012a;
    }

    /* renamed from: b */
    public final String mo81992b() {
        return this.f239013b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C88477c) {
            C88477c cVar = (C88477c) obj;
            return this.f239012a == cVar.mo81991a() && this.f239013b.equals(cVar.mo81992b());
        }
    }

    public final int hashCode() {
        long j = this.f239012a;
        return this.f239013b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f239012a;
        String str = this.f239013b;
        return "SessionInfo{id=" + j + ", type=" + str + "}";
    }
}
