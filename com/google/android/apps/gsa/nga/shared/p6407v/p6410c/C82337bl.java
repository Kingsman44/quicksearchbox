package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bl */
/* compiled from: PG */
public final class C82337bl extends C82566jy {

    /* renamed from: a */
    private final String f224927a = "NGA_EMPTY_FULFILLER";

    /* renamed from: b */
    private final int f224928b;

    public C82337bl(String str, int i) {
        this.f224928b = i;
    }

    /* renamed from: b */
    public final int mo75768b() {
        return this.f224928b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224927a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82566jy) {
            C82566jy jyVar = (C82566jy) obj;
            return this.f224927a.equals(jyVar.mo75583d()) && this.f224928b == jyVar.mo75768b();
        }
    }

    public final int hashCode() {
        return ((this.f224927a.hashCode() ^ 1000003) * 1000003) ^ this.f224928b;
    }

    public final String toString() {
        String str = this.f224927a;
        int i = this.f224928b;
        return "NgaEmptyFulfillerEvent{token=" + str + ", fulfiller=" + i + "}";
    }
}
