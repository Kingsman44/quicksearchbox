package com.google.apps.tiktok.coroutines.p3632a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.coroutines.a.aw */
/* compiled from: PG */
public final class C46614aw extends C46623be {

    /* renamed from: a */
    public final Throwable f121811a;

    public C46614aw(Throwable th) {
        this.f121811a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C46614aw) && C69664n.m101066l(this.f121811a, ((C46614aw) obj).f121811a);
    }

    public final int hashCode() {
        return this.f121811a.hashCode();
    }

    public final String toString() {
        Throwable th = this.f121811a;
        return "Failed(cause=" + th + ")";
    }
}
