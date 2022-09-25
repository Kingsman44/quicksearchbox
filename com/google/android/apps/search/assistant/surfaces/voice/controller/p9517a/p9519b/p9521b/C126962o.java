package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.binaries.satin.app.apc;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119650a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119670b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119816bk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119883dx;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.common.p9419a.p9420a.C125011a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126923a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126934b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127163w;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.C127811d;
import com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9514c.C126918d;
import com.google.android.apps.search.assistant.surfaces.voice.p9511c.p9516e.C126922a;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127354b;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127355c;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127358f;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127360h;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127362j;
import com.google.android.libraries.search.assistant.p2803u.p2804a.C36624a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4522b.C58479go;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p3186j$.util.function.Supplier;
import p5462h.C69685i;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.o */
/* compiled from: PG */
public final class C126962o implements C119670b {

    /* renamed from: a */
    public static final C59071e f349593a = C59071e.m91331h();

    /* renamed from: b */
    public final C127163w f349594b;

    /* renamed from: c */
    public final C126949b f349595c;

    /* renamed from: d */
    public final C126948ah f349596d;

    /* renamed from: e */
    public final C127360h f349597e;

    /* renamed from: f */
    public final C127358f f349598f;

    /* renamed from: g */
    public final C126945ae f349599g;

    /* renamed from: h */
    public int f349600h = 2;

    /* renamed from: i */
    private final Supplier f349601i;

    /* renamed from: j */
    private final C126923a f349602j;

    /* renamed from: k */
    private final C127354b f349603k;

    /* renamed from: l */
    private final C127362j f349604l;

    /* renamed from: m */
    private final C126934b f349605m;

    /* renamed from: n */
    private final C36624a f349606n;

    /* renamed from: o */
    private final C71422aw f349607o;

    /* renamed from: p */
    private final C127355c f349608p;

    public C126962o(Supplier supplier, C127163w wVar, C126949b bVar, C126948ah ahVar, C126923a aVar, C127354b bVar2, C127362j jVar, C126934b bVar3, C36624a aVar2, C71422aw awVar, C127355c cVar, C127360h hVar, C127358f fVar, apc apc) {
        C69664n.m101061g(wVar, "conversationDataStore");
        C69664n.m101061g(ahVar, "interactionCancellationStore");
        C69664n.m101061g(bVar2, "conversationParamsStore");
        C69664n.m101061g(jVar, "opaqueTokenStore");
        C69664n.m101061g(bVar3, "conversationStateObserver");
        C69664n.m101061g(aVar2, "onboardingDataService");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cVar, "conversationStateStore");
        C69664n.m101061g(hVar, "interactionInitiatorStore");
        C69664n.m101061g(fVar, "interactionIdStore");
        C69664n.m101061g(apc, "executionReporterFactory");
        this.f349601i = supplier;
        this.f349594b = wVar;
        this.f349595c = bVar;
        this.f349596d = ahVar;
        this.f349602j = aVar;
        this.f349603k = bVar2;
        this.f349604l = jVar;
        this.f349605m = bVar3;
        this.f349606n = aVar2;
        this.f349607o = awVar;
        this.f349608p = cVar;
        this.f349597e = hVar;
        this.f349598f = fVar;
        this.f349599g = new C126945ae(new C58759qy(new C127811d(apc.f199126a.b.f198027a.mo66756bi())), (C71422aw) apc.f199126a.a.H.mo17428b(), (C60950i) apc.f199126a.a.bC.mo17428b());
    }

    /* renamed from: l */
    private final void m207683l(C71643cp cpVar, String str) {
        C71803m.m105043d(this.f349607o, (C69585o) null, (C71424ay) null, new C126956i(cpVar, str, (C69577g) null), 3);
    }

    /* renamed from: a */
    public final C119908e mo40056a(C51809dy dyVar, C119793ao aoVar) {
        C69664n.m101061g(dyVar, "clientOp");
        C69664n.m101061g(aoVar, "context");
        C126923a aVar = this.f349602j;
        Object obj = this.f349601i.get();
        C69664n.m101060f(obj, "queryContextSupplier.get()");
        C119908e a = aVar.mo107854a(dyVar, aoVar, (C127289i) obj);
        C69664n.m101061g(a, "delegate");
        C69664n.m101061g(dyVar, "clientOp");
        C69664n.m101061g(aoVar, "context");
        C59052c cVar = (C59052c) C126918d.f349434a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "LoggingClientOpPrefetchSession");
        C119834cb cbVar = aoVar.f333672a;
        if (cbVar == null) {
            cbVar = C119834cb.f333765b;
        }
        String str = cbVar.f333767a;
        String str2 = dyVar.f135936b;
        cVar.mo56379ah(new C59094n(37238));
        cVar.mo56354G("[%s] startPrefetch: %s", str, str2);
        return new C126918d(a, dyVar, aoVar);
    }

    /* renamed from: b */
    public final C60870cx mo40057b(C119816bk bkVar) {
        C69664n.m101061g(bkVar, "update");
        C127354b bVar = this.f349603k;
        C52091ex exVar = bkVar.f333732b;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        C69664n.m101060f(exVar, "update.conversationParams");
        C69664n.m101061g(exVar, "conversationParams");
        AtomicReference atomicReference = bVar.f350714b;
        C62971cq cqVar = exVar.f136712a;
        C69664n.m101060f(cqVar, "conversationParams.paramList");
        ArrayList arrayList = new ArrayList();
        for (Object next : cqVar) {
            if (C127354b.f350713a.contains(((C52232kc) next).f137065b)) {
                arrayList.add(next);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<C52232kc> arrayList2 = new ArrayList<>();
        for (Object next2 : arrayList) {
            if (hashSet.add(((C52232kc) next2).f137065b)) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C69540x.m100804k(arrayList2, 10));
        for (C52232kc kcVar : arrayList2) {
            arrayList3.add(new C69685i(kcVar.f137065b, kcVar));
        }
        atomicReference.set(C58479go.m89812d(arrayList3));
        C127362j jVar = this.f349604l;
        C63088z zVar = bkVar.f333733c;
        C69664n.m101060f(zVar, "update.opaqueToken");
        C69664n.m101061g(zVar, "opaqueToken");
        jVar.f350726a.set(zVar);
        C60870cx k = this.f349606n.mo40247k(e.a);
        C69664n.m101060f(k, "onboardingDataService.re…s(OpaTriggerType.UNKNOWN)");
        return k;
    }

    /* renamed from: c */
    public final void mo40058c(C119904w wVar) {
        C69664n.m101061g(wVar, "assistantState");
        C125011a.m204943a(wVar);
        m207683l(C71803m.m105043d(this.f349607o, (C69585o) null, (C71424ay) null, new C126957j(this, wVar, (C69577g) null), 3), "Failed to update assistant state.");
        if (wVar.f333911a == 1) {
            C59052c cVar = (C59052c) f349593a.mo56224b();
            cVar.mo56379ah(new C59094n(37310));
            cVar.mo56386p("Assistant idle state received");
        }
        this.f349605m.mo107858a(wVar);
    }

    /* renamed from: d */
    public final void mo40059d(C119785ag agVar) {
        C69664n.m101061g(agVar, "level");
        m207683l(C71803m.m105043d(this.f349607o, (C69585o) null, (C71424ay) null, new C126958k(this, agVar, (C69577g) null), 3), "Failed to update audio level.");
    }

    /* renamed from: e */
    public final void mo40060e(C119748c cVar) {
        this.f349600h = 3;
    }

    /* renamed from: f */
    public final void mo40061f(Throwable th) {
        this.f349600h = 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40062g(com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "interactionResult"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            kotlinx.coroutines.aw r2 = r0.f349607o
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.l r3 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.l
            r4 = 0
            r3.<init>(r0, r1, r4)
            r5 = 3
            kotlinx.coroutines.cp r2 = kotlinx.coroutines.C71803m.m105043d(r2, r4, r4, r3, r5)
            java.lang.String r3 = "Failed to log interaction result to AppFlow"
            r0.m207683l(r2, r3)
            int r2 = r1.f333790a
            r6 = 2
            if (r2 != r6) goto L_0x00ff
            java.lang.Object r2 = r1.f333791b
            com.google.android.apps.search.assistant.platform.b.a.d.ck r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119843ck) r2
            boolean r2 = r2.f333786b
            if (r2 != 0) goto L_0x00ff
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ae r2 = r0.f349599g
            j$.util.function.Supplier r7 = r0.f349601i
            java.lang.Object r7 = r7.get()
            java.lang.String r8 = "queryContextSupplier.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            com.google.android.apps.search.assistant.surfaces.voice.d.d.i r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i) r7
            java.lang.String r8 = "queryContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r8)
            com.google.common.v.i r8 = r2.f349527d
            j$.time.Instant r8 = r8.mo57444a()
            java.lang.String r9 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            com.google.android.apps.search.assistant.surfaces.voice.d.d.c r9 = r7.f350565c
            if (r9 != 0) goto L_0x004d
            com.google.android.apps.search.assistant.surfaces.voice.d.d.c r9 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127283c.f350547c
        L_0x004d:
            java.lang.String r10 = "queryContext.entryPoint"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            int r9 = r9.f350549a
            com.google.android.apps.search.assistant.surfaces.voice.d.d.b r9 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127282b.m208209a(r9)
            int r9 = r9.ordinal()
            r10 = 1
            if (r9 == 0) goto L_0x006e
            if (r9 == r10) goto L_0x006b
            if (r9 != r6) goto L_0x0065
            r15 = r4
            goto L_0x0071
        L_0x0065:
            h.g r1 = new h.g
            r1.<init>()
            throw r1
        L_0x006b:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.a.c r9 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126935c.VOICE_SEARCH
            goto L_0x0070
        L_0x006e:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.a.c r9 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126935c.INPUT_PLATE
        L_0x0070:
            r15 = r9
        L_0x0071:
            if (r15 != 0) goto L_0x0093
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126945ae.f349524a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.android.apps.search.assistant.surfaces.voice.d.d.c r7 = r7.f350565c
            if (r7 != 0) goto L_0x0081
            com.google.android.apps.search.assistant.surfaces.voice.d.d.c r7 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127283c.f350547c
        L_0x0081:
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 37332(0x91d4, float:5.2313E-41)
            r8.<init>(r9)
            r2.mo56379ah(r8)
            java.lang.String r8 = "Unrecognized entry point: %s, not reporting execution"
            r2.mo56389s(r8, r7)
            goto L_0x00ff
        L_0x0093:
            java.util.concurrent.atomic.AtomicReference r7 = r2.f349528e
            java.lang.Object r7 = r7.get()
            com.google.android.apps.search.assistant.platform.b.a.d.cs r7 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs) r7
            if (r7 == 0) goto L_0x00e7
            int r7 = r7.f333806b
            int r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119848cp.m198740b(r7)
            if (r7 == 0) goto L_0x00e7
            int r7 = r7 + -1
            if (r7 == 0) goto L_0x00b0
            if (r7 == r10) goto L_0x00ad
            r7 = r4
            goto L_0x00b2
        L_0x00ad:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.a.d r7 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126936d.TOUCH
            goto L_0x00b2
        L_0x00b0:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.a.d r7 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126936d.VOICE
        L_0x00b2:
            if (r7 != 0) goto L_0x00b5
            goto L_0x00e7
        L_0x00b5:
            java.util.Set r9 = r2.f349525b
            java.util.Iterator r16 = r9.iterator()
        L_0x00bb:
            boolean r9 = r16.hasNext()
            if (r9 == 0) goto L_0x00ff
            java.lang.Object r9 = r16.next()
            r10 = r9
            com.google.android.apps.search.assistant.surfaces.voice.growth.d.d r10 = (com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.C127811d) r10
            kotlinx.coroutines.aw r14 = r2.f349526c
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ad r13 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ad
            r17 = 0
            r9 = r13
            r11 = r15
            r12 = r7
            r6 = r13
            r13 = r8
            r3 = r14
            r14 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            com.google.common.util.concurrent.cx r3 = kotlinx.coroutines.p5578d.C71663i.m104692e(r3, r4, r6, r5)
            java.lang.String r6 = "Reporting successful execution failed"
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r3, r6, r10)
            r6 = 2
            goto L_0x00bb
        L_0x00e7:
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126945ae.f349524a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r3 = new com.google.common.f.n
            r6 = 37330(0x91d2, float:5.231E-41)
            r3.<init>(r6)
            r2.mo56379ah(r3)
            java.lang.String r3 = "Unrecognized modality, not reporting execution"
            r2.mo56386p(r3)
        L_0x00ff:
            int r2 = r1.f333790a
            r3 = 2
            if (r2 != r3) goto L_0x0114
            java.lang.Object r2 = r1.f333791b
            com.google.android.apps.search.assistant.platform.b.a.d.ck r2 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119843ck) r2
            boolean r2 = r2.f333786b
            if (r2 != 0) goto L_0x0114
            com.google.android.apps.search.assistant.surfaces.voice.d.g.c r2 = r0.f349608p
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f350715a
            r3 = 0
            r2.set(r3)
        L_0x0114:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.a.b r2 = r0.f349605m
            r2.mo107859b(r1)
            kotlinx.coroutines.aw r2 = r0.f349607o
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.m r3 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.m
            r3.<init>(r0, r1, r4)
            kotlinx.coroutines.cp r1 = kotlinx.coroutines.C71803m.m105043d(r2, r4, r4, r3, r5)
            java.lang.String r2 = "Failed to update conversation data store when interaction finished."
            r0.m207683l(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126962o.mo40062g(com.google.android.apps.search.assistant.platform.b.a.d.cl):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40063h(com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119837ce r9) {
        /*
            r8 = this;
            java.lang.String r0 = "interactionInitiation"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            com.google.android.apps.search.assistant.surfaces.voice.d.g.h r1 = r8.f349597e
            java.lang.String r2 = "initiation"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r2)
            java.util.concurrent.atomic.AtomicReference r1 = r1.f350724b
            r1.set(r9)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.b r1 = r8.f349595c
            j$.util.function.Supplier r2 = r8.f349601i
            java.lang.Object r2 = r2.get()
            java.lang.String r3 = "queryContextSupplier.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.apps.search.assistant.surfaces.voice.d.d.i r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i) r2
            int r3 = r9.f333778b
            com.google.android.apps.search.assistant.platform.b.a.d.cd r3 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.m198736a(r3)
            if (r3 != 0) goto L_0x002a
            com.google.android.apps.search.assistant.platform.b.a.d.cd r3 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.UNRECOGNIZED
        L_0x002a:
            com.google.android.apps.gsa.assistant.shared.l.e r2 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9544aa.C127189a.m208030a(r2, r3)
            int r2 = r2.ca
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            int r0 = r9.f333778b
            com.google.android.apps.search.assistant.platform.b.a.d.cd r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.m198736a(r0)
            if (r0 != 0) goto L_0x003d
            com.google.android.apps.search.assistant.platform.b.a.d.cd r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.UNRECOGNIZED
        L_0x003d:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.h r3 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h.UNSPECIFIED
            int r0 = r0.ordinal()
            r3 = 1
            if (r0 == 0) goto L_0x009e
            if (r0 == r3) goto L_0x009e
            r4 = 2
            if (r0 == r4) goto L_0x007b
            r4 = 3
            if (r0 == r4) goto L_0x0058
            r4 = 4
            if (r0 != r4) goto L_0x0052
            goto L_0x009e
        L_0x0052:
            h.g r9 = new h.g
            r9.<init>()
            throw r9
        L_0x0058:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126949b.f349545a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.android.apps.search.assistant.platform.b.a.d.cb r4 = r9.f333777a
            if (r4 != 0) goto L_0x0066
            com.google.android.apps.search.assistant.platform.b.a.d.cb r4 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x0066:
            java.lang.String r4 = r4.f333767a
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 37307(0x91bb, float:5.2278E-41)
            r5.<init>(r6)
            r0.mo56379ah(r5)
            java.lang.String r5 = "Received FollowUp Interaction with id: %s"
            r0.mo56389s(r5, r4)
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97199gz
            goto L_0x009f
        L_0x007b:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126949b.f349545a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.android.apps.search.assistant.platform.b.a.d.cb r4 = r9.f333777a
            if (r4 != 0) goto L_0x0089
            com.google.android.apps.search.assistant.platform.b.a.d.cb r4 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x0089:
            java.lang.String r4 = r4.f333767a
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 37306(0x91ba, float:5.2277E-41)
            r5.<init>(r6)
            r0.mo56379ah(r5)
            java.lang.String r5 = "Received ClientOpResult Interaction with id: %s"
            r0.mo56389s(r5, r4)
            com.google.android.libraries.search.b.i.g r0 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97279iZ
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r0 != 0) goto L_0x00a2
            return
        L_0x00a2:
            com.google.android.libraries.search.b.b r1 = r1.f349546b
            com.google.android.apps.search.assistant.platform.b.a.d.cb r9 = r9.f333777a
            if (r9 != 0) goto L_0x00aa
            com.google.android.apps.search.assistant.platform.b.a.d.cb r9 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x00aa:
            java.lang.String r4 = "interaction"
            java.lang.String r9 = r9.f333767a
            com.google.android.libraries.search.b.i.a r9 = r0.mo40816j(r4, r9)
            com.google.protobuf.bt r0 = p5535j.p5536a.p5545c.p5548c.p5549a.C71058dd.f189513d
            j.a.c.c.a.dd r4 = p5535j.p5536a.p5545c.p5548c.p5549a.C71058dd.f189512c
            com.google.protobuf.bn r4 = r4.createBuilder()
            j.a.c.c.a.dc r4 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71057dc) r4
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            j.a.c.c.a.df r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            j.a.c.c.a.dl r6 = p5535j.p5536a.p5545c.p5548c.p5549a.C71066dl.f189528e
            com.google.protobuf.bn r6 = r6.createBuilder()
            j.a.c.c.a.dg r6 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71061dg) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r5)
            j.a.c.c.a.dn r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            j.a.c.c.a.dg r6 = r5.f189534a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            j.a.c.c.a.dl r6 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71066dl) r6
            int r7 = r6.f189530a
            r3 = r3 | r7
            r6.f189530a = r3
            r6.f189533d = r2
            j.a.c.c.a.dl r2 = r5.mo62605a()
            r4.mo62603b(r2)
            j.a.c.c.a.dd r2 = r4.mo62602a()
            r3 = r9
            com.google.android.libraries.search.b.i.b r3 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r3
            r3.mo40792p(r0, r2)
            r1.mo19974a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126962o.mo40063h(com.google.android.apps.search.assistant.platform.b.a.d.ce):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40064i(com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119867dh r8) {
        /*
            r7 = this;
            java.lang.String r0 = "milestone"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r8.f333830b
            int r3 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119866dg.m198754a(r3)
            r4 = 3
            r5 = 2
            if (r3 != 0) goto L_0x0013
            goto L_0x001d
        L_0x0013:
            if (r3 == r5) goto L_0x0029
            if (r3 == r4) goto L_0x0026
            r6 = 4
            if (r3 == r6) goto L_0x0023
            r6 = 5
            if (r3 == r6) goto L_0x0020
        L_0x001d:
            java.lang.String r3 = "UNRECOGNIZED"
            goto L_0x002b
        L_0x0020:
            java.lang.String r3 = "TRUE_END_OF_QUERY"
            goto L_0x002b
        L_0x0023:
            java.lang.String r3 = "MIC_OPENED"
            goto L_0x002b
        L_0x0026:
            java.lang.String r3 = "END_OF_SPEECH"
            goto L_0x002b
        L_0x0029:
            java.lang.String r3 = "UNKNOWN"
        L_0x002b:
            r6 = 0
            r2[r6] = r3
            java.lang.String r3 = "milestone {%s}"
            java.lang.String.format(r3, r2)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.b r2 = r7.f349595c
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)
            int r0 = r8.f333830b
            int r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119866dg.m198754a(r0)
            if (r0 != 0) goto L_0x0041
            r0 = 1
        L_0x0041:
            com.google.android.apps.search.assistant.platform.b.a.d.cd r3 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.UNKNOWN
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.h r3 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h.UNSPECIFIED
            int r0 = r0 + -2
            java.lang.String r3 = "interaction"
            java.lang.String r6 = "milestone.elapsedRealtime"
            if (r0 == r1) goto L_0x00a2
            if (r0 == r5) goto L_0x007a
            if (r0 == r4) goto L_0x0052
            return
        L_0x0052:
            com.google.android.libraries.search.b.b r0 = r2.f349546b
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97277iX
            java.lang.String r2 = "MAIN_ASSISTANT_TRUE_END_OF_QUERY"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.protobuf.ar r2 = r8.f333831c
            if (r2 != 0) goto L_0x0061
            com.google.protobuf.ar r2 = com.google.protobuf.C62910ar.f169858c
        L_0x0061:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            com.google.android.libraries.search.b.i.a r1 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126949b.m207655b(r1, r2)
            com.google.android.apps.search.assistant.platform.b.a.d.cb r8 = r8.f333829a
            if (r8 != 0) goto L_0x006e
            com.google.android.apps.search.assistant.platform.b.a.d.cb r8 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x006e:
            java.lang.String r8 = r8.f333767a
            r2 = r1
            com.google.android.libraries.search.b.i.b r2 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r2
            r2.mo40795s(r3, r8)
            r0.mo19974a(r1)
            return
        L_0x007a:
            com.google.android.libraries.search.b.b r0 = r2.f349546b
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97189gp
            java.lang.String r2 = "MAIN_ASSISTANT_MICROPHONE_OPENED"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.protobuf.ar r2 = r8.f333831c
            if (r2 != 0) goto L_0x0089
            com.google.protobuf.ar r2 = com.google.protobuf.C62910ar.f169858c
        L_0x0089:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            com.google.android.libraries.search.b.i.a r1 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126949b.m207655b(r1, r2)
            com.google.android.apps.search.assistant.platform.b.a.d.cb r8 = r8.f333829a
            if (r8 != 0) goto L_0x0096
            com.google.android.apps.search.assistant.platform.b.a.d.cb r8 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x0096:
            java.lang.String r8 = r8.f333767a
            r2 = r1
            com.google.android.libraries.search.b.i.b r2 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r2
            r2.mo40795s(r3, r8)
            r0.mo19974a(r1)
            return
        L_0x00a2:
            com.google.android.libraries.search.b.b r0 = r2.f349546b
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97116fV
            java.lang.String r2 = "MAIN_ASSISTANT_ESTIMATED_END_OF_SPEECH"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.protobuf.ar r2 = r8.f333831c
            if (r2 != 0) goto L_0x00b1
            com.google.protobuf.ar r2 = com.google.protobuf.C62910ar.f169858c
        L_0x00b1:
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r6)
            com.google.android.libraries.search.b.i.a r1 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126949b.m207655b(r1, r2)
            com.google.android.apps.search.assistant.platform.b.a.d.cb r8 = r8.f333829a
            if (r8 != 0) goto L_0x00be
            com.google.android.apps.search.assistant.platform.b.a.d.cb r8 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x00be:
            java.lang.String r8 = r8.f333767a
            r2 = r1
            com.google.android.libraries.search.b.i.b r2 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r2
            r2.mo40795s(r3, r8)
            r0.mo19974a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126962o.mo40064i(com.google.android.apps.search.assistant.platform.b.a.d.dh):void");
    }

    /* renamed from: j */
    public final void mo40065j(C119885dz dzVar) {
        C69664n.m101061g(dzVar, "rawTranscription");
        C69664n.m101061g(dzVar, "<this>");
        if (!dzVar.f333871e) {
            C62934bn builder = dzVar.toBuilder();
            C69664n.m101060f(builder, "this.toBuilder()");
            C119883dx dxVar = (C119883dx) builder;
            C69664n.m101061g(dxVar, "builder");
            String str = ((C119885dz) dxVar.instance).f333868b;
            C69664n.m101060f(str, "_builder.getText()");
            String str2 = ((C119885dz) dxVar.instance).f333869c;
            C69664n.m101060f(str2, "_builder.getLanguage()");
            Locale forLanguageTag = Locale.forLanguageTag(str2);
            C69664n.m101060f(forLanguageTag, "forLanguageTag(language)");
            String a = C126922a.m207614a(str, forLanguageTag);
            C69664n.m101061g(a, "value");
            dxVar.copyOnWrite();
            a.getClass();
            ((C119885dz) dxVar.instance).f333868b = a;
            C62942bv build = dxVar.build();
            C69664n.m101060f(build, "_builder.build()");
            dzVar = (C119885dz) build;
        }
        String.format("transcription {%s}", new Object[]{dzVar.f333868b});
        this.f349605m.mo107860c(dzVar);
        m207683l(C71803m.m105043d(this.f349607o, (C69585o) null, (C71424ay) null, new C126961n(this, dzVar, (C69577g) null), 3), "Failed to update transcription.");
    }

    /* renamed from: k */
    public final /* synthetic */ C60870cx mo40066k() {
        return C119650a.m198564a();
    }
}
