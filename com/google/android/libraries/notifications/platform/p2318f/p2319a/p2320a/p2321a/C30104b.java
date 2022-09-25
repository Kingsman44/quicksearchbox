package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.p2321a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.a.b */
/* compiled from: PG */
final class C30104b {

    /* renamed from: a */
    public final String f81439a;

    /* renamed from: b */
    public final long f81440b;

    /* renamed from: c */
    public final Long f81441c;

    public C30104b(String str, long j, Long l) {
        C69664n.m101061g(str, "token");
        this.f81439a = str;
        this.f81440b = j;
        this.f81441c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30104b)) {
            return false;
        }
        C30104b bVar = (C30104b) obj;
        return C69664n.m101066l(this.f81439a, bVar.f81439a) && this.f81440b == bVar.f81440b && C69664n.m101066l(this.f81441c, bVar.f81441c);
    }

    public final int hashCode() {
        int hashCode = this.f81439a.hashCode();
        long j = this.f81440b;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.f81441c;
        return i + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        String str = this.f81439a;
        long j = this.f81440b;
        Long l = this.f81441c;
        return "AuthToken(token=" + str + ", authTimeMillis=" + j + ", expirationTimeSecs=" + l + ")";
    }
}
