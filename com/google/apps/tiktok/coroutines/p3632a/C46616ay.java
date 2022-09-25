package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.ay */
/* compiled from: PG */
public final class C46616ay extends C46623be {

    /* renamed from: a */
    public final Throwable f121813a;

    public C46616ay(Throwable th) {
        this.f121813a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46616ay) && C69664n.m101066l(this.f121813a, ((C46616ay) obj).f121813a);
    }

    public final int hashCode() {
        Throwable th = this.f121813a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        Throwable th = this.f121813a;
        return "Populating(cause=" + th + ")";
    }
}
