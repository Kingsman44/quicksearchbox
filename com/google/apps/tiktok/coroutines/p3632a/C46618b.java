package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.b */
/* compiled from: PG */
public final class C46618b extends C46625c {

    /* renamed from: a */
    public final Object f121815a;

    public C46618b(Object obj) {
        this.f121815a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46618b) && C69664n.m101066l(this.f121815a, ((C46618b) obj).f121815a);
    }

    public final int hashCode() {
        Object obj = this.f121815a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f121815a;
        return "Valid(response=" + obj + ")";
    }
}
