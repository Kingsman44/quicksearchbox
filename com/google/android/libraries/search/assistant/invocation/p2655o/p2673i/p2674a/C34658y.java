package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.C33499c;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.p2589a.p2590a.C33497h;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34134g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34137j;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34230am;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.C34507e;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34565a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34567c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34569e;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34570f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34574j;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34593e;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f.C34632v;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37502di;
import com.google.android.libraries.search.p2904c.p2977w.p2979b.C38140a;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.libraries.search.p3055n.C39264an;
import com.google.common.base.C58872ci;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.C69677g;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.y */
/* compiled from: PG */
public final class C34658y implements C33499c, C34593e {

    /* renamed from: a */
    public static final C59071e f92017a = C59071e.m91331h();

    /* renamed from: b */
    public final C34532ah f92018b;

    /* renamed from: c */
    public final C71422aw f92019c;

    /* renamed from: d */
    public final AtomicReference f92020d = new AtomicReference();

    /* renamed from: e */
    private final C34137j f92021e;

    /* renamed from: f */
    private final C34570f f92022f;

    /* renamed from: g */
    private final C34632v f92023g;

    /* renamed from: h */
    private final C39141kp f92024h;

    /* renamed from: i */
    private final C58889cz f92025i;

    /* renamed from: j */
    private final C69585o f92026j;

    /* renamed from: k */
    private final C38140a f92027k;

    /* renamed from: l */
    private final C34230am f92028l;

    /* renamed from: m */
    private final C34507e f92029m;

    public C34658y(C34137j jVar, C34230am amVar, C34507e eVar, C34532ah ahVar, C34570f fVar, C34632v vVar, C39141kp kpVar, C58889cz czVar, C71422aw awVar, C69585o oVar, C38140a aVar) {
        C69664n.m101061g(ahVar, "hotwordTriggeringFrontendFactory");
        C69664n.m101061g(vVar, "hotwordSuppressionRequirement");
        C69664n.m101061g(kpVar, "clientStreamz");
        C69664n.m101061g(czVar, "ticker");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "backgroundContext");
        C69664n.m101061g(aVar, "audioRouteDisconnector");
        this.f92021e = jVar;
        this.f92028l = amVar;
        this.f92029m = eVar;
        this.f92018b = ahVar;
        this.f92022f = fVar;
        this.f92023g = vVar;
        this.f92024h = kpVar;
        this.f92025i = czVar;
        this.f92019c = awVar;
        this.f92026j = oVar;
        this.f92027k = aVar;
    }

    /* renamed from: f */
    private final int m63391f(C39260aj ajVar) {
        C37502di diVar;
        C37462ck ckVar = ajVar.f103418b;
        if (ckVar == null) {
            ckVar = C37462ck.f99442c;
        }
        C37467cp cpVar = ckVar.f99445b;
        if (cpVar == null) {
            cpVar = C37467cp.f99458c;
        }
        if (cpVar.f99460a == 6) {
            diVar = (C37502di) cpVar.f99461b;
        } else {
            diVar = C37502di.f99561c;
        }
        C37500dg dgVar = diVar.f99564b;
        if (dgVar == null) {
            dgVar = C37500dg.f99557c;
        }
        return dgVar.f99560b;
    }

    /* renamed from: g */
    private static final void m63392g(C58872ci ciVar, C34569e eVar, C34658y yVar, String str) {
        String str2;
        Duration ofNanos = Duration.ofNanos(ciVar.mo56159b());
        C69664n.m101060f(ofNanos, "stopwatch.elapsed()");
        C59052c cVar = (C59052c) f92017a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordSource");
        cVar.mo56379ah(new C59094n(51370));
        cVar.mo56359L("Hotword event propagation completed: consumer(%s), duration(%s), outcome(%s).", eVar, ofNanos, str);
        double millis = (double) ofNanos.toMillis();
        C39141kp kpVar = yVar.f92024h;
        if (eVar instanceof C34565a) {
            str2 = ((C34565a) eVar).f91837a.f90872a.f90869a.name();
        } else if (eVar instanceof C34574j) {
            str2 = "LEGACY";
        } else if (eVar instanceof C34567c) {
            str2 = "EXTERNAL";
        } else if (eVar == null) {
            str2 = "NULL";
        } else {
            throw new C69677g();
        }
        ((C19569f) kpVar.f103049u.mo6453a()).mo24824b(millis, str2, str);
    }

    /* renamed from: a */
    public final C60870cx mo39444a(C39264an anVar) {
        C69664n.m101061g(anVar, "params");
        return C71663i.m104692e(this.f92019c, (C71424ay) null, new C34657x(this, anVar, (C69577g) null), 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: com.google.android.libraries.search.assistant.invocation.o.i.a.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39460b(com.google.android.libraries.search.p3055n.C39260aj r17, p5462h.p5466c.C69577g r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            java.lang.String r2 = "value"
            java.lang.String r3 = "newBuilder()"
            java.lang.String r4 = "Unsupported consumer "
            boolean r5 = r0 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34653t
            if (r5 == 0) goto L_0x001d
            r5 = r0
            com.google.android.libraries.search.assistant.invocation.o.i.a.t r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34653t) r5
            int r6 = r5.f92008f
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f92008f = r6
            goto L_0x0022
        L_0x001d:
            com.google.android.libraries.search.assistant.invocation.o.i.a.t r5 = new com.google.android.libraries.search.assistant.invocation.o.i.a.t
            r5.<init>(r1, r0)
        L_0x0022:
            java.lang.Object r0 = r5.f92006d
            h.c.a.a r6 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r7 = r5.f92008f
            r8 = 3
            r9 = 2
            java.lang.String r10 = "TRG.HotwordSource"
            r11 = 4
            r12 = 1
            if (r7 == 0) goto L_0x0068
            if (r7 == r12) goto L_0x005e
            if (r7 == r9) goto L_0x0059
            if (r7 == r8) goto L_0x0050
            if (r7 != r11) goto L_0x0048
            java.lang.Object r2 = r5.f92005c
            java.lang.Object r3 = r5.f92004b
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.e r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34569e) r3
            java.lang.Object r4 = r5.f92003a
        L_0x0040:
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0045 }
            goto L_0x01eb
        L_0x0045:
            r0 = move-exception
            goto L_0x0213
        L_0x0048:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0050:
            java.lang.Object r2 = r5.f92005c
            java.lang.Object r3 = r5.f92004b
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.e r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34569e) r3
            java.lang.Object r4 = r5.f92003a
            goto L_0x0040
        L_0x0059:
            p5462h.C69714l.m101134b(r0)
            goto L_0x00da
        L_0x005e:
            java.lang.Object r7 = r5.f92004b
            com.google.android.libraries.search.n.aj r7 = (com.google.android.libraries.search.p3055n.C39260aj) r7
            java.lang.Object r13 = r5.f92003a
            p5462h.C69714l.m101134b(r0)
            goto L_0x0084
        L_0x0068:
            p5462h.C69714l.m101134b(r0)
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.f r0 = r1.f92022f
            com.google.android.libraries.search.assistant.invocation.o.i.a.f.v r7 = r1.f92023g
            kotlinx.coroutines.b.n r7 = r7.f91965c
            kotlinx.coroutines.b.n r0 = com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k.m63490a(r0, r7)
            r5.f92003a = r1
            r7 = r17
            r5.f92004b = r7
            r5.f92008f = r12
            java.lang.Object r0 = kotlinx.coroutines.p5574b.C71517bu.m104350a(r0, r5)
            if (r0 == r6) goto L_0x0242
            r13 = r1
        L_0x0084:
            h.i r0 = (p5462h.C69685i) r0
            java.lang.Object r14 = r0.f186052a
            com.google.android.libraries.search.assistant.invocation.o.i.a.c.e r14 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34569e) r14
            java.lang.Object r0 = r0.f186053b
            com.google.android.libraries.search.assistant.invocation.o.i.a.f.m r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f.C34623m) r0
            com.google.android.libraries.search.assistant.invocation.o.i.a.f.m r15 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2682f.C34623m.f91948a
            r8 = 0
            if (r0 != r15) goto L_0x00e4
            com.google.common.f.e r0 = f92017a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r10)
            com.google.android.libraries.search.assistant.invocation.o.i.a.y r13 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34658y) r13
            int r2 = r13.m63391f(r7)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 51367(0xc8a7, float:7.198E-41)
            r3.<init>(r4)
            r0.mo56379ah(r3)
            java.lang.String r3 = "Hotword event(bufferId=%s) has been suppressed."
            r0.mo56387q(r3, r2)
            com.google.android.libraries.search.c.w.b.a r0 = r13.f92027k
            com.google.android.libraries.search.c.ck r2 = r7.f103418b
            if (r2 != 0) goto L_0x00be
            com.google.android.libraries.search.c.ck r2 = com.google.android.libraries.search.p2904c.C37462ck.f99442c
        L_0x00be:
            com.google.android.libraries.search.c.cp r2 = r2.f99445b
            if (r2 != 0) goto L_0x00c4
            com.google.android.libraries.search.c.cp r2 = com.google.android.libraries.search.p2904c.C37467cp.f99458c
        L_0x00c4:
            java.lang.String r3 = "event.audioRouteRequestParams.audioRouteType"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.common.util.concurrent.cx r0 = r0.mo41282a(r2)
            r5.f92003a = r8
            r5.f92004b = r8
            r5.f92008f = r9
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r5)
            if (r0 != r6) goto L_0x00da
            return r6
        L_0x00da:
            com.google.android.libraries.search.c.w.b.b.a r0 = (com.google.android.libraries.search.p2904c.p2977w.p2979b.p2981b.C38150a) r0
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.name()
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x00e4:
            com.google.common.f.e r0 = f92017a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r9, r10)
            r9 = r13
            com.google.android.libraries.search.assistant.invocation.o.i.a.y r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34658y) r9
            int r15 = r9.m63391f(r7)
            com.google.common.f.n r8 = new com.google.common.f.n
            r12 = 51365(0xc8a5, float:7.1978E-41)
            r8.<init>(r12)
            r0.mo56379ah(r8)
            java.lang.String r8 = "On new hotword event(bufferId=%s)."
            r0.mo56387q(r8, r15)
            com.google.common.base.cz r0 = r9.f92025i
            com.google.common.base.ci r8 = com.google.common.base.C58872ci.m90947d(r0)
            boolean r0 = r14 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34565a     // Catch:{ all -> 0x020f }
            if (r0 == 0) goto L_0x01c0
            r0 = r13
            com.google.android.libraries.search.assistant.invocation.o.i.a.y r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34658y) r0     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.f.a.am r0 = r0.f92028l     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.d r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d.f92090g     // Catch:{ all -> 0x020f }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.c r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34666c) r4     // Catch:{ all -> 0x020f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r3)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.k r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.a.bf r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf.ENTRYPOINT_HDM_HOTWORD     // Catch:{ all -> 0x020f }
            r4.mo39467b(r9)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.a.ba r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba.f90707h     // Catch:{ all -> 0x020f }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.a.az r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34036az) r9     // Catch:{ all -> 0x020f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r3)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.a.bh r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")     // Catch:{ all -> 0x020f }
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r2)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.a.az r12 = r9.f90745a     // Catch:{ all -> 0x020f }
            r12.copyOnWrite()     // Catch:{ all -> 0x020f }
            com.google.protobuf.bv r12 = r12.instance     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.a.ba r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba) r12     // Catch:{ all -> 0x020f }
            r7.getClass()     // Catch:{ all -> 0x020f }
            r12.f90712d = r7     // Catch:{ all -> 0x020f }
            int r15 = r12.f90709a     // Catch:{ all -> 0x020f }
            r11 = r11 | r15
            r12.f90709a = r11     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.a.ba r9 = r9.mo39195a()     // Catch:{ all -> 0x020f }
            r4.mo39469d(r9)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.g r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34697g.f92115a     // Catch:{ all -> 0x020f }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.f r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34696f) r9     // Catch:{ all -> 0x020f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r3)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.i r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")     // Catch:{ all -> 0x020f }
            com.google.protobuf.bt r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34649p.f91996d     // Catch:{ all -> 0x020f }
            java.lang.String r12 = "hotwordInvocationInputExtras"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.a.p r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34649p.f91995c     // Catch:{ all -> 0x020f }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.a.o r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34648o) r12     // Catch:{ all -> 0x020f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r3)     // Catch:{ all -> 0x020f }
            java.lang.String r3 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r3)     // Catch:{ all -> 0x020f }
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r2)     // Catch:{ all -> 0x020f }
            r12.copyOnWrite()     // Catch:{ all -> 0x020f }
            com.google.protobuf.bv r2 = r12.instance     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.a.p r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34649p) r2     // Catch:{ all -> 0x020f }
            r7.getClass()     // Catch:{ all -> 0x020f }
            r2.f91999b = r7     // Catch:{ all -> 0x020f }
            int r3 = r2.f91998a     // Catch:{ all -> 0x020f }
            r7 = 1
            r3 = r3 | r7
            r2.f91998a = r3     // Catch:{ all -> 0x020f }
            com.google.protobuf.bv r2 = r12.build()     // Catch:{ all -> 0x020f }
            java.lang.String r3 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.a.p r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34649p) r2     // Catch:{ all -> 0x020f }
            r9.mo39465b(r11, r2)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.g r2 = r9.mo39464a()     // Catch:{ all -> 0x020f }
            r4.mo39468c(r2)     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.d r2 = r4.mo39466a()     // Catch:{ all -> 0x020f }
            com.google.common.util.concurrent.cx r0 = r0.mo39276a(r2)     // Catch:{ all -> 0x020f }
            r5.f92003a = r13     // Catch:{ all -> 0x020f }
            r5.f92004b = r14     // Catch:{ all -> 0x020f }
            r5.f92005c = r8     // Catch:{ all -> 0x020f }
            r2 = 3
            r5.f92008f = r2     // Catch:{ all -> 0x020f }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r5)     // Catch:{ all -> 0x020f }
            if (r0 == r6) goto L_0x01bf
            goto L_0x01e8
        L_0x01bf:
            return r6
        L_0x01c0:
            boolean r0 = r14 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34574j     // Catch:{ all -> 0x020f }
            if (r0 == 0) goto L_0x01f8
            r0 = r13
            com.google.android.libraries.search.assistant.invocation.o.i.a.y r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34658y) r0     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.e r0 = r0.f92029m     // Catch:{ all -> 0x020f }
            java.lang.String r2 = "event"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r2)     // Catch:{ all -> 0x020f }
            kotlinx.coroutines.aw r2 = r0.f91709g     // Catch:{ all -> 0x020f }
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.d r3 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.d     // Catch:{ all -> 0x020f }
            r4 = 0
            r3.<init>(r7, r0, r4)     // Catch:{ all -> 0x020f }
            com.google.common.util.concurrent.cx r0 = com.google.android.libraries.search.assistant.p2511d.C32561x.m60381a(r2, r3)     // Catch:{ all -> 0x020f }
            r5.f92003a = r13     // Catch:{ all -> 0x020f }
            r5.f92004b = r14     // Catch:{ all -> 0x020f }
            r5.f92005c = r8     // Catch:{ all -> 0x020f }
            r5.f92008f = r11     // Catch:{ all -> 0x020f }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r5)     // Catch:{ all -> 0x020f }
            if (r0 == r6) goto L_0x01f7
        L_0x01e8:
            r2 = r8
            r4 = r13
            r3 = r14
        L_0x01eb:
            r0 = r4
            com.google.android.libraries.search.assistant.invocation.o.i.a.y r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34658y) r0     // Catch:{ all -> 0x0045 }
            r5 = r2
            com.google.common.base.ci r5 = (com.google.common.base.C58872ci) r5     // Catch:{ all -> 0x0045 }
            java.lang.String r6 = "SUCCESS"
            m63392g(r5, r3, r0, r6)     // Catch:{ all -> 0x0045 }
            goto L_0x023f
        L_0x01f7:
            return r6
        L_0x01f8:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x020f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x020f }
            r2.<init>(r4)     // Catch:{ all -> 0x020f }
            r2.append(r14)     // Catch:{ all -> 0x020f }
            java.lang.String r3 = "."
            r2.append(r3)     // Catch:{ all -> 0x020f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x020f }
            r0.<init>(r2)     // Catch:{ all -> 0x020f }
            throw r0     // Catch:{ all -> 0x020f }
        L_0x020f:
            r0 = move-exception
            r2 = r8
            r4 = r13
            r3 = r14
        L_0x0213:
            com.google.common.f.e r5 = f92017a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r6, r10)
            com.google.common.f.x r0 = r5.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 51366(0xc8a6, float:7.1979E-41)
            r5.<init>(r6)
            r0.mo56379ah(r5)
            java.lang.String r5 = "Failed to forward hotword event."
            r0.mo56386p(r5)
            com.google.android.libraries.search.assistant.invocation.o.i.a.y r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34658y) r4
            com.google.common.base.ci r2 = (com.google.common.base.C58872ci) r2
            java.lang.String r0 = "FAILURE"
            m63392g(r2, r3, r4, r0)
        L_0x023f:
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0242:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.C34658y.mo39460b(com.google.android.libraries.search.n.aj, h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final Object mo38908c(C69577g gVar) {
        return C71663i.m104690c(this.f92021e.mo39228b(C34134g.HDM), gVar);
    }

    /* renamed from: d */
    public final Object mo38909d(C69577g gVar) {
        Object a = C71803m.m105040a(this.f92026j, new C34656w(this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: e */
    public final Object mo38910e(C33497h hVar, C69577g gVar) {
        Object a = C71803m.m105040a(this.f92026j, new C34655v(this, hVar, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}
