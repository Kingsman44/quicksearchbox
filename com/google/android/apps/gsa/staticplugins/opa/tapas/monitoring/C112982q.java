package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.C112961b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.C112962c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.C112963d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.common.C112964e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p4001w.p4002a.C53499f;
import com.google.assistant.p4001w.p4002a.C53503j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.p4543n.p4550f.C59434g;
import com.google.common.p4543n.p4550f.C59435h;
import com.google.common.p4543n.p4550f.C59436i;
import com.google.common.p4580v.C60948g;
import dagger.C68214a;
import java.util.Map;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.q */
/* compiled from: PG */
public final class C112982q {

    /* renamed from: a */
    public static final C59436i f313099a;

    /* renamed from: f */
    private static final C59071e f313100f = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.q");

    /* renamed from: g */
    private static final C112959c f313101g = C112959c.m186947a(C112957a.f313023a, "Tapas/TapasSuggestionFetchLatencyMonitor");

    /* renamed from: b */
    public final C86124t f313102b;

    /* renamed from: c */
    public final C68214a f313103c;

    /* renamed from: d */
    public final C112974i f313104d;

    /* renamed from: e */
    public final Map f313105e = new ConcurrentHashMap();

    /* renamed from: h */
    private final C21370a f313106h;

    /* renamed from: i */
    private final C22871g f313107i;

    /* renamed from: j */
    private final Instant f313108j;

    /* renamed from: k */
    private final long f313109k;

    static {
        C59435h hVar = new C59435h();
        hVar.f157673b = C59203do.f157270a;
        hVar.f157676e = 1000.0d;
        hVar.f157675d = C59203do.f157270a;
        hVar.f157674c = 0.1d;
        C59435h hVar2 = new C59435h(hVar);
        f313099a = new C59436i(hVar2, C59434g.m92339c(hVar2));
    }

    public C112982q(C86124t tVar, C21370a aVar, C22871g gVar, C68214a aVar2) {
        this.f313102b = tVar;
        this.f313106h = aVar;
        this.f313107i = gVar;
        this.f313103c = aVar2;
        this.f313104d = new C112974i();
        C60948g gVar2 = C60948g.f165068a;
        this.f313108j = Instant.now();
        this.f313109k = aVar.mo26873e();
        if (tVar.mo79746e(C90063do.f249318bK) && tVar.mo79746e(C90063do.f249319bL) && !tVar.mo79746e(C90063do.f249453dn)) {
            gVar.mo28212l("[Tapas] add usage info to debug pannel", new C112971f(aVar2));
        }
    }

    /* renamed from: a */
    public static double m186971a(Duration duration) {
        double nanos = (double) duration.toNanos();
        Double.isNaN(nanos);
        return nanos / 1000000.0d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m186972g(com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112979n r16, com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k r17, p3186j$.time.Instant r18, p3186j$.time.Duration r19, com.google.assistant.p4001w.p4002a.C53503j r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r20
            com.google.protobuf.ar r4 = r3.f140414e
            if (r4 != 0) goto L_0x000e
            com.google.protobuf.ar r4 = com.google.protobuf.C62910ar.f169858c
        L_0x000e:
            j$.time.Duration r4 = com.google.protobuf.p4750c.C62950b.m95473d(r4)
            r5 = r19
            j$.time.Duration r5 = r5.minus(r4)
            r6 = 2
            j$.time.Duration r5 = r5.dividedBy((long) r6)
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k.UNKNOWN
            int r6 = r17.ordinal()
            r7 = 6
            if (r6 == r7) goto L_0x003f
            r7 = 8
            if (r6 == r7) goto L_0x003c
            r7 = 10
            if (r6 == r7) goto L_0x0039
            r7 = 13
            if (r6 == r7) goto L_0x003f
            r7 = 14
            if (r6 == r7) goto L_0x003f
            r6 = 0
            goto L_0x0041
        L_0x0039:
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k.CORTEX_SERVICE_HANDLER
            goto L_0x0041
        L_0x003c:
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k.TAPAS_SERVICE_HANDLER
            goto L_0x0041
        L_0x003f:
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k.S3_REQUEST_HANDLER
        L_0x0041:
            java.lang.String r7 = "FetchLatencyMonitor"
            if (r6 != 0) goto L_0x0058
            com.google.common.f.e r0 = f313100f
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r7)
            java.lang.String r2 = "Could not resolve handler phase for RPC call client %s"
            r3 = 27558(0x6ba6, float:3.8617E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r2, r1)
            return
        L_0x0058:
            m186976k(r0, r1, r6, r2, r5)
            int r9 = r3.f140410a
            r9 = r9 & 2
            if (r9 == 0) goto L_0x0068
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.h r9 = r0.f313089e
            java.lang.String r10 = r3.f140412c
            r9.mo99798c(r6, r10)
        L_0x0068:
            j$.time.Instant r2 = r2.plus(r5)
            r9 = 0
            r10 = 0
        L_0x006e:
            com.google.protobuf.cq r11 = r3.f140416g
            int r11 = r11.size()
            if (r10 >= r11) goto L_0x00fb
            if (r10 == 0) goto L_0x007b
            r11 = r10
            r10 = 0
            goto L_0x008e
        L_0x007b:
            int r10 = r6.ordinal()
            r11 = 7
            if (r10 == r11) goto L_0x008b
            r11 = 9
            if (r10 == r11) goto L_0x0088
            r10 = 0
            goto L_0x008d
        L_0x0088:
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r10 = com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k.CORTEX_SERVICE_REQUEST
            goto L_0x008d
        L_0x008b:
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r10 = com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k.TAPAS_SERVICE_REQUEST
        L_0x008d:
            r11 = 0
        L_0x008e:
            if (r10 != 0) goto L_0x00ab
            com.google.common.f.e r10 = f313100f
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r12, r7)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            r12 = 27557(0x6ba5, float:3.8616E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r12)
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10
            java.lang.String r12 = "Unable to associate RPC trace #%d of handler %s with a phase."
            r10.mo56395y(r12, r11, r6)
            goto L_0x00f7
        L_0x00ab:
            com.google.protobuf.cq r12 = r3.f140416g
            java.lang.Object r12 = r12.get(r11)
            com.google.assistant.w.a.h r12 = (com.google.assistant.p4001w.p4002a.C53501h) r12
            int r13 = r12.f140404a
            r14 = r13 & 1
            if (r14 == 0) goto L_0x00f7
            r14 = r13 & 2
            if (r14 == 0) goto L_0x00f7
            r13 = r13 & 4
            if (r13 == 0) goto L_0x00f7
            com.google.protobuf.ar r13 = r12.f140405b
            if (r13 != 0) goto L_0x00c7
            com.google.protobuf.ar r13 = com.google.protobuf.C62910ar.f169858c
        L_0x00c7:
            j$.time.Duration r13 = com.google.protobuf.p4750c.C62950b.m95473d(r13)
            com.google.protobuf.ar r14 = r12.f140406c
            if (r14 != 0) goto L_0x00d1
            com.google.protobuf.ar r14 = com.google.protobuf.C62910ar.f169858c
        L_0x00d1:
            j$.time.Duration r14 = com.google.protobuf.p4750c.C62950b.m95473d(r14)
            j$.time.Duration r15 = r4.minus(r13)
            j$.time.Duration r15 = r15.minus(r14)
            j$.time.Instant r8 = r2.plus(r13)
            m186976k(r0, r6, r10, r2, r13)
            com.google.assistant.w.a.j r12 = r12.f140407d
            if (r12 != 0) goto L_0x00ea
            com.google.assistant.w.a.j r12 = com.google.assistant.p4001w.p4002a.C53503j.f140408h
        L_0x00ea:
            m186972g(r0, r10, r8, r14, r12)
            j$.time.Instant r12 = r8.plus(r14)
            m186976k(r0, r10, r6, r12, r15)
            m186975j(r0, r10, r8, r14)
        L_0x00f7:
            int r10 = r11 + 1
            goto L_0x006e
        L_0x00fb:
            j$.time.Instant r3 = r2.plus(r4)
            m186976k(r0, r6, r1, r3, r5)
            m186975j(r0, r6, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q.m186972g(com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.n, com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k, j$.time.Instant, j$.time.Duration, com.google.assistant.w.a.j):void");
    }

    /* renamed from: h */
    private final void m186973h(C112979n nVar) {
        this.f313107i.mo28212l("[Tapas] log and clean latency breakdown", new C112972g(this, nVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m186974i(com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112979n r4, p3186j$.time.Instant r5, boolean r6) {
        /*
            r3 = this;
            monitor-enter(r4)
            java.util.Deque r0 = r4.f313087c     // Catch:{ all -> 0x0036 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x000b:
            j$.time.Instant r0 = r4.f313091g     // Catch:{ all -> 0x0036 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r1 = r4.f313090f     // Catch:{ all -> 0x0036 }
            java.util.Deque r2 = r4.f313087c     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r2.pop()     // Catch:{ all -> 0x0036 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r2 = (com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k) r2     // Catch:{ all -> 0x0036 }
            r4.f313091g = r5     // Catch:{ all -> 0x0036 }
            r4.f313090f = r2     // Catch:{ all -> 0x0036 }
            if (r6 != 0) goto L_0x0024
            j$.time.Duration r6 = p3186j$.time.Duration.between(r0, r5)     // Catch:{ all -> 0x0036 }
            m186976k(r4, r1, r2, r0, r6)     // Catch:{ all -> 0x0036 }
        L_0x0024:
            java.util.Deque r6 = r4.f313087c     // Catch:{ all -> 0x0036 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0036 }
            if (r6 == 0) goto L_0x0034
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.h r6 = r4.f313089e     // Catch:{ all -> 0x0036 }
            r6.mo99799d(r5)     // Catch:{ all -> 0x0036 }
            r3.m186973h(r4)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q.m186974i(com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.n, j$.time.Instant, boolean):void");
    }

    /* renamed from: j */
    private static void m186975j(C112979n nVar, C112976k kVar, Instant instant, Duration duration) {
        char c = kVar.f313079p;
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        String sb2 = sb.toString();
        C58976aa aaVar = C58975e.f156826a;
        m186971a(duration);
        if (duration.isNegative()) {
            C59104x d = f313100f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FetchLatencyMonitor");
            ((C59052c) ((C59052c) d).mo56372aa(27566)).mo56359L("%d => invalid duration for %s: %.2fms", Long.valueOf(nVar.f313085a), sb2, Double.valueOf(m186971a(duration)));
            return;
        }
        C112959c cVar = f313101g;
        cVar.mo99788c(sb2);
        if (nVar.f313086b.trim().isEmpty()) {
            cVar.mo99788c("zp-".concat(sb2));
        } else {
            cVar.mo99788c("np-".concat(sb2));
        }
        nVar.f313089e.mo99796a(kVar, duration);
    }

    /* renamed from: k */
    private static void m186976k(C112979n nVar, C112976k kVar, C112976k kVar2, Instant instant, Duration duration) {
        if (kVar != kVar2) {
            String str = kVar.f313079p + "-" + kVar2.f313079p;
            C58976aa aaVar = C58975e.f156826a;
            m186971a(duration);
            if (duration.isNegative()) {
                C59104x d = f313100f.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FetchLatencyMonitor");
                ((C59052c) ((C59052c) d).mo56372aa(27568)).mo56359L("%d => invalid duration for %s: %.2fms", Long.valueOf(nVar.f313085a), str, Double.valueOf(m186971a(duration)));
                return;
            }
            C112959c cVar = f313101g;
            cVar.mo99788c(str);
            if (nVar.f313086b.trim().isEmpty()) {
                cVar.mo99788c("zp-".concat(str));
            } else {
                cVar.mo99788c("np-".concat(str));
            }
            nVar.f313089e.mo99797b(kVar, kVar2, duration);
        }
    }

    /* renamed from: l */
    private final boolean m186977l() {
        boolean e = this.f313102b.mo79746e(C90063do.f249453dn);
        if (C112975j.f313062b != e) {
            if (e) {
                C112975j jVar = C112975j.f313061a;
                synchronized (C112964e.f313040a) {
                    C112964e.f313040a.add(jVar);
                    DesugarAtomicReference.accumulateAndGet(C112964e.f313041b, C112961b.RPCS_ONLY, C112963d.f313039a);
                }
            } else {
                C112975j jVar2 = C112975j.f313061a;
                synchronized (C112964e.f313040a) {
                    C112964e.f313040a.remove(jVar2);
                    C112964e.f313041b.set((C112961b) Collection.EL.stream(C112964e.f313040a).map(C112962c.f313038a).max(Comparator.CC.naturalOrder()).orElse(C112961b.OFF));
                }
            }
            C112975j.f313062b = e;
        }
        return e;
    }

    /* renamed from: b */
    public final Instant mo99801b() {
        return Instant.ofEpochSecond(this.f313108j.getEpochSecond(), (((long) this.f313108j.getNano()) + this.f313106h.mo26873e()) - this.f313109k);
    }

    /* renamed from: c */
    public final void mo99802c(long j, C112976k kVar, C53499f fVar) {
        if (m186977l()) {
            C112979n nVar = (C112979n) this.f313105e.get(Long.valueOf(j));
            if (nVar == null) {
                C59104x d = f313100f.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FetchLatencyMonitor");
                ((C59052c) ((C59052c) d).mo56372aa(27556)).mo56388r("%d: state information for ending of RPC is not available.", j);
                return;
            }
            synchronized (nVar) {
                if (kVar == C112976k.S3_STREAMING_REQUEST && nVar.f313092h) {
                    kVar = C112976k.S3_INITIAL_STREAMING_REQUEST;
                }
                Instant instant = (Instant) nVar.f313088d.get(kVar);
                Instant b = mo99801b();
                if (!(fVar == null || instant == null || (fVar.f140396a & 16) == 0)) {
                    Duration between = Duration.between(instant, b);
                    C53503j jVar = fVar.f140401f;
                    if (jVar == null) {
                        jVar = C53503j.f140408h;
                    }
                    m186972g(nVar, kVar, instant, between, jVar);
                }
                mo99803d(j, kVar);
                if (nVar.f313087c.isEmpty()) {
                    m186973h(nVar);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo99803d(long j, C112976k kVar) {
        if (m186977l()) {
            Map map = this.f313105e;
            Long valueOf = Long.valueOf(j);
            C112979n nVar = (C112979n) map.get(valueOf);
            if (nVar == null) {
                C59104x d = f313100f.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FetchLatencyMonitor");
                ((C59052c) ((C59052c) d).mo56372aa(27562)).mo56359L("%d: Popping %c: No request state info available for %d", valueOf, Character.valueOf(kVar.f313079p), valueOf);
                return;
            }
            synchronized (nVar) {
                if (kVar == C112976k.S3_STREAMING_REQUEST && nVar.f313092h) {
                    kVar = C112976k.S3_INITIAL_STREAMING_REQUEST;
                }
                Instant b = mo99801b();
                Instant instant = (Instant) nVar.f313088d.get(kVar);
                if (instant != null) {
                    m186975j(nVar, kVar, instant, Duration.between(instant, b));
                } else {
                    C59104x d2 = f313100f.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "FetchLatencyMonitor");
                    ((C59052c) ((C59052c) d2).mo56372aa(27559)).mo56348A("%d: no start time for phase %c", nVar.f313085a, kVar.f313079p);
                }
                if (!nVar.f313087c.contains(kVar)) {
                    C59104x d3 = f313100f.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "FetchLatencyMonitor");
                    Character valueOf2 = Character.valueOf(kVar.f313079p);
                    ((C59052c) ((C59052c) d3).mo56372aa(27560)).mo56359L("%d: Popping %c: expected %c on stack but is not present - ignoring update", valueOf, valueOf2, valueOf2);
                    return;
                }
                boolean z = false;
                while (!((C112976k) nVar.f313087c.getFirst()).equals(kVar)) {
                    C58976aa aaVar = C58975e.f156826a;
                    char c = ((C112976k) nVar.f313087c.getFirst()).f313079p;
                    z = true;
                    m186974i(nVar, b, true);
                }
                m186974i(nVar, b, z);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        m186976k(r1, r6, r7, r5, p3186j$.time.Duration.between(r5, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99804e(long r5, com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k r7) {
        /*
            r4 = this;
            boolean r0 = r4.m186977l()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            j$.time.Instant r0 = r4.mo99801b()
            java.util.Map r1 = r4.f313105e
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object r1 = r1.get(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.n r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112979n) r1
            if (r1 != 0) goto L_0x0036
            com.google.common.f.e r0 = f313100f
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "FetchLatencyMonitor"
            r0.mo56378ag(r1, r2)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 27564(0x6bac, float:3.8625E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            char r7 = r7.f313079p
            r0.mo56370Y(r7, r5)
            return
        L_0x0036:
            monitor-enter(r1)
            java.util.Deque r2 = r1.f313087c     // Catch:{ all -> 0x0081 }
            boolean r2 = r2.contains(r7)     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x005f
            com.google.common.f.e r0 = f313100f     // Catch:{ all -> 0x0081 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0081 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "FetchLatencyMonitor"
            r0.mo56378ag(r2, r3)     // Catch:{ all -> 0x0081 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0081 }
            r2 = 27563(0x6bab, float:3.8624E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0081 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "%d: Phase %c already started, ignoring push."
            char r7 = r7.f313079p     // Catch:{ all -> 0x0081 }
            r0.mo56348A(r2, r5, r7)     // Catch:{ all -> 0x0081 }
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            return
        L_0x005f:
            j$.time.Instant r5 = r1.f313091g     // Catch:{ all -> 0x0081 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r6 = r1.f313090f     // Catch:{ all -> 0x0081 }
            r1.f313091g = r0     // Catch:{ all -> 0x0081 }
            r1.f313090f = r7     // Catch:{ all -> 0x0081 }
            java.util.Deque r2 = r1.f313087c     // Catch:{ all -> 0x0081 }
            r2.push(r7)     // Catch:{ all -> 0x0081 }
            java.util.EnumMap r2 = r1.f313088d     // Catch:{ all -> 0x0081 }
            r2.put(r7, r0)     // Catch:{ all -> 0x0081 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k.S3_INITIAL_STREAMING_REQUEST     // Catch:{ all -> 0x0081 }
            if (r7 != r2) goto L_0x0078
            r2 = 1
            r1.f313092h = r2     // Catch:{ all -> 0x0081 }
        L_0x0078:
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            j$.time.Duration r0 = p3186j$.time.Duration.between(r5, r0)
            m186976k(r1, r6, r7, r5, r0)
            return
        L_0x0081:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0081 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q.mo99804e(long, com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.k):void");
    }

    /* renamed from: f */
    public final void mo99805f(long j, String str) {
        if (m186977l()) {
            Instant b = mo99801b();
            C112979n nVar = new C112979n(j, str, b);
            synchronized (nVar) {
                nVar.f313091g = b;
                nVar.f313090f = C112976k.SUGGESTION_FETCH;
                nVar.f313088d.put(C112976k.SUGGESTION_FETCH, b);
                nVar.f313087c.push(C112976k.SUGGESTION_FETCH);
            }
            this.f313105e.put(Long.valueOf(j), nVar);
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
