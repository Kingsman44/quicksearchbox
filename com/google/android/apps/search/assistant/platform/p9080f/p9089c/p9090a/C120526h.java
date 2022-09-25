package com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C119942a;
import com.google.android.apps.search.assistant.platform.p9080f.p9089c.C120518a;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3908d.p3909a.C51183n;
import com.google.assistant.p3897e.p3908d.p3909a.C51184o;
import com.google.assistant.p3897e.p3908d.p3909a.C51185p;
import com.google.assistant.p3897e.p3917i.p3918a.C51271bn;
import com.google.assistant.p3897e.p3917i.p3918a.C51274bq;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3952i.p3953a.C52966a;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.c.a.h */
/* compiled from: PG */
public final class C120526h implements C120518a {

    /* renamed from: a */
    public static final C59071e f335191a = C59071e.m91331h();

    /* renamed from: b */
    public static final C33476a f335192b = new C33476a("assistant.api.params.DeviceProperties", C51334dw.f133658ab);

    /* renamed from: c */
    public final C119942a f335193c;

    /* renamed from: d */
    public final Executor f335194d;

    /* renamed from: e */
    private final C119935d f335195e;

    /* renamed from: f */
    private final C71422aw f335196f;

    public C120526h(C119942a aVar, C119935d dVar, C71422aw awVar, Executor executor) {
        C69664n.m101061g(aVar, "clientExecutionProxy");
        C69664n.m101061g(dVar, "contextProvider");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f335193c = aVar;
        this.f335195e = dVar;
        this.f335196f = awVar;
        this.f335194d = executor;
    }

    /* renamed from: e */
    private final C51274bq m199639e(C51274bq bqVar, C52428rj rjVar, boolean z) {
        C51185p pVar = bqVar.f133496h;
        if (pVar == null) {
            pVar = C51185p.f133232b;
        }
        C62971cq cqVar = pVar.f133234a;
        C69664n.m101060f(cqVar, "params\n        .getExecu… .getExecutionPlansList()");
        ArrayList arrayList = new ArrayList();
        for (Object next : cqVar) {
            C52428rj rjVar2 = ((C51183n) next).f133231d;
            if (rjVar2 == null) {
                rjVar2 = C52428rj.f137558m;
            }
            if (C52966a.m86761b(rjVar2, rjVar)) {
                arrayList.add(next);
            }
        }
        C58485gu b = C58479go.m89810b(arrayList);
        if (!b.isEmpty()) {
            C51271bn bnVar = (C51271bn) bqVar.toBuilder();
            C51184o oVar = (C51184o) C51185p.f133232b.createBuilder();
            oVar.copyOnWrite();
            C51185p pVar2 = (C51185p) oVar.instance;
            C62971cq cqVar2 = pVar2.f133234a;
            if (!cqVar2.mo58948c()) {
                pVar2.f133234a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) b, (List) pVar2.f133234a);
            bnVar.copyOnWrite();
            C51274bq bqVar2 = (C51274bq) bnVar.instance;
            C51185p pVar3 = (C51185p) oVar.build();
            pVar3.getClass();
            bqVar2.f133496h = pVar3;
            bqVar2.f133489a |= 128;
            C51183n nVar = (C51183n) C69540x.m100819A(b);
            bnVar.copyOnWrite();
            C51274bq bqVar3 = (C51274bq) bnVar.instance;
            nVar.getClass();
            bqVar3.f133495g = nVar;
            bqVar3.f133489a |= 32;
            C62942bv build = bnVar.build();
            C69664n.m101060f(build, "params\n      .toBuilder(…s.first())\n      .build()");
            return (C51274bq) build;
        } else if (z) {
            return bqVar;
        } else {
            C51274bq bqVar4 = C51274bq.f133487i;
            C69664n.m101060f(bqVar4, "getDefaultInstance()");
            return bqVar4;
        }
    }

    /* renamed from: a */
    public final C60870cx mo104800a() {
        return C71663i.m104692e(this.f335196f, (C71424ay) null, new C120520b(this, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final C60870cx mo104801b(C60870cx cxVar) {
        C69664n.m101061g(cxVar, "originalResultFuture");
        return C71663i.m104692e(this.f335196f, (C71424ay) null, new C120525g(cxVar, this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066 A[Catch:{ ct -> 0x00c7, Exception -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b A[Catch:{ ct -> 0x00c7, Exception -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099 A[Catch:{ ct -> 0x00c7, Exception -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104803c(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a.C120519a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.platform.f.c.a.a r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a.C120519a) r0
            int r1 = r0.f335170c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335170c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.c.a.a r0 = new com.google.android.apps.search.assistant.platform.f.c.a.a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f335168a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335170c
            java.lang.String r3 = "getDefaultInstance()"
            r4 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r4) goto L_0x0029
            p5462h.C69714l.m101134b(r6)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            goto L_0x0061
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.assistant.f.a.d.ar r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.aj r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj) r6
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            com.google.android.libraries.search.assistant.f.a.d.at r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            java.lang.String r2 = "asst.device.properties"
            r6.mo38300c(r2)
            com.google.android.libraries.search.assistant.f.a.d.ar r6 = r6.mo38298a()
            com.google.android.apps.search.assistant.platform.b.b.d r2 = r5.f335195e     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            com.google.common.util.concurrent.cx r6 = r2.mo104562a(r6, r4)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            java.lang.String r2 = "contextProvider.fetchContext(contextKey, true)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            r0.f335170c = r4     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            if (r6 == r1) goto L_0x00ad
        L_0x0061:
            com.google.android.libraries.search.assistant.f.a.d.aw r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r6     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            r0 = 0
            if (r6 == 0) goto L_0x0079
            int r1 = r6.f87980a     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            if (r1 != r4) goto L_0x006f
            java.lang.Object r6 = r6.f87981b     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            com.google.android.libraries.search.assistant.f.a.d.ba r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba) r6     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            goto L_0x0071
        L_0x006f:
            com.google.android.libraries.search.assistant.f.a.d.ba r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba.f87988c     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
        L_0x0071:
            if (r6 == 0) goto L_0x0079
            com.google.assistant.e.j.ka r0 = r6.f87991b     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            if (r0 != 0) goto L_0x0079
            com.google.assistant.e.j.ka r0 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
        L_0x0079:
            if (r0 != 0) goto L_0x0099
            com.google.common.f.e r6 = f335191a     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            com.google.common.f.x r6 = r6.mo56226d()     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            java.lang.String r0 = "ContextResult did not contain DeviceProperties."
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            r2 = 35478(0x8a96, float:4.9715E-41)
            r1.<init>(r2)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            r6.mo56379ah(r1)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            r6.mo56386p(r0)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            com.google.assistant.e.j.rj r6 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r3)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            return r6
        L_0x0099:
            com.google.android.libraries.search.assistant.i.a r6 = f335192b     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            com.google.protobuf.MessageLite r6 = r6.mo38880b(r0)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            com.google.assistant.e.i.a.dw r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51334dw) r6     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            com.google.assistant.e.j.rj r6 = r6.f133696j     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            if (r6 != 0) goto L_0x00a7
            com.google.assistant.e.j.rj r6 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
        L_0x00a7:
            java.lang.String r0 = "deviceProperties.deviceId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)     // Catch:{ ct -> 0x00c7, Exception -> 0x00ae }
            return r6
        L_0x00ad:
            return r1
        L_0x00ae:
            com.google.common.f.e r6 = f335191a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 35477(0x8a95, float:4.9714E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "Failed to fetch ContextResult for DeviceProperties."
            r6.mo56386p(r0)
            goto L_0x00df
        L_0x00c7:
            com.google.common.f.e r6 = f335191a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 35476(0x8a94, float:4.9712E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "Failed to parse DeviceProperties."
            r6.mo56386p(r0)
        L_0x00df:
            com.google.assistant.e.j.rj r6 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a.C120526h.mo104803c(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.google.protobuf.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.apps.search.assistant.platform.f.c.a.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.google.android.apps.search.assistant.platform.f.c.a.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: com.google.assistant.e.j.en} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v18, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: com.google.protobuf.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: com.google.protobuf.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: com.google.android.apps.search.assistant.platform.f.c.a.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104804d(com.google.assistant.p3897e.p3921j.C52081en r19, p5462h.p5466c.C69577g r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a.C120521c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.assistant.platform.f.c.a.c r3 = (com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a.C120521c) r3
            int r4 = r3.f335179h
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f335179h = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.assistant.platform.f.c.a.c r3 = new com.google.android.apps.search.assistant.platform.f.c.a.c
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f335177f
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f335179h
            r6 = 1
            if (r5 == 0) goto L_0x0044
            if (r5 != r6) goto L_0x003c
            java.lang.Object r1 = r3.f335176e
            java.lang.Object r4 = r3.f335175d
            java.lang.Object r5 = r3.f335174c
            java.lang.Object r7 = r3.f335173b
            java.lang.Object r3 = r3.f335172a
            p5462h.C69714l.m101134b(r2)
            r17 = r7
            r7 = r1
            r1 = r17
            goto L_0x006d
        L_0x003c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0044:
            p5462h.C69714l.m101134b(r2)
            com.google.protobuf.cq r5 = r1.f136684d
            java.lang.String r2 = "conversationDelta.getInteractionDeltaList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            r3.f335172a = r0
            r3.f335173b = r1
            r3.f335174c = r5
            r3.f335175d = r2
            r3.f335176e = r7
            r3.f335179h = r6
            java.lang.Object r3 = r0.mo104803c(r3)
            if (r3 == r4) goto L_0x0393
            r4 = r2
            r2 = r3
            r3 = r0
        L_0x006d:
            com.google.assistant.e.j.rj r2 = (com.google.assistant.p3897e.p3921j.C52428rj) r2
            java.util.Iterator r5 = r5.iterator()
        L_0x0073:
            boolean r8 = r5.hasNext()
            r9 = 4
            if (r8 == 0) goto L_0x0111
            java.lang.Object r8 = r5.next()
            com.google.assistant.e.j.ep r8 = (com.google.assistant.p3897e.p3921j.C52083ep) r8
            int r10 = r8.f136692b
            if (r10 != r9) goto L_0x0089
            java.lang.Object r9 = r8.f136693c
            com.google.assistant.e.j.ei r9 = (com.google.assistant.p3897e.p3921j.C52076ei) r9
            goto L_0x008b
        L_0x0089:
            com.google.assistant.e.j.ei r9 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x008b:
            com.google.assistant.e.j.rj r9 = r9.f136667b
            if (r9 != 0) goto L_0x0091
            com.google.assistant.e.j.rj r9 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
        L_0x0091:
            java.lang.String r10 = "interaction.fromAssistant.targetDeviceId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            java.lang.String r10 = com.google.assistant.p3952i.p3953a.C52966a.m86760a(r2)
            java.lang.String r11 = "getDeviceIdStringFromDeviceId(sourceDeviceId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            int r10 = r10.length()
            java.lang.String r11 = "interaction"
            if (r10 != 0) goto L_0x00a8
            goto L_0x0109
        L_0x00a8:
            java.lang.String r10 = com.google.assistant.p3952i.p3953a.C52966a.m86760a(r9)
            java.lang.String r12 = "getDeviceIdStringFromDeviceId(targetDeviceId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)
            int r10 = r10.length()
            if (r10 == 0) goto L_0x0109
            boolean r10 = com.google.assistant.p3952i.p3953a.C52966a.m86761b(r2, r9)
            if (r10 != 0) goto L_0x0109
            r10 = r7
            java.util.LinkedHashMap r10 = (java.util.LinkedHashMap) r10
            java.util.Set r12 = r10.entrySet()
            java.lang.String r13 = "targetDeviceToInteractions.entries"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            java.util.Iterator r12 = r12.iterator()
        L_0x00cd:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00ec
            java.lang.Object r13 = r12.next()
            r14 = r13
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.String r15 = "(key, _)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r15)
            java.lang.Object r14 = r14.getKey()
            com.google.assistant.e.j.rj r14 = (com.google.assistant.p3897e.p3921j.C52428rj) r14
            boolean r14 = com.google.assistant.p3952i.p3953a.C52966a.m86761b(r9, r14)
            if (r14 == 0) goto L_0x00cd
            goto L_0x00ed
        L_0x00ec:
            r13 = 0
        L_0x00ed:
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            if (r13 == 0) goto L_0x00f9
            java.lang.Object r12 = r13.getValue()
            java.util.List r12 = (java.util.List) r12
            if (r12 != 0) goto L_0x00fe
        L_0x00f9:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x00fe:
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r11)
            r12.add(r8)
            r10.put(r9, r12)
            goto L_0x0073
        L_0x0109:
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r11)
            r4.add(r8)
            goto L_0x0073
        L_0x0111:
            r5 = r7
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x011b
            return r1
        L_0x011b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = r1
            com.google.assistant.e.j.en r8 = (com.google.assistant.p3897e.p3921j.C52081en) r8
            com.google.assistant.e.j.ex r10 = r8.f136685e
            if (r10 != 0) goto L_0x0129
            com.google.assistant.e.j.ex r10 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0129:
            com.google.protobuf.cq r10 = r10.f136712a
            java.lang.String r11 = "conversationDelta.paramsDelta.paramList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            com.google.android.libraries.search.assistant.i.d r12 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89595d
            java.lang.String r13 = "REQUEST_LOGGING_PARAMS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            com.google.protobuf.MessageLite r10 = com.google.android.libraries.search.assistant.p2585i.C33481e.m62058a(r10, r12)
            com.google.assistant.e.i.a.li r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r10
            com.google.assistant.e.j.ex r12 = r8.f136685e
            if (r12 != 0) goto L_0x0143
            com.google.assistant.e.j.ex r12 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0143:
            com.google.protobuf.cq r12 = r12.f136712a
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r11)
            com.google.android.libraries.search.assistant.i.d r13 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89592a
            java.lang.String r14 = "CLIENT_EXECUTION_PARAMS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            com.google.protobuf.MessageLite r12 = com.google.android.libraries.search.assistant.p2585i.C33481e.m62058a(r12, r13)
            com.google.assistant.e.i.a.bq r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51274bq) r12
            com.google.assistant.e.j.ex r13 = r8.f136685e
            if (r13 != 0) goto L_0x015b
            com.google.assistant.e.j.ex r13 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x015b:
            com.google.protobuf.cq r13 = r13.f136712a
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r11)
            com.google.android.libraries.search.assistant.i.d r14 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89596e
            java.lang.String r15 = "FOCUS_PARAMS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r15)
            com.google.protobuf.MessageLite r13 = com.google.android.libraries.search.assistant.p2585i.C33481e.m62058a(r13, r14)
            com.google.assistant.e.i.a.gs r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51411gs) r13
            com.google.assistant.e.j.ex r14 = r8.f136685e
            if (r14 != 0) goto L_0x0173
            com.google.assistant.e.j.ex r14 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0173:
            com.google.protobuf.cq r14 = r14.f136712a
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r11)
            com.google.android.libraries.search.assistant.i.d r11 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89597f
            java.lang.String r15 = "REACHABLE_DEVICE_STATE_PARAMS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r15)
            com.google.protobuf.MessageLite r11 = com.google.android.libraries.search.assistant.p2585i.C33481e.m62058a(r14, r11)
            com.google.assistant.e.i.a.ky r11 = (com.google.assistant.p3897e.p3917i.p3918a.C51525ky) r11
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x018d:
            boolean r14 = r7.hasNext()
            java.lang.String r15 = "executionParams"
            if (r14 == 0) goto L_0x0220
            java.lang.Object r14 = r7.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r16 = r14.getKey()
            r6 = r16
            com.google.assistant.e.j.rj r6 = (com.google.assistant.p3897e.p3921j.C52428rj) r6
            java.lang.Object r14 = r14.getValue()
            java.util.List r14 = (java.util.List) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r15)
            r15 = r3
            com.google.android.apps.search.assistant.platform.f.c.a.h r15 = (com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a.C120526h) r15
            r9 = 0
            com.google.assistant.e.i.a.bq r9 = r15.m199639e(r12, r6, r9)
            com.google.android.libraries.search.assistant.performer.b.a.c r15 = com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35476c.f93160f
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.android.libraries.search.assistant.performer.b.a.b r15 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35475b) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.libraries.search.assistant.performer.b.a.c r0 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35476c) r0
            r6.getClass()
            r0.f93166e = r6
            int r6 = r0.f93162a
            r6 = r6 | 8
            r0.f93162a = r6
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.libraries.search.assistant.performer.b.a.c r0 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35476c) r0
            com.google.protobuf.cq r6 = r0.f93163b
            boolean r16 = r6.mo58948c()
            if (r16 != 0) goto L_0x01e3
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r0.f93163b = r6
        L_0x01e3:
            com.google.protobuf.cq r0 = r0.f93163b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r14, (java.util.List) r0)
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.libraries.search.assistant.performer.b.a.c r0 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35476c) r0
            r9.getClass()
            r0.f93164c = r9
            int r6 = r0.f93162a
            r6 = r6 | 2
            r0.f93162a = r6
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.android.libraries.search.assistant.performer.b.a.c r0 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35476c) r0
            r13.getClass()
            r0.f93165d = r13
            int r6 = r0.f93162a
            r9 = 4
            r6 = r6 | r9
            r0.f93162a = r6
            com.google.protobuf.bv r0 = r15.build()
            java.lang.String r6 = "newBuilder()\n          .…arams)\n          .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.android.libraries.search.assistant.performer.b.a.c r0 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35476c) r0
            r5.add(r0)
            r0 = r18
            r6 = 1
            r9 = 4
            goto L_0x018d
        L_0x0220:
            java.lang.String r0 = "loggingParams"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            java.lang.String r0 = "deviceStateParams"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            com.google.android.libraries.search.assistant.performer.b.a.d r0 = com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35477d.f93167e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.assistant.performer.b.a.a r0 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35474a) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r6 = r0.instance
            com.google.android.libraries.search.assistant.performer.b.a.d r6 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35477d) r6
            com.google.protobuf.cq r7 = r6.f93170b
            boolean r9 = r7.mo58948c()
            if (r9 != 0) goto L_0x0247
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r6.f93170b = r7
        L_0x0247:
            com.google.protobuf.cq r6 = r6.f93170b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r5, (java.util.List) r6)
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.libraries.search.assistant.performer.b.a.d r5 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35477d) r5
            r10.getClass()
            r5.f93171c = r10
            int r6 = r5.f93169a
            r7 = 1
            r6 = r6 | r7
            r5.f93169a = r6
            r0.copyOnWrite()
            com.google.protobuf.bv r5 = r0.instance
            com.google.android.libraries.search.assistant.performer.b.a.d r5 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35477d) r5
            r11.getClass()
            r5.f93172d = r11
            int r6 = r5.f93169a
            r6 = r6 | 2
            r5.f93169a = r6
            com.google.protobuf.bv r0 = r0.build()
            java.lang.String r5 = "newBuilder()\n        .ad…eParams)\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)
            com.google.android.libraries.search.assistant.performer.b.a.d r0 = (com.google.android.libraries.search.assistant.performer.p2729b.p2730a.C35477d) r0
            com.google.assistant.e.j.dy r5 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.dx r5 = (com.google.assistant.p3897e.p3921j.C51808dx) r5
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.assistant.e.j.ol r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            java.lang.String r7 = "apa.EXECUTE_REMOTE"
            r5.mo53840c(r7)
            com.google.assistant.e.j.dw r7 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.dv r7 = (com.google.assistant.p3897e.p3921j.C51806dv) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            com.google.assistant.e.j.oj r6 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            r6.mo53837c()
            com.google.android.libraries.search.assistant.i.d r7 = com.google.android.apps.search.assistant.libraries.p8966e.p8967a.C119341d.f332738b
            com.google.assistant.e.j.kc r0 = r7.mo38881b(r0)
            java.lang.String r7 = "ARGS_KEY.toProtobufMapEntry(executeRemoteArgs)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r7)
            r6.mo53836b(r0)
            com.google.assistant.e.j.dw r0 = r6.mo53835a()
            r5.mo53839b(r0)
            com.google.assistant.e.j.dy r0 = r5.mo53838a()
            com.google.assistant.e.j.ep r5 = com.google.assistant.p3897e.p3921j.C52083ep.f136689f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.eo r5 = (com.google.assistant.p3897e.p3921j.C52082eo) r5
            com.google.assistant.e.j.ei r6 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.eh r6 = (com.google.assistant.p3897e.p3921j.C52075eh) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.ei r7 = (com.google.assistant.p3897e.p3921j.C52076ei) r7
            r0.getClass()
            r7.f136668c = r0
            int r0 = r7.f136666a
            r0 = r0 | 32
            r7.f136666a = r0
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.assistant.e.j.ep r0 = (com.google.assistant.p3897e.p3921j.C52083ep) r0
            com.google.protobuf.bv r6 = r6.build()
            com.google.assistant.e.j.ei r6 = (com.google.assistant.p3897e.p3921j.C52076ei) r6
            r6.getClass()
            r0.f136693c = r6
            r6 = 4
            r0.f136692b = r6
            com.google.protobuf.bv r0 = r5.build()
            java.lang.String r5 = "newBuilder()\n        .se…ientOp))\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)
            com.google.assistant.e.j.ep r0 = (com.google.assistant.p3897e.p3921j.C52083ep) r0
            r4.add(r0)
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r15)
            com.google.android.apps.search.assistant.platform.f.c.a.h r3 = (com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a.C120526h) r3
            r0 = 1
            com.google.assistant.e.i.a.bq r0 = r3.m199639e(r12, r2, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.google.assistant.e.j.ex r3 = r8.f136685e
            if (r3 != 0) goto L_0x0316
            com.google.assistant.e.j.ex r3 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
        L_0x0316:
            com.google.protobuf.cq r3 = r3.f136712a
            java.util.Iterator r3 = r3.iterator()
        L_0x031c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x034c
            java.lang.Object r5 = r3.next()
            com.google.assistant.e.j.kc r5 = (com.google.assistant.p3897e.p3921j.C52232kc) r5
            java.lang.String r6 = r5.f137065b
            com.google.android.libraries.search.assistant.i.d r7 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89592a
            java.lang.String r7 = r7.f89601a
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r7)
            if (r6 == 0) goto L_0x0343
            com.google.android.libraries.search.assistant.i.d r5 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89592a
            com.google.assistant.e.j.kc r5 = r5.mo38881b(r0)
            java.lang.String r6 = "CLIENT_EXECUTION_PARAMS.…ry(sourceExecutionParams)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r2.add(r5)
            goto L_0x031c
        L_0x0343:
            java.lang.String r6 = "paramEntry"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r2.add(r5)
            goto L_0x031c
        L_0x034c:
            com.google.protobuf.bv r1 = (com.google.protobuf.C62942bv) r1
            com.google.protobuf.bn r0 = r1.toBuilder()
            com.google.assistant.e.j.el r0 = (com.google.assistant.p3897e.p3921j.C52079el) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.en r1 = (com.google.assistant.p3897e.p3921j.C52081en) r1
            com.google.protobuf.cq r3 = com.google.assistant.p3897e.p3921j.C52081en.emptyProtobufList()
            r1.f136684d = r3
            r0.mo53784a(r4)
            com.google.assistant.e.j.ex r1 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.ew r1 = (com.google.assistant.p3897e.p3921j.C52090ew) r1
            r1.mo53790c(r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.en r2 = (com.google.assistant.p3897e.p3921j.C52081en) r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.ex r1 = (com.google.assistant.p3897e.p3921j.C52091ex) r1
            r1.getClass()
            r2.f136685e = r1
            int r1 = r2.f136681a
            r1 = r1 | 16
            r2.f136681a = r1
            com.google.protobuf.bv r0 = r0.build()
            java.lang.String r1 = "conversationDelta\n      …Params))\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.assistant.e.j.en r0 = (com.google.assistant.p3897e.p3921j.C52081en) r0
            return r0
        L_0x0393:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a.C120526h.mo104804d(com.google.assistant.e.j.en, h.c.g):java.lang.Object");
    }
}
