package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.bo */
/* compiled from: PG */
public final class C82340bo extends C82570kb {

    /* renamed from: a */
    private final String f224933a = "NGA_ERROR_FULFILLER";

    /* renamed from: b */
    private final int f224934b;

    public C82340bo(String str, int i) {
        this.f224934b = i;
    }

    /* renamed from: b */
    public final int mo75777b() {
        return this.f224934b;
    }

    /* renamed from: d */
    public final String mo75583d() {
        return this.f224933a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C82570kb) {
            C82570kb kbVar = (C82570kb) obj;
            return this.f224933a.equals(kbVar.mo75583d()) && this.f224934b == kbVar.mo75777b();
        }
    }

    public final int hashCode() {
        return ((this.f224933a.hashCode() ^ 1000003) * 1000003) ^ this.f224934b;
    }

    public final String toString() {
        String str = this.f224933a;
        int i = this.f224934b;
        return "NgaErrorFulfillerEvent{token=" + str + ", fulfiller=" + i + "}";
    }
}
