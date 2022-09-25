package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.p9357a;

import com.google.assistant.p3741aa.p3742a.p3743a.C48166n;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.g.a.b */
/* compiled from: PG */
public final /* synthetic */ class C124268b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124269c f343084a;

    /* renamed from: b */
    public final /* synthetic */ C48166n f343085b;

    /* renamed from: c */
    public final /* synthetic */ boolean f343086c;

    public /* synthetic */ C124268b(C124269c cVar, C48166n nVar, boolean z) {
        this.f343084a = cVar;
        this.f343085b = nVar;
        this.f343086c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r2 != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x023c A[LOOP:0: B:105:0x0236->B:107:0x023c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x021d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r10 = this;
            com.google.android.apps.search.assistant.platform.wholehome.a.b.g.a.c r0 = r10.f343084a
            com.google.assistant.aa.a.a.n r1 = r10.f343085b
            boolean r2 = r10.f343086c
            int r3 = r1.f124624a
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0249
            java.lang.String r3 = r1.f124625b
            java.util.Map r5 = r0.f343090d
            boolean r5 = r5.containsKey(r3)
            if (r5 != 0) goto L_0x0024
            java.util.Map r5 = r0.f343090d
            r6 = r2 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.put(r3, r6)
            if (r2 == 0) goto L_0x005e
            goto L_0x003e
        L_0x0024:
            if (r2 != 0) goto L_0x003e
            java.util.Map r2 = r0.f343090d
            java.lang.Object r2 = r2.get(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x005e
            java.util.Map r2 = r0.f343090d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r2.put(r3, r5)
            goto L_0x005e
        L_0x003e:
            java.util.Map r2 = r0.f343090d
            java.lang.Object r2 = r2.get(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x005e
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.p9357a.C124269c.f343087a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Ignoring CrossDeviceTrait, since other traits are supported."
            r2 = 36141(0x8d2d, float:5.0644E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0254
        L_0x005e:
            int r2 = r1.f124626c
            int r5 = com.google.assistant.p3741aa.p3742a.p3743a.C48165m.m85205a(r2)
            if (r5 != 0) goto L_0x0068
            goto L_0x021d
        L_0x0068:
            r6 = 2
            if (r5 != r6) goto L_0x021d
            java.util.Map r2 = r0.f343089c
            com.google.assistant.aa.a.a.j r5 = com.google.assistant.p3741aa.p3742a.p3743a.C48162j.f124614e
            java.lang.Object r2 = p3186j$.util.Map.EL.getOrDefault(r2, r3, r5)
            com.google.assistant.aa.a.a.j r2 = (com.google.assistant.p3741aa.p3742a.p3743a.C48162j) r2
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.aa.a.a.i r2 = (com.google.assistant.p3741aa.p3742a.p3743a.C48161i) r2
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.aa.a.a.j r5 = (com.google.assistant.p3741aa.p3742a.p3743a.C48162j) r5
            com.google.assistant.aa.a.a.b r5 = r5.f124618c
            if (r5 != 0) goto L_0x0085
            com.google.assistant.aa.a.a.b r5 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x0085:
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.assistant.aa.a.a.a r5 = (com.google.assistant.p3741aa.p3742a.p3743a.C48131a) r5
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.aa.a.a.j r7 = (com.google.assistant.p3741aa.p3742a.p3743a.C48162j) r7
            r3.getClass()
            int r8 = r7.f124616a
            r8 = r8 | r4
            r7.f124616a = r8
            r7.f124617b = r3
            com.google.assistant.e.j.rj r7 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.ri r7 = (com.google.assistant.p3897e.p3921j.C52427ri) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.assistant.e.j.rj r8 = (com.google.assistant.p3897e.p3921j.C52428rj) r8
            r3.getClass()
            int r9 = r8.f137560a
            r9 = r9 | 16
            r8.f137560a = r9
            r8.f137564e = r3
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.assistant.e.j.rj r8 = (com.google.assistant.p3897e.p3921j.C52428rj) r8
            r3.getClass()
            int r9 = r8.f137560a
            r9 = r9 | 512(0x200, float:7.175E-43)
            r8.f137560a = r9
            r8.f137568i = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r8 = r2.instance
            com.google.assistant.aa.a.a.j r8 = (com.google.assistant.p3741aa.p3742a.p3743a.C48162j) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.assistant.e.j.rj r7 = (com.google.assistant.p3897e.p3921j.C52428rj) r7
            r7.getClass()
            r8.f124619d = r7
            int r7 = r8.f124616a
            r7 = r7 | 4
            r8.f124616a = r7
            com.google.assistant.aa.a.a.b r7 = r1.f124627d
            if (r7 != 0) goto L_0x00e7
            com.google.assistant.aa.a.a.b r8 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
            goto L_0x00e8
        L_0x00e7:
            r8 = r7
        L_0x00e8:
            int r8 = r8.f124596a
            r8 = r8 & r6
            if (r8 == 0) goto L_0x0108
            if (r7 != 0) goto L_0x00f1
            com.google.assistant.aa.a.a.b r7 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x00f1:
            com.google.assistant.e.i.a.nm r7 = r7.f124598c
            if (r7 != 0) goto L_0x00f7
            com.google.assistant.e.i.a.nm r7 = com.google.assistant.p3897e.p3917i.p3918a.C51594nm.f134474f
        L_0x00f7:
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.aa.a.a.b r8 = (com.google.assistant.p3741aa.p3742a.p3743a.C48154b) r8
            r7.getClass()
            r8.f124598c = r7
            int r7 = r8.f124596a
            r7 = r7 | r6
            r8.f124596a = r7
        L_0x0108:
            com.google.assistant.aa.a.a.b r7 = r1.f124627d
            if (r7 != 0) goto L_0x010f
            com.google.assistant.aa.a.a.b r8 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
            goto L_0x0110
        L_0x010f:
            r8 = r7
        L_0x0110:
            int r8 = r8.f124596a
            r8 = r8 & r4
            if (r8 == 0) goto L_0x0130
            if (r7 != 0) goto L_0x0119
            com.google.assistant.aa.a.a.b r7 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x0119:
            com.google.assistant.e.i.a.l r7 = r7.f124597b
            if (r7 != 0) goto L_0x011f
            com.google.assistant.e.i.a.l r7 = com.google.assistant.p3897e.p3917i.p3918a.C51527l.f134273f
        L_0x011f:
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.aa.a.a.b r8 = (com.google.assistant.p3741aa.p3742a.p3743a.C48154b) r8
            r7.getClass()
            r8.f124597b = r7
            int r7 = r8.f124596a
            r4 = r4 | r7
            r8.f124596a = r4
        L_0x0130:
            com.google.assistant.aa.a.a.b r4 = r1.f124627d
            if (r4 != 0) goto L_0x0137
            com.google.assistant.aa.a.a.b r7 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
            goto L_0x0138
        L_0x0137:
            r7 = r4
        L_0x0138:
            int r7 = r7.f124596a
            r7 = r7 & 4
            if (r7 == 0) goto L_0x015a
            if (r4 != 0) goto L_0x0142
            com.google.assistant.aa.a.a.b r4 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x0142:
            com.google.assistant.e.i.a.id r4 = r4.f124599d
            if (r4 != 0) goto L_0x0148
            com.google.assistant.e.i.a.id r4 = com.google.assistant.p3897e.p3917i.p3918a.C51450id.f133992h
        L_0x0148:
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.aa.a.a.b r7 = (com.google.assistant.p3741aa.p3742a.p3743a.C48154b) r7
            r4.getClass()
            r7.f124599d = r4
            int r4 = r7.f124596a
            r4 = r4 | 4
            r7.f124596a = r4
        L_0x015a:
            com.google.assistant.aa.a.a.b r4 = r1.f124627d
            if (r4 != 0) goto L_0x0161
            com.google.assistant.aa.a.a.b r7 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
            goto L_0x0162
        L_0x0161:
            r7 = r4
        L_0x0162:
            int r7 = r7.f124596a
            r7 = r7 & 32
            if (r7 == 0) goto L_0x0184
            if (r4 != 0) goto L_0x016c
            com.google.assistant.aa.a.a.b r4 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x016c:
            com.google.assistant.e.i.a.bd r4 = r4.f124602g
            if (r4 != 0) goto L_0x0172
            com.google.assistant.e.i.a.bd r4 = com.google.assistant.p3897e.p3917i.p3918a.C51261bd.f133446d
        L_0x0172:
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.aa.a.a.b r7 = (com.google.assistant.p3741aa.p3742a.p3743a.C48154b) r7
            r4.getClass()
            r7.f124602g = r4
            int r4 = r7.f124596a
            r4 = r4 | 32
            r7.f124596a = r4
        L_0x0184:
            com.google.assistant.aa.a.a.b r4 = r1.f124627d
            if (r4 != 0) goto L_0x018b
            com.google.assistant.aa.a.a.b r7 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
            goto L_0x018c
        L_0x018b:
            r7 = r4
        L_0x018c:
            int r7 = r7.f124596a
            r7 = r7 & 8
            if (r7 == 0) goto L_0x01ae
            if (r4 != 0) goto L_0x0196
            com.google.assistant.aa.a.a.b r4 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x0196:
            com.google.assistant.e.j.pb r4 = r4.f124600e
            if (r4 != 0) goto L_0x019c
            com.google.assistant.e.j.pb r4 = com.google.assistant.p3897e.p3921j.C52366pb.f137417b
        L_0x019c:
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.aa.a.a.b r7 = (com.google.assistant.p3741aa.p3742a.p3743a.C48154b) r7
            r4.getClass()
            r7.f124600e = r4
            int r4 = r7.f124596a
            r4 = r4 | 8
            r7.f124596a = r4
        L_0x01ae:
            com.google.assistant.aa.a.a.b r4 = r1.f124627d
            if (r4 != 0) goto L_0x01b5
            com.google.assistant.aa.a.a.b r7 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
            goto L_0x01b6
        L_0x01b5:
            r7 = r4
        L_0x01b6:
            int r7 = r7.f124596a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x01d4
            if (r4 != 0) goto L_0x01c0
            com.google.assistant.aa.a.a.b r4 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x01c0:
            java.lang.String r4 = r4.f124601f
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.aa.a.a.b r7 = (com.google.assistant.p3741aa.p3742a.p3743a.C48154b) r7
            r4.getClass()
            int r8 = r7.f124596a
            r8 = r8 | 16
            r7.f124596a = r8
            r7.f124601f = r4
        L_0x01d4:
            com.google.assistant.aa.a.a.b r1 = r1.f124627d
            if (r1 != 0) goto L_0x01db
            com.google.assistant.aa.a.a.b r4 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
            goto L_0x01dc
        L_0x01db:
            r4 = r1
        L_0x01dc:
            int r4 = r4.f124596a
            r4 = r4 & 64
            if (r4 == 0) goto L_0x01fa
            if (r1 != 0) goto L_0x01e6
            com.google.assistant.aa.a.a.b r1 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x01e6:
            java.lang.String r1 = r1.f124603h
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.assistant.aa.a.a.b r4 = (com.google.assistant.p3741aa.p3742a.p3743a.C48154b) r4
            r1.getClass()
            int r7 = r4.f124596a
            r7 = r7 | 64
            r4.f124596a = r7
            r4.f124603h = r1
        L_0x01fa:
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.assistant.aa.a.a.j r1 = (com.google.assistant.p3741aa.p3742a.p3743a.C48162j) r1
            com.google.protobuf.bv r4 = r5.build()
            com.google.assistant.aa.a.a.b r4 = (com.google.assistant.p3741aa.p3742a.p3743a.C48154b) r4
            r4.getClass()
            r1.f124618c = r4
            int r4 = r1.f124616a
            r4 = r4 | r6
            r1.f124616a = r4
            java.util.Map r1 = r0.f343089c
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.aa.a.a.j r2 = (com.google.assistant.p3741aa.p3742a.p3743a.C48162j) r2
            r1.put(r3, r2)
            goto L_0x022c
        L_0x021d:
            int r1 = com.google.assistant.p3741aa.p3742a.p3743a.C48165m.m85205a(r2)
            if (r1 != 0) goto L_0x0224
            goto L_0x022c
        L_0x0224:
            r2 = 3
            if (r1 != r2) goto L_0x022c
            java.util.Map r1 = r0.f343089c
            r1.remove(r3)
        L_0x022c:
            com.google.assistant.aa.a.a.h r1 = r0.mo106357c()
            java.util.Set r0 = r0.f343091e
            java.util.Iterator r0 = r0.iterator()
        L_0x0236:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0246
            java.lang.Object r2 = r0.next()
            com.google.android.apps.search.assistant.platform.wholehome.a.b.g.a r2 = (com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.C124266a) r2
            r2.mo106342e(r1)
            goto L_0x0236
        L_0x0246:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0254
        L_0x0249:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Device id must be present."
            r0.<init>(r1)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
        L_0x0254:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9356g.p9357a.C124268b.mo18058a():com.google.common.util.concurrent.cx");
    }
}
