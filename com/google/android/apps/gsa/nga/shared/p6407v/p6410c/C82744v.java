package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.v */
/* compiled from: PG */
public final class C82744v extends C82522ih {

    /* renamed from: a */
    private final String f225495a = "DID_QUERY_CLASSIFIER_LOADING_COUNT";

    /* renamed from: b */
    private final int f225496b;

    /* renamed from: c */
    private final int f225497c;

    public C82744v(String str, int i, int i2) {
        this.f225496b = i;
        this.f225497c = i2;
    }

    /* renamed from: b */
    public final int mo76562b() {
        return this.f225497c;
    }

    /* renamed from: c */
    public final int mo76563c() {
        return this.f225496b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f225495a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82522ih) {
            C82522ih ihVar = (C82522ih) obj;
            return this.f225495a.equals(ihVar.mo75583d()) && this.f225496b == ihVar.mo76563c() && this.f225497c == ihVar.mo76562b();
        }
    }

    public final int hashCode() {
        return ((((this.f225495a.hashCode() ^ 1000003) * 1000003) ^ this.f225496b) * 1000003) ^ this.f225497c;
    }

    public final String toString() {
        String str = this.f225495a;
        int i = this.f225496b;
        int i2 = this.f225497c;
        return "DidQueryClassifierLoadingCount{token=" + str + ", resourceVersion=" + i + ", resourceStatus=" + i2 + "}";
    }
}
