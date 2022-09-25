package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fp */
/* compiled from: PG */
public final class C82449fp extends C82679oc {

    /* renamed from: a */
    private final String f225284a = "NGA_UNDERSTANDING_ERROR_REWRITE";

    /* renamed from: b */
    private final int f225285b;

    public C82449fp(String str, int i) {
        this.f225285b = i;
    }

    /* renamed from: b */
    public final int mo76272b() {
        return this.f225285b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225284a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82679oc) {
            C82679oc ocVar = (C82679oc) obj;
            return this.f225284a.equals(ocVar.mo75583d()) && this.f225285b == ocVar.mo76272b();
        }
    }

    public final int hashCode() {
        return ((this.f225284a.hashCode() ^ 1000003) * 1000003) ^ this.f225285b;
    }

    public final String toString() {
        String str = this.f225284a;
        int i = this.f225285b;
        return "NgaUnderstandingErrorRewriteEvent{token=" + str + ", rewriter=" + i + "}";
    }
}
