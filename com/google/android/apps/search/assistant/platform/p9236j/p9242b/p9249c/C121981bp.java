package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import android.os.Bundle;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33514d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.bp */
/* compiled from: PG */
final class C121981bp {

    /* renamed from: a */
    public final C33514d f338504a;

    /* renamed from: b */
    public final Bundle f338505b;

    /* renamed from: c */
    public final int f338506c;

    public C121981bp(C33514d dVar, Bundle bundle, int i) {
        this.f338504a = dVar;
        this.f338505b = bundle;
        this.f338506c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121981bp)) {
            return false;
        }
        C121981bp bpVar = (C121981bp) obj;
        return C69664n.m101066l(this.f338504a, bpVar.f338504a) && C69664n.m101066l(this.f338505b, bpVar.f338505b) && this.f338506c == bpVar.f338506c;
    }

    public final int hashCode() {
        int i;
        C33514d dVar = this.f338504a;
        int i2 = 0;
        if (dVar == null) {
            i = 0;
        } else {
            long j = dVar.f89676a;
            i = (int) (j ^ (j >>> 32));
        }
        int i3 = i * 31;
        Bundle bundle = this.f338505b;
        if (bundle != null) {
            i2 = bundle.hashCode();
        }
        return ((i3 + i2) * 31) + this.f338506c;
    }

    public final String toString() {
        C33514d dVar = this.f338504a;
        Bundle bundle = this.f338505b;
        int i = this.f338506c;
        return "SessionInvocationRequest(preexistingSessionId=" + dVar + ", args=" + bundle + ", flags=" + i + ")";
    }
}
