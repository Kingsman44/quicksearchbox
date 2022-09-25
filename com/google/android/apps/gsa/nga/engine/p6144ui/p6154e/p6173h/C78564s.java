package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.s */
/* compiled from: PG */
final class C78564s extends C78566u {

    /* renamed from: a */
    private final C78533ap f216315a;

    public C78564s(C78533ap apVar) {
        this.f216315a = apVar;
    }

    /* renamed from: a */
    public final C78533ap mo73480a() {
        return this.f216315a;
    }

    /* renamed from: b */
    public final C78539av mo73481b() {
        return C78539av.EMPTY;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78538au) {
            C78538au auVar = (C78538au) obj;
            if (C78539av.EMPTY != auVar.mo73481b() || !this.f216315a.equals(auVar.mo73480a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216315a.hashCode();
    }

    public final String toString() {
        String obj = this.f216315a.toString();
        return "TopContent{empty=" + obj + "}";
    }
}
