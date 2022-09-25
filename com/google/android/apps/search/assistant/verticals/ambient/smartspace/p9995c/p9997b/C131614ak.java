package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import com.google.android.apps.search.assistant.libraries.p8946b.p8948b.C119223f;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124184c;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124185a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124186b;
import com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a.C124348r;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.C131648d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32904f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48154b;
import com.google.assistant.p3741aa.p3742a.p3743a.C48162j;
import com.google.assistant.p3897e.p3917i.p3918a.C51591nj;
import com.google.assistant.p3897e.p3917i.p3918a.C51592nk;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.C60944c;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5574b.C71546cw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak */
/* compiled from: PG */
public final class C131614ak {

    /* renamed from: a */
    public static final C65753ak f359606a = C65753ak.CROSS_DEVICE_TIMER;

    /* renamed from: k */
    private static final Duration f359607k = Duration.ofSeconds(30);

    /* renamed from: b */
    public final C124184c f359608b;

    /* renamed from: c */
    public final Executor f359609c;

    /* renamed from: d */
    public final C119223f f359610d;

    /* renamed from: e */
    public final C59071e f359611e = C59071e.m91331h();

    /* renamed from: f */
    public final C37215b f359612f;

    /* renamed from: g */
    public final C69626l f359613g;

    /* renamed from: h */
    public final C71788b f359614h;

    /* renamed from: i */
    public C71643cp f359615i;

    /* renamed from: j */
    public final C124348r f359616j;

    /* renamed from: l */
    private final C131623e f359617l;

    /* renamed from: m */
    private final C71422aw f359618m;

    /* renamed from: n */
    private final C131648d f359619n;

    /* renamed from: o */
    private final C130895ag f359620o;

    /* renamed from: p */
    private final C131629k f359621p;

    /* renamed from: q */
    private boolean f359622q;

    public C131614ak(C124184c cVar, C131623e eVar, Executor executor, C71422aw awVar, C32904f fVar, C119223f fVar2, C131648d dVar, C130895ag agVar, C124348r rVar, C131629k kVar, C38780c cVar2) {
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(fVar, "contextSource");
        C69664n.m101061g(dVar, "notificationsController");
        C69664n.m101061g(agVar, "ambientStreamz");
        C69664n.m101061g(kVar, "settingEnabledObserver");
        C69664n.m101061g(cVar2, "appFlowLoggerProvider");
        this.f359608b = cVar;
        this.f359617l = eVar;
        this.f359609c = executor;
        this.f359618m = awVar;
        this.f359610d = fVar2;
        this.f359619n = dVar;
        this.f359620o = agVar;
        this.f359616j = rVar;
        this.f359621p = kVar;
        this.f359612f = cVar2.mo41619a(C38828b.PROACTIVE_ASSISTANT);
        this.f359614h = new C71799m();
        C32881e a = fVar.mo38224a("WholeHome", C58485gu.m89845m());
        C124185a aVar = (C124185a) C124186b.f342938c.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C69664n.m101061g(aVar, "builder");
        C32849cq b = a.mo38265b();
        C69664n.m101060f(b, "session.sessionToken");
        C69664n.m101061g(b, "value");
        aVar.copyOnWrite();
        b.getClass();
        ((C124186b) aVar.instance).f342940a = b;
        C62942bv build = aVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C131639t tVar = new C131639t();
        C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C131636q(C71546cw.m104402d(tVar.f359680a, kVar.f359663a, new C131612ai((C69577g) null)), this, (C69577g) null), 3);
        this.f359613g = new C131637r(C71803m.m105042c(awVar, (C69585o) null, (C71424ay) null, new C131605ab(this, (C124186b) build, tVar, (C69577g) null), 3), a, (C69577g) null);
    }

    /* renamed from: h */
    private final Object m214033h(C69577g gVar) {
        Object d = mo110211d("Deleting shared data", new C131613aj(this, (C69577g) null), gVar);
        return d == C69554a.COROUTINE_SUSPENDED ? d : C69788q.f186170a;
    }

    /* renamed from: g */
    public final void mo110214g(List list) {
        Duration duration;
        C69664n.m101061g(list, "remoteDeviceStates");
        ArrayList<C51592nk> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C48154b bVar = ((C48162j) it.next()).f124618c;
            if (bVar == null) {
                bVar = C48154b.f124594i;
            }
            C51594nm nmVar = bVar.f124598c;
            if (nmVar == null) {
                nmVar = C51594nm.f134474f;
            }
            C62971cq cqVar = nmVar.f134477b;
            C69664n.m101060f(cqVar, "it.deviceState.timer.timerList");
            C69540x.m100811r(arrayList, cqVar);
        }
        ArrayList arrayList2 = new ArrayList(C69540x.m100804k(arrayList, 10));
        for (C51592nk nkVar : arrayList) {
            C69664n.m101060f(nkVar, "it");
            C51591nj a = C51591nj.m86227a(nkVar.f134468e);
            if (a == null) {
                a = C51591nj.UNKNOWN_TIMER_STATUS;
            }
            int ordinal = a.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    duration = C131623e.f359651b;
                } else if (ordinal != 3) {
                    duration = Duration.ZERO;
                    C69664n.m101060f(duration, "ZERO");
                }
                arrayList2.add(duration);
            }
            duration = C60944c.f165056b;
            C69664n.m101060f(duration, "MAX");
            arrayList2.add(duration);
        }
        Duration duration2 = (Duration) C69540x.m100854x(arrayList2);
        if (duration2 == null) {
            duration2 = Duration.ZERO;
            C69664n.m101060f(duration2, "ZERO");
        }
        Duration duration3 = f359607k;
        C69664n.m101061g(duration2, "a");
        C69664n.m101061g(duration3, "b");
        if (duration2.compareTo(duration3) < 0) {
            duration2 = duration3;
        }
        C69664n.m101060f(duration2, "maxOf(stateConverter.tim…IVE_CHANNEL_GRACE_PERIOD)");
        C71643cp cpVar = this.f359615i;
        if (cpVar != null) {
            cpVar.mo62723u(new CancellationException("New update"));
        }
        if (duration2.compareTo(C60944c.f165056b) < 0) {
            this.f359615i = C71803m.m105043d(this.f359618m, (C69585o) null, (C71424ay) null, new C131610ag(duration2, this, (C69577g) null), 3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110210c(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131606ac
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ac r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131606ac) r0
            int r1 = r0.f359575e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359575e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ac r0 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ac
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f359573c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359575e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r1 = r0.f359572b
            java.lang.Object r0 = r0.f359571a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0047
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            p5462h.C69714l.m101134b(r6)
            kotlinx.coroutines.j.b r6 = r5.f359614h
            r0.f359571a = r5
            r0.f359572b = r6
            r0.f359575e = r3
            java.lang.Object r0 = r6.mo63025b(r4, r0)
            if (r0 == r1) goto L_0x0058
            r0 = r5
            r1 = r6
        L_0x0047:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r0     // Catch:{ all -> 0x0053 }
            boolean r6 = r0.f359622q     // Catch:{ all -> 0x0053 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0053 }
            r1.mo63026c(r4)
            return r6
        L_0x0053:
            r6 = move-exception
            r1.mo63026c(r4)
            throw r6
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak.mo110210c(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110208a(com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131620b r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131644y
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.y r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131644y) r0
            int r1 = r0.f359691f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359691f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.y r0 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.y
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f359689d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359691f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0045
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r7 = r0.f359686a
            kotlinx.coroutines.j.b r7 = (kotlinx.coroutines.p5584j.C71788b) r7
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x002f }
            goto L_0x006b
        L_0x002f:
            r8 = move-exception
            goto L_0x0072
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            java.lang.Object r7 = r0.f359688c
            java.lang.Object r2 = r0.f359687b
            java.lang.Object r4 = r0.f359686a
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r4 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r4
            p5462h.C69714l.m101134b(r8)
            goto L_0x005b
        L_0x0045:
            p5462h.C69714l.m101134b(r8)
            kotlinx.coroutines.j.b r8 = r6.f359614h
            r0.f359686a = r6
            r0.f359687b = r7
            r0.f359688c = r8
            r0.f359691f = r4
            java.lang.Object r2 = r8.mo63025b(r5, r0)
            if (r2 == r1) goto L_0x0076
            r4 = r6
            r2 = r7
            r7 = r8
        L_0x005b:
            r0.f359686a = r7     // Catch:{ all -> 0x002f }
            r0.f359687b = r5     // Catch:{ all -> 0x002f }
            r0.f359688c = r5     // Catch:{ all -> 0x002f }
            r0.f359691f = r3     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.b r2 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131620b) r2     // Catch:{ all -> 0x002f }
            java.lang.Object r8 = r4.mo110209b(r2, r0)     // Catch:{ all -> 0x002f }
            if (r8 == r1) goto L_0x0071
        L_0x006b:
            r7.mo63026c(r5)
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x0071:
            return r1
        L_0x0072:
            r7.mo63026c(r5)
            throw r8
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak.mo110208a(com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.b, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: com.google.assistant.aa.a.a.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.assistant.aa.a.a.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.assistant.aa.a.a.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.google.assistant.aa.a.a.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: com.google.assistant.aa.a.a.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.assistant.aa.a.a.h, code=java.lang.Object, for r12v0, types: [com.google.assistant.aa.a.a.h, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[Catch:{ all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110212e(java.lang.Object r12, boolean r13, p5462h.p5466c.C69577g r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131608ae
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ae r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131608ae) r0
            int r1 = r0.f359587g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359587g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ae r0 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ae
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f359585e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359587g
            java.lang.String r3 = "update.remoteDeviceStateList"
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005d
            if (r2 == r6) goto L_0x004d
            if (r2 == r5) goto L_0x0044
            if (r2 != r4) goto L_0x003c
            java.lang.Object r12 = r0.f359583c
            java.lang.Object r13 = r0.f359582b
            java.lang.Object r0 = r0.f359581a
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r0
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0039 }
            goto L_0x012c
        L_0x0039:
            r13 = move-exception
            goto L_0x0140
        L_0x003c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0044:
            java.lang.Object r12 = r0.f359581a
            kotlinx.coroutines.j.b r12 = (kotlinx.coroutines.p5584j.C71788b) r12
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0039 }
            goto L_0x0136
        L_0x004d:
            boolean r13 = r0.f359584d
            java.lang.Object r12 = r0.f359583c
            java.lang.Object r2 = r0.f359582b
            java.lang.Object r8 = r0.f359581a
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r8 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r8
            p5462h.C69714l.m101134b(r14)
            r14 = r12
            r12 = r2
            goto L_0x0073
        L_0x005d:
            p5462h.C69714l.m101134b(r14)
            kotlinx.coroutines.j.b r14 = r11.f359614h
            r0.f359581a = r11
            r0.f359582b = r12
            r0.f359583c = r14
            r0.f359584d = r13
            r0.f359587g = r6
            java.lang.Object r2 = r14.mo63025b(r7, r0)
            if (r2 == r1) goto L_0x0144
            r8 = r11
        L_0x0073:
            boolean r2 = r8.f359622q     // Catch:{ all -> 0x013d }
            if (r2 == 0) goto L_0x0095
            com.google.common.f.e r12 = r8.f359611e     // Catch:{ all -> 0x013d }
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ all -> 0x013d }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x013d }
            java.lang.String r13 = "Update received after Torus channel closed"
            com.google.common.f.n r0 = new com.google.common.f.n     // Catch:{ all -> 0x013d }
            r1 = 39141(0x98e5, float:5.4848E-41)
            r0.<init>(r1)     // Catch:{ all -> 0x013d }
            r12.mo56379ah(r0)     // Catch:{ all -> 0x013d }
            r12.mo56386p(r13)     // Catch:{ all -> 0x013d }
            h.q r12 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x013d }
            r14.mo63026c(r7)
            return r12
        L_0x0095:
            r2 = r12
            com.google.assistant.aa.a.a.h r2 = (com.google.assistant.p3741aa.p3742a.p3743a.C48160h) r2     // Catch:{ all -> 0x013d }
            int r2 = r2.f124611b     // Catch:{ all -> 0x013d }
            int r2 = com.google.assistant.p3741aa.p3742a.p3743a.C48159g.m85204a(r2)     // Catch:{ all -> 0x013d }
            if (r2 != 0) goto L_0x00a1
            r2 = 1
        L_0x00a1:
            int r2 = r2 + -1
            if (r2 == r6) goto L_0x00eb
            if (r2 == r5) goto L_0x00c0
            com.google.common.f.e r12 = r8.f359611e     // Catch:{ all -> 0x013d }
            com.google.common.f.x r12 = r12.mo56226d()     // Catch:{ all -> 0x013d }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x013d }
            java.lang.String r13 = "Unknown update status, not updating Geller"
            com.google.common.f.n r0 = new com.google.common.f.n     // Catch:{ all -> 0x013d }
            r1 = 39140(0x98e4, float:5.4847E-41)
            r0.<init>(r1)     // Catch:{ all -> 0x013d }
            r12.mo56379ah(r0)     // Catch:{ all -> 0x013d }
            r12.mo56386p(r13)     // Catch:{ all -> 0x013d }
            goto L_0x00e8
        L_0x00c0:
            com.google.common.f.e r12 = r8.f359611e     // Catch:{ all -> 0x013d }
            com.google.common.f.x r12 = r12.mo56225c()     // Catch:{ all -> 0x013d }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x013d }
            java.lang.String r13 = "Closing channel - libconnect not available!"
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x013d }
            r3 = 39138(0x98e2, float:5.4844E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x013d }
            r12.mo56379ah(r2)     // Catch:{ all -> 0x013d }
            r12.mo56386p(r13)     // Catch:{ all -> 0x013d }
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.b r12 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131620b.ERROR_LIBCONNECT_UNAVAILABLE     // Catch:{ all -> 0x013d }
            r0.f359581a = r14     // Catch:{ all -> 0x013d }
            r0.f359582b = r7     // Catch:{ all -> 0x013d }
            r0.f359583c = r7     // Catch:{ all -> 0x013d }
            r0.f359587g = r5     // Catch:{ all -> 0x013d }
            java.lang.Object r12 = r8.mo110209b(r12, r0)     // Catch:{ all -> 0x013d }
            if (r12 == r1) goto L_0x00ea
        L_0x00e8:
            r12 = r14
            goto L_0x0136
        L_0x00ea:
            return r1
        L_0x00eb:
            com.google.common.f.e r2 = r8.f359611e     // Catch:{ all -> 0x013d }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x013d }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x013d }
            java.lang.String r5 = "__SsXDeviceTimer__Step_3: Updating Geller with %d device states"
            r6 = r12
            com.google.assistant.aa.a.a.h r6 = (com.google.assistant.p3741aa.p3742a.p3743a.C48160h) r6     // Catch:{ all -> 0x013d }
            com.google.protobuf.cq r6 = r6.f124612c     // Catch:{ all -> 0x013d }
            int r6 = r6.size()     // Catch:{ all -> 0x013d }
            com.google.common.f.n r9 = new com.google.common.f.n     // Catch:{ all -> 0x013d }
            r10 = 39139(0x98e3, float:5.4845E-41)
            r9.<init>(r10)     // Catch:{ all -> 0x013d }
            r2.mo56379ah(r9)     // Catch:{ all -> 0x013d }
            r2.mo56387q(r5, r6)     // Catch:{ all -> 0x013d }
            com.google.android.libraries.search.b.b r2 = r8.f359612f     // Catch:{ all -> 0x013d }
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a.f98668d     // Catch:{ all -> 0x013d }
            r2.mo19974a(r5)     // Catch:{ all -> 0x013d }
            r2 = r12
            com.google.assistant.aa.a.a.h r2 = (com.google.assistant.p3741aa.p3742a.p3743a.C48160h) r2     // Catch:{ all -> 0x013d }
            com.google.protobuf.cq r2 = r2.f124612c     // Catch:{ all -> 0x013d }
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x013d }
            r0.f359581a = r8     // Catch:{ all -> 0x013d }
            r0.f359582b = r12     // Catch:{ all -> 0x013d }
            r0.f359583c = r14     // Catch:{ all -> 0x013d }
            r0.f359587g = r4     // Catch:{ all -> 0x013d }
            java.lang.Object r13 = r8.mo110213f(r2, r13, r0)     // Catch:{ all -> 0x013d }
            if (r13 == r1) goto L_0x013c
            r13 = r12
            r12 = r14
            r0 = r8
        L_0x012c:
            com.google.assistant.aa.a.a.h r13 = (com.google.assistant.p3741aa.p3742a.p3743a.C48160h) r13     // Catch:{ all -> 0x0039 }
            com.google.protobuf.cq r13 = r13.f124612c     // Catch:{ all -> 0x0039 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r3)     // Catch:{ all -> 0x0039 }
            r0.mo110214g(r13)     // Catch:{ all -> 0x0039 }
        L_0x0136:
            r12.mo63026c(r7)
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x013c:
            return r1
        L_0x013d:
            r12 = move-exception
            r13 = r12
            r12 = r14
        L_0x0140:
            r12.mo63026c(r7)
            throw r13
        L_0x0144:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak.mo110212e(com.google.assistant.aa.a.a.h, boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f A[Catch:{ Exception -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[Catch:{ Exception -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110211d(java.lang.String r5, p5462h.p5473f.p5474a.C69626l r6, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131607ad
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ad r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131607ad) r0
            int r1 = r0.f359580e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359580e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ad r0 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ad
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f359578c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359580e
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r5 = r0.f359577b
            java.lang.Object r6 = r0.f359576a
            p5462h.C69714l.m101134b(r7)     // Catch:{ Exception -> 0x002b }
            goto L_0x004b
        L_0x002b:
            r7 = move-exception
            goto L_0x00eb
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r7 = r4.f359620o
            r7.mo109888X()
            r0.f359576a = r4     // Catch:{ Exception -> 0x00e8 }
            r0.f359577b = r5     // Catch:{ Exception -> 0x00e8 }
            r0.f359580e = r3     // Catch:{ Exception -> 0x00e8 }
            java.lang.Object r7 = r6.mo5761a(r0)     // Catch:{ Exception -> 0x00e8 }
            if (r7 == r1) goto L_0x00e7
            r6 = r4
        L_0x004b:
            com.google.android.apps.search.assistant.libraries.a.d r7 = (com.google.android.apps.search.assistant.libraries.p8942a.C119207d) r7     // Catch:{ Exception -> 0x002b }
            if (r7 != 0) goto L_0x006d
            r7 = r6
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r7 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r7     // Catch:{ Exception -> 0x002b }
            com.google.common.f.e r7 = r7.f359611e     // Catch:{ Exception -> 0x002b }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ Exception -> 0x002b }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ Exception -> 0x002b }
            java.lang.String r0 = "Geller share \"%s\" completed with null status - should never happen!"
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ Exception -> 0x002b }
            r2 = 39136(0x98e0, float:5.4841E-41)
            r1.<init>(r2)     // Catch:{ Exception -> 0x002b }
            r7.mo56379ah(r1)     // Catch:{ Exception -> 0x002b }
            r7.mo56389s(r0, r5)     // Catch:{ Exception -> 0x002b }
            h.q r5 = p5462h.C69788q.f186170a     // Catch:{ Exception -> 0x002b }
            return r5
        L_0x006d:
            r0 = r6
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r0     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r0 = r0.f359620o     // Catch:{ Exception -> 0x002b }
            int r1 = r7.ordinal()     // Catch:{ Exception -> 0x002b }
            switch(r1) {
                case 0: goto L_0x007c;
                case 1: goto L_0x007c;
                case 2: goto L_0x007c;
                case 3: goto L_0x007c;
                case 4: goto L_0x007c;
                case 5: goto L_0x007c;
                case 6: goto L_0x007c;
                case 7: goto L_0x007c;
                case 8: goto L_0x007c;
                case 9: goto L_0x007c;
                default: goto L_0x0079;
            }     // Catch:{ Exception -> 0x002b }
        L_0x0079:
            h.g r7 = new h.g     // Catch:{ Exception -> 0x002b }
            goto L_0x00e3
        L_0x007c:
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x002b }
            r0.mo109887W(r1)     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.libraries.a.d r0 = com.google.android.apps.search.assistant.libraries.p8942a.C119207d.SUCCESS     // Catch:{ Exception -> 0x002b }
            if (r7 != r0) goto L_0x00b3
            r7 = r6
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r7 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r7     // Catch:{ Exception -> 0x002b }
            com.google.common.f.e r7 = r7.f359611e     // Catch:{ Exception -> 0x002b }
            com.google.common.f.x r7 = r7.mo56224b()     // Catch:{ Exception -> 0x002b }
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7     // Catch:{ Exception -> 0x002b }
            java.lang.String r0 = "Geller share \"%s\" completed successfully"
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ Exception -> 0x002b }
            r2 = 39135(0x98df, float:5.484E-41)
            r1.<init>(r2)     // Catch:{ Exception -> 0x002b }
            r7.mo56379ah(r1)     // Catch:{ Exception -> 0x002b }
            r7.mo56389s(r0, r5)     // Catch:{ Exception -> 0x002b }
            r7 = r6
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r7 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r7     // Catch:{ Exception -> 0x002b }
            com.google.android.libraries.search.b.b r7 = r7.f359612f     // Catch:{ Exception -> 0x002b }
            com.google.android.libraries.search.b.i.f r0 = com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a.f98669e     // Catch:{ Exception -> 0x002b }
            com.google.net.a.a.b r1 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ Exception -> 0x002b }
            com.google.android.libraries.search.b.i.a r0 = r0.mo40805c(r1)     // Catch:{ Exception -> 0x002b }
            r7.mo19974a(r0)     // Catch:{ Exception -> 0x002b }
            goto L_0x0118
        L_0x00b3:
            r0 = r6
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r0     // Catch:{ Exception -> 0x002b }
            com.google.common.f.e r0 = r0.f359611e     // Catch:{ Exception -> 0x002b }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ Exception -> 0x002b }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ Exception -> 0x002b }
            java.lang.String r1 = "Geller share \"%s\" completed with non-success task status: %s"
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x002b }
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ Exception -> 0x002b }
            r3 = 39133(0x98dd, float:5.4837E-41)
            r2.<init>(r3)     // Catch:{ Exception -> 0x002b }
            r0.mo56379ah(r2)     // Catch:{ Exception -> 0x002b }
            r0.mo56354G(r1, r5, r7)     // Catch:{ Exception -> 0x002b }
            r7 = r6
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r7 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r7     // Catch:{ Exception -> 0x002b }
            com.google.android.libraries.search.b.b r7 = r7.f359612f     // Catch:{ Exception -> 0x002b }
            com.google.android.libraries.search.b.i.f r0 = com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a.f98669e     // Catch:{ Exception -> 0x002b }
            com.google.net.a.a.b r1 = com.google.net.p4726a.p4727a.C62722b.INTERNAL     // Catch:{ Exception -> 0x002b }
            com.google.android.libraries.search.b.i.a r0 = r0.mo40805c(r1)     // Catch:{ Exception -> 0x002b }
            r7.mo19974a(r0)     // Catch:{ Exception -> 0x002b }
            goto L_0x0118
        L_0x00e3:
            r7.<init>()     // Catch:{ Exception -> 0x002b }
            throw r7     // Catch:{ Exception -> 0x002b }
        L_0x00e7:
            return r1
        L_0x00e8:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L_0x00eb:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r6 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r6
            com.google.common.f.e r0 = r6.f359611e
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r7 = r0.mo56382g(r7)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 39134(0x98de, float:5.4838E-41)
            r0.<init>(r1)
            r7.mo56379ah(r0)
            java.lang.String r0 = "Geller share \"%s\" failed with throwable!"
            r7.mo56389s(r0, r5)
            com.google.android.libraries.search.b.b r5 = r6.f359612f
            com.google.android.libraries.search.b.i.f r6 = com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a.f98669e
            com.google.net.a.a.b r7 = com.google.net.p4726a.p4727a.C62722b.FAILED_PRECONDITION
            com.google.android.libraries.search.b.i.a r6 = r6.mo40805c(r7)
            r5.mo19974a(r6)
        L_0x0118:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak.mo110211d(java.lang.String, h.f.a.l, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ce A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110209b(com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131620b r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131645z
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.z r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131645z) r0
            int r1 = r0.f359697f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359697f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.z r0 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.z
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f359695d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359697f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.f359693b
            java.lang.Object r0 = r0.f359692a
            p5462h.C69714l.m101134b(r10)
            goto L_0x00b3
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.f359694c
            java.lang.Object r9 = r0.f359693b
            java.lang.Object r2 = r0.f359692a
            p5462h.C69714l.m101134b(r10)
            goto L_0x00a1
        L_0x0042:
            p5462h.C69714l.m101134b(r10)
            boolean r10 = r8.f359622q
            if (r10 == 0) goto L_0x0064
            com.google.common.f.e r9 = r8.f359611e
            com.google.common.f.x r9 = r9.mo56224b()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.n r10 = new com.google.common.f.n
            r0 = 39132(0x98dc, float:5.4836E-41)
            r10.<init>(r0)
            r9.mo56379ah(r10)
            java.lang.String r10 = "Not closing already closed channel"
            r9.mo56386p(r10)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0064:
            com.google.common.f.e r10 = r8.f359611e
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            java.lang.String r2 = r9.toString()
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 39131(0x98db, float:5.4834E-41)
            r6.<init>(r7)
            r10.mo56379ah(r6)
            java.lang.String r6 = "Initializing channel close for reason: %s"
            r10.mo56389s(r6, r2)
            r8.f359622q = r4
            kotlinx.coroutines.cp r10 = r8.f359615i
            if (r10 == 0) goto L_0x00a0
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r6 = "Channel already closed"
            r2.<init>(r6)
            r10.mo62723u(r2)
            r0.f359692a = r8
            r0.f359693b = r9
            r0.f359694c = r10
            r0.f359697f = r4
            java.lang.Object r10 = r10.mo62869o(r0)
            if (r10 == r1) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            return r1
        L_0x00a0:
            r2 = r8
        L_0x00a1:
            r0.f359692a = r2
            r0.f359693b = r9
            r0.f359694c = r5
            r0.f359697f = r3
            r10 = r2
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r10 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r10
            java.lang.Object r10 = r10.m214033h(r0)
            if (r10 == r1) goto L_0x00ce
            r0 = r2
        L_0x00b3:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r0
            kotlinx.coroutines.aw r10 = r0.f359618m
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.aa r1 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.aa
            r1.<init>(r0, r5)
            r2 = 3
            kotlinx.coroutines.C71803m.m105043d(r10, r5, r5, r1, r2)
            com.google.android.apps.search.assistant.verticals.ambient.m.ag r10 = r0.f359620o
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.b r9 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131620b) r9
            java.lang.String r9 = r9.toString()
            r10.mo109885U(r9)
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x00ce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak.mo110209b(com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.b, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak} */
    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.Object, com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ba, code lost:
        if (r0 == null) goto L_0x01b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0236 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110213f(java.util.List r22, boolean r23, p5462h.p5466c.C69577g r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131609af
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.af r2 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131609af) r2
            int r3 = r2.f359592e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f359592e = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.af r2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.af
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f359590c
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f359592e
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x003b
            if (r4 == r6) goto L_0x002a
            if (r4 != r5) goto L_0x0033
        L_0x002a:
            java.lang.Object r3 = r2.f359589b
            java.lang.Object r2 = r2.f359588a
            p5462h.C69714l.m101134b(r1)
            goto L_0x03ef
        L_0x0033:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003b:
            p5462h.C69714l.m101134b(r1)
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.e r1 = r0.f359617l
            java.lang.String r4 = "remoteDeviceStates"
            r7 = r22
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r22.iterator()
        L_0x0050:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x039c
            java.lang.Object r8 = r7.next()
            com.google.assistant.aa.a.a.j r8 = (com.google.assistant.p3741aa.p3742a.p3743a.C48162j) r8
            com.google.assistant.aa.a.a.b r10 = r8.f124618c
            if (r10 != 0) goto L_0x0062
            com.google.assistant.aa.a.a.b r10 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x0062:
            int r10 = r10.f124596a
            r10 = r10 & r5
            if (r10 == 0) goto L_0x0384
            com.google.assistant.aa.a.a.b r10 = r8.f124618c
            if (r10 != 0) goto L_0x006d
            com.google.assistant.aa.a.a.b r10 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x006d:
            com.google.assistant.e.i.a.nm r10 = r10.f124598c
            if (r10 != 0) goto L_0x0073
            com.google.assistant.e.i.a.nm r10 = com.google.assistant.p3897e.p3917i.p3918a.C51594nm.f134474f
        L_0x0073:
            java.lang.String r11 = "remoteDeviceState.deviceState.timer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            com.google.android.apps.d.a.a.a.h r11 = com.google.android.apps.p471d.p472a.p473a.p474a.C9026h.f31165b
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.d.a.a.a.a r11 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9019a) r11
            java.lang.String r12 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            java.lang.String r13 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r13)
            com.google.android.apps.d.a.a.a.g r14 = com.google.android.apps.p471d.p472a.p473a.p474a.C9025g.f31162b
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.apps.d.a.a.a.f r14 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9024f) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r13)
            com.google.protobuf.a.b r15 = new com.google.protobuf.a.b
            com.google.protobuf.bv r9 = r14.instance
            com.google.android.apps.d.a.a.a.g r9 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9025g) r9
            com.google.protobuf.cq r9 = r9.f31164a
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.String r5 = "_builder.getTimersList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)
            r15.<init>(r9)
            com.google.protobuf.cq r5 = r10.f134477b
            java.lang.String r9 = "timerParams.timerList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00bc:
            boolean r10 = r5.hasNext()
            java.lang.String r15 = "timeSource.now()"
            r16 = 4
            java.lang.String r6 = "_builder.build()"
            r17 = r7
            java.lang.String r7 = "value"
            if (r10 == 0) goto L_0x0245
            java.lang.Object r10 = r5.next()
            com.google.assistant.e.i.a.nk r10 = (com.google.assistant.p3897e.p3917i.p3918a.C51592nk) r10
            r18 = r5
            java.lang.String r5 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)
            com.google.android.apps.d.a.a.a.e r5 = com.google.android.apps.p471d.p472a.p473a.p474a.C9023e.f31155f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.d.a.a.a.d r5 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9022d) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r13)
            com.google.android.apps.d.a.a.a.c r19 = com.google.android.apps.p471d.p472a.p473a.p474a.C9021c.f31152b
            com.google.protobuf.bn r19 = r19.createBuilder()
            r20 = r3
            r3 = r19
            com.google.android.apps.d.a.a.a.b r3 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9020b) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r13)
            java.lang.String r0 = r10.f134467d
            r19 = r2
            java.lang.String r2 = "timer.timerId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            r3.copyOnWrite()
            com.google.protobuf.bv r2 = r3.instance
            com.google.android.apps.d.a.a.a.c r2 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9021c) r2
            r0.getClass()
            r2.f31154a = r0
            com.google.protobuf.bv r0 = r3.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.android.apps.d.a.a.a.c r0 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9021c) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.apps.d.a.a.a.e r2 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9023e) r2
            r0.getClass()
            r2.f31161e = r0
            java.lang.String r0 = r10.f134470g
            java.lang.String r2 = "timer.label"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.apps.d.a.a.a.e r2 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9023e) r2
            r0.getClass()
            r2.f31159c = r0
            int r0 = r10.f134468e
            com.google.assistant.e.i.a.nj r0 = com.google.assistant.p3897e.p3917i.p3918a.C51591nj.m86227a(r0)
            if (r0 != 0) goto L_0x0149
            com.google.assistant.e.i.a.nj r0 = com.google.assistant.p3897e.p3917i.p3918a.C51591nj.UNKNOWN_TIMER_STATUS
        L_0x0149:
            int r0 = r0.ordinal()
            r2 = 3
            r3 = 1
            if (r0 == r3) goto L_0x015d
            r3 = 2
            if (r0 == r3) goto L_0x015a
            if (r0 == r2) goto L_0x015f
            r0 = 0
            r16 = 0
            goto L_0x015f
        L_0x015a:
            r16 = 3
            goto L_0x015f
        L_0x015d:
            r16 = 2
        L_0x015f:
            if (r16 != 0) goto L_0x0164
        L_0x0161:
            r0 = 0
            goto L_0x0215
        L_0x0164:
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.android.apps.d.a.a.a.e r0 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9023e) r0
            int r3 = r16 + -2
            r0.f31157a = r3
            int r0 = r10.f134468e
            com.google.assistant.e.i.a.nj r0 = com.google.assistant.p3897e.p3917i.p3918a.C51591nj.m86227a(r0)
            if (r0 != 0) goto L_0x0179
            com.google.assistant.e.i.a.nj r0 = com.google.assistant.p3897e.p3917i.p3918a.C51591nj.UNKNOWN_TIMER_STATUS
        L_0x0179:
            int r0 = r0.ordinal()
            r3 = 1
            if (r0 == r3) goto L_0x01a5
            r3 = 2
            if (r0 == r3) goto L_0x0196
            if (r0 == r2) goto L_0x0187
        L_0x0185:
            r2 = 0
            goto L_0x01e5
        L_0x0187:
            com.google.protobuf.fg r0 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131624f.m214054b(r10)
            if (r0 != 0) goto L_0x018e
            r0 = 0
        L_0x018e:
            if (r0 == 0) goto L_0x0185
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.c r2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.c
            r2.<init>(r0)
            goto L_0x01e5
        L_0x0196:
            com.google.protobuf.ar r0 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131624f.m214053a(r10)
            if (r0 != 0) goto L_0x019d
            r0 = 0
        L_0x019d:
            if (r0 == 0) goto L_0x0185
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.d r2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.d
            r2.<init>(r0)
            goto L_0x01e5
        L_0x01a5:
            int r0 = r10.f134465b
            int r0 = com.google.assistant.p3897e.p3917i.p3918a.C51589nh.m86226a(r0)
            int r2 = r0 + -1
            if (r0 == 0) goto L_0x0243
            if (r2 == 0) goto L_0x01bd
            r0 = 1
            if (r2 == r0) goto L_0x01b6
        L_0x01b4:
            r0 = 0
            goto L_0x01de
        L_0x01b6:
            com.google.protobuf.fg r0 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131624f.m214054b(r10)
            if (r0 != 0) goto L_0x01de
            goto L_0x01b4
        L_0x01bd:
            com.google.protobuf.ar r0 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131624f.m214053a(r10)
            if (r0 == 0) goto L_0x01b4
            com.google.common.v.i r2 = r1.f359652c
            j$.time.Instant r2 = r2.mo57444a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r15)
            com.google.protobuf.fg r2 = com.google.protobuf.p4750c.p4751a.C62949a.m95467b(r2)
            com.google.protobuf.fg r0 = com.google.protobuf.p4750c.C62953e.m95481f(r2, r0)
            java.lang.String r2 = "add(timeSource.now().toP…amp(), remainingDuration)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            java.lang.String r2 = "expireTimestamp"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)
        L_0x01de:
            if (r0 == 0) goto L_0x0185
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.c r2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.c
            r2.<init>(r0)
        L_0x01e5:
            if (r2 != 0) goto L_0x01e9
            goto L_0x0161
        L_0x01e9:
            boolean r0 = r2 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131622d
            if (r0 == 0) goto L_0x01fb
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.d r2 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131622d) r2
            com.google.protobuf.ar r0 = r2.f359649a
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.apps.d.a.a.a.e r2 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9023e) r2
            r2.f31160d = r0
            goto L_0x020c
        L_0x01fb:
            boolean r0 = r2 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131621c
            if (r0 == 0) goto L_0x020c
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.c r2 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131621c) r2
            com.google.protobuf.fg r0 = r2.f359648a
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.android.apps.d.a.a.a.e r2 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9023e) r2
            r2.f31158b = r0
        L_0x020c:
            com.google.protobuf.bv r0 = r5.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.android.apps.d.a.a.a.e r0 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9023e) r0
        L_0x0215:
            if (r0 != 0) goto L_0x0231
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131623e.f359650a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r3 = r10.f134467d
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 39123(0x98d3, float:5.4823E-41)
            r5.<init>(r6)
            r2.mo56379ah(r5)
            java.lang.String r5 = "Timer with id %s did not convert successfully and will not be sent to Geller."
            r2.mo56389s(r5, r3)
        L_0x0231:
            if (r0 == 0) goto L_0x0236
            r9.add(r0)
        L_0x0236:
            r0 = r21
            r7 = r17
            r5 = r18
            r2 = r19
            r3 = r20
            r6 = 1
            goto L_0x00bc
        L_0x0243:
            r0 = 0
            throw r0
        L_0x0245:
            r19 = r2
            r20 = r3
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.android.apps.d.a.a.a.g r0 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9025g) r0
            com.google.protobuf.cq r2 = r0.f31164a
            boolean r3 = r2.mo58948c()
            if (r3 != 0) goto L_0x025e
            com.google.protobuf.cq r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r2)
            r0.f31164a = r2
        L_0x025e:
            com.google.protobuf.cq r0 = r0.f31164a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r9, (java.util.List) r0)
            com.google.protobuf.bv r0 = r14.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.android.apps.d.a.a.a.g r0 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9025g) r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.apps.d.a.a.a.h r2 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9026h) r2
            r0.getClass()
            r2.f31167a = r0
            com.google.protobuf.bv r0 = r11.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.android.apps.d.a.a.a.h r0 = (com.google.android.apps.p471d.p472a.p473a.p474a.C9026h) r0
            com.google.assistant.e.j.rj r2 = r8.f124619d
            if (r2 != 0) goto L_0x028a
            com.google.assistant.e.j.rj r2 = com.google.assistant.p3897e.p3921j.C52428rj.f137558m
        L_0x028a:
            java.lang.String r3 = "remoteDeviceState.deviceIdProto"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.assistant.aa.a.a.b r3 = r8.f124618c
            if (r3 != 0) goto L_0x0295
            com.google.assistant.aa.a.a.b r3 = com.google.assistant.p3741aa.p3742a.p3743a.C48154b.f124594i
        L_0x0295:
            java.lang.String r3 = r3.f124603h
            java.lang.String r5 = "remoteDeviceState.deviceState.deviceName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            com.google.protos.p.b.am r5 = com.google.protos.p5129p.p5131b.C65755am.f178758e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.protos.p.b.al r5 = (com.google.protos.p5129p.p5131b.C65754al) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r13)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.protos.p.b.am r8 = (com.google.protos.p5129p.p5131b.C65755am) r8
            r0.getClass()
            r8.f178762b = r0
            int r0 = r8.f178761a
            r9 = 1
            r0 = r0 | r9
            r8.f178761a = r0
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r7)
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.protos.p.b.am r0 = (com.google.protos.p5129p.p5131b.C65755am) r0
            r2.getClass()
            r0.f178764d = r2
            int r8 = r0.f178761a
            r8 = r8 | 4
            r0.f178761a = r8
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r7)
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.protos.p.b.am r0 = (com.google.protos.p5129p.p5131b.C65755am) r0
            r3.getClass()
            int r8 = r0.f178761a
            r9 = 2
            r8 = r8 | r9
            r0.f178761a = r8
            r0.f178763c = r3
            com.google.protobuf.bv r0 = r5.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            com.google.protos.p.b.am r0 = (com.google.protos.p5129p.p5131b.C65755am) r0
            com.google.protos.p.b.az r3 = com.google.protos.p5129p.p5131b.C65768az.f178793f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.protos.p.b.ay r3 = (com.google.protos.p5129p.p5131b.C65767ay) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r13)
            java.lang.String r5 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            com.google.common.l.i r5 = com.google.common.p4541l.C59326i.f157516d
            byte[] r2 = r2.toByteArray()
            int r8 = r2.length
            java.lang.String r2 = r5.mo56837l(r2, r8)
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.protos.p.b.az r5 = (com.google.protos.p5129p.p5131b.C65768az) r5
            int r8 = r5.f178795a
            r8 = r8 | 4
            r5.f178795a = r8
            r5.f178798d = r2
            com.google.protos.f.q.d.a.d r2 = com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d.f176307e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.f.q.d.a.c r2 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r12)
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r13)
            com.google.common.v.i r5 = r1.f359652c
            j$.time.Instant r5 = r5.mo57444a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r15)
            long r8 = com.google.common.p4580v.C60941b.m93082a(r5)
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.protos.f.q.d.a.d r5 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r5
            int r10 = r5.f176309a
            r11 = 1
            r10 = r10 | r11
            r5.f176309a = r10
            r5.f176310b = r8
            com.google.protobuf.bv r2 = r2.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            com.google.protos.f.q.d.a.d r2 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r2
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r7)
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.protos.p.b.az r5 = (com.google.protos.p5129p.p5131b.C65768az) r5
            r2.getClass()
            r5.f178796b = r2
            int r2 = r5.f178795a
            r8 = 1
            r2 = r2 | r8
            r5.f178795a = r2
            com.google.protobuf.bt r2 = com.google.protos.p5129p.p5131b.C65755am.f178759f
            java.lang.String r5 = "elementExtension"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            java.lang.String r5 = "extension"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r7)
            r3.mo58885m(r2, r0)
            com.google.protobuf.bv r0 = r3.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r6)
            r9 = r0
            com.google.protos.p.b.az r9 = (com.google.protos.p5129p.p5131b.C65768az) r9
            goto L_0x038b
        L_0x0384:
            r19 = r2
            r20 = r3
            r17 = r7
            r9 = 0
        L_0x038b:
            if (r9 == 0) goto L_0x0390
            r4.add(r9)
        L_0x0390:
            r0 = r21
            r7 = r17
            r2 = r19
            r3 = r20
            r5 = 2
            r6 = 1
            goto L_0x0050
        L_0x039c:
            r19 = r2
            r20 = r3
            if (r23 == 0) goto L_0x03da
            r0 = r21
            r2 = r19
            r2.f359588a = r0
            r2.f359589b = r4
            r1 = 1
            r2.f359592e = r1
            int r1 = r4.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Updating with new timer states for "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = " device(s)"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ah r3 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ah
            r5 = 0
            r3.<init>(r0, r4, r5)
            java.lang.Object r1 = r0.mo110211d(r1, r3, r2)
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r1 == r2) goto L_0x03d4
            h.q r1 = p5462h.C69788q.f186170a
        L_0x03d4:
            r3 = r20
            if (r1 == r3) goto L_0x03d9
            goto L_0x03ed
        L_0x03d9:
            return r3
        L_0x03da:
            r0 = r21
            r2 = r19
            r3 = r20
            r2.f359588a = r0
            r2.f359589b = r4
            r1 = 2
            r2.f359592e = r1
            java.lang.Object r1 = r0.m214033h(r2)
            if (r1 == r3) goto L_0x0427
        L_0x03ed:
            r2 = r0
            r3 = r4
        L_0x03ef:
            java.util.Iterator r1 = r3.iterator()
        L_0x03f3:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0424
            java.lang.Object r3 = r1.next()
            com.google.protos.p.b.az r3 = (com.google.protos.p5129p.p5131b.C65768az) r3
            r4 = r2
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r4 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r4
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.d r4 = r4.f359619n
            com.google.protobuf.bt r5 = com.google.protos.p5129p.p5131b.C65755am.f178759f
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r3.mo58887l(r5)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r6 = r5.f169971d
            java.lang.Object r3 = r3.mo58854l(r6)
            if (r3 != 0) goto L_0x041a
            java.lang.Object r3 = r5.f169969b
            goto L_0x041e
        L_0x041a:
            java.lang.Object r3 = r5.mo58889c(r3)
        L_0x041e:
            com.google.protos.p.b.am r3 = (com.google.protos.p5129p.p5131b.C65755am) r3
            r4.mo110241a(r3)
            goto L_0x03f3
        L_0x0424:
            h.q r1 = p5462h.C69788q.f186170a
            return r1
        L_0x0427:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak.mo110213f(java.util.List, boolean, h.c.g):java.lang.Object");
    }
}
