package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.am */
/* compiled from: PG */
public final class C46604am extends C46605an {

    /* renamed from: a */
    public final Object f121794a;

    /* renamed from: b */
    public final C46607ap f121795b;

    public C46604am(Object obj, C46607ap apVar) {
        this.f121794a = obj;
        this.f121795b = apVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46604am)) {
            return false;
        }
        C46604am amVar = (C46604am) obj;
        return C69664n.m101066l(this.f121794a, amVar.f121794a) && C69664n.m101066l(this.f121795b, amVar.f121795b);
    }

    public final int hashCode() {
        Object obj = this.f121794a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f121795b.hashCode();
    }

    public final String toString() {
        Object obj = this.f121794a;
        C46607ap apVar = this.f121795b;
        return "StaleRead(staleResponse=" + obj + ", cause=" + apVar + ")";
    }
}
