package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.fn */
/* compiled from: PG */
public final class C82447fn extends C82677oa {

    /* renamed from: a */
    private final String f225280a = "NGA_UNDERSTANDING_EMPTY_REWRITE";

    /* renamed from: b */
    private final int f225281b;

    public C82447fn(String str, int i) {
        this.f225281b = i;
    }

    /* renamed from: b */
    public final int mo76264b() {
        return this.f225281b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225280a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82677oa) {
            C82677oa oaVar = (C82677oa) obj;
            return this.f225280a.equals(oaVar.mo75583d()) && this.f225281b == oaVar.mo76264b();
        }
    }

    public final int hashCode() {
        return ((this.f225280a.hashCode() ^ 1000003) * 1000003) ^ this.f225281b;
    }

    public final String toString() {
        String str = this.f225280a;
        int i = this.f225281b;
        return "NgaUnderstandingEmptyRewriteEvent{token=" + str + ", rewriter=" + i + "}";
    }
}
