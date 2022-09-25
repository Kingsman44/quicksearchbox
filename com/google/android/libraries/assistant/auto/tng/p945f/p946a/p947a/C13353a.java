package com.google.android.libraries.assistant.auto.tng.p945f.p946a.p947a;

import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.a.a.a */
/* compiled from: PG */
public final class C13353a {

    /* renamed from: a */
    public final Optional f41084a;

    public C13353a(Optional optional) {
        C69664n.m101061g(optional, "localResponseDelta");
        this.f41084a = optional;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13353a) && C69664n.m101066l(this.f41084a, ((C13353a) obj).f41084a);
    }

    public final int hashCode() {
        return this.f41084a.hashCode();
    }

    public final String toString() {
        Optional optional = this.f41084a;
        return "FulfillmentResponse(localResponseDelta=" + optional + ")";
    }
}
