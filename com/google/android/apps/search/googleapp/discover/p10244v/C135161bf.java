package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10214s.C134577bo;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.bf */
/* compiled from: PG */
public final class C135161bf {

    /* renamed from: a */
    public final C134577bo f368147a;

    /* renamed from: b */
    public final String f368148b;

    public C135161bf(C134577bo boVar, String str) {
        C69664n.m101061g(str, "sessionId");
        this.f368147a = boVar;
        this.f368148b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135161bf)) {
            return false;
        }
        C135161bf bfVar = (C135161bf) obj;
        return C69664n.m101066l(this.f368147a, bfVar.f368147a) && C69664n.m101066l(this.f368148b, bfVar.f368148b);
    }

    public final int hashCode() {
        C134577bo boVar = this.f368147a;
        return ((boVar == null ? 0 : boVar.hashCode()) * 31) + this.f368148b.hashCode();
    }

    public final String toString() {
        C134577bo boVar = this.f368147a;
        String str = this.f368148b;
        return "SessionInteraction(userInteraction=" + boVar + ", sessionId=" + str + ")";
    }
}
