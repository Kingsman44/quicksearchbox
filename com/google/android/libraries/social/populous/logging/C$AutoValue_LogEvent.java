package com.google.android.libraries.social.populous.logging;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.logging.$AutoValue_LogEvent  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_LogEvent extends LogEvent {

    /* renamed from: a */
    public final Long f111663a;

    /* renamed from: b */
    public final long f111664b;

    /* renamed from: c */
    public final long f111665c;

    /* renamed from: d */
    public final String f111666d;

    /* renamed from: e */
    public final C58485gu f111667e;

    /* renamed from: f */
    public final Long f111668f;

    /* renamed from: g */
    public final boolean f111669g;

    /* renamed from: h */
    public final Integer f111670h;

    /* renamed from: i */
    public final int f111671i;

    public C$AutoValue_LogEvent(int i, Long l, long j, long j2, String str, C58485gu guVar, Long l2, boolean z, Integer num) {
        if (i != 0) {
            this.f111671i = i;
            this.f111663a = l;
            this.f111664b = j;
            this.f111665c = j2;
            this.f111666d = str;
            if (guVar != null) {
                this.f111667e = guVar;
                this.f111668f = l2;
                this.f111669g = z;
                this.f111670h = num;
                return;
            }
            throw new NullPointerException("Null logEntities");
        }
        throw new NullPointerException("Null eventType");
    }

    /* renamed from: a */
    public final long mo45594a() {
        return this.f111664b;
    }

    /* renamed from: b */
    public final long mo45595b() {
        return this.f111665c;
    }

    /* renamed from: c */
    public final C42587v mo45596c() {
        return new C42567b(this);
    }

    /* renamed from: d */
    public final C58485gu mo45597d() {
        return this.f111667e;
    }

    /* renamed from: e */
    public final Integer mo45598e() {
        return this.f111670h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r1 = r7.f111666d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        r1 = r7.f111668f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        r1 = r7.f111670h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f111663a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.libraries.social.populous.logging.LogEvent
            r2 = 0
            if (r1 == 0) goto L_0x0091
            com.google.android.libraries.social.populous.logging.LogEvent r8 = (com.google.android.libraries.social.populous.logging.LogEvent) r8
            int r1 = r7.f111671i
            int r3 = r8.mo45605j()
            if (r1 != r3) goto L_0x0091
            java.lang.Long r1 = r7.f111663a
            if (r1 != 0) goto L_0x001e
            java.lang.Long r1 = r8.mo45601g()
            if (r1 != 0) goto L_0x0091
            goto L_0x0028
        L_0x001e:
            java.lang.Long r3 = r8.mo45601g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0091
        L_0x0028:
            long r3 = r7.f111664b
            long r5 = r8.mo45594a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0091
            long r3 = r7.f111665c
            long r5 = r8.mo45595b()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0091
            java.lang.String r1 = r7.f111666d
            if (r1 != 0) goto L_0x0047
            java.lang.String r1 = r8.mo45602h()
            if (r1 != 0) goto L_0x0091
            goto L_0x0051
        L_0x0047:
            java.lang.String r3 = r8.mo45602h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0091
        L_0x0051:
            com.google.common.b.gu r1 = r7.f111667e
            com.google.common.b.gu r3 = r8.mo45597d()
            boolean r1 = com.google.common.p4522b.C58597ky.m90218i(r1, r3)
            if (r1 == 0) goto L_0x0091
            java.lang.Long r1 = r7.f111668f
            if (r1 != 0) goto L_0x0068
            java.lang.Long r1 = r8.mo45600f()
            if (r1 != 0) goto L_0x0091
            goto L_0x0072
        L_0x0068:
            java.lang.Long r3 = r8.mo45600f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0091
        L_0x0072:
            boolean r1 = r7.f111669g
            boolean r3 = r8.mo45604i()
            if (r1 != r3) goto L_0x0091
            java.lang.Integer r1 = r7.f111670h
            if (r1 != 0) goto L_0x0085
            java.lang.Integer r8 = r8.mo45598e()
            if (r8 != 0) goto L_0x0091
            goto L_0x0090
        L_0x0085:
            java.lang.Integer r8 = r8.mo45598e()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            return r0
        L_0x0091:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.logging.C$AutoValue_LogEvent.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Long mo45600f() {
        return this.f111668f;
    }

    /* renamed from: g */
    public final Long mo45601g() {
        return this.f111663a;
    }

    /* renamed from: h */
    public final String mo45602h() {
        return this.f111666d;
    }

    /* renamed from: i */
    public final boolean mo45604i() {
        return this.f111669g;
    }

    /* renamed from: j */
    public final int mo45605j() {
        return this.f111671i;
    }

    public final String toString() {
        int i = this.f111671i;
        Long l = this.f111663a;
        long j = this.f111664b;
        long j2 = this.f111665c;
        String str = this.f111666d;
        String obj = this.f111667e.toString();
        Long l2 = this.f111668f;
        boolean z = this.f111669g;
        Integer num = this.f111670h;
        return "LogEvent{eventType=" + C42581p.m75151a(i) + ", querySessionId=" + l + ", selectSessionId=" + j + ", submitSessionId=" + j2 + ", query=" + str + ", logEntities=" + obj + ", cacheLastUpdatedTime=" + l2 + ", hadDeviceContactsPermission=" + z + ", affinityVersion=" + num + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = (this.f111671i ^ 1000003) * 1000003;
        Long l = this.f111663a;
        int i5 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        long j = this.f111664b;
        long j2 = this.f111665c;
        int i6 = (((((i4 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        String str = this.f111666d;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int hashCode = (((i6 ^ i2) * 1000003) ^ this.f111667e.hashCode()) * 1000003;
        Long l2 = this.f111668f;
        if (l2 == null) {
            i3 = 0;
        } else {
            i3 = l2.hashCode();
        }
        int i7 = (((hashCode ^ i3) * 1000003) ^ (true != this.f111669g ? 1237 : 1231)) * 1000003;
        Integer num = this.f111670h;
        if (num != null) {
            i5 = num.hashCode();
        }
        return i7 ^ i5;
    }
}
