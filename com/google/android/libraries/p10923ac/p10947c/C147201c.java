package com.google.android.libraries.p10923ac.p10947c;

/* renamed from: com.google.android.libraries.ac.c.c */
/* compiled from: PG */
public final class C147201c extends C147208j {

    /* renamed from: a */
    public final int f397417a;

    /* renamed from: b */
    public final Long f397418b;

    /* renamed from: c */
    public final Long f397419c;

    public C147201c(int i, Long l, Long l2) {
        this.f397417a = i;
        this.f397418b = l;
        this.f397419c = l2;
    }

    /* renamed from: a */
    public final int mo124023a() {
        return this.f397417a;
    }

    /* renamed from: b */
    public final Long mo124024b() {
        return this.f397419c;
    }

    /* renamed from: c */
    public final Long mo124025c() {
        return this.f397418b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = r4.f397419c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r4.f397418b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.p10923ac.p10947c.C147208j
            r2 = 0
            if (r1 == 0) goto L_0x003f
            com.google.android.libraries.ac.c.j r5 = (com.google.android.libraries.p10923ac.p10947c.C147208j) r5
            int r1 = r4.f397417a
            int r3 = r5.mo124023a()
            if (r1 != r3) goto L_0x003f
            java.lang.Long r1 = r4.f397418b
            if (r1 != 0) goto L_0x001e
            java.lang.Long r1 = r5.mo124025c()
            if (r1 != 0) goto L_0x003f
            goto L_0x0028
        L_0x001e:
            java.lang.Long r3 = r5.mo124025c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003f
        L_0x0028:
            java.lang.Long r1 = r4.f397419c
            if (r1 != 0) goto L_0x0033
            java.lang.Long r5 = r5.mo124024b()
            if (r5 != 0) goto L_0x003f
            goto L_0x003e
        L_0x0033:
            java.lang.Long r5 = r5.mo124024b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10947c.C147201c.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int i = this.f397417a;
        Long l = this.f397418b;
        Long l2 = this.f397419c;
        return "TimeSeriesFootprintsFilter{numFootprints=" + i + ", relativeNowMinTimestampMicros=" + l + ", relativeNowMaxTimestampMicros=" + l2 + "}";
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f397417a ^ 1000003) * 1000003;
        Long l = this.f397418b;
        int i3 = 0;
        if (l == null) {
            i = 0;
        } else {
            i = l.hashCode();
        }
        int i4 = (i2 ^ i) * 1000003;
        Long l2 = this.f397419c;
        if (l2 != null) {
            i3 = l2.hashCode();
        }
        return i4 ^ i3;
    }
}
