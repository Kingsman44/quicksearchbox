package com.google.android.libraries.search.assistant.appactions.p2501a;

import com.google.assistant.p3931f.p3939c.C52813ac;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.appactions.a.t */
/* compiled from: PG */
public final class C32461t {

    /* renamed from: a */
    public final C52813ac f86997a;

    /* renamed from: b */
    public final boolean f86998b;

    public C32461t(C52813ac acVar, boolean z) {
        this.f86997a = acVar;
        this.f86998b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32461t)) {
            return false;
        }
        C32461t tVar = (C32461t) obj;
        return C69664n.m101066l(this.f86997a, tVar.f86997a) && this.f86998b == tVar.f86998b;
    }

    public final int hashCode() {
        return (this.f86997a.hashCode() * 31) + (this.f86998b ? 1 : 0);
    }

    public final String toString() {
        C52813ac acVar = this.f86997a;
        boolean z = this.f86998b;
        return "AppExecutionResponse(fulfillmentResponse=" + acVar + ", dialogTerminated=" + z + ")";
    }
}
