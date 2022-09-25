package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100923f;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112665ac;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112678ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112685aw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112687ay;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112705m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48736r;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4553a.C59529cz;
import com.google.common.p4552o.p4553a.C59568x;
import com.google.common.p4552o.p4553a.C59569y;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.speech.p5228m.C67328ce;
import com.google.speech.p5228m.C67329cf;
import dagger.C68214a;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ct */
/* compiled from: PG */
public final class C112794ct {

    /* renamed from: a */
    public static final C59071e f312616a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.ct");

    /* renamed from: b */
    public static final C121537f f312617b = C121537f.m200840b("Tapas/FulfillmentLogger", C121511c.f337208a);

    /* renamed from: c */
    public final C86124t f312618c;

    /* renamed from: d */
    public final C112687ay f312619d;

    /* renamed from: e */
    private final C112685aw f312620e;

    /* renamed from: f */
    private final C112705m f312621f;

    /* renamed from: g */
    private final C112678ap f312622g;

    /* renamed from: h */
    private final C68214a f312623h;

    /* renamed from: i */
    private final C21370a f312624i;

    /* renamed from: j */
    private final AtomicInteger f312625j = new AtomicInteger();

    /* renamed from: k */
    private final C68214a f312626k;

    /* renamed from: l */
    private final C68214a f312627l;

    /* renamed from: m */
    private final C100923f f312628m;

    public C112794ct(C86124t tVar, C112685aw awVar, C112705m mVar, C112678ap apVar, C68214a aVar, C21370a aVar2, C68214a aVar3, C68214a aVar4, C112687ay ayVar, C100923f fVar) {
        this.f312618c = tVar;
        this.f312620e = awVar;
        this.f312621f = mVar;
        this.f312622g = apVar;
        this.f312623h = aVar;
        this.f312624i = aVar2;
        this.f312626k = aVar3;
        this.f312627l = aVar4;
        this.f312619d = ayVar;
        this.f312628m = fVar;
    }

    /* renamed from: d */
    private static boolean m186665d(int i) {
        int i2 = i - 1;
        if (!(i2 == 1 || i2 == 9)) {
            switch (i2) {
                case 15:
                case 16:
                case 17:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v73, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.p4552o.p4553a.C59529cz mo99739a(int r25, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez r26, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es r27, p3186j$.util.Optional r28) {
        /*
            r24 = this;
            r6 = r24
            r1 = r25
            r0 = r26
            r2 = r27
            com.google.common.f.e r3 = f312616a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "TapasFufillLogger"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Tapas suggestion tap is being fulfilled"
            r5 = 27800(0x6c98, float:3.8956E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.search.assistant.platform.i.e.a.f r3 = f312617b
            java.lang.String r4 = "tapas_suggestion_submit"
            r3.mo105240i(r4)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r4 = r27.mo100118a()
            java.lang.String r4 = r4.mo100033p()
            int r4 = r4.length()
            long r4 = (long) r4
            java.lang.String r7 = "tapas_prefix_suggestion_submit"
            r3.mo105239h(r7, r4)
            com.google.common.o.l.r r3 = com.google.android.libraries.logging.C28260b.m52825a()
            com.google.protobuf.bn r3 = r3.toBuilder()
            com.google.common.o.l.q r3 = (com.google.common.p4552o.p4566l.C60217q) r3
            com.google.common.o.l.t r4 = com.google.common.p4552o.p4566l.C60220t.f162931e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.common.o.l.s r4 = (com.google.common.p4552o.p4566l.C60219s) r4
            com.google.android.libraries.f.a r5 = r6.f312624i
            long r7 = r5.mo26870b()
            java.util.concurrent.atomic.AtomicInteger r5 = r6.f312625j
            int r5 = r5.incrementAndGet()
            r4.copyOnWrite()
            com.google.protobuf.bv r9 = r4.instance
            com.google.common.o.l.t r9 = (com.google.common.p4552o.p4566l.C60220t) r9
            int r10 = r9.f162933a
            r15 = 1
            r10 = r10 | r15
            r9.f162933a = r10
            r10 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r10
            int r5 = r5 % 999
            int r5 = r5 + r15
            long r10 = (long) r5
            long r7 = r7 + r10
            r9.f162934b = r7
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.common.o.l.t r5 = (com.google.common.p4552o.p4566l.C60220t) r5
            int r7 = r5.f162933a
            r7 = r7 | 4
            r5.f162933a = r7
            r14 = 0
            r5.f162936d = r14
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.common.o.l.t r5 = (com.google.common.p4552o.p4566l.C60220t) r5
            int r7 = r5.f162933a
            r13 = 2
            r7 = r7 | r13
            r5.f162933a = r7
            r5.f162935c = r14
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.common.o.l.r r5 = (com.google.common.p4552o.p4566l.C60218r) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.common.o.l.t r4 = (com.google.common.p4552o.p4566l.C60220t) r4
            r4.getClass()
            r5.f162928b = r4
            int r4 = r5.f162927a
            r4 = r4 | r15
            r5.f162927a = r4
            com.google.protobuf.bv r3 = r3.build()
            r12 = r3
            com.google.common.o.l.r r12 = (com.google.common.p4552o.p4566l.C60218r) r12
            r3 = 3
            if (r1 != r3) goto L_0x00b5
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aw r3 = r6.f312620e
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r12)
            r3.mo99636k(r0, r4)
            goto L_0x00ce
        L_0x00b5:
            boolean r3 = m186665d(r25)
            if (r3 != 0) goto L_0x00c5
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aw r3 = r6.f312620e
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r12)
            r3.mo99638m(r0, r4)
            goto L_0x00ce
        L_0x00c5:
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aw r3 = r6.f312620e
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            r3.mo99638m(r0, r4)
        L_0x00ce:
            com.google.android.apps.gsa.search.core.i.t r3 = r6.f312618c
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247740mp
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x0101
            dagger.a r3 = r6.f312623h
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ag r3 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112312ag) r3
            com.google.android.apps.gsa.search.core.i.t r4 = r3.f311675g
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247740mp
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x0101
            com.google.common.util.concurrent.cx r4 = r3.mo99493b()
            com.google.android.libraries.gsa.k.g r5 = r3.f311673e
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.l r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.l
            r7.<init>(r3, r2, r0)
            com.google.android.apps.gsa.shared.util.c.ag r3 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r8 = "Getting APR and WAA bits"
            r3.<init>(r4, r5, r8, r7)
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.m r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112379m.f311813a
            r3.mo85223a(r4)
        L_0x0101:
            boolean r3 = m186665d(r25)
            if (r3 == 0) goto L_0x010a
            r4 = 2
            goto L_0x0511
        L_0x010a:
            p3186j$.util.Optional.empty()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r3 = r27.mo100118a()
            long r3 = r3.mo100016a()
            java.lang.String r8 = com.google.android.libraries.search.logging.p3043f.C39191a.m68623b(r3)
            if (r8 == 0) goto L_0x06bf
            if (r0 == 0) goto L_0x06b7
            if (r2 == 0) goto L_0x06af
            com.google.common.o.e.a r11 = com.google.common.p4552o.p4559e.C59743a.TAPAS_ON_DEVICE_QUERY
            if (r11 == 0) goto L_0x06a7
            if (r12 == 0) goto L_0x069f
            if (r28 == 0) goto L_0x0697
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.c r3 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.c
            r7 = r3
            r9 = r26
            r10 = r27
            r4 = 2
            r13 = r28
            r5 = 0
            r14 = r25
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ap r7 = r6.f312622g
            com.google.android.libraries.assistant.portable.b.t r8 = com.google.android.libraries.assistant.portable.p1586b.C19088t.f53533p
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.assistant.portable.b.s r8 = (com.google.android.libraries.assistant.portable.p1586b.C19087s) r8
            java.lang.String r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112678ap.m186472a(r3)
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.portable.b.t r10 = (com.google.android.libraries.assistant.portable.p1586b.C19088t) r10
            r9.getClass()
            int r11 = r10.f53535a
            r11 = r11 | r15
            r10.f53535a = r11
            r10.f53536b = r9
            com.google.android.libraries.assistant.portable.b.ag r9 = com.google.android.libraries.assistant.portable.p1586b.C19063ag.f53477c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.assistant.portable.b.af r9 = (com.google.android.libraries.assistant.portable.p1586b.C19062af) r9
            com.google.assistant.ab.ct r10 = com.google.assistant.p3745ab.C48292ct.SUCCESS
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.android.libraries.assistant.portable.b.ag r11 = (com.google.android.libraries.assistant.portable.p1586b.C19063ag) r11
            int r10 = r10.f124907o
            r11.f53480b = r10
            int r10 = r11.f53479a
            r10 = r10 | r15
            r11.f53479a = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.portable.b.t r10 = (com.google.android.libraries.assistant.portable.p1586b.C19088t) r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.libraries.assistant.portable.b.ag r9 = (com.google.android.libraries.assistant.portable.p1586b.C19063ag) r9
            r9.getClass()
            r10.f53541g = r9
            int r9 = r10.f53535a
            r9 = r9 | 64
            r10.f53535a = r9
            com.google.android.libraries.assistant.portable.b.m r9 = com.google.android.libraries.assistant.portable.p1586b.C19081m.f53515g
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.assistant.portable.b.l r9 = (com.google.android.libraries.assistant.portable.p1586b.C19080l) r9
            com.google.android.libraries.assistant.portable.b.am r10 = com.google.android.libraries.assistant.portable.p1586b.C19069am.f53489c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.portable.b.al r10 = (com.google.android.libraries.assistant.portable.p1586b.C19068al) r10
            com.google.android.libraries.assistant.portable.b.b r11 = com.google.android.libraries.assistant.portable.p1586b.C19070b.f53493c
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.libraries.assistant.portable.b.a r11 = (com.google.android.libraries.assistant.portable.p1586b.C19056a) r11
            com.google.android.apps.gsa.staticplugins.opa.util.ca r12 = r7.f312318n
            java.lang.String r12 = r12.f315214a
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.assistant.portable.b.b r13 = (com.google.android.libraries.assistant.portable.p1586b.C19070b) r13
            r12.getClass()
            int r14 = r13.f53495a
            r14 = r14 | r15
            r13.f53495a = r14
            r13.f53496b = r12
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.portable.b.am r12 = (com.google.android.libraries.assistant.portable.p1586b.C19069am) r12
            com.google.protobuf.bv r11 = r11.build()
            com.google.android.libraries.assistant.portable.b.b r11 = (com.google.android.libraries.assistant.portable.p1586b.C19070b) r11
            r11.getClass()
            r12.f53492b = r11
            r12.f53491a = r15
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.android.libraries.assistant.portable.b.m r11 = (com.google.android.libraries.assistant.portable.p1586b.C19081m) r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.portable.b.am r10 = (com.google.android.libraries.assistant.portable.p1586b.C19069am) r10
            r10.getClass()
            r11.f53521e = r10
            int r10 = r11.f53517a
            r10 = r10 | 32
            r11.f53517a = r10
            com.google.android.apps.gsa.search.core.cq r10 = r7.f312309e
            java.lang.String r10 = r10.mo6453a()
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.android.libraries.assistant.portable.b.m r11 = (com.google.android.libraries.assistant.portable.p1586b.C19081m) r11
            r10.getClass()
            int r12 = r11.f53517a
            r12 = r12 | 64
            r11.f53517a = r12
            r11.f53522f = r10
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.libraries.assistant.portable.b.m r10 = (com.google.android.libraries.assistant.portable.p1586b.C19081m) r10
            int r11 = r10.f53517a
            r11 = r11 | 16
            r10.f53517a = r11
            r10.f53520d = r15
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r10 = r3.f312419c
            j$.util.Optional r10 = r10.mo100129j()
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ao r11 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112677ao.f312304a
            java.lang.Object r10 = r10.orElseGet(r11)
            java.lang.String r10 = (java.lang.String) r10
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.android.libraries.assistant.portable.b.m r11 = (com.google.android.libraries.assistant.portable.p1586b.C19081m) r11
            r10.getClass()
            int r12 = r11.f53517a
            r12 = r12 | r15
            r11.f53517a = r12
            r11.f53518b = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.portable.b.t r10 = (com.google.android.libraries.assistant.portable.p1586b.C19088t) r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.libraries.assistant.portable.b.m r9 = (com.google.android.libraries.assistant.portable.p1586b.C19081m) r9
            r9.getClass()
            r10.f53542h = r9
            int r9 = r10.f53535a
            r9 = r9 | 128(0x80, float:1.794E-43)
            r10.f53535a = r9
            com.google.android.apps.gsa.nga.shared.h.a.fj r9 = r7.f312319o
            com.google.protos.f.b.c.b r9 = r9.mo74971a()
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.portable.b.t r10 = (com.google.android.libraries.assistant.portable.p1586b.C19088t) r10
            int r9 = r9.getNumber()
            r10.f53547m = r9
            int r9 = r10.f53535a
            r9 = r9 | 4096(0x1000, float:5.74E-42)
            r10.f53535a = r9
            j$.util.Optional r9 = r3.f312422f
            boolean r9 = r9.isPresent()
            if (r9 == 0) goto L_0x027d
            j$.util.Optional r9 = r3.f312422f
            java.lang.Object r9 = r9.get()
            java.util.List r9 = (java.util.List) r9
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aj r10 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112672aj.f312293a
            j$.util.stream.Stream r9 = r9.map(r10)
            j$.util.stream.Collector r10 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r9 = r9.collect(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            goto L_0x0281
        L_0x027d:
            com.google.common.b.gu r9 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0281:
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.android.libraries.assistant.portable.b.t r10 = (com.google.android.libraries.assistant.portable.p1586b.C19088t) r10
            r10.mo24284a()
            com.google.protobuf.cq r10 = r10.f53544j
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r9, (java.util.List) r10)
            com.google.android.apps.gsa.search.core.google.gaia.o r9 = r7.f312307c
            java.lang.String r9 = r9.mo79659F()
            if (r9 != 0) goto L_0x029d
            j$.util.Optional r9 = p3186j$.util.Optional.empty()
            goto L_0x02ab
        L_0x029d:
            com.google.android.apps.gsa.assistant.settings.shared.ae r10 = r7.f312314j
            java.util.Locale r9 = r10.d(r9)
            java.lang.String r9 = r9.toLanguageTag()
            j$.util.Optional r9 = p3186j$.util.Optional.m71637of(r9)
        L_0x02ab:
            p3186j$.util.Objects.requireNonNull(r8)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ak r10 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ak
            r10.<init>(r8)
            r9.ifPresent(r10)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r9 = r3.f312418b
            j$.util.Optional r9 = r9.mo100195H()
            boolean r9 = r9.isPresent()
            java.lang.String r10 = "ShowEntity"
            if (r9 == 0) goto L_0x02f5
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r9 = r3.f312418b
            j$.util.Optional r9 = r9.mo100195H()
            java.lang.Object r9 = r9.get()
            com.google.assistant.ad.d.al r9 = (com.google.assistant.p3781ad.p3789d.C48578al) r9
            j$.util.Optional r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113148bf.m187156c(r9)
            boolean r11 = r9.isPresent()
            r12 = 0
            if (r11 == 0) goto L_0x030a
            java.lang.Object r9 = r9.get()
            com.google.assistant.ad.d.ad r9 = (com.google.assistant.p3781ad.p3789d.C48570ad) r9
            com.google.android.apps.gsa.search.core.i.t r11 = r7.f312312h
            j$.util.Optional r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112036an.m185879f(r9, r11)
            boolean r11 = r9.isPresent()
            if (r11 == 0) goto L_0x030a
            java.lang.Object r9 = r9.get()
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            goto L_0x030a
        L_0x02f5:
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r9 = r3.f312418b
            int r9 = r9.mo100206f()
            r11 = 20010(0x4e2a, float:2.804E-41)
            if (r9 == r11) goto L_0x0308
            r11 = 20014(0x4e2e, float:2.8046E-41)
            if (r9 == r11) goto L_0x0306
            java.lang.String r12 = ""
            goto L_0x030a
        L_0x0306:
            r12 = r10
            goto L_0x030a
        L_0x0308:
            java.lang.String r12 = "intent_factory_device.Open_app"
        L_0x030a:
            boolean r9 = com.google.common.base.C58837ba.m90859h(r12)
            if (r9 == 0) goto L_0x0315
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            goto L_0x0370
        L_0x0315:
            com.google.ba.b.a.a.b r9 = com.google.p4140ba.p4147b.p4148a.p4149a.C54937b.f144428b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.ba.b.a.a.a r9 = (com.google.p4140ba.p4147b.p4148a.p4149a.C54936a) r9
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x033e
            com.google.ba.b.a.a.e r5 = com.google.p4140ba.p4147b.p4148a.p4149a.C54940e.f144433c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.ba.b.a.a.c r5 = (com.google.p4140ba.p4147b.p4148a.p4149a.C54938c) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.ba.b.a.a.e r10 = (com.google.p4140ba.p4147b.p4148a.p4149a.C54940e) r10
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r10.f144436b = r11
            r10.f144435a = r15
            r9.mo54162a(r5)
            goto L_0x0366
        L_0x033e:
            com.google.ba.b.a.a.e r10 = com.google.p4140ba.p4147b.p4148a.p4149a.C54940e.f144433c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.ba.b.a.a.c r10 = (com.google.p4140ba.p4147b.p4148a.p4149a.C54938c) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.ba.b.a.a.e r11 = (com.google.p4140ba.p4147b.p4148a.p4149a.C54940e) r11
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.f144436b = r5
            r11.f144435a = r15
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.ba.b.a.a.e r5 = (com.google.p4140ba.p4147b.p4148a.p4149a.C54940e) r5
            r12.getClass()
            r5.f144435a = r4
            r5.f144436b = r12
            r9.mo54162a(r10)
        L_0x0366:
            com.google.protobuf.bv r5 = r9.build()
            com.google.ba.b.a.a.b r5 = (com.google.p4140ba.p4147b.p4148a.p4149a.C54937b) r5
            j$.util.Optional r5 = p3186j$.util.Optional.m71637of(r5)
        L_0x0370:
            p3186j$.util.Objects.requireNonNull(r8)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.al r9 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.al
            r9.<init>(r8)
            r5.ifPresent(r9)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r5 = r3.f312419c
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r5 = r5.mo100118a()
            java.lang.String r5 = r5.mo100033p()
            com.google.common.o.a.y r9 = com.google.common.p4552o.p4553a.C59569y.f158066g
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.common.o.a.x r9 = (com.google.common.p4552o.p4553a.C59568x) r9
            int r5 = r5.length()
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.common.o.a.y r10 = (com.google.common.p4552o.p4553a.C59569y) r10
            int r11 = r10.f158068a
            r11 = r11 | r15
            r10.f158068a = r11
            r10.f158069b = r5
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r5 = r3.f312419c
            j$.util.Optional r5 = r5.mo100125g()
            com.google.common.o.a.aa r10 = com.google.common.p4552o.p4553a.C59450aa.f157704d
            java.lang.Object r5 = r5.orElse(r10)
            com.google.common.o.a.aa r5 = (com.google.common.p4552o.p4553a.C59450aa) r5
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.common.o.a.y r10 = (com.google.common.p4552o.p4553a.C59569y) r10
            r5.getClass()
            r10.f158072e = r5
            int r5 = r10.f158068a
            r5 = r5 | 32
            r10.f158068a = r5
            com.google.common.o.uf r5 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.common.o.tz r5 = (com.google.common.p4552o.C60548tz) r5
            java.lang.String r10 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112678ap.m186472a(r3)
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            r10.getClass()
            int r12 = r11.f164249d
            r12 = r12 | 64
            r11.f164249d = r12
            r11.f164133an = r10
            java.lang.String r10 = r3.f312417a
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            int r12 = r11.f164093a
            r12 = r12 | 4
            r11.f164093a = r12
            r11.f164259n = r10
            com.google.common.o.e.a r10 = r3.f312420d
            int r10 = r10.f161421ts
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            int r12 = r11.f164093a
            r12 = r12 | r4
            r11.f164093a = r12
            r11.f164258m = r10
            com.google.android.libraries.f.a r10 = r7.f312308d
            long r10 = r10.mo26871c()
            r5.copyOnWrite()
            com.google.protobuf.bv r12 = r5.instance
            com.google.common.o.uf r12 = (com.google.common.p4552o.C60555uf) r12
            int r13 = r12.f164250e
            r13 = r13 | 16
            r12.f164250e = r13
            r12.f164094aA = r10
            com.google.android.libraries.f.a r10 = r7.f312308d
            long r10 = r10.mo26872d()
            r5.copyOnWrite()
            com.google.protobuf.bv r12 = r5.instance
            com.google.common.o.uf r12 = (com.google.common.p4552o.C60555uf) r12
            int r13 = r12.f164250e
            r13 = r13 | 4096(0x1000, float:5.74E-42)
            r12.f164250e = r13
            r12.f164099aF = r10
            com.google.android.libraries.f.a r10 = r7.f312308d
            long r10 = r10.mo26870b()
            r5.copyOnWrite()
            com.google.protobuf.bv r12 = r5.instance
            com.google.common.o.uf r12 = (com.google.common.p4552o.C60555uf) r12
            int r13 = r12.f164093a
            r13 = r13 | r15
            r12.f164093a = r13
            r12.f164257l = r10
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aw r10 = r7.f312313i
            com.google.common.o.a.cz r10 = r10.mo99626a()
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            r10.getClass()
            r11.f164239cq = r10
            int r10 = r11.f164255j
            r10 = r10 | 512(0x200, float:7.175E-43)
            r11.f164255j = r10
            com.google.android.apps.gsa.nga.shared.v.h r10 = r7.f312317m
            com.google.assistant.ab.w.g r10 = r10.mo75573b()
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            r10.getClass()
            r11.f164237co = r10
            int r10 = r11.f164255j
            r10 = r10 | 32
            r11.f164255j = r10
            com.google.common.o.a.u r10 = com.google.common.p4552o.p4553a.C59565u.f158051f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.common.o.a.p r10 = (com.google.common.p4552o.p4553a.C59560p) r10
            com.google.android.apps.gsa.assistant.shared.l.e r11 = com.google.android.apps.gsa.assistant.shared.l.e.O
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.common.o.a.u r12 = (com.google.common.p4552o.p4553a.C59565u) r12
            int r11 = r11.ca
            r12.f158054b = r11
            int r11 = r12.f158053a
            r11 = r11 | r4
            r12.f158053a = r11
            r5.copyOnWrite()
            com.google.protobuf.bv r11 = r5.instance
            com.google.common.o.uf r11 = (com.google.common.p4552o.C60555uf) r11
            com.google.protobuf.bv r10 = r10.build()
            com.google.common.o.a.u r10 = (com.google.common.p4552o.p4553a.C59565u) r10
            r10.getClass()
            r11.f164174bb = r10
            int r10 = r11.f164251f
            r12 = 33554432(0x2000000, float:9.403955E-38)
            r10 = r10 | r12
            r11.f164251f = r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.common.o.a.y r9 = (com.google.common.p4552o.p4553a.C59569y) r9
            r5.copyOnWrite()
            com.google.protobuf.bv r10 = r5.instance
            com.google.common.o.uf r10 = (com.google.common.p4552o.C60555uf) r10
            r9.getClass()
            r10.f164241cs = r9
            int r9 = r10.f164255j
            r9 = r9 | 2048(0x800, float:2.87E-42)
            r10.f164255j = r9
            com.google.android.apps.gsa.search.core.i.t r9 = r7.f312312h
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249365cE
            boolean r9 = r9.mo79746e(r10)
            if (r9 != 0) goto L_0x050e
            com.google.android.apps.gsa.search.core.i.t r9 = r7.f312312h
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249373cM
            boolean r21 = r9.mo79746e(r10)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r9 = r3.f312419c
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r10 = r3.f312418b
            j$.util.OptionalInt r17 = r10.mo100198K()
            java.lang.String r10 = r7.f312315k
            com.google.common.o.e.a r11 = r3.f312420d
            int r12 = r3.f312423g
            r22 = 2
            com.google.android.libraries.gsa.k.g r13 = r7.f312311g
            r16 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r23 = r13
            j$.util.Optional r9 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112665ac.m186456b(r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r10 = r9.isPresent()
            if (r10 == 0) goto L_0x050e
            java.lang.Object r9 = r9.get()
            com.google.common.util.concurrent.cx r9 = (com.google.common.util.concurrent.C60870cx) r9
            com.google.android.libraries.gsa.k.g r10 = r7.f312311g
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.am r11 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.am
            r11.<init>(r7, r3, r5, r8)
            com.google.android.apps.gsa.shared.util.c.ag r12 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r13 = "[Tapas] annotate monitoring data"
            r12.<init>(r9, r10, r13, r11)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.an r9 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.an
            r9.<init>(r7, r3, r5, r8)
            r12.mo85223a(r9)
            goto L_0x0511
        L_0x050e:
            r7.mo99625b(r3, r5, r8)
        L_0x0511:
            com.google.android.apps.gsa.search.core.i.t r3 = r6.f312618c
            boolean r3 = com.google.android.apps.gsa.opa.p6448i.C83709a.m133281a(r3)
            if (r3 == 0) goto L_0x0520
            j$.util.OptionalInt r3 = r26.mo100198K()
            r6.mo99741c(r1, r2, r3, r4)
        L_0x0520:
            com.google.android.apps.gsa.search.core.i.t r3 = r6.f312618c
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249381cU
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x066b
            dagger.a r3 = r6.f312626k
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ac r3 = (com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112665ac) r3
            dagger.a r4 = r3.f312282j
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ff r4 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff) r4
            boolean r4 = r4.mo100143i()
            if (r4 != 0) goto L_0x054a
            com.google.android.apps.gsa.search.core.i.t r4 = r3.f312279g
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249270aP
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x066b
        L_0x054a:
            j$.util.Optional r4 = r27.mo100133n()
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.p r5 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.p
            r5.<init>(r3)
            j$.util.Optional r4 = r4.map(r5)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r5 = r27.mo100118a()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.dm r7 = r3.f312284l
            long r7 = r7.mo100146a()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.eo r5 = r5.mo100020e()
            r5.mo100011k(r7)
            com.google.common.b.gu r7 = r27.mo100053o()
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.n r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112706n.f312447a
            j$.util.stream.Stream r7 = r7.map(r8)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.t r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112712t.f312453a
            j$.util.stream.Stream r7 = r7.filter(r8)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.u r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112713u.f312454a
            j$.util.stream.Stream r7 = r7.map(r8)
            j$.util.stream.Collector r8 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r7 = r7.collect(r8)
            com.google.common.b.gu r7 = (com.google.common.p4522b.C58485gu) r7
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0596
            j$.util.Optional r4 = p3186j$.util.Optional.empty()
            goto L_0x0620
        L_0x0596:
            com.google.assistant.ar.a.d r8 = com.google.assistant.p3858ar.p3859a.C49714d.f128299g
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.ar.a.c r8 = (com.google.assistant.p3858ar.p3859a.C49713c) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.ar.a.d r9 = (com.google.assistant.p3858ar.p3859a.C49714d) r9
            int r10 = r9.f128301a
            r10 = r10 | r15
            r9.f128301a = r10
            r9.f128302b = r15
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.ar.a.d r9 = (com.google.assistant.p3858ar.p3859a.C49714d) r9
            com.google.protobuf.ck r10 = r9.f128303c
            boolean r11 = r10.mo58948c()
            if (r11 != 0) goto L_0x05c1
            com.google.protobuf.ck r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62964ck) r10)
            r9.f128303c = r10
        L_0x05c1:
            com.google.protobuf.ck r9 = r9.f128303c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r7, (java.util.List) r9)
            com.google.android.apps.gsa.search.core.i.t r7 = r3.f312279g
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249460du
            boolean r7 = r7.mo79746e(r9)
            if (r7 == 0) goto L_0x05df
            r8.copyOnWrite()
            com.google.protobuf.bv r7 = r8.instance
            com.google.assistant.ar.a.d r7 = (com.google.assistant.p3858ar.p3859a.C49714d) r7
            int r9 = r7.f128301a
            r9 = r9 | 4
            r7.f128301a = r9
            r7.f128305e = r15
        L_0x05df:
            j$.util.Optional r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112665ac.m186455a(r26)
            p3186j$.util.Objects.requireNonNull(r8)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.v r9 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.v
            r9.<init>(r8)
            r7.ifPresent(r9)
            boolean r7 = r4.isPresent()
            if (r7 == 0) goto L_0x060b
            com.google.android.libraries.gsa.k.g r7 = r3.f312280h
            java.lang.Object r4 = r4.get()
            com.google.common.util.concurrent.cx r4 = (com.google.common.util.concurrent.C60870cx) r4
            p3186j$.util.Objects.requireNonNull(r8)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.w r9 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.w
            r9.<init>(r8)
            java.lang.String r8 = "[Tapas] Set client event id to logging request"
            com.google.common.util.concurrent.cx r4 = r7.mo28209i(r4, r8, r9)
            goto L_0x060f
        L_0x060b:
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92900i(r8)
        L_0x060f:
            com.google.android.libraries.gsa.k.g r7 = r3.f312280h
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.x r8 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.x
            r8.<init>(r5)
            java.lang.String r5 = "[Tapas] Generate logging request"
            com.google.common.util.concurrent.cx r4 = r7.mo28209i(r4, r5, r8)
            j$.util.Optional r4 = p3186j$.util.Optional.m71637of(r4)
        L_0x0620:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x0642
            com.google.android.apps.search.assistant.platform.i.e.a.f r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112665ac.f312274b
            java.lang.String r5 = "logging_request_skipped"
            r4.mo105240i(r5)
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112665ac.f312273a
            com.google.common.f.x r4 = r4.mo56224b()
            r5 = 27510(0x6b76, float:3.855E-41)
            java.lang.String r7 = "Skipping sending server-side logging request"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r5)).mo56386p(r7)
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.k r3 = r3.f312283k
            com.google.android.apps.gsa.staticplugins.opa.tapas.c.a.r r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r.CORTEX_LOG
            r3.mo99076a(r4, r7)
            goto L_0x066b
        L_0x0642:
            com.google.android.libraries.gsa.k.g r5 = r3.f312280h
            java.lang.Object r4 = r4.get()
            com.google.common.util.concurrent.cx r4 = (com.google.common.util.concurrent.C60870cx) r4
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.q r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.q
            r7.<init>(r3)
            java.lang.String r8 = "[Tapas] Send MLlogging request"
            com.google.common.util.concurrent.cx r4 = r5.mo28210j(r4, r8, r7)
            com.google.android.libraries.gsa.k.g r5 = r3.f312280h
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.r r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.r
            r7.<init>(r3)
            com.google.android.apps.gsa.shared.util.c.ag r8 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r9 = "process logging response"
            r8.<init>(r4, r5, r9, r7)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.s r4 = new com.google.android.apps.gsa.staticplugins.opa.tapas.logging.s
            r4.<init>(r3)
            r8.mo85223a(r4)
        L_0x066b:
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.aw r3 = r6.f312620e
            com.google.common.o.a.cz r7 = r3.mo99626a()
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep r3 = r27.mo100118a()
            java.lang.String r3 = r3.mo100033p()
            r4 = 0
            j$.util.Optional r5 = r27.mo100125g()
            java.lang.String r0 = r26.mo100199L()
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r0)
            r0 = r24
            r1 = r25
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r8
            r0.mo99740b(r1, r2, r3, r4, r5)
            com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ay r0 = r6.f312619d
            r0.mo99644b()
            return r7
        L_0x0697:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null featureVEIdsOptional"
            r0.<init>(r1)
            throw r0
        L_0x069f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null clientEventId"
            r0.<init>(r1)
            throw r0
        L_0x06a7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null eventName"
            r0.<init>(r1)
            throw r0
        L_0x06af:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null tapasSuggestionResponse"
            r0.<init>(r1)
            throw r0
        L_0x06b7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null tapasSuggestionWrapper"
            r0.<init>(r1)
            throw r0
        L_0x06bf:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null requestId"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m.C112794ct.mo99739a(int, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez, com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es, j$.util.Optional):com.google.common.o.a.cz");
    }

    /* renamed from: b */
    public final void mo99740b(int i, String str, boolean z, Optional optional, Optional optional2) {
        if (this.f312618c.mo79746e(C89978aq.f246621t)) {
            C100923f fVar = this.f312628m;
            C67328ce ceVar = (C67328ce) C67329cf.f183007c.createBuilder();
            String str2 = (String) optional2.orElse(str);
            ceVar.copyOnWrite();
            C67329cf cfVar = (C67329cf) ceVar.instance;
            str2.getClass();
            cfVar.f183009a |= 1;
            cfVar.f183010b = str2;
            C60856cj.m92911t(fVar.mo92096a((C67329cf) ceVar.build()), C47810es.m84974n(new C112793cs()), C60826bg.f164896a);
        }
        C121537f fVar2 = f312617b;
        fVar2.mo105240i("tapas_fulfillment_type_".concat(C48736r.m85275a(i)));
        fVar2.mo105239h("tapas_prefix_fulfillment_type_".concat(C48736r.m85275a(i)), (long) str.length());
        C59568x xVar = (C59568x) C59569y.f158066g.createBuilder();
        int length = str.length();
        xVar.copyOnWrite();
        C59569y yVar = (C59569y) xVar.instance;
        yVar.f158068a |= 1;
        yVar.f158069b = length;
        Objects.requireNonNull(xVar);
        optional.ifPresent(new C112792cr(xVar));
        switch (i - 1) {
            case 2:
            case 20:
            case 24:
                C107662av avVar = (C107662av) this.f312627l.mo27525b();
                avVar.f299654b = true;
                avVar.mo96205a(C89849ae.AGSA_TEXT_TAPAS_ATTENTION);
                this.f312621f.mo99669d(C89849ae.TAPAS_ANSWER_ATTENTION);
                return;
            case 3:
                ((C107662av) this.f312627l.mo27525b()).mo96208d(this.f312620e.mo99626a(), (C59569y) xVar.build());
                this.f312621f.mo99669d(C89849ae.TAPAS_PERFORM_APP_ACTION);
                return;
            case 4:
            case 22:
                ((C107662av) this.f312627l.mo27525b()).mo96207c();
                this.f312621f.mo99669d(C89849ae.TAPAS_PERFORM_HOME_AUTOMATION);
                return;
            case 5:
            case 13:
                ((C107662av) this.f312627l.mo27525b()).mo96208d(this.f312620e.mo99626a(), (C59569y) xVar.build());
                this.f312621f.mo99669d(C89849ae.TAPAS_EXTERNAL_APP_OPEN);
                return;
            case 6:
                ((C107662av) this.f312627l.mo27525b()).mo96208d(this.f312620e.mo99626a(), (C59569y) xVar.build());
                this.f312621f.mo99669d(C89849ae.TAPAS_PLAY_MEDIA);
                return;
            case 7:
                ((C107662av) this.f312627l.mo27525b()).mo96208d(this.f312620e.mo99626a(), (C59569y) xVar.build());
                this.f312621f.mo99669d(C89849ae.TAPAS_CALL_CONTACT);
                return;
            case 8:
                ((C107662av) this.f312627l.mo27525b()).mo96208d(this.f312620e.mo99626a(), (C59569y) xVar.build());
                this.f312621f.mo99669d(C89849ae.TAPAS_SEND_MESSAGE);
                return;
            case 10:
                ((C107662av) this.f312627l.mo27525b()).mo96208d(this.f312620e.mo99626a(), (C59569y) xVar.build());
                this.f312621f.mo99669d(C89849ae.TAPAS_PERFORM_PRODUCTIVITY_ACTION);
                return;
            case 11:
                ((C107662av) this.f312627l.mo27525b()).mo96207c();
                this.f312621f.mo99669d(C89849ae.TAPAS_DEVICE_ACTION_SLICE_CHANGE);
                return;
            case 12:
                ((C107662av) this.f312627l.mo27525b()).mo96208d(this.f312620e.mo99626a(), (C59569y) xVar.build());
                this.f312621f.mo99669d(C89849ae.TAPAS_EXTERNAL_APP_OPEN_VIDEO);
                return;
            case 14:
                ((C107662av) this.f312627l.mo27525b()).mo96208d(this.f312620e.mo99626a(), (C59569y) xVar.build());
                this.f312621f.mo99669d(C89849ae.TAPAS_ZERO_STATE_CANCEL);
                return;
            case 15:
                if (this.f312618c.mo79746e(C90029ch.f248215aB)) {
                    this.f312620e.mo99633h(optional2);
                    C107662av avVar2 = (C107662av) this.f312627l.mo27525b();
                    C59529cz a = this.f312620e.mo99626a();
                    C59569y yVar2 = (C59569y) xVar.build();
                    if (avVar2.f299653a.mo79746e(C90029ch.f248215aB)) {
                        avVar2.mo96206b(C89849ae.AGSA_TEXT_TAPAS_CORRECTIONS_SUBMIT, Optional.m71637of(a), Optional.m71637of(yVar2));
                    }
                    this.f312621f.mo99669d(C89849ae.TAPAS_TEXT_SUGGESTION_SUBMIT);
                    return;
                }
                break;
            case 23:
                ((C107662av) this.f312627l.mo27525b()).mo96207c();
                this.f312621f.mo99669d(C89849ae.TAPAS_APP_ACTIONS_SLICE_CHANGE);
                return;
        }
        if (!m186665d(i)) {
            return;
        }
        if (z) {
            ((C107662av) this.f312627l.mo27525b()).mo96206b(C89849ae.AGSA_TEXT_TAPAS_QUERY_SUBMIT, Optional.m71637of(this.f312620e.mo99626a()), Optional.m71637of((C59569y) xVar.build()));
            this.f312621f.mo99669d(C89849ae.TAPAS_TEXT_QUERY_SUBMIT);
            return;
        }
        ((C107662av) this.f312627l.mo27525b()).mo96208d(this.f312620e.mo99626a(), (C59569y) xVar.build());
        this.f312621f.mo99669d(C89849ae.TAPAS_TEXT_SUGGESTION_SUBMIT);
    }

    /* renamed from: c */
    public final void mo99741c(int i, C113408es esVar, OptionalInt optionalInt, int i2) {
        if (m186665d(i)) {
            C112665ac acVar = (C112665ac) this.f312626k.mo27525b();
            if (acVar.f312279g.mo79746e(C90063do.f249365cE)) {
                acVar.mo99617c(i, esVar, optionalInt, i2, C59743a.TAPAS_ML_MODEL_REQUEST);
                return;
            }
            acVar.mo99617c(i, esVar, optionalInt, i2, C59743a.TAPAS_SERVER_QUERY);
            return;
        }
        C112665ac acVar2 = (C112665ac) this.f312626k.mo27525b();
        if (acVar2.f312279g.mo79746e(C90063do.f249365cE)) {
            acVar2.mo99617c(i, esVar, optionalInt, i2, C59743a.TAPAS_ML_MODEL_REQUEST);
        }
    }
}
