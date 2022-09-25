package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.ax */
/* compiled from: PG */
public final class C121898ax {

    /* renamed from: a */
    private final Instant f338268a;

    /* renamed from: b */
    private final C121894at f338269b;

    public C121898ax(Instant instant, C121894at atVar) {
        C69664n.m101061g(instant, "timestamp");
        this.f338268a = instant;
        this.f338269b = atVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121898ax)) {
            return false;
        }
        C121898ax axVar = (C121898ax) obj;
        return C69664n.m101066l(this.f338268a, axVar.f338268a) && C69664n.m101066l(this.f338269b, axVar.f338269b);
    }

    public final int hashCode() {
        return (this.f338268a.hashCode() * 31) + this.f338269b.hashCode();
    }

    public final String toString() {
        Instant instant = this.f338268a;
        C121894at atVar = this.f338269b;
        return "@" + instant + ": " + atVar;
    }
}
