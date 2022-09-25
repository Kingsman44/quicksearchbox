package com.google.android.libraries.home.p1940a.p1943c.p1944a;

import com.google.android.libraries.home.p1940a.p1943c.C23570eq;

/* renamed from: com.google.android.libraries.home.a.c.a.al */
/* compiled from: PG */
public final class C23365al implements C23570eq {
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0118  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.libraries.home.p1940a.p1943c.C23571er mo28847a(com.google.android.libraries.home.p1940a.p1943c.C23553e r31, java.util.Map r32) {
        /*
            r30 = this;
            r0 = r31
            r1 = r32
            java.util.Map r2 = r0.f64463a
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0013:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "cameraIdentifier"
            java.lang.String r6 = "aspectRatio"
            java.lang.String r7 = "cameraStreamHistoricalSupportedProtocols"
            java.lang.String r8 = "cameraStreamSupportedProtocols"
            java.lang.String r9 = "cameraStreamNeedAuthToken"
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r10 = r4.getKey()
            java.lang.String r10 = (java.lang.String) r10
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r9)
            if (r9 != 0) goto L_0x004d
            boolean r8 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r8)
            if (r8 != 0) goto L_0x004d
            boolean r7 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r7)
            if (r7 != 0) goto L_0x004d
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r6)
            if (r6 != 0) goto L_0x004d
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r5)
            if (r5 == 0) goto L_0x0013
        L_0x004d:
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r3.put(r5, r4)
            goto L_0x0013
        L_0x0059:
            com.google.android.libraries.home.a.c.e r12 = new com.google.android.libraries.home.a.c.e
            r12.<init>(r3)
            com.google.android.libraries.home.a.c.a.am r2 = new com.google.android.libraries.home.a.c.a.am
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            j$.util.Optional r3 = r0.mo28920c(r9, r3)
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r3 = r3.orElse(r4)
            java.lang.String r4 = "attributes\n        .getV… )\n        .orElse(false)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            j$.util.Optional r4 = r0.mo28918a(r8, r4)
            h.a.am r8 = p5462h.p5463a.C69496am.f185918a
            java.lang.Object r4 = r4.orElse(r8)
            java.lang.String r8 = "attributes\n        .getL…        .orElse(listOf())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            j$.util.Optional r7 = r0.mo28918a(r7, r9)
            h.a.am r9 = p5462h.p5463a.C69496am.f185918a
            java.lang.Object r7 = r7.orElse(r9)
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            java.lang.Class<java.lang.Double> r7 = java.lang.Double.class
            j$.util.Optional r6 = r0.mo28919b(r6, r7)
            java.lang.Object r6 = com.google.android.libraries.home.p1955d.p1956a.C23765a.m44264a(r6)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L_0x00b1
            com.google.android.libraries.home.a.c.a.ak r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23364ak.f63893a
        L_0x00af:
            r10 = r6
            goto L_0x00ec
        L_0x00b1:
            java.lang.String r7 = "width"
            java.lang.Object r7 = r6.get(r7)
            java.lang.Double r7 = (java.lang.Double) r7
            java.lang.String r8 = "height"
            java.lang.Object r6 = r6.get(r8)
            java.lang.Double r6 = (java.lang.Double) r6
            if (r7 == 0) goto L_0x00e9
            if (r6 == 0) goto L_0x00e9
            double r10 = r7.doubleValue()
            r13 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 < 0) goto L_0x00e9
            double r10 = r6.doubleValue()
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 >= 0) goto L_0x00d8
            goto L_0x00e9
        L_0x00d8:
            com.google.android.libraries.home.a.c.a.ak r8 = new com.google.android.libraries.home.a.c.a.ak
            double r10 = r7.doubleValue()
            int r7 = (int) r10
            double r10 = r6.doubleValue()
            int r6 = (int) r10
            r8.<init>(r7, r6)
            r10 = r8
            goto L_0x00ec
        L_0x00e9:
            com.google.android.libraries.home.a.c.a.ak r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23364ak.f63893a
            goto L_0x00af
        L_0x00ec:
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            j$.util.Optional r0 = r0.mo28920c(r5, r6)
            java.lang.String r5 = ""
            java.lang.Object r0 = r0.orElse(r5)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r6 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            h.m.k r6 = new h.m.k
            java.lang.String r7 = "quartz.[0-9a-f]{32}"
            r6.<init>((java.lang.String) r7)
            boolean r6 = r6.mo61434b(r0)
            if (r6 == 0) goto L_0x0118
            r5 = 7
            java.lang.String r0 = r0.substring(r5)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)
            r11 = r0
            goto L_0x0119
        L_0x0118:
            r11 = r5
        L_0x0119:
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_NEST_UUID
            java.lang.Class<com.google.android.libraries.home.a.c.a.aq> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23370aq.class
            com.google.android.libraries.home.a.c.a.aq r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23370aq.f63923b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r13 = r0
            com.google.android.libraries.home.a.c.a.aq r13 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23370aq) r13
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_STREAM_RECEIVER_APP_ID
            java.lang.Class<com.google.android.libraries.home.a.c.a.ah> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23361ah.class
            com.google.android.libraries.home.a.c.a.ah r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23361ah.f63891b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r14 = r0
            com.google.android.libraries.home.a.c.a.ah r14 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23361ah) r14
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_STREAM_PROTOCOL
            java.lang.Class<com.google.android.libraries.home.a.c.a.af> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23359af.class
            com.google.android.libraries.home.a.c.a.af r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23359af.f63889b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r15 = r0
            com.google.android.libraries.home.a.c.a.af r15 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23359af) r15
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_STREAM_ACCESS_URL
            java.lang.Class<com.google.android.libraries.home.a.c.a.ao> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23368ao.class
            com.google.android.libraries.home.a.c.a.ao r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23368ao.f63921b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r16 = r0
            com.google.android.libraries.home.a.c.a.ao r16 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23368ao) r16
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_STREAM_AUTH_TOKEN
            java.lang.Class<com.google.android.libraries.home.a.c.a.u> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23392u.class
            com.google.android.libraries.home.a.c.a.u r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23392u.f63948b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r17 = r0
            com.google.android.libraries.home.a.c.a.u r17 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23392u) r17
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_STREAM_AUTH_TOKEN_TYPE
            java.lang.Class<com.google.android.libraries.home.a.c.a.x> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23395x.class
            com.google.android.libraries.home.a.c.a.x r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23395x.f63959b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r18 = r0
            com.google.android.libraries.home.a.c.a.x r18 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23395x) r18
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_STREAM_AUTH_TOKEN_EXPIRATION_SEC
            java.lang.Class<com.google.android.libraries.home.a.c.a.s> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23390s.class
            com.google.android.libraries.home.a.c.a.s r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23390s.f63946b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r19 = r0
            com.google.android.libraries.home.a.c.a.s r19 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23390s) r19
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_SIGNALING_URL
            java.lang.Class<com.google.android.libraries.home.a.c.a.q> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23388q.class
            com.google.android.libraries.home.a.c.a.q r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23388q.f63944b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r20 = r0
            com.google.android.libraries.home.a.c.a.q r20 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23388q) r20
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_STREAM_PLACEHOLDER_IMAGE
            java.lang.Class<com.google.android.libraries.home.a.c.a.ad> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23357ad.class
            com.google.android.libraries.home.a.c.a.ad r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23357ad.f63887c
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r21 = r0
            com.google.android.libraries.home.a.c.a.ad r21 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23357ad) r21
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_STREAM_LIVE_VIEW_IMAGE
            java.lang.Class<com.google.android.libraries.home.a.c.a.ab> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23355ab.class
            com.google.android.libraries.home.a.c.a.ab r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23355ab.f63885c
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r22 = r0
            com.google.android.libraries.home.a.c.a.ab r22 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23355ab) r22
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_OFFER
            java.lang.Class<com.google.android.libraries.home.a.c.a.o> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23386o.class
            com.google.android.libraries.home.a.c.a.o r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23386o.f63942b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r23 = r0
            com.google.android.libraries.home.a.c.a.o r23 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23386o) r23
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_ICE_SERVERS
            java.lang.Class<com.google.android.libraries.home.a.c.a.k> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23382k.class
            com.google.android.libraries.home.a.c.a.k r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23382k.f63938b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r24 = r0
            com.google.android.libraries.home.a.c.a.k r24 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23382k) r24
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_STREAM_HOST
            java.lang.Class<com.google.android.libraries.home.a.c.a.z> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23397z.class
            com.google.android.libraries.home.a.c.a.z r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23397z.f63961c
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r25 = r0
            com.google.android.libraries.home.a.c.a.z r25 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23397z) r25
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_NEXUS_HOST
            java.lang.Class<com.google.android.libraries.home.a.c.a.m> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23384m.class
            com.google.android.libraries.home.a.c.a.m r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23384m.f63940b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r26 = r0
            com.google.android.libraries.home.a.c.a.m r26 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23384m) r26
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_AUDIO_COMMUNICATION_TYPE
            java.lang.Class<com.google.android.libraries.home.a.c.a.b> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23373b.class
            com.google.android.libraries.home.a.c.a.b r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23373b.f63926b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r27 = r0
            com.google.android.libraries.home.a.c.a.b r27 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23373b) r27
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CLIENT_CONTEXT_TOKEN
            java.lang.Class<com.google.android.libraries.home.a.c.a.d> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23375d.class
            com.google.android.libraries.home.a.c.a.d r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23375d.f63928b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r28 = r0
            com.google.android.libraries.home.a.c.a.d r28 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23375d) r28
            com.google.android.libraries.home.a.c.dp r0 = com.google.android.libraries.home.p1940a.p1943c.C23542dp.CAMERA_CLOUD_BACKEND
            java.lang.Class<com.google.android.libraries.home.a.c.a.i> r5 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23380i.class
            com.google.android.libraries.home.a.c.a.i r6 = com.google.android.libraries.home.p1940a.p1943c.p1944a.C23380i.f63936b
            com.google.android.libraries.home.a.c.dr r0 = com.google.android.libraries.home.p1940a.p1943c.C23569ep.m43989a(r1, r0, r5, r6)
            r29 = r0
            com.google.android.libraries.home.a.c.a.i r29 = (com.google.android.libraries.home.p1940a.p1943c.p1944a.C23380i) r29
            r6 = r2
            r7 = r3
            r8 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.p1940a.p1943c.p1944a.C23365al.mo28847a(com.google.android.libraries.home.a.c.e, java.util.Map):com.google.android.libraries.home.a.c.er");
    }
}
