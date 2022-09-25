package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.t */
/* compiled from: PG */
public final class C78565t extends C78566u {

    /* renamed from: a */
    private final C78537at f216316a;

    public C78565t(C78537at atVar) {
        this.f216316a = atVar;
    }

    /* renamed from: b */
    public final C78539av mo73481b() {
        return C78539av.GREETING;
    }

    /* renamed from: c */
    public final C78537at mo73482c() {
        return this.f216316a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78538au) {
            C78538au auVar = (C78538au) obj;
            if (C78539av.GREETING != auVar.mo73481b() || !this.f216316a.equals(auVar.mo73482c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216316a.hashCode();
    }

    public final String toString() {
        String obj = this.f216316a.toString();
        return "TopContent{greeting=" + obj + "}";
    }
}
