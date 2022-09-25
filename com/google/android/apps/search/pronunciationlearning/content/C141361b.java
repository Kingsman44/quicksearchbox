package com.google.android.apps.search.pronunciationlearning.content;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.pronunciationlearning.content.b */
/* compiled from: PG */
public final /* synthetic */ class C141361b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C141366g f383757a;

    /* renamed from: b */
    public final /* synthetic */ String f383758b;

    public /* synthetic */ C141361b(C141366g gVar, String str) {
        this.f383757a = gVar;
        this.f383758b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.apps.search.pronunciationlearning.content.g r0 = r10.f383757a
            java.lang.String r1 = r10.f383758b
            com.google.android.apps.search.pronunciationlearning.content.m r11 = (com.google.android.apps.search.pronunciationlearning.content.C141372m) r11
            com.google.android.apps.search.pronunciationlearning.content.i r2 = com.google.android.apps.search.pronunciationlearning.content.C141368i.f383770b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.pronunciationlearning.content.h r2 = (com.google.android.apps.search.pronunciationlearning.content.C141367h) r2
            com.google.common.b.gu r3 = com.google.android.apps.search.pronunciationlearning.content.C141374o.f383781a
            com.google.common.b.pq r3 = (com.google.common.p4522b.C58724pq) r3
            int r3 = r3.f156474d
            if (r11 == 0) goto L_0x003b
            com.google.protobuf.cq r4 = r11.f383780a
            int r4 = r4.size()
            if (r4 < r3) goto L_0x003b
            com.google.android.apps.search.pronunciationlearning.b.c r11 = r0.f383769d
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2882j.C37200a.f98707q
            com.google.protobuf.bt r5 = com.google.common.p4552o.aqf.f159732l
            r6 = 0
            com.google.common.o.aqf r6 = r11.mo116361a(r6, r6)
            com.google.android.libraries.search.b.i.a r4 = r4.mo40812e(r5, r6)
            r11.mo116362b(r4)
            com.google.android.apps.search.pronunciationlearning.content.m r11 = com.google.android.apps.search.pronunciationlearning.content.C141372m.f383778b
            com.google.android.libraries.storage.protostore.ab r4 = r0.f383767b
            com.google.android.apps.search.pronunciationlearning.content.c r5 = com.google.android.apps.search.pronunciationlearning.content.C141362c.f383759a
            com.google.common.util.concurrent.da r0 = r0.f383768c
            r4.mo46039a(r5, r0)
        L_0x003b:
            r0 = 0
            r4 = 1
            if (r1 != 0) goto L_0x0042
            com.google.common.b.gu r1 = com.google.android.apps.search.pronunciationlearning.content.C141374o.f383781a
            goto L_0x0074
        L_0x0042:
            java.lang.String r1 = com.google.common.base.C58890d.m90988c(r1)
            int r5 = r1.hashCode()
            r6 = 3246(0xcae, float:4.549E-42)
            if (r5 == r6) goto L_0x005d
            r6 = 3329(0xd01, float:4.665E-42)
            if (r5 == r6) goto L_0x0053
            goto L_0x0067
        L_0x0053:
            java.lang.String r5 = "hi"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x005d:
            java.lang.String r5 = "es"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0067
            r1 = 0
            goto L_0x0068
        L_0x0067:
            r1 = -1
        L_0x0068:
            if (r1 == 0) goto L_0x0072
            if (r1 == r4) goto L_0x006f
            com.google.common.b.gu r1 = com.google.android.apps.search.pronunciationlearning.content.C141374o.f383781a
            goto L_0x0074
        L_0x006f:
            com.google.common.b.gu r1 = com.google.android.apps.search.pronunciationlearning.content.C141374o.f383783c
            goto L_0x0074
        L_0x0072:
            com.google.common.b.gu r1 = com.google.android.apps.search.pronunciationlearning.content.C141374o.f383782b
        L_0x0074:
            r5 = r1
            com.google.common.b.pq r5 = (com.google.common.p4522b.C58724pq) r5
            int r5 = r5.f156474d
            if (r5 != r3) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            com.google.common.base.C58838bb.m90883r(r5)
            r5 = 0
        L_0x0082:
            if (r0 >= r3) goto L_0x00e7
            r6 = 3
            if (r5 >= r6) goto L_0x00e7
            com.google.common.b.gu r6 = com.google.android.apps.search.pronunciationlearning.content.C141374o.f383781a
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r11 == 0) goto L_0x0099
            com.google.protobuf.cq r7 = r11.f383780a
            boolean r7 = r7.contains(r6)
            if (r7 != 0) goto L_0x00e4
        L_0x0099:
            com.google.android.apps.search.pronunciationlearning.content.k r7 = com.google.android.apps.search.pronunciationlearning.content.C141370k.f383773d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.search.pronunciationlearning.content.j r7 = (com.google.android.apps.search.pronunciationlearning.content.C141369j) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.search.pronunciationlearning.content.k r8 = (com.google.android.apps.search.pronunciationlearning.content.C141370k) r8
            r6.getClass()
            int r9 = r8.f383775a
            r9 = r9 | r4
            r8.f383775a = r9
            r8.f383776b = r6
            java.lang.Object r6 = r1.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.search.pronunciationlearning.content.k r8 = (com.google.android.apps.search.pronunciationlearning.content.C141370k) r8
            r6.getClass()
            int r9 = r8.f383775a
            r9 = r9 | 2
            r8.f383775a = r9
            r8.f383777c = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.apps.search.pronunciationlearning.content.i r6 = (com.google.android.apps.search.pronunciationlearning.content.C141368i) r6
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.apps.search.pronunciationlearning.content.k r7 = (com.google.android.apps.search.pronunciationlearning.content.C141370k) r7
            r7.getClass()
            r6.mo116390a()
            com.google.protobuf.cq r6 = r6.f383772a
            r6.add(r7)
            int r5 = r5 + 1
        L_0x00e4:
            int r0 = r0 + 1
            goto L_0x0082
        L_0x00e7:
            com.google.protobuf.bv r11 = r2.build()
            com.google.android.apps.search.pronunciationlearning.content.i r11 = (com.google.android.apps.search.pronunciationlearning.content.C141368i) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.pronunciationlearning.content.C141361b.apply(java.lang.Object):java.lang.Object");
    }
}
