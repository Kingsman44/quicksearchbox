package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.aa */
/* compiled from: PG */
final class C121904aa {

    /* renamed from: a */
    public final long f338278a;

    /* renamed from: b */
    public final long f338279b;

    /* renamed from: c */
    public final String f338280c;

    /* renamed from: d */
    public final Instant f338281d;

    /* renamed from: e */
    private final Instant f338282e;

    /* renamed from: f */
    private final String f338283f;

    public C121904aa(long j, long j2, String str, Instant instant, Instant instant2, String str2) {
        C69664n.m101061g(str, "fragmentFromClient");
        C69664n.m101061g(instant, "createdAt");
        this.f338278a = j;
        this.f338279b = j2;
        this.f338280c = str;
        this.f338281d = instant;
        this.f338282e = instant2;
        this.f338283f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121904aa)) {
            return false;
        }
        C121904aa aaVar = (C121904aa) obj;
        return this.f338278a == aaVar.f338278a && this.f338279b == aaVar.f338279b && C69664n.m101066l(this.f338280c, aaVar.f338280c) && C69664n.m101066l(this.f338281d, aaVar.f338281d) && C69664n.m101066l(this.f338282e, aaVar.f338282e) && C69664n.m101066l(this.f338283f, aaVar.f338283f);
    }

    public final int hashCode() {
        long j = this.f338278a;
        long j2 = this.f338279b;
        int hashCode = ((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f338280c.hashCode()) * 31) + this.f338281d.hashCode()) * 31;
        Instant instant = this.f338282e;
        int i = 0;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        String str = this.f338283f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        long j = this.f338278a;
        long j2 = this.f338279b;
        String str = this.f338280c;
        Instant instant = this.f338281d;
        Instant instant2 = this.f338282e;
        String str2 = this.f338283f;
        return "AssistLayerSessionData(id=" + j + ", windowId=" + j2 + ", fragmentFromClient=" + str + ", createdAt=" + instant + ", endedAt=" + instant2 + ", endReason=" + str2 + ")";
    }
}
