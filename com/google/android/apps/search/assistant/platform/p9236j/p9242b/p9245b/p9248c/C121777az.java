package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.az */
/* compiled from: PG */
public final class C121777az implements C121759ah {

    /* renamed from: a */
    public final Instant f337943a;

    /* renamed from: b */
    public final int f337944b;

    /* renamed from: c */
    public final boolean f337945c;

    /* renamed from: d */
    public final String f337946d;

    /* renamed from: e */
    public final boolean f337947e;

    public C121777az(Instant instant, int i, boolean z, String str, boolean z2) {
        C69664n.m101061g(instant, "startListeningAt");
        this.f337943a = instant;
        this.f337944b = i;
        this.f337945c = z;
        this.f337946d = str;
        this.f337947e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121777az)) {
            return false;
        }
        C121777az azVar = (C121777az) obj;
        return C69664n.m101066l(this.f337943a, azVar.f337943a) && this.f337944b == azVar.f337944b && this.f337945c == azVar.f337945c && C69664n.m101066l(this.f337946d, azVar.f337946d) && this.f337947e == azVar.f337947e;
    }

    public final int hashCode() {
        return (((((((this.f337943a.hashCode() * 31) + this.f337944b) * 31) + (this.f337945c ? 1 : 0)) * 31) + this.f337946d.hashCode()) * 31) + (this.f337947e ? 1 : 0);
    }

    public final String toString() {
        Instant instant = this.f337943a;
        int i = this.f337944b;
        boolean z = this.f337945c;
        String str = this.f337946d;
        boolean z2 = this.f337947e;
        return "StartListeningCompletedEvent(startListeningAt=" + instant + ", sessionId=" + i + ", isEarlyListeningSession=" + z + ", audioRouteType=" + str + ", hasLegacyHotwordEvent=" + z2 + ")";
    }
}
