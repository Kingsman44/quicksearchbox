package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.protobuf.MessageLite;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.fv */
/* compiled from: PG */
public final class C135102fv {

    /* renamed from: a */
    public final MessageLite f367969a;

    /* renamed from: b */
    public final boolean f367970b;

    public C135102fv(MessageLite messageLite, boolean z) {
        C69664n.m101061g(messageLite, "response");
        this.f367969a = messageLite;
        this.f367970b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135102fv)) {
            return false;
        }
        C135102fv fvVar = (C135102fv) obj;
        return C69664n.m101066l(this.f367969a, fvVar.f367969a) && this.f367970b == fvVar.f367970b;
    }

    public final int hashCode() {
        return (this.f367969a.hashCode() * 31) + (this.f367970b ? 1 : 0);
    }

    public final String toString() {
        MessageLite messageLite = this.f367969a;
        boolean z = this.f367970b;
        return "ResponseWithAuthStatus(response=" + messageLite + ", serverRequestedAuthUpdate=" + z + ")";
    }
}
