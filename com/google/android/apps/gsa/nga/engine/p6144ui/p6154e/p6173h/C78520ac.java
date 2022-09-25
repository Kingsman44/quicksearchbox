package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.ac */
/* compiled from: PG */
final class C78520ac extends C78533ap {

    /* renamed from: f */
    private final boolean f216263f;

    /* renamed from: g */
    private final int f216264g;

    public C78520ac(boolean z, int i) {
        this.f216263f = z;
        this.f216264g = i;
    }

    /* renamed from: a */
    public final boolean mo73441a() {
        return this.f216263f;
    }

    /* renamed from: b */
    public final int mo73442b() {
        return this.f216264g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78533ap) {
            C78533ap apVar = (C78533ap) obj;
            return this.f216263f == apVar.mo73441a() && this.f216264g == apVar.mo73442b();
        }
    }

    public final int hashCode() {
        return (((true != this.f216263f ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f216264g;
    }

    public final String toString() {
        boolean z = this.f216263f;
        int i = this.f216264g;
        String str = i != 1 ? i != 2 ? "ACTIVE_BIG" : "ACTIVE_SMALL" : "NOT_ACTIVE";
        return "Empty{withAnimation=" + z + ", active=" + str + "}";
    }
}
