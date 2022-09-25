package com.google.android.libraries.performance.primes.metrics.p2404b;

import com.google.android.libraries.performance.primes.p2397b.C31178h;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71207aq;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej;

/* renamed from: com.google.android.libraries.performance.primes.metrics.b.b */
/* compiled from: PG */
final class C31299b extends C31302e {

    /* renamed from: a */
    private final String f84285a;

    /* renamed from: b */
    private final boolean f84286b;

    /* renamed from: c */
    private final C71308ej f84287c;

    /* renamed from: d */
    private final C71207aq f84288d;

    /* renamed from: e */
    private final String f84289e;

    /* renamed from: f */
    private final Long f84290f;

    /* renamed from: g */
    private final boolean f84291g;

    /* renamed from: h */
    private final C31178h f84292h;

    /* renamed from: i */
    private final int f84293i;

    public C31299b(String str, boolean z, C71308ej ejVar, C71207aq aqVar, String str2, Long l, boolean z2, C31178h hVar, int i) {
        this.f84285a = str;
        this.f84286b = z;
        this.f84287c = ejVar;
        this.f84288d = aqVar;
        this.f84289e = str2;
        this.f84290f = l;
        this.f84291g = z2;
        this.f84292h = hVar;
        this.f84293i = i;
    }

    /* renamed from: a */
    public final int mo37006a() {
        return this.f84293i;
    }

    /* renamed from: b */
    public final C31178h mo37007b() {
        return this.f84292h;
    }

    /* renamed from: c */
    public final Long mo37008c() {
        return this.f84290f;
    }

    /* renamed from: d */
    public final String mo37009d() {
        return this.f84289e;
    }

    /* renamed from: e */
    public final String mo37010e() {
        return this.f84285a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r1 = r4.f84288d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r1 = r4.f84289e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        r1 = r4.f84290f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        r1 = r4.f84292h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.performance.primes.metrics.p2404b.C31302e
            r2 = 0
            if (r1 == 0) goto L_0x009a
            com.google.android.libraries.performance.primes.metrics.b.e r5 = (com.google.android.libraries.performance.primes.metrics.p2404b.C31302e) r5
            java.lang.String r1 = r4.f84285a
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.mo37010e()
            if (r1 != 0) goto L_0x009a
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.mo37010e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009a
        L_0x0020:
            boolean r1 = r4.f84286b
            boolean r3 = r5.mo37014h()
            if (r1 != r3) goto L_0x009a
            j.a.i.b.a.ej r1 = r4.f84287c
            j.a.i.b.a.ej r3 = r5.mo37013g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009a
            j.a.i.b.a.aq r1 = r4.f84288d
            if (r1 != 0) goto L_0x003f
            j.a.i.b.a.aq r1 = r5.mo37012f()
            if (r1 != 0) goto L_0x009a
            goto L_0x0049
        L_0x003f:
            j.a.i.b.a.aq r3 = r5.mo37012f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009a
        L_0x0049:
            java.lang.String r1 = r4.f84289e
            if (r1 != 0) goto L_0x0054
            java.lang.String r1 = r5.mo37009d()
            if (r1 != 0) goto L_0x009a
            goto L_0x005e
        L_0x0054:
            java.lang.String r3 = r5.mo37009d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009a
        L_0x005e:
            java.lang.Long r1 = r4.f84290f
            if (r1 != 0) goto L_0x0069
            java.lang.Long r1 = r5.mo37008c()
            if (r1 != 0) goto L_0x009a
            goto L_0x0073
        L_0x0069:
            java.lang.Long r3 = r5.mo37008c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x009a
        L_0x0073:
            boolean r1 = r4.f84291g
            boolean r3 = r5.mo37016i()
            if (r1 != r3) goto L_0x009a
            com.google.android.libraries.performance.primes.b.h r1 = r4.f84292h
            if (r1 != 0) goto L_0x0086
            com.google.android.libraries.performance.primes.b.h r1 = r5.mo37007b()
            if (r1 != 0) goto L_0x009a
            goto L_0x0091
        L_0x0086:
            com.google.android.libraries.performance.primes.b.h r3 = r5.mo37007b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0091
            goto L_0x009a
        L_0x0091:
            int r1 = r4.f84293i
            int r5 = r5.mo37006a()
            if (r1 != r5) goto L_0x009a
            return r0
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2404b.C31299b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final C71207aq mo37012f() {
        return this.f84288d;
    }

    /* renamed from: g */
    public final C71308ej mo37013g() {
        return this.f84287c;
    }

    /* renamed from: h */
    public final boolean mo37014h() {
        return this.f84286b;
    }

    /* renamed from: i */
    public final boolean mo37016i() {
        return this.f84291g;
    }

    public final String toString() {
        String str = this.f84285a;
        boolean z = this.f84286b;
        String obj = this.f84287c.toString();
        String valueOf = String.valueOf(this.f84288d);
        String str2 = this.f84289e;
        Long l = this.f84290f;
        boolean z2 = this.f84291g;
        String valueOf2 = String.valueOf(this.f84292h);
        int i = this.f84293i;
        return "Metric{customEventName=" + str + ", isEventNameConstant=" + z + ", metric=" + obj + ", metricExtension=" + valueOf + ", accountableComponentName=" + str2 + ", sampleRatePermille=" + l + ", isUnsampled=" + z2 + ", debugLogsTime=" + valueOf2 + ", debugLogsSize=" + i + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f84285a;
        int i5 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i6 = 1237;
        int hashCode = (((((i ^ 1000003) * 1000003) ^ (true != this.f84286b ? 1237 : 1231)) * 1000003) ^ this.f84287c.hashCode()) * 1000003;
        C71207aq aqVar = this.f84288d;
        if (aqVar == null) {
            i2 = 0;
        } else {
            i2 = aqVar.hashCode();
        }
        int i7 = (hashCode ^ i2) * 1000003;
        String str2 = this.f84289e;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        Long l = this.f84290f;
        if (l == null) {
            i4 = 0;
        } else {
            i4 = l.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        if (true == this.f84291g) {
            i6 = 1231;
        }
        int i10 = (i9 ^ i6) * 1000003;
        C31178h hVar = this.f84292h;
        if (hVar != null) {
            i5 = hVar.hashCode();
        }
        return ((i10 ^ i5) * 1000003) ^ this.f84293i;
    }
}
