package com.google.android.libraries.search.p6glow;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.p6glow.ad */
/* compiled from: PG */
final class C39846ad extends C39848af {

    /* renamed from: a */
    public final Object f104801a;

    public C39846ad(Object obj) {
        this.f104801a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39846ad) && C69664n.m101066l(this.f104801a, ((C39846ad) obj).f104801a);
    }

    public final int hashCode() {
        Object obj = this.f104801a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f104801a;
        return "Initialized(value=" + obj + ")";
    }
}
