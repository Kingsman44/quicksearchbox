package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fr */
/* compiled from: PG */
public final class C82451fr extends C82681oe {

    /* renamed from: a */
    private final String f225288a = "NGA_UNDERSTANDING_NON_EMPTY_REWRITE";

    /* renamed from: b */
    private final int f225289b;

    public C82451fr(String str, int i) {
        this.f225289b = i;
    }

    /* renamed from: b */
    public final int mo76280b() {
        return this.f225289b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225288a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82681oe) {
            C82681oe oeVar = (C82681oe) obj;
            return this.f225288a.equals(oeVar.mo75583d()) && this.f225289b == oeVar.mo76280b();
        }
    }

    public final int hashCode() {
        return ((this.f225288a.hashCode() ^ 1000003) * 1000003) ^ this.f225289b;
    }

    public final String toString() {
        String str = this.f225288a;
        int i = this.f225289b;
        return "NgaUnderstandingNonEmptyRewriteEvent{token=" + str + ", rewriter=" + i + "}";
    }
}
