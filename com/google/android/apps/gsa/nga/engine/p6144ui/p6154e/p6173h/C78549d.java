package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80787fh;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.d */
/* compiled from: PG */
public final class C78549d extends C78553h {

    /* renamed from: a */
    private final C80787fh f216304a;

    public C78549d(C80787fh fhVar) {
        this.f216304a = fhVar;
    }

    /* renamed from: a */
    public final C78532ao mo73464a() {
        return C78532ao.CHIPS;
    }

    /* renamed from: c */
    public final C80787fh mo73466c() {
        return this.f216304a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C78531an) {
            C78531an anVar = (C78531an) obj;
            if (C78532ao.CHIPS != anVar.mo73464a() || !this.f216304a.equals(anVar.mo73466c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f216304a.hashCode();
    }

    public final String toString() {
        String obj = this.f216304a.toString();
        return "DoubleContent{chips=" + obj + "}";
    }
}
