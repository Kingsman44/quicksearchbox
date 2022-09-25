package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.ae */
/* compiled from: PG */
final class C78522ae extends C78537at {

    /* renamed from: b */
    private final int f216266b;

    public C78522ae(int i) {
        this.f216266b = i;
    }

    /* renamed from: a */
    public final int mo73447a() {
        return this.f216266b;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C78537at)) {
            return false;
        }
        int i = this.f216266b;
        if (i != ((C78537at) obj).mo73447a()) {
            z = false;
        }
        if (i != 0) {
            return z;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f216266b;
        if (i != 0) {
            return i ^ 1000003;
        }
        throw null;
    }

    public final String toString() {
        int i = this.f216266b;
        return "StagesGreeting{type=" + C78524ag.m126140a(i) + "}";
    }
}
