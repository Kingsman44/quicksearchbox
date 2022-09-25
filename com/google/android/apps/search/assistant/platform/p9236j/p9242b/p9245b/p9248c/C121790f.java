package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9248c;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.b.c.f */
/* compiled from: PG */
final class C121790f {

    /* renamed from: a */
    public Instant f337977a = null;

    /* renamed from: b */
    public Instant f337978b = null;

    /* renamed from: c */
    public Instant f337979c = null;

    /* renamed from: d */
    private final int f337980d;

    /* renamed from: e */
    private final Instant f337981e;

    /* renamed from: f */
    private final Instant f337982f;

    /* renamed from: g */
    private final boolean f337983g;

    /* renamed from: h */
    private final String f337984h;

    /* renamed from: i */
    private final boolean f337985i;

    public C121790f(int i, Instant instant, Instant instant2, boolean z, String str, boolean z2) {
        C69664n.m101061g(instant, "startListeningStartedAt");
        C69664n.m101061g(instant2, "startListeningCompletedAt");
        this.f337980d = i;
        this.f337981e = instant;
        this.f337982f = instant2;
        this.f337983g = z;
        this.f337984h = str;
        this.f337985i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121790f)) {
            return false;
        }
        C121790f fVar = (C121790f) obj;
        return this.f337980d == fVar.f337980d && C69664n.m101066l(this.f337981e, fVar.f337981e) && C69664n.m101066l(this.f337982f, fVar.f337982f) && this.f337983g == fVar.f337983g && C69664n.m101066l(this.f337984h, fVar.f337984h) && this.f337985i == fVar.f337985i && C69664n.m101066l(this.f337977a, fVar.f337977a) && C69664n.m101066l(this.f337978b, fVar.f337978b) && C69664n.m101066l(this.f337979c, fVar.f337979c);
    }

    public final int hashCode() {
        int hashCode = ((((((((((this.f337980d * 31) + this.f337981e.hashCode()) * 31) + this.f337982f.hashCode()) * 31) + (this.f337983g ? 1 : 0)) * 31) + this.f337984h.hashCode()) * 31) + (this.f337985i ? 1 : 0)) * 31;
        Instant instant = this.f337977a;
        int i = 0;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f337978b;
        int hashCode3 = (hashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31;
        Instant instant3 = this.f337979c;
        if (instant3 != null) {
            i = instant3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        int i = this.f337980d;
        Instant instant = this.f337981e;
        Instant instant2 = this.f337982f;
        boolean z = this.f337983g;
        String str = this.f337984h;
        boolean z2 = this.f337985i;
        Instant instant3 = this.f337977a;
        Instant instant4 = this.f337978b;
        Instant instant5 = this.f337979c;
        return "Session(sessionId=" + i + ", startListeningStartedAt=" + instant + ", startListeningCompletedAt=" + instant2 + ", isEarlyListeningSession=" + z + ", audioRouteType=" + str + ", hasLegacyHotwordEvent=" + z2 + ", startListeningEarlySessionAccessedAt=" + instant3 + ", stoppedListeningStartedAt=" + instant4 + ", stoppedListeningCompletedAt=" + instant5 + ")";
    }
}
