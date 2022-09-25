package com.google.android.apps.search.googleapp.search.srp;

import com.google.common.util.concurrent.C60817ay;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.x */
/* compiled from: PG */
public final class C137901x {

    /* renamed from: a */
    public final String f375212a;

    /* renamed from: b */
    public final C60817ay f375213b;

    public C137901x(String str, C60817ay ayVar) {
        C69664n.m101061g(str, "uriString");
        this.f375212a = str;
        this.f375213b = ayVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137901x)) {
            return false;
        }
        C137901x xVar = (C137901x) obj;
        return C69664n.m101066l(this.f375212a, xVar.f375212a) && C69664n.m101066l(this.f375213b, xVar.f375213b);
    }

    public final int hashCode() {
        return (this.f375212a.hashCode() * 31) + this.f375213b.hashCode();
    }

    public final String toString() {
        String str = this.f375212a;
        C60817ay ayVar = this.f375213b;
        return "CachedSrpUriResponsePair(uriString=" + str + ", responseClosingFuture=" + ayVar + ")";
    }
}
