package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126923a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.p9522a.C126939a;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127895g;
import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b.C127898j;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.g */
/* compiled from: PG */
public final class C126954g implements C126950c {

    /* renamed from: a */
    private static final Duration f349565a;

    /* renamed from: b */
    private static final Duration f349566b;

    /* renamed from: c */
    private final C126923a f349567c;

    /* renamed from: d */
    private final C126939a f349568d;

    /* renamed from: e */
    private final boolean f349569e;

    /* renamed from: f */
    private final C127898j f349570f;

    /* renamed from: g */
    private final C127895g f349571g;

    /* renamed from: h */
    private final boolean f349572h;

    /* renamed from: i */
    private final boolean f349573i;

    /* renamed from: j */
    private final boolean f349574j;

    static {
        Duration ofSeconds = Duration.ofSeconds(6);
        C69664n.m101060f(ofSeconds, "ofSeconds(6)");
        f349565a = ofSeconds;
        Duration ofSeconds2 = Duration.ofSeconds(6);
        C69664n.m101060f(ofSeconds2, "ofSeconds(6)");
        f349566b = ofSeconds2;
    }

    public C126954g(C126923a aVar, C126939a aVar2, boolean z, C127898j jVar, C127895g gVar, boolean z2, boolean z3, boolean z4) {
        this.f349567c = aVar;
        this.f349568d = aVar2;
        this.f349569e = z;
        this.f349570f = jVar;
        this.f349571g = gVar;
        this.f349572h = z2;
        this.f349573i = z3;
        this.f349574j = z4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.google.android.apps.search.assistant.platform.b.a.d.am} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: com.google.android.apps.search.assistant.platform.b.a.d.am} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: com.google.android.apps.search.assistant.platform.b.a.d.am} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107869a(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq r18, com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i r19, p5462h.p5466c.C69577g r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126952e
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.e r3 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126952e) r3
            int r4 = r3.f349561j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f349561j = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.e r3 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.e
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f349559h
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f349561j
            r6 = 2
            r7 = 1
            java.lang.String r8 = "newBuilder()"
            if (r5 == 0) goto L_0x0063
            if (r5 == r7) goto L_0x0047
            if (r5 != r6) goto L_0x003f
            java.lang.Object r1 = r3.f349556e
            java.lang.Object r4 = r3.f349555d
            java.lang.Object r5 = r3.f349554c
            com.google.android.apps.search.assistant.platform.b.a.d.am r5 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119791am) r5
            java.lang.Object r9 = r3.f349553b
            java.lang.Object r3 = r3.f349552a
            p5462h.C69714l.m101134b(r2)
            goto L_0x0179
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            java.lang.Object r1 = r3.f349558g
            java.lang.Object r5 = r3.f349557f
            java.lang.Object r9 = r3.f349556e
            java.lang.Object r10 = r3.f349555d
            java.lang.Object r11 = r3.f349554c
            com.google.android.apps.search.assistant.surfaces.voice.d.d.i r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i) r11
            java.lang.Object r12 = r3.f349553b
            java.lang.Object r13 = r3.f349552a
            p5462h.C69714l.m101134b(r2)
            r16 = r2
            r2 = r1
            r1 = r11
            r11 = r5
            r5 = r10
            r10 = r16
            goto L_0x00cf
        L_0x0063:
            p5462h.C69714l.m101134b(r2)
            com.google.android.apps.search.assistant.platform.b.a.d.ak r2 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak.f333656k
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.aj r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119788aj) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r8)
            com.google.android.apps.search.assistant.platform.b.a.d.am r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.android.apps.search.assistant.surfaces.voice.d.d.l r5 = r1.f350566d
            if (r5 != 0) goto L_0x007b
            com.google.android.apps.search.assistant.surfaces.voice.d.d.l r5 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127292l.f350572c
        L_0x007b:
            com.google.android.apps.search.assistant.surfaces.voice.d.d.g r5 = r5.f350575b
            if (r5 != 0) goto L_0x0081
            com.google.android.apps.search.assistant.surfaces.voice.d.d.g r5 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127287g.f350556d
        L_0x0081:
            java.lang.String r9 = "queryContext.settings.language"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r9)
            com.google.android.apps.search.assistant.platform.b.a.d.aa r9 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119779aa.f333642c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.z r9 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119907z) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r8)
            com.google.android.apps.search.assistant.platform.b.a.d.ae r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.android.apps.search.assistant.platform.b.a.d.y r10 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119906y.f333913e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.x r10 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119905x) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r8)
            com.google.android.apps.search.assistant.platform.b.a.d.ac r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            com.google.android.apps.search.assistant.platform.b.a.d.y r10 = r10.mo104514a()
            r9.mo104516b(r10)
            com.google.android.apps.search.assistant.platform.b.a.d.aa r9 = r9.mo104515a()
            r2.mo104520c(r9)
            r3.f349552a = r0
            r9 = r18
            r3.f349553b = r9
            r3.f349554c = r1
            r3.f349555d = r2
            r3.f349556e = r2
            r3.f349557f = r5
            r3.f349558g = r2
            r3.f349561j = r7
            java.lang.Object r10 = r0.mo107870b(r5, r3)
            if (r10 == r4) goto L_0x0283
            r13 = r0
            r11 = r5
            r12 = r9
            r5 = r2
            r9 = r5
        L_0x00cf:
            com.google.android.apps.search.assistant.platform.b.a.d.l r10 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l) r10
            com.google.android.apps.search.assistant.platform.b.a.d.am r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119791am) r2
            r2.mo104519b(r10)
            com.google.android.apps.search.assistant.platform.b.a.d.bm r2 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119818bm.f333734b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.bl r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119817bl) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r8)
            com.google.android.apps.search.assistant.platform.b.a.d.bo r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            r2.mo104534d()
            r10 = r13
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.g r10 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126954g) r10
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.a.a r14 = r10.f349567c
            java.lang.String r15 = "queryContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r15)
            java.util.Map r15 = r14.f349453a
            com.google.android.apps.search.assistant.surfaces.voice.d.d.c r1 = r1.f350565c
            if (r1 != 0) goto L_0x00fa
            com.google.android.apps.search.assistant.surfaces.voice.d.d.c r1 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127283c.f350547c
        L_0x00fa:
            int r1 = r1.f350549a
            com.google.android.apps.search.assistant.surfaces.voice.d.d.b r1 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127282b.m208209a(r1)
            java.lang.String r7 = "queryContext.entryPoint.typeCase"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.a.h r7 = r14.f349454b
            java.lang.Object r1 = p3186j$.util.Map.EL.getOrDefault(r15, r1, r7)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.a.h r1 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126930h) r1
            java.util.List r1 = r1.f349460b
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0118:
            boolean r15 = r1.hasNext()
            if (r15 == 0) goto L_0x014e
            java.lang.Object r15 = r1.next()
            r6 = r15
            com.google.assistant.e.j.da r6 = (com.google.assistant.p3897e.p3921j.C51785da) r6
            java.lang.String r6 = r6.f135878b
            int r0 = r6.hashCode()
            r18 = r1
            r1 = -2026494367(0xffffffff87362661, float:-1.3703437E-34)
            if (r0 == r1) goto L_0x0133
            goto L_0x0145
        L_0x0133:
            java.lang.String r0 = "text.START_DICTATION"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0145
            com.google.android.apps.search.assistant.libraries.dictation.starter.a r0 = r14.f349455c
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f332684a
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0148
        L_0x0145:
            r7.add(r15)
        L_0x0148:
            r0 = r17
            r1 = r18
            r6 = 2
            goto L_0x0118
        L_0x014e:
            r2.mo104532b(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.bm r0 = r2.mo104531a()
            r1 = r9
            com.google.android.apps.search.assistant.platform.b.a.d.am r1 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119791am) r1
            r1.mo104522e(r0)
            r3.f349552a = r13
            r3.f349553b = r12
            r3.f349554c = r5
            r3.f349555d = r9
            r3.f349556e = r9
            r0 = 0
            r3.f349557f = r0
            r3.f349558g = r0
            r0 = 2
            r3.f349561j = r0
            com.google.android.apps.search.assistant.surfaces.voice.d.d.g r11 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127287g) r11
            java.lang.Object r2 = r10.mo107871c(r11, r3)
            if (r2 == r4) goto L_0x0283
            r1 = r9
            r4 = r1
            r9 = r12
            r3 = r13
        L_0x0179:
            com.google.android.apps.search.assistant.platform.b.a.d.bx r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx) r2
            com.google.android.apps.search.assistant.platform.b.a.d.am r1 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119791am) r1
            r1.mo104523f(r2)
            com.google.android.apps.search.assistant.platform.b.a.d.bg r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119812bg.f333724c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.bf r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119811bf) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r8)
            com.google.android.apps.search.assistant.platform.b.a.d.bi r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.android.libraries.search.assistant.f.a.d.cq r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r9
            r0.mo104527b(r9)
            com.google.android.apps.search.assistant.platform.b.a.d.bg r0 = r0.mo104526a()
            com.google.android.apps.search.assistant.platform.b.a.d.am r4 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119791am) r4
            r4.mo104521d(r0)
            com.google.android.apps.search.assistant.platform.b.a.d.du r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119880du.f333857f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.dt r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119879dt) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r8)
            com.google.android.apps.search.assistant.platform.b.a.d.dw r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.g r3 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126954g) r3
            boolean r1 = r3.f349569e
            com.google.android.apps.search.assistant.platform.b.a.d.dt r2 = r0.f333864a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.search.assistant.platform.b.a.d.du r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119880du) r2
            int r6 = r2.f333859a
            r7 = 2
            r6 = r6 | r7
            r2.f333859a = r6
            r2.f333862d = r1
            boolean r1 = r3.f349574j
            com.google.android.apps.search.assistant.platform.b.a.d.dt r2 = r0.f333864a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.apps.search.assistant.platform.b.a.d.du r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119880du) r2
            int r6 = r2.f333859a
            r6 = r6 | 4
            r2.f333859a = r6
            r2.f333863e = r1
            com.google.android.apps.search.assistant.platform.b.a.d.du r0 = r0.mo104548a()
            r4.mo104524g(r0)
            com.google.android.apps.search.assistant.platform.b.a.d.dj r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119869dj.f333832c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.di r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119868di) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r8)
            java.lang.String r1 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            boolean r2 = r3.f349573i
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.apps.search.assistant.platform.b.a.d.dj r3 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119869dj) r3
            int r6 = r3.f333834a
            r7 = 1
            r6 = r6 | r7
            r3.f333834a = r6
            r3.f333835b = r2
            com.google.protobuf.bv r0 = r0.build()
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            com.google.android.apps.search.assistant.platform.b.a.d.dj r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119869dj) r0
            java.lang.String r3 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)
            com.google.android.apps.search.assistant.platform.b.a.d.aj r6 = r4.f333669a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.apps.search.assistant.platform.b.a.d.ak r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak) r6
            com.google.android.apps.search.assistant.platform.b.a.d.ak r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak.f333656k
            r0.getClass()
            r6.f333666i = r0
            int r0 = r6.f333658a
            r0 = r0 | 64
            r6.f333658a = r0
            com.google.android.apps.search.assistant.platform.b.a.d.ai r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119787ai.f333651d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.ah r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119786ah) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)
            j$.time.Duration r1 = f349565a
            long r6 = r1.toMillis()
            int r1 = (int) r6
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.apps.search.assistant.platform.b.a.d.ai r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119787ai) r6
            int r7 = r6.f333653a
            r8 = 1
            r7 = r7 | r8
            r6.f333653a = r7
            r6.f333654b = r1
            j$.time.Duration r1 = f349566b
            long r6 = r1.toMillis()
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.platform.b.a.d.ai r1 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119787ai) r1
            int r8 = r1.f333653a
            r9 = 2
            r8 = r8 | r9
            r1.f333653a = r8
            int r7 = (int) r6
            r1.f333655c = r7
            com.google.protobuf.bv r0 = r0.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            com.google.android.apps.search.assistant.platform.b.a.d.ai r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119787ai) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r3)
            com.google.android.apps.search.assistant.platform.b.a.d.aj r1 = r4.f333669a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.android.apps.search.assistant.platform.b.a.d.ak r1 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119789ak) r1
            r0.getClass()
            r1.f333667j = r0
            int r0 = r1.f333658a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.f333658a = r0
            com.google.android.apps.search.assistant.platform.b.a.d.am r5 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119791am) r5
            com.google.android.apps.search.assistant.platform.b.a.d.ak r0 = r5.mo104518a()
            return r0
        L_0x0283:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126954g.mo107869a(com.google.android.libraries.search.assistant.f.a.d.cq, com.google.android.apps.search.assistant.surfaces.voice.d.d.i, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107870b(com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127287g r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126951d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.d r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126951d) r0
            int r1 = r0.f349551d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f349551d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.d r0 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.d
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f349549b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f349551d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r6 = r0.f349548a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0048
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.j r7 = r5.f349570f
            java.lang.String r6 = r6.f350559b
            java.lang.String r2 = "languageConfiguration.primaryLocale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            r0.f349548a = r5
            r0.f349551d = r3
            java.lang.Object r7 = r7.mo108269a(r6, r0)
            if (r7 == r1) goto L_0x0172
            r6 = r5
        L_0x0048:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.b r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b) r7
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.g r6 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126954g) r6
            boolean r0 = r6.f349572h
            java.lang.String r1 = "newBuilder()"
            if (r0 == 0) goto L_0x0083
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l.f333893e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.k r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119892k) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)
            com.google.android.apps.search.assistant.platform.b.a.d.n r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.NATCON
            r6.mo104554c(r7)
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.ON_DEVICE_SERVER_FALLBACK
            r6.mo104554c(r7)
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.ONLINE
            r6.mo104554c(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.j r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j.OGG_OPUS_AUDIO_ENCODING
            r6.mo104553b(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = r6.mo104552a()
            return r6
        L_0x0083:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.b r0 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b.UNKNOWN
            int r0 = r7.ordinal()
            if (r0 == 0) goto L_0x0151
            if (r0 == r3) goto L_0x0151
            r2 = 2
            if (r0 == r2) goto L_0x0130
            r4 = 3
            if (r0 != r4) goto L_0x0118
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a.a r6 = r6.f349568d
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a.b r6 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.p9522a.C126940b) r6
            int r6 = r6.mo107862b()
            int r6 = r6 + -1
            if (r6 == r3) goto L_0x00f7
            if (r6 == r2) goto L_0x00f7
            if (r6 == r4) goto L_0x00cd
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l.f333893e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.k r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119892k) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)
            com.google.android.apps.search.assistant.platform.b.a.d.n r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.ON_DEVICE_SERVER_FALLBACK
            r6.mo104554c(r7)
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.ONLINE
            r6.mo104554c(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.j r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j.OGG_OPUS_AUDIO_ENCODING
            r6.mo104553b(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = r6.mo104552a()
            goto L_0x0171
        L_0x00cd:
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l.f333893e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.k r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119892k) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)
            com.google.android.apps.search.assistant.platform.b.a.d.n r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.ONLINE
            r6.mo104554c(r7)
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.ON_DEVICE_SERVER_FALLBACK
            r6.mo104554c(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.j r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j.OGG_OPUS_AUDIO_ENCODING
            r6.mo104553b(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = r6.mo104552a()
            goto L_0x0171
        L_0x00f7:
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l.f333893e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.k r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119892k) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)
            com.google.android.apps.search.assistant.platform.b.a.d.n r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.ON_DEVICE_SERVER_FALLBACK
            r6.mo104554c(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.j r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j.OGG_OPUS_AUDIO_ENCODING
            r6.mo104553b(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = r6.mo104552a()
            goto L_0x0171
        L_0x0118:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Asr strategy invalid: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r1.concat(r7)
            r6.<init>(r7)
            throw r6
        L_0x0130:
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l.f333893e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.k r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119892k) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)
            com.google.android.apps.search.assistant.platform.b.a.d.n r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.ON_DEVICE_SERVER_FALLBACK
            r6.mo104554c(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.j r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j.OGG_OPUS_AUDIO_ENCODING
            r6.mo104553b(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = r6.mo104552a()
            goto L_0x0171
        L_0x0151:
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l.f333893e
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.k r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119892k) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r1)
            com.google.android.apps.search.assistant.platform.b.a.d.n r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            r6.mo104555d()
            com.google.android.apps.search.assistant.platform.b.a.d.h r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119889h.ONLINE
            r6.mo104554c(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.j r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j.OGG_OPUS_AUDIO_ENCODING
            r6.mo104553b(r7)
            com.google.android.apps.search.assistant.platform.b.a.d.l r6 = r6.mo104552a()
        L_0x0171:
            return r6
        L_0x0172:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126954g.mo107870b(com.google.android.apps.search.assistant.surfaces.voice.d.d.g, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107871c(com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127287g r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126953f
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.f r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126953f) r0
            int r1 = r0.f349564c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f349564c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.f r0 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.f
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f349562a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f349564c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r6)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.surfaces.voice.h.b.b.g r6 = r4.f349571g
            java.lang.String r5 = r5.f350559b
            java.lang.String r2 = "language.primaryLocale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            r0.f349564c = r3
            java.lang.Object r6 = r6.mo108268b(r5, r0)
            if (r6 == r1) goto L_0x008c
        L_0x0043:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r6
            int r5 = r6.f352149a
            if (r5 != r3) goto L_0x0052
            java.lang.Object r5 = r6.f352150b
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L_0x0053
        L_0x0052:
            r5 = 0
        L_0x0053:
            com.google.android.apps.search.assistant.platform.b.a.d.bx r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx.f333757f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.search.assistant.platform.b.a.d.bu r6 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119826bu) r6
            java.lang.String r0 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            com.google.android.apps.search.assistant.platform.b.a.d.bz r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            if (r5 == 0) goto L_0x0077
            r6.mo104539c()
            com.google.android.apps.search.assistant.platform.b.a.d.bw r5 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119828bw.HYBRID_FLUID_ACTIONS_ON_DEVICE_AND_ONLINE
            r6.mo104538b(r5)
            r6.mo104539c()
            com.google.android.apps.search.assistant.platform.b.a.d.bw r5 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119828bw.HYBRID
            r6.mo104538b(r5)
            goto L_0x007f
        L_0x0077:
            r6.mo104539c()
            com.google.android.apps.search.assistant.platform.b.a.d.bw r5 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119828bw.HYBRID_FLUID_ACTIONS_AND_ONLINE
            r6.mo104538b(r5)
        L_0x007f:
            r6.mo104539c()
            com.google.android.apps.search.assistant.platform.b.a.d.bw r5 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119828bw.ONLINE
            r6.mo104538b(r5)
            com.google.android.apps.search.assistant.platform.b.a.d.bx r5 = r6.mo104537a()
            return r5
        L_0x008c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126954g.mo107871c(com.google.android.apps.search.assistant.surfaces.voice.d.d.g, h.c.g):java.lang.Object");
    }
}
