package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fd */
/* compiled from: PG */
final class C82437fd extends C82666nq {

    /* renamed from: a */
    private final String f225248a;

    /* renamed from: b */
    private final int f225249b;

    /* renamed from: c */
    private final String f225250c;

    public C82437fd(String str, int i, String str2) {
        this.f225248a = str;
        this.f225249b = i;
        this.f225250c = str2;
    }

    /* renamed from: b */
    public final int mo76216b() {
        return this.f225249b;
    }

    /* renamed from: c */
    public final String mo76217c() {
        return this.f225250c;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225248a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82666nq) {
            C82666nq nqVar = (C82666nq) obj;
            return this.f225248a.equals(nqVar.mo75583d()) && this.f225249b == nqVar.mo76216b() && this.f225250c.equals(nqVar.mo76217c());
        }
    }

    public final int hashCode() {
        return ((((this.f225248a.hashCode() ^ 1000003) * 1000003) ^ this.f225249b) * 1000003) ^ this.f225250c.hashCode();
    }

    public final String toString() {
        String str = this.f225248a;
        int i = this.f225249b;
        String str2 = this.f225250c;
        return "NgaSyncError{token=" + str + ", errorCode=" + i + ", exceptionType=" + str2 + "}";
    }
}
