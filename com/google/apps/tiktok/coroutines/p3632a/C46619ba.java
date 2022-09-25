package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.ba */
/* compiled from: PG */
public final class C46619ba extends C46623be {

    /* renamed from: a */
    public final Throwable f121816a;

    public C46619ba(Throwable th) {
        this.f121816a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46619ba) && C69664n.m101066l(this.f121816a, ((C46619ba) obj).f121816a);
    }

    public final int hashCode() {
        Throwable th = this.f121816a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        Throwable th = this.f121816a;
        return "Reading(cause=" + th + ")";
    }
}
