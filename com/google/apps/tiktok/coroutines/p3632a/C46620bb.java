package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.bb */
/* compiled from: PG */
public final class C46620bb extends C46623be {

    /* renamed from: a */
    public final Object f121817a;

    /* renamed from: b */
    public final Throwable f121818b;

    public C46620bb(Object obj, Throwable th) {
        this.f121817a = obj;
        this.f121818b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46620bb)) {
            return false;
        }
        C46620bb bbVar = (C46620bb) obj;
        return C69664n.m101066l(this.f121817a, bbVar.f121817a) && C69664n.m101066l(this.f121818b, bbVar.f121818b);
    }

    public final int hashCode() {
        Object obj = this.f121817a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Throwable th = this.f121818b;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        Object obj = this.f121817a;
        Throwable th = this.f121818b;
        return "Repopulating(staleResponse=" + obj + ", cause=" + th + ")";
    }
}
