package com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.d.a.e */
/* compiled from: PG */
final class C13834e extends C13838i {

    /* renamed from: a */
    private final C13840k f42132a;

    /* renamed from: b */
    private final long f42133b;

    public C13834e(C13840k kVar, long j) {
        this.f42132a = kVar;
        this.f42133b = j;
    }

    /* renamed from: a */
    public final long mo21270a() {
        return this.f42133b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13838i) {
            C13838i iVar = (C13838i) obj;
            return this.f42132a.equals(iVar.mo21287f()) && this.f42133b == iVar.mo21270a();
        }
    }

    /* renamed from: f */
    public final C13840k mo21287f() {
        return this.f42132a;
    }

    public final int hashCode() {
        int hashCode = this.f42132a.hashCode();
        long j = this.f42133b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String obj = this.f42132a.toString();
        long j = this.f42133b;
        return "FetchRequestImpl{fetchRequestParams=" + obj + ", creationTimeMs=" + j + "}";
    }
}
