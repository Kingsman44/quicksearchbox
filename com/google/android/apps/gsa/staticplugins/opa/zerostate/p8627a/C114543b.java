package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a;

import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.a.b */
/* compiled from: PG */
final class C114543b extends C114545d {

    /* renamed from: a */
    private final C58528ij f317637a;

    public C114543b(C58528ij ijVar) {
        this.f317637a = ijVar;
    }

    /* renamed from: a */
    public final C58528ij mo101397a() {
        return this.f317637a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C114545d) {
            return this.f317637a.equals(((C114545d) obj).mo101397a());
        }
        return false;
    }

    public final int hashCode() {
        return ((C58759qy) this.f317637a).f156534a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f317637a.toString();
        return "LookupConfig{validCachedElementCases=" + obj + "}";
    }
}
