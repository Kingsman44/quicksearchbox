package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.bc */
/* compiled from: PG */
public final class C46621bc extends C46623be {

    /* renamed from: a */
    public final Object f121819a;

    /* renamed from: b */
    public final Throwable f121820b;

    public C46621bc(Object obj, Throwable th) {
        this.f121819a = obj;
        this.f121820b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46621bc)) {
            return false;
        }
        C46621bc bcVar = (C46621bc) obj;
        return C69664n.m101066l(this.f121819a, bcVar.f121819a) && C69664n.m101066l(this.f121820b, bcVar.f121820b);
    }

    public final int hashCode() {
        Object obj = this.f121819a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Throwable th = this.f121820b;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        Object obj = this.f121819a;
        Throwable th = this.f121820b;
        return "Rereading(staleResponse=" + obj + ", cause=" + th + ")";
    }
}
