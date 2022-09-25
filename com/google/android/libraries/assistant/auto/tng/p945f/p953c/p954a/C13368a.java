package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a;

import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.a.a */
/* compiled from: PG */
public final class C13368a {

    /* renamed from: a */
    public final Optional f41116a;

    /* renamed from: b */
    public final Optional f41117b;

    public C13368a(Optional optional, Optional optional2) {
        C69664n.m101061g(optional, "localResponseDelta");
        C69664n.m101061g(optional2, "serverRequestDelta");
        this.f41116a = optional;
        this.f41117b = optional2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13368a)) {
            return false;
        }
        C13368a aVar = (C13368a) obj;
        return C69664n.m101066l(this.f41116a, aVar.f41116a) && C69664n.m101066l(this.f41117b, aVar.f41117b);
    }

    public final int hashCode() {
        return (this.f41116a.hashCode() * 31) + this.f41117b.hashCode();
    }

    public final String toString() {
        Optional optional = this.f41116a;
        Optional optional2 = this.f41117b;
        return "FulfillmentResponse(localResponseDelta=" + optional + ", serverRequestDelta=" + optional2 + ")";
    }
}
