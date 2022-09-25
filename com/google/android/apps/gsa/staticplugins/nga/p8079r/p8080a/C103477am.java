package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.am */
/* compiled from: PG */
final class C103477am extends C103596de {

    /* renamed from: a */
    private final long f288354a;

    /* renamed from: b */
    private final String f288355b;

    public C103477am(long j, String str) {
        this.f288354a = j;
        if (str != null) {
            this.f288355b = str;
            return;
        }
        throw new NullPointerException("Null recognizedQuery");
    }

    /* renamed from: a */
    public final long mo93795a() {
        return this.f288354a;
    }

    /* renamed from: b */
    public final String mo93796b() {
        return this.f288355b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103596de) {
            C103596de deVar = (C103596de) obj;
            return this.f288354a == deVar.mo93795a() && this.f288355b.equals(deVar.mo93796b());
        }
    }

    public final int hashCode() {
        long j = this.f288354a;
        return this.f288355b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f288354a;
        String str = this.f288355b;
        return "RecognitionCompletedResult{speechDurationMs=" + j + ", recognizedQuery=" + str + "}";
    }
}
