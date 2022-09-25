package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.bf */
/* compiled from: PG */
public final class C121971bf implements C121894at {

    /* renamed from: a */
    private final C33514d f338487a;

    /* renamed from: b */
    private final boolean f338488b;

    /* renamed from: c */
    private final boolean f338489c;

    /* renamed from: d */
    private final boolean f338490d;

    public C121971bf(C33514d dVar, boolean z, boolean z2, boolean z3) {
        this.f338487a = dVar;
        this.f338488b = z;
        this.f338489c = z2;
        this.f338490d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121971bf)) {
            return false;
        }
        C121971bf bfVar = (C121971bf) obj;
        return C69664n.m101066l(this.f338487a, bfVar.f338487a) && this.f338488b == bfVar.f338488b && this.f338489c == bfVar.f338489c && this.f338490d == bfVar.f338490d;
    }

    public final int hashCode() {
        int i;
        C33514d dVar = this.f338487a;
        if (dVar == null) {
            i = 0;
        } else {
            long j = dVar.f89676a;
            i = (int) (j ^ (j >>> 32));
        }
        return (((((i * 31) + (this.f338488b ? 1 : 0)) * 31) + (this.f338489c ? 1 : 0)) * 31) + (this.f338490d ? 1 : 0);
    }

    public final String toString() {
        C33514d dVar = this.f338487a;
        boolean z = this.f338488b;
        boolean z2 = this.f338489c;
        boolean z3 = this.f338490d;
        return "OnHandleAssistEvent(sessionId=" + dVar + ", hasAssistData=" + z + ", hasAssistStructure=" + z2 + ", hasAssistContent=" + z3 + ")";
    }
}
