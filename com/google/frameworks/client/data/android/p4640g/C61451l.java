package com.google.frameworks.client.data.android.p4640g;

import java.net.URI;

/* renamed from: com.google.frameworks.client.data.android.g.l */
/* compiled from: PG */
final class C61451l extends C61438al {

    /* renamed from: a */
    public final URI f166140a;

    /* renamed from: b */
    public final long f166141b;

    /* renamed from: c */
    public final Integer f166142c;

    /* renamed from: d */
    public final Integer f166143d;

    public C61451l(URI uri, long j, Integer num, Integer num2) {
        this.f166140a = uri;
        this.f166141b = j;
        this.f166142c = num;
        this.f166143d = num2;
    }

    /* renamed from: a */
    public final long mo58048a() {
        return this.f166141b;
    }

    /* renamed from: b */
    public final Integer mo58049b() {
        return this.f166143d;
    }

    /* renamed from: c */
    public final Integer mo58050c() {
        return this.f166142c;
    }

    /* renamed from: d */
    public final URI mo58051d() {
        return this.f166140a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r1 = r7.f166143d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f166142c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.frameworks.client.data.android.p4640g.C61438al
            r2 = 0
            if (r1 == 0) goto L_0x004d
            com.google.frameworks.client.data.android.g.al r8 = (com.google.frameworks.client.data.android.p4640g.C61438al) r8
            java.net.URI r1 = r7.f166140a
            java.net.URI r3 = r8.mo58051d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
            long r3 = r7.f166141b
            long r5 = r8.mo58048a()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x004d
            java.lang.Integer r1 = r7.f166142c
            if (r1 != 0) goto L_0x002c
            java.lang.Integer r1 = r8.mo58050c()
            if (r1 != 0) goto L_0x004d
            goto L_0x0036
        L_0x002c:
            java.lang.Integer r3 = r8.mo58050c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x004d
        L_0x0036:
            java.lang.Integer r1 = r7.f166143d
            if (r1 != 0) goto L_0x0041
            java.lang.Integer r8 = r8.mo58049b()
            if (r8 != 0) goto L_0x004d
            goto L_0x004c
        L_0x0041:
            java.lang.Integer r8 = r8.mo58049b()
            boolean r8 = r1.equals(r8)
            if (r8 != 0) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            return r0
        L_0x004d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.frameworks.client.data.android.p4640g.C61451l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f166140a.hashCode();
        long j = this.f166141b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Integer num = this.f166142c;
        int i3 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        Integer num2 = this.f166143d;
        if (num2 != null) {
            i3 = num2.hashCode();
        }
        return i4 ^ i3;
    }

    public final String toString() {
        String obj = this.f166140a.toString();
        long j = this.f166141b;
        Integer num = this.f166142c;
        Integer num2 = this.f166143d;
        return "ChannelRuntimeConfig{uri=" + obj + ", grpcIdleTimeoutMillis=" + j + ", trafficStatsUid=" + num + ", trafficStatsTag=" + num2 + "}";
    }
}
