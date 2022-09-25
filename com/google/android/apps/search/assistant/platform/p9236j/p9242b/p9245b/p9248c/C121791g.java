package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.g */
/* compiled from: PG */
final class C121791g {

    /* renamed from: a */
    private final Instant f337986a;

    /* renamed from: b */
    private final Instant f337987b;

    /* renamed from: c */
    private final String f337988c;

    public C121791g(Instant instant, Instant instant2, String str) {
        C69664n.m101061g(instant, "startListeningStartedAt");
        C69664n.m101061g(instant2, "startListeningFailedAt");
        C69664n.m101061g(str, "startListeningFailedReason");
        this.f337986a = instant;
        this.f337987b = instant2;
        this.f337988c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121791g)) {
            return false;
        }
        C121791g gVar = (C121791g) obj;
        return C69664n.m101066l(this.f337986a, gVar.f337986a) && C69664n.m101066l(this.f337987b, gVar.f337987b) && C69664n.m101066l(this.f337988c, gVar.f337988c);
    }

    public final int hashCode() {
        return (((this.f337986a.hashCode() * 31) + this.f337987b.hashCode()) * 31) + this.f337988c.hashCode();
    }

    public final String toString() {
        Instant instant = this.f337986a;
        Instant instant2 = this.f337987b;
        String str = this.f337988c;
        return "StartListeningFailed(startListeningStartedAt=" + instant + ", startListeningFailedAt=" + instant2 + ", startListeningFailedReason=" + str + ")";
    }
}
