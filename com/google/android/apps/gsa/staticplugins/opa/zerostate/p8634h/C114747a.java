package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h;

import com.google.assistant.p3994s.p3995a.C53366lf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.h.a */
/* compiled from: PG */
public final class C114747a extends C114751e {

    /* renamed from: a */
    private final C53366lf f318447a;

    public C114747a(C53366lf lfVar) {
        if (lfVar != null) {
            this.f318447a = lfVar;
            return;
        }
        throw new NullPointerException("Null cachedElementCandidate");
    }

    /* renamed from: a */
    public final C53366lf mo101573a() {
        return this.f318447a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C114751e) {
            return this.f318447a.equals(((C114751e) obj).mo101573a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f318447a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f318447a.toString();
        return "ZeroStateCardData{cachedElementCandidate=" + obj + "}";
    }
}
