package com.google.android.apps.search.googleapp.search.suggest.p10443a;

import com.google.common.base.C58817ah;
import com.google.p4017at.p4060h.p4073d.p4074a.C54231at;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.av */
/* compiled from: PG */
public final /* synthetic */ class C137936av implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C54231at f375276a;

    public /* synthetic */ C137936av(C54231at atVar) {
        this.f375276a = atVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r11 != com.google.android.apps.search.googleapp.search.suggest.C138034az.COMPLETE_SERVER) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r9 == com.google.android.apps.search.googleapp.search.suggest.C138034az.ICING) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        r9 = com.google.android.apps.search.googleapp.search.suggest.C138034az.m224336a(r7.f375545i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r9 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r9 = com.google.android.apps.search.googleapp.search.suggest.C138034az.NONE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r9 != com.google.android.apps.search.googleapp.search.suggest.C138034az.COMPLETE_SERVER) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            com.google.at.h.d.a.at r1 = r0.f375276a
            r2 = r17
            java.util.List r2 = (java.util.List) r2
            r2.size()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            int r4 = r2.size()
            boolean[] r4 = new boolean[r4]
            r6 = 0
        L_0x0017:
            int r7 = r2.size()
            if (r6 >= r7) goto L_0x010d
            java.lang.Object r7 = r2.get(r6)
            com.google.android.apps.search.googleapp.search.suggest.av r7 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r7
            java.lang.String r8 = r7.f375544h
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            r10 = -1
            if (r9 != 0) goto L_0x008a
            boolean r9 = r3.containsKey(r8)
            if (r9 == 0) goto L_0x008a
            java.lang.Object r9 = r3.get(r8)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r10 = r9.intValue()
            java.lang.Object r9 = r2.get(r10)
            com.google.android.apps.search.googleapp.search.suggest.av r9 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r9
            int r11 = r9.f375545i
            com.google.android.apps.search.googleapp.search.suggest.az r11 = com.google.android.apps.search.googleapp.search.suggest.C138034az.m224336a(r11)
            if (r11 != 0) goto L_0x004c
            com.google.android.apps.search.googleapp.search.suggest.az r11 = com.google.android.apps.search.googleapp.search.suggest.C138034az.NONE
        L_0x004c:
            com.google.android.apps.search.googleapp.search.suggest.az r12 = com.google.android.apps.search.googleapp.search.suggest.C138034az.ICING
            if (r11 != r12) goto L_0x005e
            int r11 = r7.f375545i
            com.google.android.apps.search.googleapp.search.suggest.az r11 = com.google.android.apps.search.googleapp.search.suggest.C138034az.m224336a(r11)
            if (r11 != 0) goto L_0x005a
            com.google.android.apps.search.googleapp.search.suggest.az r11 = com.google.android.apps.search.googleapp.search.suggest.C138034az.NONE
        L_0x005a:
            com.google.android.apps.search.googleapp.search.suggest.az r12 = com.google.android.apps.search.googleapp.search.suggest.C138034az.COMPLETE_SERVER
            if (r11 == r12) goto L_0x007a
        L_0x005e:
            int r9 = r9.f375545i
            com.google.android.apps.search.googleapp.search.suggest.az r9 = com.google.android.apps.search.googleapp.search.suggest.C138034az.m224336a(r9)
            if (r9 != 0) goto L_0x0068
            com.google.android.apps.search.googleapp.search.suggest.az r9 = com.google.android.apps.search.googleapp.search.suggest.C138034az.NONE
        L_0x0068:
            com.google.android.apps.search.googleapp.search.suggest.az r11 = com.google.android.apps.search.googleapp.search.suggest.C138034az.COMPLETE_SERVER
            if (r9 != r11) goto L_0x0089
            int r9 = r7.f375545i
            com.google.android.apps.search.googleapp.search.suggest.az r9 = com.google.android.apps.search.googleapp.search.suggest.C138034az.m224336a(r9)
            if (r9 != 0) goto L_0x0076
            com.google.android.apps.search.googleapp.search.suggest.az r9 = com.google.android.apps.search.googleapp.search.suggest.C138034az.NONE
        L_0x0076:
            com.google.android.apps.search.googleapp.search.suggest.az r11 = com.google.android.apps.search.googleapp.search.suggest.C138034az.ICING
            if (r9 != r11) goto L_0x0089
        L_0x007a:
            int r9 = r7.f375545i
            com.google.android.apps.search.googleapp.search.suggest.az r9 = com.google.android.apps.search.googleapp.search.suggest.C138034az.m224336a(r9)
            if (r9 != 0) goto L_0x0084
            com.google.android.apps.search.googleapp.search.suggest.az r9 = com.google.android.apps.search.googleapp.search.suggest.C138034az.NONE
        L_0x0084:
            com.google.android.apps.search.googleapp.search.suggest.az r11 = com.google.android.apps.search.googleapp.search.suggest.C138034az.COMPLETE_SERVER
            if (r9 != r11) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r10 = r6
        L_0x008a:
            r9 = 1
            if (r10 < 0) goto L_0x008f
            if (r10 == r6) goto L_0x00f6
        L_0x008f:
            com.google.protobuf.cq r11 = r1.f142372l
            boolean r12 = r11.isEmpty()
            if (r12 != 0) goto L_0x00f6
            com.google.protobuf.cj r12 = new com.google.protobuf.cj
            com.google.protobuf.ch r13 = r7.f375542e
            com.google.protobuf.ci r14 = com.google.android.apps.search.googleapp.search.suggest.C138030av.f375535f
            r12.<init>(r13, r14)
            j$.util.stream.Stream r12 = p3186j$.util.Collection.EL.stream(r12)
            com.google.android.apps.search.googleapp.search.suggest.a.as r13 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C137933as.f375273a
            j$.util.stream.Stream r12 = r12.map(r13)
            com.google.android.apps.search.googleapp.search.suggest.a.at r13 = com.google.android.apps.search.googleapp.search.suggest.p10443a.C137934at.f375274a
            j$.util.stream.Collector r13 = p3186j$.util.stream.Collectors.toCollection(r13)
            java.lang.Object r12 = r12.collect(r13)
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r11 = r11.iterator()
        L_0x00ba:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00f6
            java.lang.Object r13 = r11.next()
            com.google.at.h.d.a.av r13 = (com.google.p4017at.p4060h.p4073d.p4074a.C54233av) r13
            int r14 = r13.f142383a
            r14 = r14 & r9
            com.google.protobuf.ch r15 = r13.f142385c
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x00d3
            r15 = 1
            goto L_0x00d4
        L_0x00d3:
            r15 = 0
        L_0x00d4:
            if (r14 != 0) goto L_0x00d9
            if (r15 == 0) goto L_0x00ba
            r15 = 1
        L_0x00d9:
            if (r14 == 0) goto L_0x00eb
            int r14 = r13.f142384b
            int r5 = r7.f375541d
            com.google.android.apps.search.googleapp.search.suggest.au r5 = com.google.android.apps.search.googleapp.search.suggest.C138029au.m224331a(r5)
            if (r5 != 0) goto L_0x00e7
            com.google.android.apps.search.googleapp.search.suggest.au r5 = com.google.android.apps.search.googleapp.search.suggest.C138029au.QUERY
        L_0x00e7:
            int r5 = r5.f375534n
            if (r14 != r5) goto L_0x00ba
        L_0x00eb:
            if (r15 == 0) goto L_0x00f5
            com.google.protobuf.ch r5 = r13.f142385c
            boolean r5 = r12.containsAll(r5)
            if (r5 == 0) goto L_0x00ba
        L_0x00f5:
            r10 = r6
        L_0x00f6:
            if (r10 == r6) goto L_0x0105
            boolean r5 = com.google.common.base.C58837ba.m90859h(r8)
            if (r5 != 0) goto L_0x0105
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r3.put(r8, r5)
        L_0x0105:
            if (r10 < 0) goto L_0x0109
            r4[r10] = r9
        L_0x0109:
            int r6 = r6 + 1
            goto L_0x0017
        L_0x010d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = 0
        L_0x0113:
            int r3 = r2.size()
            if (r5 >= r3) goto L_0x0129
            boolean r3 = r4[r5]
            if (r3 != 0) goto L_0x0126
            java.lang.Object r3 = r2.get(r5)
            com.google.android.apps.search.googleapp.search.suggest.av r3 = (com.google.android.apps.search.googleapp.search.suggest.C138030av) r3
            r1.add(r3)
        L_0x0126:
            int r5 = r5 + 1
            goto L_0x0113
        L_0x0129:
            r1.size()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.p10443a.C137936av.apply(java.lang.Object):java.lang.Object");
    }
}
