package com.google.ads.interactivemedia.p367v3.internal;

import com.google.common.p4535g.C59203do;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lg */
/* compiled from: PG */
final class C7089lg extends C7091li {

    /* renamed from: b */
    private long f22723b = -9223372036854775807L;

    /* renamed from: c */
    private long[] f22724c = new long[0];

    /* renamed from: d */
    private long[] f22725d = new long[0];

    public C7089lg() {
        super(new C7052jx());
    }

    /* renamed from: g */
    private static Double m21019g(aee aee) {
        return Double.valueOf(Double.longBitsToDouble(aee.mo14570x()));
    }

    /* renamed from: h */
    private static String m21020h(aee aee) {
        int o = aee.mo14561o();
        int g = aee.mo14553g();
        aee.mo14557k(o);
        return new String(aee.mo14555i(), g, o);
    }

    /* renamed from: i */
    private static HashMap m21021i(aee aee) {
        int B = aee.mo14538B();
        HashMap hashMap = new HashMap(B);
        for (int i = 0; i < B; i++) {
            String h = m21020h(aee);
            Object j = m21022j(aee, aee.mo14560n());
            if (j != null) {
                hashMap.put(h, j);
            }
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m21022j(com.google.ads.interactivemedia.p367v3.internal.aee r4, int r5) {
        /*
            if (r5 == 0) goto L_0x007a
            r0 = 0
            r1 = 1
            if (r5 == r1) goto L_0x006e
            r1 = 2
            if (r5 == r1) goto L_0x0069
            r2 = 3
            if (r5 == r2) goto L_0x004d
            r2 = 8
            if (r5 == r2) goto L_0x0048
            r2 = 10
            if (r5 == r2) goto L_0x002c
            r0 = 11
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r5 = new java.util.Date
            java.lang.Double r0 = m21019g(r4)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r5.<init>(r2)
            r4.mo14557k(r1)
            return r5
        L_0x002c:
            int r5 = r4.mo14538B()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0035:
            if (r0 >= r5) goto L_0x0047
            int r2 = r4.mo14560n()
            java.lang.Object r2 = m21022j(r4, r2)
            if (r2 == 0) goto L_0x0044
            r1.add(r2)
        L_0x0044:
            int r0 = r0 + 1
            goto L_0x0035
        L_0x0047:
            return r1
        L_0x0048:
            java.util.HashMap r4 = m21021i(r4)
            return r4
        L_0x004d:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x0052:
            java.lang.String r0 = m21020h(r4)
            int r1 = r4.mo14560n()
            r2 = 9
            if (r1 != r2) goto L_0x005f
            return r5
        L_0x005f:
            java.lang.Object r1 = m21022j(r4, r1)
            if (r1 == 0) goto L_0x0052
            r5.put(r0, r1)
            goto L_0x0052
        L_0x0069:
            java.lang.String r4 = m21020h(r4)
            return r4
        L_0x006e:
            int r4 = r4.mo14560n()
            if (r4 != r1) goto L_0x0075
            r0 = 1
        L_0x0075:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x007a:
            java.lang.Double r4 = m21019g(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7089lg.m21022j(com.google.ads.interactivemedia.v3.internal.aee, int):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo16141a(aee aee) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo16142b(aee aee, long j) {
        if (aee.mo14560n() != 2 || !"onMetaData".equals(m21020h(aee)) || aee.mo14560n() != 8) {
            return false;
        }
        HashMap i = m21021i(aee);
        Object obj = i.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > C59203do.f157270a) {
                this.f22723b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = i.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f22724c = new long[size];
                this.f22725d = new long[size];
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Object obj5 = list.get(i2);
                    Object obj6 = list2.get(i2);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f22724c = new long[0];
                        this.f22725d = new long[0];
                    } else {
                        this.f22724c[i2] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f22725d[i2] = ((Double) obj5).longValue();
                        i2++;
                    }
                }
                this.f22724c = new long[0];
                this.f22725d = new long[0];
            }
        }
        return false;
    }

    /* renamed from: c */
    public final long mo16143c() {
        return this.f22723b;
    }

    /* renamed from: d */
    public final long[] mo16144d() {
        return this.f22724c;
    }

    /* renamed from: e */
    public final long[] mo16145e() {
        return this.f22725d;
    }
}
