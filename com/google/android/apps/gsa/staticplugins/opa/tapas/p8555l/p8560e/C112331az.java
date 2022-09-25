package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.assistant.shared.l.h;
import com.google.android.apps.gsa.assistant.shared.l.j;
import com.google.android.apps.gsa.assistant.shared.l.k;
import com.google.android.apps.gsa.assistant.shared.l.l;
import com.google.android.apps.gsa.assistant.shared.l.m;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63087y;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.research.p5181a.p5182a.C66282e;
import com.google.research.p5181a.p5182a.C66283f;
import com.google.research.p5181a.p5182a.C66285h;
import com.google.research.p5181a.p5182a.C66286i;
import com.google.research.p5181a.p5182a.C66287j;
import com.google.research.p5181a.p5182a.C66288k;
import com.google.research.p5181a.p5182a.C66289l;
import com.google.research.p5181a.p5182a.C66290m;
import com.google.research.p5181a.p5187e.C66352b;
import com.google.research.p5181a.p5187e.C66355e;
import com.google.research.p5181a.p5187e.C66361k;
import com.google.research.p5181a.p5187e.C66364n;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.time.Instant;
import p3186j$.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.az */
/* compiled from: PG */
public final class C112331az {

    /* renamed from: a */
    public static final C121537f f311704a = C121537f.m200840b("Tapas/ReflectionDataManager", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f311705b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.az");

    /* renamed from: c */
    public final C22871g f311706c;

    /* renamed from: d */
    public final u f311707d;

    /* renamed from: e */
    public final C83581al f311708e;

    /* renamed from: f */
    public final C86124t f311709f;

    /* renamed from: g */
    private final C22871g f311710g;

    /* renamed from: h */
    private final i f311711h;

    public C112331az(C83581al alVar, C22871g gVar, C22871g gVar2, i iVar, u uVar, C86124t tVar) {
        this.f311708e = alVar;
        this.f311706c = gVar;
        this.f311710g = gVar2;
        this.f311711h = iVar;
        this.f311707d = uVar;
        this.f311709f = tVar;
    }

    /* renamed from: b */
    public static m m186193b(C66355e eVar, Instant instant) {
        k createBuilder = l.d.createBuilder();
        long epochMilli = instant.toEpochMilli();
        createBuilder.copyOnWrite();
        createBuilder.instance.c = epochMilli;
        C63088z A = C63088z.m96139A(C66355e.m97090c(eVar));
        createBuilder.copyOnWrite();
        createBuilder.instance.a = A;
        createBuilder.copyOnWrite();
        createBuilder.instance.b = 1;
        l build = createBuilder.build();
        j createBuilder2 = m.b.createBuilder();
        createBuilder2.copyOnWrite();
        build.getClass();
        createBuilder2.instance.a = build;
        return createBuilder2.build();
    }

    /* renamed from: g */
    private static C58485gu m186194g(Map map) {
        C58480gp e = C58485gu.m89837e();
        Map.EL.forEach(map, new C112321ap(e));
        return e.mo55394f();
    }

    /* renamed from: a */
    public final com.google.android.apps.gsa.assistant.shared.l.i mo99498a(java.util.Map map, Instant instant) {
        C66288k kVar;
        C66285h hVar = (C66285h) C66286i.f180264e.createBuilder();
        long epochMilli = instant.toEpochMilli();
        hVar.copyOnWrite();
        C66286i iVar = (C66286i) hVar.instance;
        iVar.f180266a |= 1;
        iVar.f180267b = epochMilli;
        long a = this.f311709f.mo79743a(C90063do.f249564fs);
        hVar.copyOnWrite();
        C66286i iVar2 = (C66286i) hVar.instance;
        iVar2.f180266a |= 2;
        iVar2.f180268c = (int) a;
        for (Map.Entry entry : ((C58495hd) map).entrySet()) {
            C66289l lVar = (C66289l) C66290m.f180281d.createBuilder();
            String str = (String) entry.getKey();
            lVar.copyOnWrite();
            C66290m mVar = (C66290m) lVar.instance;
            str.getClass();
            mVar.f180283a |= 1;
            mVar.f180284b = str;
            C66364n nVar = (C66364n) entry.getValue();
            for (C66361k kVar2 : nVar.f180453g) {
                C66282e eVar = (C66282e) C66283f.f180257d.createBuilder();
                int intValue = nVar.mo59598c(kVar2).intValue();
                eVar.copyOnWrite();
                C66283f fVar = (C66283f) eVar.instance;
                fVar.f180259a |= 2;
                fVar.f180261c = intValue;
                C66287j jVar = (C66287j) C66288k.f180270j.createBuilder();
                C63087y v = C63088z.m96150v();
                DataOutputStream dataOutputStream = new DataOutputStream(v);
                kVar2.mo59581h(dataOutputStream);
                dataOutputStream.flush();
                C63088z b = v.mo59165b();
                jVar.copyOnWrite();
                C66288k kVar3 = (C66288k) jVar.instance;
                b.getClass();
                kVar3.f180272a |= 2;
                kVar3.f180274c = b;
                dataOutputStream.close();
                String e = kVar2.mo59575e();
                jVar.copyOnWrite();
                C66288k kVar4 = (C66288k) jVar.instance;
                e.getClass();
                kVar4.f180272a |= 1;
                kVar4.f180273b = e;
                if (!(kVar2 instanceof C66352b)) {
                    kVar = (C66288k) jVar.build();
                } else {
                    C66352b bVar = (C66352b) kVar2;
                    int i = bVar.f180423e;
                    jVar.copyOnWrite();
                    C66288k kVar5 = (C66288k) jVar.instance;
                    kVar5.f180272a |= 8;
                    kVar5.f180276e = i;
                    int i2 = bVar.f180426h;
                    jVar.copyOnWrite();
                    C66288k kVar6 = (C66288k) jVar.instance;
                    kVar6.f180272a |= 4;
                    kVar6.f180275d = i2;
                    HashMap hashMap = bVar.f180422d;
                    C58480gp e2 = C58485gu.m89837e();
                    Map.EL.forEach(hashMap, new C112319an(e2));
                    C58485gu f = e2.mo55394f();
                    jVar.copyOnWrite();
                    C66288k kVar7 = (C66288k) jVar.instance;
                    C62971cq cqVar = kVar7.f180277f;
                    if (!cqVar.mo58948c()) {
                        kVar7.f180277f = C62942bv.mutableCopy(cqVar);
                    }
                    C62947c.addAll((Iterable) f, (List) kVar7.f180277f);
                    C58485gu g = m186194g(bVar.f180421c);
                    jVar.copyOnWrite();
                    C66288k kVar8 = (C66288k) jVar.instance;
                    C62971cq cqVar2 = kVar8.f180278g;
                    if (!cqVar2.mo58948c()) {
                        kVar8.f180278g = C62942bv.mutableCopy(cqVar2);
                    }
                    C62947c.addAll((Iterable) g, (List) kVar8.f180278g);
                    C58485gu g2 = m186194g(bVar.f180424f);
                    jVar.copyOnWrite();
                    C66288k kVar9 = (C66288k) jVar.instance;
                    C62971cq cqVar3 = kVar9.f180279h;
                    if (!cqVar3.mo58948c()) {
                        kVar9.f180279h = C62942bv.mutableCopy(cqVar3);
                    }
                    C62947c.addAll((Iterable) g2, (List) kVar9.f180279h);
                    C58485gu g3 = m186194g(bVar.f180425g);
                    jVar.copyOnWrite();
                    C66288k kVar10 = (C66288k) jVar.instance;
                    C62971cq cqVar4 = kVar10.f180280i;
                    if (!cqVar4.mo58948c()) {
                        kVar10.f180280i = C62942bv.mutableCopy(cqVar4);
                    }
                    C62947c.addAll((Iterable) g3, (List) kVar10.f180280i);
                    kVar = (C66288k) jVar.build();
                }
                eVar.copyOnWrite();
                C66283f fVar2 = (C66283f) eVar.instance;
                kVar.getClass();
                fVar2.f180260b = kVar;
                fVar2.f180259a |= 1;
                lVar.copyOnWrite();
                C66290m mVar2 = (C66290m) lVar.instance;
                C66283f fVar3 = (C66283f) eVar.build();
                fVar3.getClass();
                C62971cq cqVar5 = mVar2.f180285c;
                if (!cqVar5.mo58948c()) {
                    mVar2.f180285c = C62942bv.mutableCopy(cqVar5);
                }
                mVar2.f180285c.add(fVar3);
            }
            hVar.copyOnWrite();
            C66286i iVar3 = (C66286i) hVar.instance;
            C66290m mVar3 = (C66290m) lVar.build();
            mVar3.getClass();
            C62971cq cqVar6 = iVar3.f180269d;
            if (!cqVar6.mo58948c()) {
                iVar3.f180269d = C62942bv.mutableCopy(cqVar6);
            }
            iVar3.f180269d.add(mVar3);
        }
        h createBuilder = com.google.android.apps.gsa.assistant.shared.l.i.b.createBuilder();
        createBuilder.copyOnWrite();
        C66286i iVar4 = (C66286i) hVar.build();
        iVar4.getClass();
        createBuilder.instance.a = iVar4;
        return createBuilder.build();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112329ax mo99499c(p3186j$.util.Optional r17) {
        /*
            r16 = this;
            r0 = r16
            boolean r1 = r17.isEmpty()
            if (r1 == 0) goto L_0x000d
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ax r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112329ax.m186189d()
            return r1
        L_0x000d:
            java.lang.Object r1 = r17.get()
            com.google.android.apps.gsa.assistant.shared.l.i r1 = (com.google.android.apps.gsa.assistant.shared.l.i) r1
            com.google.research.a.a.i r1 = r1.a
            if (r1 != 0) goto L_0x0019
            com.google.research.a.a.i r1 = com.google.research.p5181a.p5182a.C66286i.f180264e
        L_0x0019:
            int r1 = r1.f180268c
            long r1 = (long) r1
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f311709f
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249564fs
            long r3 = r3.mo79743a(r4)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0059
            com.google.common.f.e r1 = f311705b
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            r2 = 27688(0x6c28, float:3.8799E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            java.lang.Object r2 = r17.get()
            com.google.android.apps.gsa.assistant.shared.l.i r2 = (com.google.android.apps.gsa.assistant.shared.l.i) r2
            com.google.research.a.a.i r2 = r2.a
            if (r2 != 0) goto L_0x0044
            com.google.research.a.a.i r2 = com.google.research.p5181a.p5182a.C66286i.f180264e
        L_0x0044:
            int r2 = r2.f180268c
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f311709f
            com.google.android.apps.gsa.shared.m.f r4 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249564fs
            long r3 = r3.mo79743a(r4)
            java.lang.String r5 = "Loaded Reflection model version %d, with the latest model version %d."
            r1.mo56394x(r5, r2, r3)
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ay r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ay
            r1.<init>()
            throw r1
        L_0x0059:
            com.google.common.b.gz r1 = new com.google.common.b.gz
            r2 = 4
            r1.<init>(r2)
            com.google.research.a.b.a.c r2 = new com.google.research.a.b.a.c
            r2.<init>()
            java.lang.Object r3 = r17.get()
            com.google.android.apps.gsa.assistant.shared.l.i r3 = (com.google.android.apps.gsa.assistant.shared.l.i) r3
            com.google.research.a.a.i r3 = r3.a
            if (r3 != 0) goto L_0x0070
            com.google.research.a.a.i r3 = com.google.research.p5181a.p5182a.C66286i.f180264e
        L_0x0070:
            com.google.protobuf.cq r3 = r3.f180269d
            java.util.Iterator r3 = r3.iterator()
        L_0x0076:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x01e8
            java.lang.Object r4 = r3.next()
            com.google.research.a.a.m r4 = (com.google.research.p5181a.p5182a.C66290m) r4
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bi r6 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bi
            com.google.android.libraries.gsa.k.g r7 = r0.f311710g
            r6.<init>(r7)
            com.google.protobuf.cq r7 = r4.f180285c
            java.util.Iterator r7 = r7.iterator()
        L_0x0090:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01e1
            java.lang.Object r8 = r7.next()
            com.google.research.a.a.f r8 = (com.google.research.p5181a.p5182a.C66283f) r8
            com.google.research.a.a.k r9 = r8.f180260b
            if (r9 != 0) goto L_0x00a2
            com.google.research.a.a.k r9 = com.google.research.p5181a.p5182a.C66288k.f180270j
        L_0x00a2:
            java.lang.String r10 = r9.f180273b
            java.lang.String r11 = "neural_predictor"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x00b2
            com.google.research.a.e.i r10 = new com.google.research.a.e.i
            r10.<init>()
            goto L_0x0107
        L_0x00b2:
            java.lang.String r11 = "recency_event_predictor"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x00c0
            com.google.research.a.e.m r10 = new com.google.research.a.e.m
            r10.<init>()
            goto L_0x0107
        L_0x00c0:
            java.lang.String r11 = "shortcut_neural_predictor"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x00ce
            com.google.research.a.e.u r10 = new com.google.research.a.e.u
            r10.<init>()
            goto L_0x0107
        L_0x00ce:
            java.lang.String r11 = "Rule_Based_Predictor"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x00dc
            com.google.research.a.e.o r10 = new com.google.research.a.e.o
            r10.<init>()
            goto L_0x0107
        L_0x00dc:
            java.lang.String r11 = "sharesheet_directshare_logistic_predictor"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x00ea
            com.google.research.a.e.d r10 = new com.google.research.a.e.d
            r10.<init>()
            goto L_0x0107
        L_0x00ea:
            java.lang.String r11 = "sharesheet_shareapp_logistic_predictor"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x00f8
            com.google.research.a.e.t r10 = new com.google.research.a.e.t
            r10.<init>()
            goto L_0x0107
        L_0x00f8:
            java.lang.String r11 = "sharesheet_shareapp_ltr_softmax_predictor"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0106
            com.google.research.a.e.s r10 = new com.google.research.a.e.s
            r10.<init>()
            goto L_0x0107
        L_0x0106:
            r10 = 0
        L_0x0107:
            if (r10 != 0) goto L_0x0125
            java.lang.String r10 = r9.f180273b
            com.google.assistant.ad.d.b.ac r11 = com.google.assistant.p3781ad.p3789d.p3791b.C48668ac.LOGISTIC_PREDICTOR
            java.lang.String r11 = r11.name()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x011d
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.c r10 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.c
            r10.<init>()
            goto L_0x0125
        L_0x011d:
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.f r10 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.f
            com.google.assistant.ad.d.b.ac r11 = com.google.assistant.p3781ad.p3789d.p3791b.C48668ac.UNSPECIFIED_REFLECTION_PREDICTOR
            r12 = 0
            r10.<init>(r11, r5, r5, r12)
        L_0x0125:
            java.io.DataInputStream r11 = new java.io.DataInputStream
            com.google.protobuf.z r12 = r9.f180274c
            java.io.InputStream r12 = r12.mo59041m()
            r11.<init>(r12)
            r10.mo59580g(r11, r2)
            r11.close()
            boolean r11 = r10 instanceof com.google.research.p5181a.p5187e.C66352b
            if (r11 != 0) goto L_0x013d
            r15 = r6
            goto L_0x01d8
        L_0x013d:
            com.google.research.a.e.b r10 = (com.google.research.p5181a.p5187e.C66352b) r10
            int r11 = r9.f180276e
            r10.f180423e = r11
            int r11 = r9.f180275d
            r10.f180426h = r11
            com.google.protobuf.cq r11 = r9.f180277f
            java.util.Iterator r11 = r11.iterator()
        L_0x014d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0167
            java.lang.Object r12 = r11.next()
            com.google.research.a.a.p r12 = (com.google.research.p5181a.p5182a.C66293p) r12
            java.util.HashMap r13 = r10.f180422d
            java.lang.String r14 = r12.f180290c
            int r12 = r12.f180289b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r13.put(r14, r12)
            goto L_0x014d
        L_0x0167:
            com.google.protobuf.cq r11 = r9.f180278g
            java.util.Iterator r11 = r11.iterator()
        L_0x016d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x018f
            java.lang.Object r12 = r11.next()
            com.google.research.a.a.d r12 = (com.google.research.p5181a.p5182a.C66281d) r12
            java.util.HashMap r13 = r10.f180421c
            int r14 = r12.f180255b
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = r6
            long r5 = r12.f180256c
            int r6 = (int) r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r13.put(r14, r5)
            r6 = r15
            r5 = 0
            goto L_0x016d
        L_0x018f:
            r15 = r6
            com.google.protobuf.cq r5 = r9.f180279h
            java.util.Iterator r5 = r5.iterator()
        L_0x0196:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01b4
            java.lang.Object r6 = r5.next()
            com.google.research.a.a.d r6 = (com.google.research.p5181a.p5182a.C66281d) r6
            java.util.HashMap r11 = r10.f180424f
            int r12 = r6.f180255b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            long r13 = r6.f180256c
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r11.put(r12, r6)
            goto L_0x0196
        L_0x01b4:
            com.google.protobuf.cq r5 = r9.f180280i
            java.util.Iterator r5 = r5.iterator()
        L_0x01ba:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01d8
            java.lang.Object r6 = r5.next()
            com.google.research.a.a.d r6 = (com.google.research.p5181a.p5182a.C66281d) r6
            java.util.HashMap r9 = r10.f180425g
            int r11 = r6.f180255b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            long r12 = r6.f180256c
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            r9.put(r11, r6)
            goto L_0x01ba
        L_0x01d8:
            int r5 = r8.f180261c
            r6 = r15
            r6.mo59599d(r10, r5)
            r5 = 0
            goto L_0x0090
        L_0x01e1:
            java.lang.String r4 = r4.f180284b
            r1.mo55429h(r4, r6)
            goto L_0x0076
        L_0x01e8:
            r4 = 0
            com.google.common.b.hd r1 = r1.mo55427f(r4)
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            java.lang.Object r2 = r17.get()
            com.google.android.apps.gsa.assistant.shared.l.i r2 = (com.google.android.apps.gsa.assistant.shared.l.i) r2
            com.google.research.a.a.i r2 = r2.a
            if (r2 != 0) goto L_0x01fd
            com.google.research.a.a.i r2 = com.google.research.p5181a.p5182a.C66286i.f180264e
        L_0x01fd:
            long r2 = r2.f180267b
            j$.time.Instant r2 = p3186j$.time.Instant.ofEpochMilli(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a r3 = new com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.a
            r4 = 0
            r3.<init>(r1, r4, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112331az.mo99499c(j$.util.Optional):com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ax");
    }

    /* renamed from: d */
    public final C60870cx mo99500d() {
        return this.f311706c.mo28209i(this.f311708e.mo76933h(), "opaStore.getTapasTrainingBuffers", C112322aq.f311697a);
    }

    /* renamed from: e */
    public final C60870cx mo99501e() {
        return this.f311706c.mo28209i(this.f311708e.mo76931f(), "opaStore.getTapasModels", new C112323ar(this));
    }

    /* renamed from: f */
    public final C60870cx mo99502f(String str, C65753ak akVar, MessageLite messageLite) {
        return this.f311706c.mo28209i(this.f311711h.c(str, akVar, (String) null, C63662ac.f172144a, messageLite), "readFromGeller", new C112320ao(messageLite, akVar));
    }
}
