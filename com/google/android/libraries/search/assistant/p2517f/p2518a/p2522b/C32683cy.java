package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.cy */
/* compiled from: PG */
public final class C32683cy {

    /* renamed from: a */
    public final Object f87588a;

    /* renamed from: b */
    public final boolean f87589b;

    public C32683cy(Object obj, boolean z) {
        this.f87588a = obj;
        this.f87589b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32683cy)) {
            return false;
        }
        C32683cy cyVar = (C32683cy) obj;
        return C69664n.m101066l(this.f87588a, cyVar.f87588a) && this.f87589b == cyVar.f87589b;
    }

    public final int hashCode() {
        return (this.f87588a.hashCode() * 31) + (this.f87589b ? 1 : 0);
    }

    public final String toString() {
        Object obj = this.f87588a;
        boolean z = this.f87589b;
        return "FetchResult(result=" + obj + ", isCachedIndefinitely=" + z + ")";
    }
}
