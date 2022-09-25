package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.common.p4526f.C58976aa;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.dd */
/* compiled from: PG */
public final class C32689dd {

    /* renamed from: a */
    public final C58976aa f87604a;

    /* renamed from: b */
    public final Object f87605b;

    public C32689dd(C58976aa aaVar, Object obj) {
        this.f87604a = aaVar;
        this.f87605b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32689dd)) {
            return false;
        }
        C32689dd ddVar = (C32689dd) obj;
        return C69664n.m101066l(this.f87604a, ddVar.f87604a) && C69664n.m101066l(this.f87605b, ddVar.f87605b);
    }

    public final int hashCode() {
        return (this.f87604a.hashCode() * 31) + this.f87605b.hashCode();
    }

    public final String toString() {
        C58976aa aaVar = this.f87604a;
        Object obj = this.f87605b;
        return "LogTag(key=" + aaVar + ", value=" + obj + ")";
    }
}
