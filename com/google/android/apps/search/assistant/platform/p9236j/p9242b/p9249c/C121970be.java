package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.be */
/* compiled from: PG */
public final class C121970be implements C121894at {

    /* renamed from: a */
    private final C33514d f338483a;

    /* renamed from: b */
    private final boolean f338484b;

    /* renamed from: c */
    private final boolean f338485c;

    /* renamed from: d */
    private final boolean f338486d;

    public C121970be(C33514d dVar, boolean z, boolean z2, boolean z3) {
        this.f338483a = dVar;
        this.f338484b = z;
        this.f338485c = z2;
        this.f338486d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121970be)) {
            return false;
        }
        C121970be beVar = (C121970be) obj;
        return C69664n.m101066l(this.f338483a, beVar.f338483a) && this.f338484b == beVar.f338484b && this.f338485c == beVar.f338485c && this.f338486d == beVar.f338486d;
    }

    public final int hashCode() {
        int i;
        C33514d dVar = this.f338483a;
        if (dVar == null) {
            i = 0;
        } else {
            long j = dVar.f89676a;
            i = (int) (j ^ (j >>> 32));
        }
        return (((((i * 31) + (this.f338484b ? 1 : 0)) * 31) + (this.f338485c ? 1 : 0)) * 31) + (this.f338486d ? 1 : 0);
    }

    public final String toString() {
        C33514d dVar = this.f338483a;
        boolean z = this.f338484b;
        boolean z2 = this.f338485c;
        boolean z3 = this.f338486d;
        return "OnForegroundActivityAssistStateReceivedEvent(sessionId=" + dVar + ", hasAssistData=" + z + ", hasAssistStructure=" + z2 + ", hasAssistContent=" + z3 + ")";
    }
}
