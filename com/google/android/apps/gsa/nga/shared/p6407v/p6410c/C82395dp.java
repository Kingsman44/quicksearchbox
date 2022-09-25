package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.dp */
/* compiled from: PG */
public final class C82395dp extends C82625mc {

    /* renamed from: a */
    private final String f225117a = "NGA_NON_EMPTY_FULFILLER";

    /* renamed from: b */
    private final int f225118b;

    public C82395dp(String str, int i) {
        this.f225118b = i;
    }

    /* renamed from: b */
    public final int mo76020b() {
        return this.f225118b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225117a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82625mc) {
            C82625mc mcVar = (C82625mc) obj;
            return this.f225117a.equals(mcVar.mo75583d()) && this.f225118b == mcVar.mo76020b();
        }
    }

    public final int hashCode() {
        return ((this.f225117a.hashCode() ^ 1000003) * 1000003) ^ this.f225118b;
    }

    public final String toString() {
        String str = this.f225117a;
        int i = this.f225118b;
        return "NgaNonEmptyFulfillerEvent{token=" + str + ", fulfiller=" + i + "}";
    }
}
