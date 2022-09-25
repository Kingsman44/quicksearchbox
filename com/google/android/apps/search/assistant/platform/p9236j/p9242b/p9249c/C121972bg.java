package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.bg */
/* compiled from: PG */
public final class C121972bg implements C121894at {

    /* renamed from: a */
    private final C33514d f338491a;

    /* renamed from: b */
    private final boolean f338492b;

    public C121972bg(C33514d dVar, boolean z) {
        this.f338491a = dVar;
        this.f338492b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121972bg)) {
            return false;
        }
        C121972bg bgVar = (C121972bg) obj;
        return C69664n.m101066l(this.f338491a, bgVar.f338491a) && this.f338492b == bgVar.f338492b;
    }

    public final int hashCode() {
        int i;
        C33514d dVar = this.f338491a;
        if (dVar == null) {
            i = 0;
        } else {
            long j = dVar.f89676a;
            i = (int) (j ^ (j >>> 32));
        }
        return (i * 31) + (this.f338492b ? 1 : 0);
    }

    public final String toString() {
        C33514d dVar = this.f338491a;
        boolean z = this.f338492b;
        return "OnHandleScreenshotEvent(sessionId=" + dVar + ", hasScreenshot=" + z + ")";
    }
}
