package com.google.android.apps.gsa.search.core.p6805i;

import java.util.List;
import java.util.Map;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.search.core.i.u */
/* compiled from: PG */
public final /* synthetic */ class C86125u implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ List f232780a;

    /* renamed from: b */
    public final /* synthetic */ Map f232781b;

    /* renamed from: c */
    public final /* synthetic */ Map f232782c;

    public /* synthetic */ C86125u(List list, Map map, Map map2) {
        this.f232780a = list;
        this.f232781b = map;
        this.f232782c = map2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (((java.lang.Boolean) r1.f232753c).booleanValue() == (r5.f232752b == 2 ? ((java.lang.Boolean) r5.f232753c).booleanValue() : false)) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        if (((java.lang.Long) r1.f232753c).longValue() == (r5.f232752b == 4 ? ((java.lang.Long) r5.f232753c).longValue() : 0)) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b7, code lost:
        if (((java.lang.String) r1.f232753c).equals(r5.f232752b == 3 ? (java.lang.String) r5.f232753c : com.evernote.android.state.BuildConfig.FLAVOR) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d1, code lost:
        if (r6.equals(r7) != false) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get() {
        /*
            r11 = this;
            java.util.List r0 = r11.f232780a
            java.util.Map r1 = r11.f232781b
            java.util.Map r2 = r11.f232782c
            com.google.common.b.ih r3 = new com.google.common.b.ih
            r3.<init>()
            com.google.common.b.ih r4 = new com.google.common.b.ih
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0036
            java.lang.Object r5 = r0.next()
            com.google.android.apps.gsa.search.core.i.i r5 = (com.google.android.apps.gsa.search.core.p6805i.C86113i) r5
            int r6 = r5.f232755e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r1.containsKey(r6)
            if (r6 != 0) goto L_0x0014
            int r5 = r5.f232755e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.mo55373c(r5)
            goto L_0x0014
        L_0x0036:
            java.util.Collection r0 = r1.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x003e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00fe
            java.lang.Object r1 = r0.next()
            com.google.android.apps.gsa.search.core.i.i r1 = (com.google.android.apps.gsa.search.core.p6805i.C86113i) r1
            int r5 = r1.f232755e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r2.get(r5)
            com.google.android.apps.gsa.search.core.i.i r5 = (com.google.android.apps.gsa.search.core.p6805i.C86113i) r5
            if (r5 != 0) goto L_0x0062
            int r1 = r1.f232755e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.mo55373c(r1)
            goto L_0x003e
        L_0x0062:
            int r6 = r1.f232752b
            r7 = 2
            if (r6 != r7) goto L_0x007f
            java.lang.Object r6 = r1.f232753c
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            int r8 = r5.f232752b
            if (r8 != r7) goto L_0x007c
            java.lang.Object r7 = r5.f232753c
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L_0x007d
        L_0x007c:
            r7 = 0
        L_0x007d:
            if (r6 != r7) goto L_0x00f3
        L_0x007f:
            int r6 = r1.f232752b
            r7 = 4
            if (r6 != r7) goto L_0x009f
            java.lang.Object r6 = r1.f232753c
            java.lang.Long r6 = (java.lang.Long) r6
            long r8 = r6.longValue()
            int r6 = r5.f232752b
            if (r6 != r7) goto L_0x0099
            java.lang.Object r6 = r5.f232753c
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            goto L_0x009b
        L_0x0099:
            r6 = 0
        L_0x009b:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x00f3
        L_0x009f:
            int r6 = r1.f232752b
            r7 = 3
            if (r6 != r7) goto L_0x00b9
            java.lang.Object r6 = r1.f232753c
            java.lang.String r6 = (java.lang.String) r6
            int r8 = r5.f232752b
            if (r8 != r7) goto L_0x00b1
            java.lang.Object r7 = r5.f232753c
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00b3
        L_0x00b1:
            java.lang.String r7 = ""
        L_0x00b3:
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00f3
        L_0x00b9:
            int r6 = r1.f232752b
            r7 = 6
            if (r6 != r7) goto L_0x00d3
            java.lang.Object r6 = r1.f232753c
            com.google.protobuf.z r6 = (com.google.protobuf.C63088z) r6
            int r8 = r5.f232752b
            if (r8 != r7) goto L_0x00cb
            java.lang.Object r7 = r5.f232753c
            com.google.protobuf.z r7 = (com.google.protobuf.C63088z) r7
            goto L_0x00cd
        L_0x00cb:
            com.google.protobuf.z r7 = com.google.protobuf.C63088z.f170246b
        L_0x00cd:
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00f3
        L_0x00d3:
            int r6 = r1.f232752b
            r7 = 7
            if (r6 != r7) goto L_0x003e
            java.lang.Object r6 = r1.f232753c
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            int r6 = r5.f232752b
            if (r6 != r7) goto L_0x00ed
            java.lang.Object r5 = r5.f232753c
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            goto L_0x00ef
        L_0x00ed:
            r5 = 0
        L_0x00ef:
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x003e
        L_0x00f3:
            int r1 = r1.f232755e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.mo55373c(r1)
            goto L_0x003e
        L_0x00fe:
            com.google.android.apps.gsa.search.core.i.m r0 = new com.google.android.apps.gsa.search.core.i.m
            com.google.common.b.ij r1 = r3.mo55486f()
            com.google.common.b.ij r2 = r4.mo55486f()
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6805i.C86125u.get():java.lang.Object");
    }
}
