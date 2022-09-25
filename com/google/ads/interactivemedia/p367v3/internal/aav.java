package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aav */
/* compiled from: PG */
public final class aav implements Comparable {

    /* renamed from: a */
    public final boolean f20149a;

    /* renamed from: b */
    private final aaq f20150b;

    /* renamed from: c */
    private final boolean f20151c;

    /* renamed from: d */
    private final boolean f20152d;

    /* renamed from: e */
    private final int f20153e;

    /* renamed from: f */
    private final int f20154f;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
        if (r10 < ((float) r8.f20102h)) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005b, code lost:
        if (r10 < r8.f20103i) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aav(com.google.ads.interactivemedia.p367v3.internal.C6864cy r7, com.google.ads.interactivemedia.p367v3.internal.aaq r8, int r9, boolean r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.f20150b = r8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1
            r2 = -1
            r3 = 0
            if (r10 == 0) goto L_0x0033
            int r4 = r7.f21817q
            if (r4 == r2) goto L_0x0014
            int r5 = r8.f20096b
            if (r4 > r5) goto L_0x0033
        L_0x0014:
            int r4 = r7.f21818r
            if (r4 == r2) goto L_0x001c
            int r5 = r8.f20097c
            if (r4 > r5) goto L_0x0033
        L_0x001c:
            float r4 = r7.f21819s
            int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0029
            int r5 = r8.f20098d
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x0033
        L_0x0029:
            int r4 = r7.f21808h
            if (r4 == r2) goto L_0x0031
            int r5 = r8.f20099e
            if (r4 > r5) goto L_0x0033
        L_0x0031:
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            r6.f20149a = r4
            if (r10 == 0) goto L_0x005e
            int r10 = r7.f21817q
            if (r10 == r2) goto L_0x0040
            int r4 = r8.f20100f
            if (r10 < r4) goto L_0x005e
        L_0x0040:
            int r10 = r7.f21818r
            if (r10 == r2) goto L_0x0048
            int r4 = r8.f20101g
            if (r10 < r4) goto L_0x005e
        L_0x0048:
            float r10 = r7.f21819s
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0055
            int r0 = r8.f20102h
            float r0 = (float) r0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x005e
        L_0x0055:
            int r10 = r7.f21808h
            if (r10 == r2) goto L_0x005f
            int r8 = r8.f20103i
            if (r10 < r8) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            r6.f20151c = r1
            boolean r8 = com.google.ads.interactivemedia.p367v3.internal.aaw.m18093b(r9, r3)
            r6.f20152d = r8
            int r8 = r7.f21808h
            r6.f20153e = r8
            int r7 = r7.mo15639d()
            r6.f20154f = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aav.<init>(com.google.ads.interactivemedia.v3.internal.cy, com.google.ads.interactivemedia.v3.internal.aaq, int, boolean):void");
    }

    /* renamed from: a */
    public final int compareTo(aav aav) {
        asc asc;
        asc asc2;
        if (!this.f20149a || !this.f20152d) {
            asc = aaw.f20157c.mo15341a();
        } else {
            asc = aaw.f20157c;
        }
        aqv d = aqv.m19338g().mo15220d(this.f20152d, aav.f20152d).mo15220d(this.f20149a, aav.f20149a).mo15220d(this.f20151c, aav.f20151c);
        Integer valueOf = Integer.valueOf(this.f20153e);
        Integer valueOf2 = Integer.valueOf(aav.f20153e);
        if (this.f20150b.f20116v) {
            asc2 = aaw.f20157c.mo15341a();
        } else {
            asc2 = aaw.f20158d;
        }
        return d.mo15217a(valueOf, valueOf2, asc2).mo15217a(Integer.valueOf(this.f20154f), Integer.valueOf(aav.f20154f), asc).mo15217a(Integer.valueOf(this.f20153e), Integer.valueOf(aav.f20153e), asc).mo15221e();
    }
}
