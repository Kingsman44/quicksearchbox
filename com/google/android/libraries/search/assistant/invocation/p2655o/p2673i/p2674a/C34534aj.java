package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.aj */
/* compiled from: PG */
final class C34534aj implements C34564c {

    /* renamed from: a */
    private final Throwable f91771a;

    public C34534aj(Throwable th) {
        this.f91771a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34534aj) && C69664n.m101066l(this.f91771a, ((C34534aj) obj).f91771a);
    }

    public final int hashCode() {
        Throwable th = this.f91771a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        Throwable th = this.f91771a;
        return "On failure completion: " + th + ".";
    }
}
