package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.ck */
/* compiled from: PG */
final class C82363ck extends C82592kx {

    /* renamed from: a */
    private final String f225001a;

    /* renamed from: b */
    private final String f225002b;

    public C82363ck(String str, String str2) {
        this.f225001a = str;
        this.f225002b = str2;
    }

    /* renamed from: b */
    public final String mo75869b() {
        return this.f225002b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225001a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82592kx) {
            C82592kx kxVar = (C82592kx) obj;
            return this.f225001a.equals(kxVar.mo75583d()) && this.f225002b.equals(kxVar.mo75869b());
        }
    }

    public final int hashCode() {
        return ((this.f225001a.hashCode() ^ 1000003) * 1000003) ^ this.f225002b.hashCode();
    }

    public final String toString() {
        String str = this.f225001a;
        String str2 = this.f225002b;
        return "NgaGmailSearchIntentGeneratedPartialCountEvent{token=" + str + ", intentGenerator=" + str2 + "}";
    }
}
