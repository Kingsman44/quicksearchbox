package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.bm */
/* compiled from: PG */
public final class C121978bm implements C121894at {

    /* renamed from: a */
    private final C33514d f338499a;

    /* renamed from: b */
    private final boolean f338500b;

    /* renamed from: c */
    private final boolean f338501c;

    public C121978bm(C33514d dVar, boolean z, boolean z2) {
        this.f338499a = dVar;
        this.f338500b = z;
        this.f338501c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121978bm)) {
            return false;
        }
        C121978bm bmVar = (C121978bm) obj;
        return C69664n.m101066l(this.f338499a, bmVar.f338499a) && this.f338500b == bmVar.f338500b && this.f338501c == bmVar.f338501c;
    }

    public final int hashCode() {
        int i;
        C33514d dVar = this.f338499a;
        if (dVar == null) {
            i = 0;
        } else {
            long j = dVar.f89676a;
            i = (int) (j ^ (j >>> 32));
        }
        return (((i * 31) + (this.f338500b ? 1 : 0)) * 31) + (this.f338501c ? 1 : 0);
    }

    public final String toString() {
        C33514d dVar = this.f338499a;
        boolean z = this.f338500b;
        boolean z2 = this.f338501c;
        return "OnShowInvocationEvent(sessionId=" + dVar + ", assistDataRequested=" + z + ", screenshotRequested=" + z2 + ")";
    }
}
