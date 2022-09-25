package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.bd */
/* compiled from: PG */
public final class C121969bd implements C121894at {

    /* renamed from: a */
    private final C33514d f338482a;

    public C121969bd(C33514d dVar) {
        this.f338482a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C121969bd) && C69664n.m101066l(this.f338482a, ((C121969bd) obj).f338482a);
    }

    public final int hashCode() {
        C33514d dVar = this.f338482a;
        if (dVar == null) {
            return 0;
        }
        long j = dVar.f89676a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        C33514d dVar = this.f338482a;
        return "OnDirectActionsInvalidatedEvent(sessionId=" + dVar + ")";
    }
}
