package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.bd */
/* compiled from: PG */
public final class C46622bd extends C46623be {

    /* renamed from: a */
    public final Object f121821a;

    /* renamed from: b */
    public final Throwable f121822b;

    public C46622bd(Object obj, Throwable th) {
        this.f121821a = obj;
        this.f121822b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46622bd)) {
            return false;
        }
        C46622bd bdVar = (C46622bd) obj;
        return C69664n.m101066l(this.f121821a, bdVar.f121821a) && C69664n.m101066l(this.f121822b, bdVar.f121822b);
    }

    public final int hashCode() {
        Object obj = this.f121821a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f121822b.hashCode();
    }

    public final String toString() {
        Object obj = this.f121821a;
        Throwable th = this.f121822b;
        return "StaleRead(staleResponse=" + obj + ", cause=" + th + ")";
    }
}
