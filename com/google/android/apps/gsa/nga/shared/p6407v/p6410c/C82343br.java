package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.br */
/* compiled from: PG */
final class C82343br extends C82573ke {

    /* renamed from: a */
    private final String f224938a;

    /* renamed from: b */
    private final String f224939b;

    public C82343br(String str, String str2) {
        this.f224938a = str;
        this.f224939b = str2;
    }

    /* renamed from: b */
    public final String mo75785b() {
        return this.f224939b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224938a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82573ke) {
            C82573ke keVar = (C82573ke) obj;
            return this.f224938a.equals(keVar.mo75583d()) && this.f224939b.equals(keVar.mo75785b());
        }
    }

    public final int hashCode() {
        return ((this.f224938a.hashCode() ^ 1000003) * 1000003) ^ this.f224939b.hashCode();
    }

    public final String toString() {
        String str = this.f224938a;
        String str2 = this.f224939b;
        return "NgaExecutionPathEvent{token=" + str + ", executionPath=" + str2 + "}";
    }
}
