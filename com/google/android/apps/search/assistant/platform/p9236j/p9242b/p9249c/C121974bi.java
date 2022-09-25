package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.bi */
/* compiled from: PG */
public final class C121974bi implements C121894at {

    /* renamed from: a */
    private final C33514d f338494a;

    /* renamed from: b */
    private final boolean f338495b;

    /* renamed from: c */
    private final boolean f338496c;

    public C121974bi(C33514d dVar, boolean z, boolean z2) {
        this.f338494a = dVar;
        this.f338495b = z;
        this.f338496c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121974bi)) {
            return false;
        }
        C121974bi biVar = (C121974bi) obj;
        return C69664n.m101066l(this.f338494a, biVar.f338494a) && this.f338495b == biVar.f338495b && this.f338496c == biVar.f338496c;
    }

    public final int hashCode() {
        long j = this.f338494a.f89676a;
        return (((((int) (j ^ (j >>> 32))) * 31) + (this.f338495b ? 1 : 0)) * 31) + (this.f338496c ? 1 : 0);
    }

    public final String toString() {
        C33514d dVar = this.f338494a;
        boolean z = this.f338495b;
        boolean z2 = this.f338496c;
        return "OnNewSystemInvocationEvent(sessionId=" + dVar + ", assistDataRequested=" + z + ", screenshotRequested=" + z2 + ")";
    }
}
