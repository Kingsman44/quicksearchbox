package com.google.apps.tiktok.coroutines;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a */
/* compiled from: PG */
public final class C46590a extends C46650c {

    /* renamed from: a */
    public final Throwable f121777a;

    public C46590a(Throwable th) {
        this.f121777a = th;
    }

    /* renamed from: a */
    public final Object mo50592a() {
        throw this.f121777a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46590a) && C69664n.m101066l(this.f121777a, ((C46590a) obj).f121777a);
    }

    public final int hashCode() {
        return this.f121777a.hashCode();
    }

    public final String toString() {
        Throwable th = this.f121777a;
        return "Failure(error=" + th + ")";
    }
}
