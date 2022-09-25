package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.protos.youtube.elements.C66192df;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.am */
/* compiled from: PG */
public final class C40032am extends C40035ap {

    /* renamed from: a */
    private final C66192df f105191a;

    public C40032am(C66192df dfVar) {
        C69664n.m101061g(dfVar, "loggingNode");
        this.f105191a = dfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40032am) && C69664n.m101066l(this.f105191a, ((C40032am) obj).f105191a);
    }

    public final int hashCode() {
        return this.f105191a.hashCode();
    }

    public final String toString() {
        C66192df dfVar = this.f105191a;
        return "NonVe(loggingNode=" + dfVar + ")";
    }
}
