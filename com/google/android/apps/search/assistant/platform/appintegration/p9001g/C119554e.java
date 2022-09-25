package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9150b.C121023g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.e */
/* compiled from: PG */
public final class C119554e implements C70862aj {

    /* renamed from: a */
    public static final C59071e f333198a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.g.e");

    /* renamed from: b */
    public final String f333199b;

    /* renamed from: c */
    public final C119548ac f333200c;

    /* renamed from: d */
    private final C119562m f333201d;

    /* renamed from: e */
    private final String f333202e;

    /* renamed from: f */
    private final String f333203f;

    /* renamed from: g */
    private final C60888db f333204g;

    /* renamed from: h */
    private final C119547ab f333205h;

    /* renamed from: i */
    private C119561l f333206i;

    /* renamed from: j */
    private final C121023g f333207j;

    public C119554e(String str, String str2, C119562m mVar, C60888db dbVar, Context context, C121023g gVar, C119547ab abVar, C119548ac acVar) {
        this.f333201d = mVar;
        this.f333200c = acVar;
        this.f333202e = str;
        this.f333205h = abVar;
        this.f333203f = str2;
        this.f333204g = dbVar;
        this.f333207j = gVar;
        this.f333199b = context.getPackageName();
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f333200c.f333189a.mo20121a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) f333198a.mo56225c()).mo56382g(th)).mo56372aa(34531)).mo56386p("onError()");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ca, code lost:
        if (r1.equals("com.google.android.apps.search.assistant.platform.appintegration.devapp") == false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0110, code lost:
        if (r2.equals("com.google.android.apps.search.assistant.platform.appintegration.devapp") == false) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0195  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo20123c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r2 = r18
            com.google.android.apps.search.assistant.platform.appintegration.grpc.e r2 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119623e) r2
            com.google.android.apps.search.assistant.platform.appintegration.g.ac r1 = r0.f333200c
            java.lang.String r3 = "onNext received"
            r1.mo104428b(r3)
            int r1 = r2.f333374b
            r3 = 3
            if (r1 != r3) goto L_0x0044
            java.lang.Object r1 = r2.f333375c
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0044
            com.google.android.apps.search.assistant.platform.appintegration.g.l r1 = r0.f333206i
            if (r1 == 0) goto L_0x0211
            com.google.common.util.concurrent.cx r2 = r1.f333227f
            if (r2 != 0) goto L_0x002c
            io.grpc.Status r2 = p5488io.grpc.Status.f186912j
            java.lang.String r3 = "stopInteraction: sendData should be called before calling stopInteraction"
            r1.mo104430a(r2, r3)
            goto L_0x0040
        L_0x002c:
            com.google.android.apps.search.assistant.platform.appintegration.g.j r3 = new com.google.android.apps.search.assistant.platform.appintegration.g.j
            r3.<init>(r1)
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.s r3 = com.google.apps.tiktok.tracing.C47810es.m84966f(r3)
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60922j.m93045h(r2, r3, r4)
            java.lang.String r3 = "stopInteraction"
            r1.mo104431b(r3, r2)
        L_0x0040:
            r1 = 0
            r0.f333206i = r1
            return
        L_0x0044:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.v r1 = r2.f333376d
            if (r1 != 0) goto L_0x004a
            com.google.android.apps.search.assistant.platform.appintegration.grpc.v r1 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v.f333408i
        L_0x004a:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.x r1 = r1.f333412c
            if (r1 != 0) goto L_0x0050
            com.google.android.apps.search.assistant.platform.appintegration.grpc.x r1 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119642x.f333419e
        L_0x0050:
            int r3 = r1.f333421a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0386
            java.lang.String r3 = r1.f333423c
            int r1 = r1.f333424d
            java.lang.String r4 = r0.f333202e
            boolean r4 = com.google.android.apps.search.assistant.platform.appintegration.p8991c.C119521a.m198385a(r4, r3, r1)
            r11 = 0
            r12 = 1
            if (r4 != 0) goto L_0x006f
            java.lang.String r4 = r0.f333203f
            boolean r4 = com.google.android.apps.search.assistant.platform.appintegration.p8991c.C119521a.m198385a(r4, r3, r1)
            if (r4 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r13 = 0
            goto L_0x0070
        L_0x006f:
            r13 = 1
        L_0x0070:
            com.google.common.f.e r4 = f333198a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 34533(0x86e5, float:4.8391E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r13)
            java.lang.String r7 = r0.f333202e
            java.lang.String r8 = r0.f333203f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r5 = "eligible: %b, mosaic: %s, legacy: %s, package:%s, version: %d"
            r9 = r3
            r10 = r1
            r4.mo56361N(r5, r6, r7, r8, r9, r10)
            r8 = 2
            if (r13 == 0) goto L_0x0368
            int r1 = r2.f333374b
            java.lang.String r9 = "com.google.android.apps.search.assistant.platform.appintegration.devapp"
            java.lang.String r10 = "com.google.android.youtube"
            r14 = -305258803(0xffffffffedce1ecd, float:-7.9738935E27)
            r15 = -2075712516(0xffffffff844723fc, float:-2.340886E-36)
            r3 = 6
            if (r1 != r3) goto L_0x0212
            java.lang.Object r1 = r2.f333375c
            com.google.android.apps.search.assistant.platform.appintegration.grpc.as r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119599as) r1
            boolean r1 = r1.f333335a
            if (r1 == 0) goto L_0x00dd
            com.google.android.apps.search.assistant.platform.h.c.b.g r1 = r0.f333207j
            com.google.common.util.concurrent.cx r1 = r1.mo105028b()
            com.google.android.apps.search.assistant.platform.h.c.b.g r4 = r0.f333207j
            com.google.common.util.concurrent.cx r4 = r4.mo105027a()
            com.google.common.util.concurrent.cx[] r5 = new com.google.common.util.concurrent.C60870cx[r8]
            r5[r11] = r1
            r5[r12] = r4
            com.google.apps.tiktok.tracing.contrib.b.j r5 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r5)
            com.google.android.apps.search.assistant.platform.appintegration.g.c r6 = new com.google.android.apps.search.assistant.platform.appintegration.g.c
            r6.<init>(r0, r1, r4)
            com.google.common.util.concurrent.db r1 = r0.f333204g
            com.google.common.util.concurrent.cx r1 = r5.mo51520a(r6, r1)
            com.google.android.apps.search.assistant.platform.appintegration.g.d r4 = new com.google.android.apps.search.assistant.platform.appintegration.g.d
            r4.<init>(r0)
            com.google.common.util.concurrent.bz r4 = com.google.apps.tiktok.tracing.C47810es.m84974n(r4)
            com.google.common.util.concurrent.bg r5 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.C60856cj.m92911t(r1, r4, r5)
        L_0x00dd:
            int r1 = r2.f333374b
            if (r1 != r3) goto L_0x00e6
            java.lang.Object r1 = r2.f333375c
            com.google.android.apps.search.assistant.platform.appintegration.grpc.as r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119599as) r1
            goto L_0x00e8
        L_0x00e6:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.as r1 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119599as.f333333c
        L_0x00e8:
            boolean r1 = r1.f333336b
            if (r1 == 0) goto L_0x0211
            com.google.android.apps.search.assistant.platform.appintegration.g.ab r1 = r0.f333205h
            com.google.android.apps.search.assistant.platform.appintegration.grpc.v r2 = r2.f333376d
            if (r2 != 0) goto L_0x00f4
            com.google.android.apps.search.assistant.platform.appintegration.grpc.v r2 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v.f333408i
        L_0x00f4:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.x r2 = r2.f333412c
            if (r2 != 0) goto L_0x00fa
            com.google.android.apps.search.assistant.platform.appintegration.grpc.x r2 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119642x.f333419e
        L_0x00fa:
            java.lang.String r2 = r2.f333423c
            com.google.android.apps.search.assistant.platform.appintegration.g.ac r3 = r0.f333200c
            int r4 = r2.hashCode()
            if (r4 == r15) goto L_0x011d
            r5 = -956226305(0xffffffffc70124ff, float:-33060.996)
            if (r4 == r5) goto L_0x0113
            if (r4 == r14) goto L_0x010c
            goto L_0x0125
        L_0x010c:
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0125
            goto L_0x0126
        L_0x0113:
            java.lang.String r4 = "com.google.android.libraries.assistant.appintegration.sample.mosaic"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0125
            r11 = 1
            goto L_0x0126
        L_0x011d:
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0125
            r11 = 2
            goto L_0x0126
        L_0x0125:
            r11 = -1
        L_0x0126:
            if (r11 == 0) goto L_0x0135
            if (r11 == r12) goto L_0x0132
            if (r11 == r8) goto L_0x012f
            com.google.android.apps.search.assistant.platform.appintegration.grpc.aq r2 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119597aq.ID_UNKNOWN
            goto L_0x0137
        L_0x012f:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.aq r2 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119597aq.ID_YOUTUBE
            goto L_0x0137
        L_0x0132:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.aq r2 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119597aq.ID_STING_DEVAPP
            goto L_0x0137
        L_0x0135:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.aq r2 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119597aq.ID_TIKTOK_DEVAPP
        L_0x0137:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ab r1 = r1.f333188b
            com.google.protobuf.cq r1 = r1.f333284a
            java.util.Iterator r1 = r1.iterator()
        L_0x0144:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x018f
            java.lang.Object r5 = r1.next()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.z r5 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119644z) r5
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.platform.appintegration.p9001g.C119547ab.f333187a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            r7 = 34550(0x86f6, float:4.8415E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r7)
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            java.lang.String r7 = "Found experiment %s for %s"
            r6.mo56354G(r7, r5, r2)
            int r6 = r5.f333428b
            com.google.android.apps.search.assistant.platform.appintegration.grpc.aq r6 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119597aq.m198500a(r6)
            if (r6 != 0) goto L_0x0170
            com.google.android.apps.search.assistant.platform.appintegration.grpc.aq r6 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119597aq.ID_UNKNOWN
        L_0x0170:
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x0144
            com.google.protobuf.cq r6 = r5.f333429c
            java.util.Iterator r6 = r6.iterator()
        L_0x017c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0189
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x017c
        L_0x0189:
            com.google.protobuf.cq r5 = r5.f333429c
            r4.addAll(r5)
            goto L_0x0144
        L_0x018f:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0211
            com.google.android.apps.search.assistant.platform.appintegration.grpc.z r1 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119644z.f333425d
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.y r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119643y) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.z r5 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119644z) r5
            int r2 = r2.f333332f
            r5.f333428b = r2
            int r2 = r5.f333427a
            r2 = r2 | r12
            r5.f333427a = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.z r2 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119644z) r2
            com.google.protobuf.cq r5 = r2.f333429c
            boolean r6 = r5.mo58948c()
            if (r6 != 0) goto L_0x01c2
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)
            r2.f333429c = r5
        L_0x01c2:
            com.google.protobuf.cq r2 = r2.f333429c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r4, (java.util.List) r2)
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.z r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119644z) r1
            io.grpc.i.aj r2 = r3.f333189a
            com.google.android.apps.search.assistant.platform.appintegration.grpc.i r3 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119627i.f333384i
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.f r3 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119624f) r3
            com.google.android.apps.search.assistant.platform.appintegration.grpc.au r4 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119601au.f333338d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.at r4 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119600at) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.au r5 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119601au) r5
            r1.getClass()
            r5.f333342c = r1
            int r1 = r5.f333340a
            r1 = r1 | r8
            r5.f333340a = r1
            com.google.protobuf.bv r1 = r4.build()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.au r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119601au) r1
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.search.assistant.platform.appintegration.grpc.i r4 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119627i) r4
            r1.getClass()
            r4.f333393h = r1
            int r1 = r4.f333386a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r4.f333386a = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.apps.search.assistant.platform.appintegration.grpc.i r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119627i) r1
            r2.mo20123c(r1)
        L_0x0211:
            return
        L_0x0212:
            com.google.android.apps.search.assistant.platform.appintegration.g.m r1 = r0.f333201d
            com.google.android.apps.search.assistant.platform.appintegration.g.ac r3 = r0.f333200c
            com.google.android.apps.search.assistant.platform.appintegration.g.l r7 = new com.google.android.apps.search.assistant.platform.appintegration.g.l
            r2.getClass()
            r3.getClass()
            g.a.a r4 = r1.f333230a
            java.lang.Object r4 = r4.mo17428b()
            com.google.android.apps.search.assistant.platform.appintegration.g.z r4 = (com.google.android.apps.search.assistant.platform.appintegration.p9001g.C119575z) r4
            r4.getClass()
            g.a.a r5 = r1.f333231b
            java.lang.Object r5 = r5.mo17428b()
            com.google.android.apps.search.assistant.surfaces.voice.f.a.f r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127448f) r5
            r5.getClass()
            g.a.a r6 = r1.f333232c
            java.lang.Object r6 = r6.mo17428b()
            com.google.android.apps.search.assistant.platform.appintegration.e.b r6 = (com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b) r6
            r6.getClass()
            g.a.a r1 = r1.f333233d
            java.lang.Object r1 = r1.mo17428b()
            r16 = r1
            com.google.android.apps.search.assistant.platform.h.c.b.g r16 = (com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9150b.C121023g) r16
            r16.getClass()
            r1 = r7
            r13 = r7
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.f333206i = r13
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.appintegration.p9001g.C119561l.f333222a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "sendData"
            r3 = 34539(0x86eb, float:4.84E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.search.assistant.platform.appintegration.grpc.e r1 = r13.f333223b
            int r2 = r1.f333374b
            if (r2 != r8) goto L_0x026e
            java.lang.Object r1 = r1.f333375c
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ay r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119605ay) r1
            goto L_0x0270
        L_0x026e:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ay r1 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119605ay.f333343c
        L_0x0270:
            int r1 = r1.f333345a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0278
            r1 = 1
            goto L_0x0279
        L_0x0278:
            r1 = 0
        L_0x0279:
            com.google.android.apps.search.assistant.platform.appintegration.e.b r2 = r13.f333225d
            com.google.android.apps.search.assistant.platform.appintegration.e.a r3 = com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119532a.KARAJAN_V2
            com.google.android.apps.search.assistant.platform.appintegration.grpc.e r4 = r13.f333223b
            com.google.android.apps.search.assistant.platform.appintegration.grpc.v r4 = r4.f333376d
            if (r4 != 0) goto L_0x0285
            com.google.android.apps.search.assistant.platform.appintegration.grpc.v r4 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v.f333408i
        L_0x0285:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.x r4 = r4.f333412c
            if (r4 != 0) goto L_0x028b
            com.google.android.apps.search.assistant.platform.appintegration.grpc.x r4 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119642x.f333419e
        L_0x028b:
            java.lang.String r4 = r4.f333423c
            r2.mo104419b(r3, r4, r1)
            com.google.android.apps.search.assistant.platform.appintegration.grpc.e r2 = r13.f333223b
            com.google.android.apps.search.assistant.platform.appintegration.grpc.v r3 = r2.f333376d
            if (r3 != 0) goto L_0x0299
            com.google.android.apps.search.assistant.platform.appintegration.grpc.v r4 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v.f333408i
            goto L_0x029a
        L_0x0299:
            r4 = r3
        L_0x029a:
            boolean r4 = r4.f333417h
            java.lang.String r5 = "sendTextQuery"
            if (r4 == 0) goto L_0x0321
            int r1 = r2.f333374b
            if (r1 != r8) goto L_0x02a9
            java.lang.Object r1 = r2.f333375c
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ay r1 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119605ay) r1
            goto L_0x02ab
        L_0x02a9:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ay r1 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119605ay.f333343c
        L_0x02ab:
            int r1 = r1.f333345a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0311
            if (r3 != 0) goto L_0x02b5
            com.google.android.apps.search.assistant.platform.appintegration.grpc.v r3 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v.f333408i
        L_0x02b5:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.x r1 = r3.f333412c
            if (r1 != 0) goto L_0x02bb
            com.google.android.apps.search.assistant.platform.appintegration.grpc.x r1 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119642x.f333419e
        L_0x02bb:
            java.lang.String r1 = r1.f333423c
            int r2 = r1.hashCode()
            if (r2 == r15) goto L_0x02cd
            if (r2 == r14) goto L_0x02c6
            goto L_0x02d5
        L_0x02c6:
            boolean r2 = r1.equals(r9)
            if (r2 == 0) goto L_0x02d5
            goto L_0x02d6
        L_0x02cd:
            boolean r2 = r1.equals(r10)
            if (r2 == 0) goto L_0x02d5
            r11 = 1
            goto L_0x02d6
        L_0x02d5:
            r11 = -1
        L_0x02d6:
            if (r11 == 0) goto L_0x02e0
            if (r11 == r12) goto L_0x02dd
            com.google.android.apps.search.assistant.surfaces.voice.f.a.c.k r2 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127434k.UNKNOWN
            goto L_0x02e2
        L_0x02dd:
            com.google.android.apps.search.assistant.surfaces.voice.f.a.c.k r2 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127434k.YOUTUBE
            goto L_0x02e2
        L_0x02e0:
            com.google.android.apps.search.assistant.surfaces.voice.f.a.c.k r2 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127434k.MOSAIC_DEVAPP
        L_0x02e2:
            com.google.android.apps.search.assistant.surfaces.voice.f.a.c.k r3 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c.C127434k.UNKNOWN
            if (r2 != r3) goto L_0x02fb
            io.grpc.Status r2 = p5488io.grpc.Status.f186909g
            java.lang.String r3 = "TNG:MA handover isn't supported for: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r3.concat(r1)
            java.lang.Throwable r1 = r13.mo104430a(r2, r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92899h(r1)
            goto L_0x031d
        L_0x02fb:
            com.google.android.apps.search.assistant.platform.h.c.b.g r1 = r13.f333229h
            com.google.common.util.concurrent.cx r1 = r1.mo105028b()
            com.google.android.apps.search.assistant.platform.appintegration.g.i r3 = new com.google.android.apps.search.assistant.platform.appintegration.g.i
            r3.<init>(r13, r2)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.s r3 = com.google.apps.tiktok.tracing.C47810es.m84966f(r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r1, r3, r2)
            goto L_0x031d
        L_0x0311:
            io.grpc.Status r1 = p5488io.grpc.Status.f186906d
            java.lang.String r2 = "TNG:MA handover is only supported for requests with clientInput."
            java.lang.Throwable r1 = r13.mo104430a(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92899h(r1)
        L_0x031d:
            r13.mo104432c(r5, r1)
            return
        L_0x0321:
            if (r1 == 0) goto L_0x034d
            com.google.android.apps.search.assistant.platform.appintegration.g.y r1 = r13.f333224c
            int r3 = r2.f333374b
            if (r3 != r8) goto L_0x032e
            java.lang.Object r2 = r2.f333375c
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ay r2 = (com.google.android.apps.search.assistant.platform.appintegration.grpc.C119605ay) r2
            goto L_0x0330
        L_0x032e:
            com.google.android.apps.search.assistant.platform.appintegration.grpc.ay r2 = com.google.android.apps.search.assistant.platform.appintegration.grpc.C119605ay.f333343c
        L_0x0330:
            com.google.assistant.e.j.du r2 = r2.f333346b
            if (r2 != 0) goto L_0x0336
            com.google.assistant.e.j.du r2 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x0336:
            com.google.android.apps.search.assistant.platform.appintegration.g.x r3 = new com.google.android.apps.search.assistant.platform.appintegration.g.x
            r3.<init>(r1, r2)
            java.util.concurrent.Executor r1 = r1.f333254a
            com.google.common.util.concurrent.r r2 = com.google.apps.tiktok.tracing.C47810es.m84965e(r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92905n(r2, r1)
            r13.f333227f = r1
            com.google.common.util.concurrent.cx r1 = r13.f333227f
            r13.mo104432c(r5, r1)
            return
        L_0x034d:
            com.google.android.apps.search.assistant.platform.appintegration.g.y r1 = r13.f333224c
            com.google.android.apps.search.assistant.platform.appintegration.g.t r2 = new com.google.android.apps.search.assistant.platform.appintegration.g.t
            r2.<init>(r1)
            java.util.concurrent.Executor r1 = r1.f333254a
            com.google.common.util.concurrent.r r2 = com.google.apps.tiktok.tracing.C47810es.m84965e(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92905n(r2, r1)
            r13.f333227f = r1
            java.lang.String r1 = "startVoiceQuery"
            com.google.common.util.concurrent.cx r2 = r13.f333227f
            r13.mo104432c(r1, r2)
            return
        L_0x0368:
            com.google.android.apps.search.assistant.platform.appintegration.g.ac r2 = r0.f333200c
            io.grpc.Status r4 = p5488io.grpc.Status.f186912j
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Object[] r6 = new java.lang.Object[r8]
            r6[r11] = r3
            r6[r12] = r1
            java.lang.String r1 = "%s (version %d) is not an eligible app to access Mosaic"
            java.lang.String r1 = java.lang.String.format(r5, r1, r6)
            io.grpc.Status r1 = r4.withDescription(r1)
            io.grpc.StatusException r1 = r1.asException()
            r2.mo104427a(r1)
            return
        L_0x0386:
            com.google.common.f.e r1 = f333198a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Request has no package name"
            r3 = 34534(0x86e6, float:4.8392E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.android.apps.search.assistant.platform.appintegration.g.ac r1 = r0.f333200c
            io.grpc.Status r2 = p5488io.grpc.Status.f186912j
            java.lang.String r3 = "Package name is missing."
            io.grpc.Status r2 = r2.withDescription(r3)
            io.grpc.StatusException r2 = r2.asException()
            r1.mo104427a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.appintegration.p9001g.C119554e.mo20123c(java.lang.Object):void");
    }
}
