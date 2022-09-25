package com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b;

/* renamed from: com.google.android.libraries.ac.b.c.b.h */
/* compiled from: PG */
public final class C146811h extends C146821r {

    /* renamed from: b */
    private final int f396372b;

    /* renamed from: c */
    private final Long f396373c;

    /* renamed from: d */
    private final Long f396374d;

    public C146811h(int i, Long l, Long l2) {
        this.f396372b = i;
        this.f396373c = l;
        this.f396374d = l2;
    }

    /* renamed from: a */
    public final int mo123699a() {
        return this.f396372b;
    }

    /* renamed from: b */
    public final Long mo123700b() {
        return this.f396374d;
    }

    /* renamed from: c */
    public final Long mo123701c() {
        return this.f396373c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f396374d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f396373c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146821r
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.libraries.ac.b.c.b.r r5 = (com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146821r) r5
            int r1 = r4.f396372b
            int r3 = r5.mo123699a()
            if (r1 != r3) goto L_0x003f
            java.lang.Long r1 = r4.f396373c
            if (r1 != 0) goto L_0x001e
            java.lang.Long r1 = r5.mo123701c()
            if (r1 != 0) goto L_0x003f
            goto L_0x0028
        L_0x001e:
            java.lang.Long r3 = r5.mo123701c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0028:
            java.lang.Long r1 = r4.f396374d
            if (r1 != 0) goto L_0x0033
            java.lang.Long r5 = r5.mo123700b()
            if (r5 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0033:
            java.lang.Long r5 = r5.mo123700b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146811h.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = this.f396372b;
        Long l = this.f396373c;
        Long l2 = this.f396374d;
        return "CoreTimeSeriesFootprintsFilter{numFootprints=" + i + ", relativeNowMinTimestampMicros=" + l + ", relativeNowMaxTimestampMicros=" + l2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f396372b ^ 1000003) * 1000003;
        Long l = this.f396373c;
        int i3 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        Long l2 = this.f396374d;
        if (l2 != null) {
            i3 = l2.hashCode();
        }
        return i4 ^ i3;
    }
}
