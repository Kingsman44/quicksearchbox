package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.bb */
/* compiled from: PG */
public final class C121780bb implements C121759ah {

    /* renamed from: a */
    public final Instant f337950a;

    /* renamed from: b */
    public final String f337951b;

    public C121780bb(Instant instant, String str) {
        C69664n.m101061g(instant, "startListeningAt");
        C69664n.m101061g(str, "reason");
        this.f337950a = instant;
        this.f337951b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121780bb)) {
            return false;
        }
        C121780bb bbVar = (C121780bb) obj;
        return C69664n.m101066l(this.f337950a, bbVar.f337950a) && C69664n.m101066l(this.f337951b, bbVar.f337951b);
    }

    public final int hashCode() {
        return (this.f337950a.hashCode() * 31) + this.f337951b.hashCode();
    }

    public final String toString() {
        Instant instant = this.f337950a;
        String str = this.f337951b;
        return "StartListeningFailureEvent(startListeningAt=" + instant + ", reason=" + str + ")";
    }
}
