package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9262b;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.c.b.b */
/* compiled from: PG */
public final class C122117b {

    /* renamed from: a */
    private final C122561k f338771a;

    public C122117b(C122561k kVar) {
        this.f338771a = kVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d2, code lost:
        if (r0.equals("media") != false) goto L_0x00ea;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo105538a(com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122119d r14, com.google.protobuf.MessageLite r15) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.k r1 = r13.f338771a
            com.google.android.apps.search.assistant.platform.ondevice.a.a.h r15 = r14.mo105534a(r15)
            boolean r2 = r1.f339696a
            if (r2 == 0) goto L_0x0026
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.e.d r15 = r1.f339698c
            com.google.common.f.c r15 = r15.mo105764c()
            r0 = 34919(0x8867, float:4.8932E-41)
            com.google.common.f.x r15 = r15.mo56372aa(r0)
            com.google.common.f.c r15 = (com.google.common.p4526f.C59052c) r15
            java.lang.String r0 = "Not fetching client context because cancelled."
            r15.mo56386p(r0)
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60856cj.m92898g()
            goto L_0x01ca
        L_0x0026:
            java.lang.String r2 = "ContextRequest"
            r3 = 0
            r4 = 2
            r5 = 1
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0078 }
            r6.<init>()     // Catch:{ JSONException -> 0x0078 }
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r7 = r15.f338747b     // Catch:{ JSONException -> 0x0078 }
            if (r7 != 0) goto L_0x0036
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r7 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o.f338758c     // Catch:{ JSONException -> 0x0078 }
        L_0x0036:
            int r7 = r7.f338760a     // Catch:{ JSONException -> 0x0078 }
            if (r7 != r5) goto L_0x0050
            java.lang.String r7 = "param"
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r8 = r15.f338747b     // Catch:{ JSONException -> 0x0078 }
            if (r8 != 0) goto L_0x0042
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r8 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o.f338758c     // Catch:{ JSONException -> 0x0078 }
        L_0x0042:
            int r9 = r8.f338760a     // Catch:{ JSONException -> 0x0078 }
            if (r9 != r5) goto L_0x004b
            java.lang.Object r8 = r8.f338761b     // Catch:{ JSONException -> 0x0078 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ JSONException -> 0x0078 }
            goto L_0x004c
        L_0x004b:
            r8 = r0
        L_0x004c:
            r6.put(r7, r8)     // Catch:{ JSONException -> 0x0078 }
            goto L_0x0073
        L_0x0050:
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r7 = r15.f338747b     // Catch:{ JSONException -> 0x0078 }
            if (r7 != 0) goto L_0x0057
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r8 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o.f338758c     // Catch:{ JSONException -> 0x0078 }
            goto L_0x0058
        L_0x0057:
            r8 = r7
        L_0x0058:
            int r8 = r8.f338760a     // Catch:{ JSONException -> 0x0078 }
            if (r8 != r4) goto L_0x0073
            java.lang.String r8 = "generic"
            if (r7 != 0) goto L_0x0062
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r7 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o.f338758c     // Catch:{ JSONException -> 0x0078 }
        L_0x0062:
            int r9 = r7.f338760a     // Catch:{ JSONException -> 0x0078 }
            if (r9 != r4) goto L_0x006f
            java.lang.Object r7 = r7.f338761b     // Catch:{ JSONException -> 0x0078 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ JSONException -> 0x0078 }
            int r7 = r7.intValue()     // Catch:{ JSONException -> 0x0078 }
            goto L_0x0070
        L_0x006f:
            r7 = 0
        L_0x0070:
            r6.put(r8, r7)     // Catch:{ JSONException -> 0x0078 }
        L_0x0073:
            java.lang.String r2 = com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122865j.m202184a(r6, r2)     // Catch:{ JSONException -> 0x0078 }
            goto L_0x0079
        L_0x0078:
        L_0x0079:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.e.d r6 = r1.f339698c
            com.google.common.f.c r6 = r6.mo105764c()
            r7 = 34918(0x8866, float:4.893E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r7)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            java.lang.String r7 = "Fetching client context %s"
            r6.mo56389s(r7, r2)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.av r6 = r1.f339699d
            int r7 = r15.f338746a
            r7 = r7 & r5
            r8 = 10002(0x2712, float:1.4016E-41)
            r9 = 4
            if (r7 == 0) goto L_0x014b
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r7 = r15.f338747b
            if (r7 != 0) goto L_0x009d
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r7 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o.f338758c
        L_0x009d:
            int r7 = r7.f338760a
            if (r7 != r5) goto L_0x0106
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r7 = r15.f338747b
            if (r7 != 0) goto L_0x00a7
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r7 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o.f338758c
        L_0x00a7:
            int r8 = r7.f338760a
            if (r8 != r5) goto L_0x00af
            java.lang.Object r0 = r7.f338761b
            java.lang.String r0 = (java.lang.String) r0
        L_0x00af:
            int r7 = r0.hashCode()
            r8 = 3
            switch(r7) {
                case 3045982: goto L_0x00df;
                case 92895825: goto L_0x00d5;
                case 103772132: goto L_0x00cc;
                case 110364485: goto L_0x00c2;
                case 1651731981: goto L_0x00b8;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            goto L_0x00e9
        L_0x00b8:
            java.lang.String r3 = "stopwatch"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e9
            r3 = 3
            goto L_0x00ea
        L_0x00c2:
            java.lang.String r3 = "timer"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e9
            r3 = 2
            goto L_0x00ea
        L_0x00cc:
            java.lang.String r7 = "media"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00d5:
            java.lang.String r3 = "alarm"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e9
            r3 = 1
            goto L_0x00ea
        L_0x00df:
            java.lang.String r3 = "call"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e9
            r3 = 4
            goto L_0x00ea
        L_0x00e9:
            r3 = -1
        L_0x00ea:
            if (r3 == 0) goto L_0x0103
            if (r3 == r5) goto L_0x0100
            if (r3 == r4) goto L_0x00fd
            if (r3 == r8) goto L_0x00fa
            if (r3 == r9) goto L_0x00f7
            r8 = 10102(0x2776, float:1.4156E-41)
            goto L_0x014b
        L_0x00f7:
            r8 = 10107(0x277b, float:1.4163E-41)
            goto L_0x014b
        L_0x00fa:
            r8 = 10106(0x277a, float:1.4162E-41)
            goto L_0x014b
        L_0x00fd:
            r8 = 10105(0x2779, float:1.416E-41)
            goto L_0x014b
        L_0x0100:
            r8 = 10104(0x2778, float:1.4159E-41)
            goto L_0x014b
        L_0x0103:
            r8 = 10103(0x2777, float:1.4157E-41)
            goto L_0x014b
        L_0x0106:
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r0 = r15.f338747b
            if (r0 != 0) goto L_0x010d
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r3 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o.f338758c
            goto L_0x010e
        L_0x010d:
            r3 = r0
        L_0x010e:
            int r3 = r3.f338760a
            if (r3 != r4) goto L_0x014b
            if (r0 != 0) goto L_0x0116
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r0 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o.f338758c
        L_0x0116:
            int r3 = r0.f338760a
            r8 = 10202(0x27da, float:1.4296E-41)
            if (r3 != r4) goto L_0x014b
            java.lang.Object r0 = r0.f338761b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3 = 372913119(0x163a33df, float:1.5041328E-25)
            if (r0 == r3) goto L_0x0149
            r3 = 397886532(0x17b74444, float:1.184333E-24)
            if (r0 == r3) goto L_0x0146
            r3 = 403298683(0x1809d97b, float:1.7816635E-24)
            if (r0 == r3) goto L_0x0143
            switch(r0) {
                case 372913121: goto L_0x0140;
                case 372913122: goto L_0x013d;
                case 372913123: goto L_0x013a;
                case 372913124: goto L_0x0137;
                default: goto L_0x0136;
            }
        L_0x0136:
            goto L_0x014b
        L_0x0137:
            r8 = 10207(0x27df, float:1.4303E-41)
            goto L_0x014b
        L_0x013a:
            r8 = 10206(0x27de, float:1.4302E-41)
            goto L_0x014b
        L_0x013d:
            r8 = 10205(0x27dd, float:1.43E-41)
            goto L_0x014b
        L_0x0140:
            r8 = 10204(0x27dc, float:1.4299E-41)
            goto L_0x014b
        L_0x0143:
            r8 = 10209(0x27e1, float:1.4306E-41)
            goto L_0x014b
        L_0x0146:
            r8 = 10208(0x27e0, float:1.4304E-41)
            goto L_0x014b
        L_0x0149:
            r8 = 10203(0x27db, float:1.4297E-41)
        L_0x014b:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.m r0 = r1.f339701f
            int r3 = r1.f339700e
            com.google.android.apps.search.assistant.platform.ondevice.a.a.b r7 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b.f338729e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.search.assistant.platform.ondevice.a.a.a r7 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122092a) r7
            java.util.concurrent.atomic.AtomicLong r10 = r0.f339708e
            long r10 = r10.incrementAndGet()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r7.copyOnWrite()
            com.google.protobuf.bv r11 = r7.instance
            com.google.android.apps.search.assistant.platform.ondevice.a.a.b r11 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b) r11
            r10.getClass()
            int r12 = r11.f338731a
            r5 = r5 | r12
            r11.f338731a = r5
            r11.f338732b = r10
            r7.copyOnWrite()
            com.google.protobuf.bv r5 = r7.instance
            com.google.android.apps.search.assistant.platform.ondevice.a.a.b r5 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b) r5
            int r10 = r5.f338731a
            r4 = r4 | r10
            r5.f338731a = r4
            r5.f338733c = r3
            r7.copyOnWrite()
            com.google.protobuf.bv r3 = r7.instance
            com.google.android.apps.search.assistant.platform.ondevice.a.a.b r3 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b) r3
            r15.getClass()
            r3.f338734d = r15
            int r4 = r3.f338731a
            r4 = r4 | r9
            r3.f338731a = r4
            com.google.protobuf.bv r3 = r7.build()
            com.google.android.apps.search.assistant.platform.ondevice.a.a.b r3 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b) r3
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.e r4 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.e
            r4.<init>(r0, r3)
            java.util.concurrent.Executor r0 = r0.f339709f
            com.google.common.util.concurrent.r r3 = com.google.apps.tiktok.tracing.C47810es.m84965e(r4)
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92905n(r3, r0)
            com.google.apps.tiktok.tracing.contrib.b.f r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r0)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.e.d r3 = r1.f339698c
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.i r4 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.i
            r4.<init>(r3, r2)
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r0 = r0.mo51515h(r4, r3)
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.e.d r3 = r1.f339698c
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.j r4 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.a.j
            r4.<init>(r1, r3, r2, r15)
            java.lang.Class<java.lang.Throwable> r15 = java.lang.Throwable.class
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r15 = r0.mo51514f(r15, r4, r1)
            com.google.common.util.concurrent.cx r15 = r6.mo105821d(r8, r15)
        L_0x01ca:
            com.google.android.apps.search.assistant.platform.ondevice.a.c.b.a r0 = new com.google.android.apps.search.assistant.platform.ondevice.a.c.b.a
            r0.<init>(r14)
            com.google.common.util.concurrent.bg r14 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.s r0 = com.google.apps.tiktok.tracing.C47810es.m84966f(r0)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60922j.m93045h(r15, r0, r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9262b.C122117b.mo105538a(com.google.android.apps.search.assistant.platform.ondevice.a.c.d, com.google.protobuf.MessageLite):com.google.common.util.concurrent.cx");
    }
}
