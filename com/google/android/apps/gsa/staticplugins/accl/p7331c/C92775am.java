package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.search.core.p6491a.C84350ai;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.accl.p7331c.p7333b.C92790a;
import com.google.android.apps.gsa.staticplugins.p8025l.C102643m;
import com.google.android.libraries.gsa.conversation.p1852f.C22580g;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.am */
/* compiled from: PG */
public final class C92775am implements C22580g {

    /* renamed from: a */
    final C92797f f258899a;

    /* renamed from: b */
    private final C68214a f258900b;

    /* renamed from: c */
    private final int f258901c;

    /* renamed from: d */
    private final C92804m f258902d;

    /* renamed from: e */
    private final C84350ai f258903e;

    /* renamed from: f */
    private final C89859i f258904f;

    /* renamed from: g */
    private final C92790a f258905g;

    /* renamed from: h */
    private final C58833ax f258906h;

    /* renamed from: i */
    private final C102643m f258907i;

    public C92775am(C68214a aVar, int i, C102643m mVar, C92804m mVar2, C92797f fVar, C84350ai aiVar, C89859i iVar, C92790a aVar2, C58833ax axVar) {
        this.f258900b = aVar;
        this.f258901c = i;
        this.f258907i = mVar;
        this.f258902d = mVar2;
        this.f258899a = fVar;
        this.f258903e = aiVar;
        this.f258904f = iVar;
        this.f258905g = aVar2;
        this.f258906h = axVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0292 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0213  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.gsa.conversation.p1852f.C22579f mo27690a(com.google.assistant.p3897e.p3921j.C52081en r17, com.google.common.base.C58833ax r18, com.google.common.base.C58833ax r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.apps.gsa.staticplugins.accl.c.b.a r2 = r0.f258905g
            com.google.android.apps.gsa.shared.search.Query r3 = com.google.android.apps.gsa.shared.search.Query.f252741b
            boolean r4 = r19.mo56113h()
            r5 = 16
            java.lang.String r6 = "android.opa.extra.TRIGGERED_BY"
            if (r4 == 0) goto L_0x009f
            java.lang.Object r4 = r19.mo56107c()
            com.google.android.libraries.gsa.conversation.f.i r4 = (com.google.android.libraries.gsa.conversation.p1852f.C22582i) r4
            boolean r7 = r4 instanceof com.google.android.apps.gsa.search.core.p6491a.C84367m
            if (r7 == 0) goto L_0x007d
            com.google.android.apps.gsa.search.core.a.m r4 = (com.google.android.apps.gsa.search.core.p6491a.C84367m) r4
            com.google.android.apps.gsa.shared.search.Query r3 = r4.f229625a
            int r4 = r3.mo84263a(r6)
            r7 = 106(0x6a, float:1.49E-43)
            if (r4 != r7) goto L_0x009f
            java.lang.String r4 = "android.opa.extra.CONVERSATION_DELTA"
            boolean r4 = r3.mo84364bx(r4)
            if (r4 == 0) goto L_0x009f
            byte[] r4 = r3.mo84439dT()     // Catch:{ Exception -> 0x007b }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ Exception -> 0x007b }
            com.google.assistant.e.j.en r8 = com.google.assistant.p3897e.p3921j.C52081en.f136679i     // Catch:{ Exception -> 0x007b }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r4, (com.google.protobuf.C62921ba) r7)     // Catch:{ Exception -> 0x007b }
            com.google.assistant.e.j.en r4 = (com.google.assistant.p3897e.p3921j.C52081en) r4     // Catch:{ Exception -> 0x007b }
            com.google.assistant.e.j.ex r7 = r1.f136685e     // Catch:{ Exception -> 0x007b }
            if (r7 != 0) goto L_0x0046
            com.google.assistant.e.j.ex r7 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b     // Catch:{ Exception -> 0x007b }
        L_0x0046:
            com.google.protobuf.bn r7 = r7.toBuilder()     // Catch:{ Exception -> 0x007b }
            com.google.assistant.e.j.ew r7 = (com.google.assistant.p3897e.p3921j.C52090ew) r7     // Catch:{ Exception -> 0x007b }
            com.google.assistant.e.j.ex r4 = r4.f136685e     // Catch:{ Exception -> 0x007b }
            if (r4 != 0) goto L_0x0052
            com.google.assistant.e.j.ex r4 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b     // Catch:{ Exception -> 0x007b }
        L_0x0052:
            com.google.protobuf.cq r4 = r4.f136712a     // Catch:{ Exception -> 0x007b }
            r7.mo53790c(r4)     // Catch:{ Exception -> 0x007b }
            com.google.protobuf.bn r4 = r17.toBuilder()     // Catch:{ Exception -> 0x007b }
            com.google.assistant.e.j.el r4 = (com.google.assistant.p3897e.p3921j.C52079el) r4     // Catch:{ Exception -> 0x007b }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ Exception -> 0x007b }
            com.google.assistant.e.j.ex r7 = (com.google.assistant.p3897e.p3921j.C52091ex) r7     // Catch:{ Exception -> 0x007b }
            r4.copyOnWrite()     // Catch:{ Exception -> 0x007b }
            com.google.protobuf.bv r8 = r4.instance     // Catch:{ Exception -> 0x007b }
            com.google.assistant.e.j.en r8 = (com.google.assistant.p3897e.p3921j.C52081en) r8     // Catch:{ Exception -> 0x007b }
            r7.getClass()     // Catch:{ Exception -> 0x007b }
            r8.f136685e = r7     // Catch:{ Exception -> 0x007b }
            int r7 = r8.f136681a     // Catch:{ Exception -> 0x007b }
            r7 = r7 | r5
            r8.f136681a = r7     // Catch:{ Exception -> 0x007b }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ Exception -> 0x007b }
            com.google.assistant.e.j.en r4 = (com.google.assistant.p3897e.p3921j.C52081en) r4     // Catch:{ Exception -> 0x007b }
            goto L_0x00a0
        L_0x007b:
            goto L_0x009f
        L_0x007d:
            boolean r7 = r4 instanceof com.google.android.apps.gsa.search.core.p6491a.C84348ag
            if (r7 == 0) goto L_0x009f
            com.google.android.apps.gsa.search.core.a.ag r4 = (com.google.android.apps.gsa.search.core.p6491a.C84348ag) r4
            com.google.assistant.e.f.d r7 = r4.f229564a
            com.google.assistant.e.f.d r8 = com.google.assistant.p3897e.p3912f.C51209d.UNKNOWN_SOURCE
            if (r7 == r8) goto L_0x0091
            java.lang.String r8 = "android.opa.extra.REQUEST_SOURCE_TYPE"
            int r7 = r7.f133323n
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84311aw(r8, r7)
        L_0x0091:
            com.google.android.apps.gsa.assistant.shared.l.e r7 = r4.f229565b
            com.google.android.apps.gsa.assistant.shared.l.e r8 = com.google.android.apps.gsa.assistant.shared.l.e.a
            if (r7 == r8) goto L_0x009f
            com.google.android.apps.gsa.assistant.shared.l.e r4 = r4.f229565b
            int r4 = r4.ca
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84311aw(r6, r4)
        L_0x009f:
            r4 = r1
        L_0x00a0:
            r7 = 0
            r8 = 0
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84245H(r7, r7, r8)
            com.google.common.base.ax r7 = r2.f258932c
            com.google.common.base.bk r7 = (com.google.common.base.C58847bk) r7
            java.lang.Object r7 = r7.f156646a
            com.google.android.apps.gsa.staticplugins.opa.util.ca r7 = (com.google.android.apps.gsa.staticplugins.opa.util.C113812ca) r7
            java.lang.String r7 = r7.f315214a
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84275aL(r7)
            byte[] r4 = r4.toByteArray()
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84304ap(r4)
            java.lang.String r4 = "android.opa.extra.CONVERSATION_CLIENT_TYPE"
            int r7 = r2.f258931b
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84311aw(r4, r7)
            boolean r4 = r18.mo56113h()
            java.lang.String r7 = "android.opa.extra.EXTRA_QUERY_SEND_EXECUTION_RESPONSE_TO_NGA"
            r9 = 1
            if (r4 == 0) goto L_0x01e7
            dagger.a r4 = r2.f258930a
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r4 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r4
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247634kp
            boolean r4 = r4.mo79746e(r10)
            if (r4 == 0) goto L_0x00e3
            r4 = 58
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84311aw(r6, r4)
        L_0x00e3:
            java.lang.Object r4 = r18.mo56107c()
            boolean r4 = r4 instanceof com.google.android.apps.gsa.search.core.p6491a.C84349ah
            if (r4 == 0) goto L_0x01e7
            java.lang.Object r4 = r18.mo56107c()
            com.google.android.apps.gsa.search.core.a.ah r4 = (com.google.android.apps.gsa.search.core.p6491a.C84349ah) r4
            com.google.android.apps.gsa.shared.search.Query r8 = r4.f229566a
            if (r8 == 0) goto L_0x01e7
            boolean r4 = r8.mo84404ck()
            if (r4 == 0) goto L_0x00ff
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84246I()
        L_0x00ff:
            boolean r4 = r8.mo84466dt()
            if (r4 == 0) goto L_0x0109
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84291ab()
        L_0x0109:
            boolean r4 = r8.mo84464dr()
            if (r4 == 0) goto L_0x0113
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84287aX()
        L_0x0113:
            java.lang.String r4 = "android.opa.extra.ENABLED_ON_OPA_LOCKSCREEN"
            boolean r6 = r8.mo84363bw(r4)
            if (r6 == 0) goto L_0x011f
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84302an(r4, r9)
        L_0x011f:
            java.lang.String r4 = "android.opa.extra.QUERY_INITIATED_BY_NGA"
            boolean r6 = r8.mo84363bw(r4)
            if (r6 == 0) goto L_0x014e
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84302an(r4, r9)
            java.lang.String r4 = "android.opa.extra.ORIGINAL_REQUEST_ID_INITIATED_BY_NGA"
            boolean r6 = r8.mo84364bx(r4)
            if (r6 == 0) goto L_0x0138
            long r10 = r8.mo84476f(r4)
            goto L_0x013a
        L_0x0138:
            long r10 = r8.f252749G
        L_0x013a:
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84313ay(r4, r10)
            java.lang.String r4 = "android.opa.extra.QUERY_RESPONSE_GENERATED_BY_NGA"
            com.google.android.apps.gsa.shared.search.Query r3 = com.google.android.apps.gsa.staticplugins.accl.p7331c.p7333b.C92790a.m152818a(r3, r8, r4)
            com.google.android.apps.gsa.shared.search.Query r3 = com.google.android.apps.gsa.staticplugins.accl.p7331c.p7333b.C92790a.m152818a(r3, r8, r7)
            java.lang.String r4 = "android.opa.extra.TRIGGERED_BY_HEADSET"
            com.google.android.apps.gsa.shared.search.Query r3 = com.google.android.apps.gsa.staticplugins.accl.p7331c.p7333b.C92790a.m152818a(r3, r8, r4)
        L_0x014e:
            java.lang.String r4 = "android.opa.extra.QUERY_GACS_CAPABILITIES"
            byte[] r6 = r8.mo84440dU(r4)
            if (r6 == 0) goto L_0x015a
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84303ao(r4, r6)
        L_0x015a:
            java.lang.String r4 = "android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ"
            boolean r6 = r8.mo84364bx(r4)
            if (r6 == 0) goto L_0x016a
            int r6 = r8.mo84263a(r4)
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84311aw(r4, r6)
        L_0x016a:
            java.lang.String r4 = "android.opa.extra.VOICE_SEARCH_TTS_ENCODING"
            boolean r6 = r8.mo84364bx(r4)
            if (r6 == 0) goto L_0x017a
            int r6 = r8.mo84263a(r4)
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84311aw(r4, r6)
        L_0x017a:
            java.lang.String r4 = "user-agent-suffix"
            java.lang.String r6 = r8.mo84347bf(r4)
            if (r6 == 0) goto L_0x0186
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84278aO(r4, r6)
        L_0x0186:
            com.google.common.o.amo r4 = r8.f252760R
            if (r4 == 0) goto L_0x018e
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84272aI(r4)
        L_0x018e:
            java.lang.String r4 = "android.opa.extra.MINI_PLATE_ENABLED"
            boolean r6 = r8.mo84363bw(r4)
            if (r6 == 0) goto L_0x019a
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84302an(r4, r9)
        L_0x019a:
            java.lang.String r4 = r8.mo84351bj()
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x01aa
            java.lang.String r6 = "android.opa.extra.APP_INTEGRATION_CLIENT_PACKAGE_NAME"
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84278aO(r6, r4)
        L_0x01aa:
            java.lang.String r4 = "android.opa.extra.DEVICE_MODEL_ID"
            java.lang.String r6 = r8.mo84347bf(r4)
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 != 0) goto L_0x01ba
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84278aO(r4, r6)
        L_0x01ba:
            boolean r4 = r8.mo84337bV()
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84260X(r4)
            boolean r4 = r8.mo84411cr()
            if (r4 == 0) goto L_0x01cd
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84308at()
            goto L_0x01d7
        L_0x01cd:
            boolean r4 = r8.mo84324bI()
            if (r4 == 0) goto L_0x01d7
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84301am()
        L_0x01d7:
            java.lang.String r4 = "android.opa.extra.EXTRA_HETERODYNE_TOKEN"
            java.lang.String r6 = r8.mo84347bf(r4)
            boolean r10 = android.text.TextUtils.isEmpty(r6)
            if (r10 != 0) goto L_0x01e7
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84278aO(r4, r6)
        L_0x01e7:
            int r2 = r2.f258931b
            switch(r2) {
                case 2: goto L_0x0209;
                case 3: goto L_0x01ec;
                case 4: goto L_0x01f7;
                case 5: goto L_0x01f2;
                case 6: goto L_0x01f2;
                case 7: goto L_0x01ed;
                case 8: goto L_0x0209;
                default: goto L_0x01ec;
            }
        L_0x01ec:
            goto L_0x020d
        L_0x01ed:
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84243F()
            goto L_0x020d
        L_0x01f2:
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84309au()
            goto L_0x020d
        L_0x01f7:
            if (r8 == 0) goto L_0x0204
            boolean r2 = r8.mo84411cr()
            if (r2 == 0) goto L_0x0204
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84308at()
            goto L_0x020d
        L_0x0204:
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84301am()
            goto L_0x020d
        L_0x0209:
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84260X(r9)
        L_0x020d:
            boolean r2 = r18.mo56113h()
            if (r2 == 0) goto L_0x0234
            java.lang.Object r2 = r18.mo56107c()
            com.google.android.apps.gsa.search.core.a.ah r2 = (com.google.android.apps.gsa.search.core.p6491a.C84349ah) r2
            boolean r4 = r2 instanceof com.google.android.apps.gsa.search.core.p6491a.C84349ah
            java.lang.String r6 = "android.opa.extra.ORIGINAL_REQUEST_ID"
            if (r4 == 0) goto L_0x022c
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f229566a
            boolean r4 = r2.mo84364bx(r6)
            if (r4 == 0) goto L_0x022e
            long r10 = r2.mo84476f(r6)
            goto L_0x0230
        L_0x022c:
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f229566a
        L_0x022e:
            long r10 = r2.f252749G
        L_0x0230:
            com.google.android.apps.gsa.shared.search.Query r3 = r3.mo84313ay(r6, r10)
        L_0x0234:
            com.google.android.apps.gsa.search.core.a.ah r11 = new com.google.android.apps.gsa.search.core.a.ah
            r11.<init>(r3)
            com.google.assistant.e.j.ex r2 = r1.f136685e
            if (r2 != 0) goto L_0x023f
            com.google.assistant.e.j.ex r2 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x023f:
            com.google.protobuf.cq r2 = r2.f136712a
            java.util.Iterator r2 = r2.iterator()
        L_0x0245:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0292
            java.lang.Object r4 = r2.next()
            com.google.assistant.e.j.kc r4 = (com.google.assistant.p3897e.p3921j.C52232kc) r4
            java.lang.String r6 = "asst.request.logging.params"
            java.lang.String r8 = r4.f137065b
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0245
            com.google.assistant.e.j.ka r6 = r4.f137066c
            if (r6 != 0) goto L_0x0261
            com.google.assistant.e.j.ka r6 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
        L_0x0261:
            java.lang.String r8 = "assistant.api.params.RequestLoggingParams"
            java.lang.String r6 = r6.f137060b
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0245
            com.google.assistant.e.j.ka r2 = r4.f137066c     // Catch:{ ct -> 0x028f }
            if (r2 != 0) goto L_0x0271
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x028f }
        L_0x0271:
            com.google.protobuf.z r2 = r2.f137061c     // Catch:{ ct -> 0x028f }
            com.google.protobuf.ba r4 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x028f }
            com.google.assistant.e.i.a.li r6 = com.google.assistant.p3897e.p3917i.p3918a.C51536li.f134316k     // Catch:{ ct -> 0x028f }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (com.google.protobuf.C63088z) r2, (com.google.protobuf.C62921ba) r4)     // Catch:{ ct -> 0x028f }
            com.google.assistant.e.i.a.li r2 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r2     // Catch:{ ct -> 0x028f }
            java.lang.String r2 = r2.f134320c     // Catch:{ ct -> 0x028f }
            boolean r4 = r2.isEmpty()     // Catch:{ ct -> 0x028f }
            if (r4 == 0) goto L_0x028a
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x028f }
            goto L_0x0294
        L_0x028a:
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)     // Catch:{ ct -> 0x028f }
            goto L_0x0294
        L_0x028f:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x0294
        L_0x0292:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x0294:
            boolean r4 = r2.mo56113h()
            if (r4 == 0) goto L_0x02b1
            java.lang.Object r2 = r2.mo56107c()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.libraries.gsa.conversation.f.a r4 = new com.google.android.libraries.gsa.conversation.f.a
            r4.<init>()
            r4.mo27666b(r2)
            com.google.android.libraries.gsa.conversation.f.k r2 = r4.mo27665a()
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x02b3
        L_0x02b1:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x02b3:
            r12 = r2
            boolean r2 = r3.mo84363bw(r7)
            r4 = 2
            if (r2 == 0) goto L_0x038c
            dagger.a r2 = r0.f258900b
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r2 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r2
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90032ck.f248332q
            boolean r2 = r2.mo79746e(r6)
            if (r2 == 0) goto L_0x038c
            com.google.common.base.ax r2 = r0.f258906h
            com.google.common.base.bk r2 = (com.google.common.base.C58847bk) r2
            java.lang.Object r2 = r2.f156646a
            dagger.a r2 = (dagger.C68214a) r2
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.staticplugins.nga.a.b.c r2 = (com.google.android.apps.gsa.staticplugins.nga.p8044a.p8046b.C103000c) r2
            com.google.protobuf.cq r1 = r1.f136684d
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.staticplugins.accl.c.ag r3 = com.google.android.apps.gsa.staticplugins.accl.p7331c.C92769ag.f258891a
            j$.util.stream.Stream r1 = r1.filter(r3)
            com.google.android.apps.gsa.staticplugins.accl.c.ah r3 = com.google.android.apps.gsa.staticplugins.accl.p7331c.C92770ah.f258892a
            j$.util.stream.Stream r1 = r1.map(r3)
            j$.util.stream.Collector r3 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r1 = r1.collect(r3)
            java.util.List r1 = (java.util.List) r1
            com.google.android.apps.gsa.opa.f.a.y r3 = com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y.f228080e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.opa.f.a.w r3 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83671w) r3
            com.google.android.apps.gsa.opa.f.a.av r6 = com.google.android.apps.gsa.opa.p6441f.p6442a.C83633av.f227991c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.opa.f.a.au r6 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83632au) r6
            com.google.android.apps.gsa.nga.shared.aa.m.i r7 = com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80506i.f221000c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.m.g r7 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80504g) r7
            com.google.android.apps.gsa.nga.shared.aa.m.m r8 = com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80510m.f221010b
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.m.l r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80509l) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.apps.gsa.nga.shared.aa.m.m r10 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80510m) r10
            com.google.protobuf.cq r13 = r10.f221012a
            boolean r14 = r13.mo58948c()
            if (r14 != 0) goto L_0x032a
            com.google.protobuf.cq r13 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r13)
            r10.f221012a = r13
        L_0x032a:
            com.google.protobuf.cq r10 = r10.f221012a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r10)
            r7.copyOnWrite()
            com.google.protobuf.bv r1 = r7.instance
            com.google.android.apps.gsa.nga.shared.aa.m.i r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80506i) r1
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.apps.gsa.nga.shared.aa.m.m r8 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80510m) r8
            r8.getClass()
            r1.f221003b = r8
            r1.f221002a = r4
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.android.apps.gsa.opa.f.a.av r1 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83633av) r1
            com.google.protobuf.bv r4 = r7.build()
            com.google.android.apps.gsa.nga.shared.aa.m.i r4 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6293m.C80506i) r4
            r4.getClass()
            r1.f227994b = r4
            int r4 = r1.f227993a
            r4 = r4 | r9
            r1.f227993a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r1 = r3.instance
            com.google.android.apps.gsa.opa.f.a.y r1 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y) r1
            com.google.protobuf.bv r4 = r6.build()
            com.google.android.apps.gsa.opa.f.a.av r4 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83633av) r4
            r4.getClass()
            r1.f228084c = r4
            r1.f228083b = r5
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.apps.gsa.opa.f.a.y r1 = (com.google.android.apps.gsa.opa.p6441f.p6442a.C83673y) r1
            r2.mo93557a(r1)
            com.google.android.apps.gsa.staticplugins.accl.c.f r10 = r0.f258899a
            com.google.common.util.concurrent.cx r13 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            com.google.android.apps.gsa.staticplugins.accl.c.e r1 = r10.mo87457a(r11, r12, r13, r14, r15)
            return r1
        L_0x038c:
            com.google.common.util.concurrent.SettableFuture r13 = new com.google.common.util.concurrent.SettableFuture
            r13.<init>()
            com.google.common.util.concurrent.SettableFuture r2 = new com.google.common.util.concurrent.SettableFuture
            r2.<init>()
            com.google.common.util.concurrent.SettableFuture r5 = new com.google.common.util.concurrent.SettableFuture
            r5.<init>()
            com.google.android.apps.gsa.staticplugins.l.m r6 = r0.f258907i
            com.google.android.apps.gsa.staticplugins.accl.c.al r7 = new com.google.android.apps.gsa.staticplugins.accl.c.al
            r7.<init>(r13, r2, r5)
            com.google.android.apps.gsa.search.core.f.b r6 = r6.mo93353a(r3, r7)
            r6.mo79427a()
            com.google.android.apps.gsa.staticplugins.accl.c.f r10 = r0.f258899a
            com.google.common.util.concurrent.cx r14 = com.google.android.apps.gsa.shared.util.p7159c.C90918bo.m148514a(r2)
            r15 = r5
            com.google.android.apps.gsa.staticplugins.accl.c.e r2 = r10.mo87457a(r11, r12, r13, r14, r15)
            com.google.android.apps.gsa.staticplugins.accl.c.s r6 = r2.f258946a
            com.google.common.util.concurrent.cx r7 = r6.f258981a
            com.google.common.util.concurrent.cx r6 = r6.mo87463c()
            com.google.android.apps.gsa.staticplugins.accl.c.m r8 = r0.f258902d
            com.google.android.apps.gsa.staticplugins.accl.c.aj r9 = com.google.android.apps.gsa.staticplugins.accl.p7331c.C92772aj.f258894a
            com.google.common.util.concurrent.bg r10 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60922j.m93044g(r5, r9, r10)
            r9 = r18
            r8.mo87460a(r7, r5, r6, r9)
            int r5 = r0.f258901c
            if (r5 != 0) goto L_0x04c4
            com.google.protobuf.cq r1 = r1.f136684d
            java.util.Iterator r1 = r1.iterator()
        L_0x03d5:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x04c4
            java.lang.Object r5 = r1.next()
            com.google.assistant.e.j.ep r5 = (com.google.assistant.p3897e.p3921j.C52083ep) r5
            dagger.a r6 = r0.f258900b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r6 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r6
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247183cO
            boolean r6 = r6.mo79746e(r7)
            java.lang.String r7 = "rId"
            r8 = 3
            if (r6 == 0) goto L_0x041e
            int r6 = r5.f136692b
            if (r6 != r8) goto L_0x041e
            java.lang.Object r6 = r5.f136693c
            com.google.assistant.e.j.ek r6 = (com.google.assistant.p3897e.p3921j.C52078ek) r6
            int r6 = r6.f136674b
            r9 = 5
            if (r6 != r9) goto L_0x041e
            com.google.android.apps.gsa.shared.logger.b.i r1 = r0.f258904f
            com.google.android.apps.gsa.shared.logger.b.f r4 = new com.google.android.apps.gsa.shared.logger.b.f
            r4.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CCL_CLIENT_INTERACTION_SEND_REQUEST_ID
            r4.f246201a = r5
            long r5 = r3.f252749G
            java.lang.String r5 = java.lang.Long.toString(r5)
            r4.mo83701c(r7, r5)
            com.google.android.apps.gsa.shared.logger.b.g r4 = r4.mo83699a()
            r1.mo74236a(r4)
            goto L_0x04a7
        L_0x041e:
            dagger.a r6 = r0.f258900b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r6 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r6
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247187cS
            boolean r6 = r6.mo79746e(r9)
            if (r6 == 0) goto L_0x03d5
            int r6 = r5.f136692b
            if (r6 != r8) goto L_0x03d5
            java.lang.Object r5 = r5.f136693c
            com.google.assistant.e.j.ek r5 = (com.google.assistant.p3897e.p3921j.C52078ek) r5
            int r6 = r5.f136674b
            if (r6 != r8) goto L_0x03d5
            int r1 = r5.f136674b
            if (r1 != r8) goto L_0x0443
            java.lang.Object r1 = r5.f136675c
            com.google.assistant.e.j.ec r1 = (com.google.assistant.p3897e.p3921j.C52070ec) r1
            goto L_0x0445
        L_0x0443:
            com.google.assistant.e.j.ec r1 = com.google.assistant.p3897e.p3921j.C52070ec.f136651d
        L_0x0445:
            dagger.a r5 = r0.f258900b
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247316ep
            boolean r5 = r5.mo79746e(r6)
            if (r5 == 0) goto L_0x048c
            int r5 = r1.f136653a
            r4 = r4 & r5
            if (r4 == 0) goto L_0x048c
            com.google.assistant.e.j.eb r1 = r1.f136655c
            if (r1 != 0) goto L_0x0460
            com.google.assistant.e.j.eb r1 = com.google.assistant.p3897e.p3921j.C52069eb.f136648b
        L_0x0460:
            com.google.protobuf.cq r1 = r1.f136650a
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.staticplugins.accl.c.ai r4 = new com.google.android.apps.gsa.staticplugins.accl.c.ai
            r4.<init>()
            boolean r1 = r1.anyMatch(r4)
            if (r1 == 0) goto L_0x048c
            com.google.android.apps.gsa.shared.logger.b.i r1 = r0.f258904f
            com.google.android.apps.gsa.shared.logger.b.f r4 = new com.google.android.apps.gsa.shared.logger.b.f
            r4.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.FAD_CLIENT_OP_RESULT_SUBMIT
            r4.f246201a = r5
            long r5 = r3.f252749G
            java.lang.String r5 = java.lang.Long.toString(r5)
            r4.mo83701c(r7, r5)
            com.google.android.apps.gsa.shared.logger.b.g r4 = r4.mo83699a()
            r1.mo74236a(r4)
        L_0x048c:
            com.google.android.apps.gsa.shared.logger.b.i r1 = r0.f258904f
            com.google.android.apps.gsa.shared.logger.b.f r4 = new com.google.android.apps.gsa.shared.logger.b.f
            r4.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r5 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_CLIENT_OP_RESULT_SUBMIT
            r4.f246201a = r5
            long r5 = r3.f252749G
            java.lang.String r5 = java.lang.Long.toString(r5)
            r4.mo83701c(r7, r5)
            com.google.android.apps.gsa.shared.logger.b.g r4 = r4.mo83699a()
            r1.mo74236a(r4)
        L_0x04a7:
            com.google.android.apps.gsa.search.shared.service.al r1 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ASSISTANT_REQUEST_ID
            r1.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r4)
            r1.mo81966c(r3)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r1 = r1.mo81964a()
            com.google.android.apps.gsa.search.core.a.ai r3 = r0.f258903e
            com.google.common.util.concurrent.cx r1 = r3.mo77886a(r1)
            java.lang.String r3 = "Service event sent, received: %b"
            java.lang.String r4 = "Failed to send service event to active client."
            java.lang.String r5 = "SearchServiceCDSender"
            com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148481o(r1, r5, r3, r4)
        L_0x04c4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.p7331c.C92775am.mo27690a(com.google.assistant.e.j.en, com.google.common.base.ax, com.google.common.base.ax):com.google.android.libraries.gsa.conversation.f.f");
    }
}
