package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ay */
/* compiled from: PG */
final class C80669ay extends C80728dc {

    /* renamed from: c */
    private final boolean f221484c;

    public C80669ay(boolean z) {
        this.f221484c = z;
    }

    /* renamed from: a */
    public final boolean mo74516a() {
        return this.f221484c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C80728dc) && this.f221484c == ((C80728dc) obj).mo74516a();
    }

    public final int hashCode() {
        return (true != this.f221484c ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f221484c;
        return "GestureNavBarVisible{navbarVisible=" + z + "}";
    }
}
