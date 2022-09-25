package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.bq */
/* compiled from: PG */
public final class C121982bq implements C121894at {

    /* renamed from: a */
    private final C33514d f338507a;

    public C121982bq(C33514d dVar) {
        C69664n.m101061g(dVar, "sessionId");
        this.f338507a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C121982bq) && C69664n.m101066l(this.f338507a, ((C121982bq) obj).f338507a);
    }

    public final int hashCode() {
        long j = this.f338507a.f89676a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        C33514d dVar = this.f338507a;
        return "StartSessionEvent(sessionId=" + dVar + ")";
    }
}
