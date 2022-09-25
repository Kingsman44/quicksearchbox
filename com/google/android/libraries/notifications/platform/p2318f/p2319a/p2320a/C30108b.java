package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.b */
/* compiled from: PG */
public final class C30108b extends C30112f {

    /* renamed from: a */
    public final Throwable f81455a;

    public C30108b(Throwable th) {
        this.f81455a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C30108b) && C69664n.m101066l(this.f81455a, ((C30108b) obj).f81455a);
    }

    public final int hashCode() {
        return this.f81455a.hashCode();
    }

    public final String toString() {
        Throwable th = this.f81455a;
        return "PermanentFailure(cause=" + th + ")";
    }
}
