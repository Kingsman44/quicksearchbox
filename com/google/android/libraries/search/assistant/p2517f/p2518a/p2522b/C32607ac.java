package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32774c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32805b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32917b;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32914i;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32916k;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32920c;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32922e;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.p4751a.C62949a;
import java.io.Closeable;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ac */
/* compiled from: PG */
public final class C32607ac implements C32603b, C32916k {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f87310a = C59071e.m91331h();

    /* renamed from: b */
    public final C32858d f87311b;

    /* renamed from: c */
    public final C32805b f87312c;

    /* renamed from: d */
    public final C32917b f87313d;

    /* renamed from: e */
    public final C69626l f87314e;

    /* renamed from: f */
    public final C58889cz f87315f;

    /* renamed from: g */
    public final C32920c f87316g;

    /* renamed from: h */
    public final AtomicLong f87317h = new AtomicLong(0);

    /* renamed from: i */
    public final List f87318i;

    /* renamed from: j */
    public final C71643cp f87319j;

    /* renamed from: k */
    public final C32763p f87320k;

    /* renamed from: l */
    public final AtomicBoolean f87321l;

    /* renamed from: m */
    public final C32762o f87322m;

    /* renamed from: n */
    public final C71816z f87323n;

    /* renamed from: o */
    public final C71816z f87324o;

    /* renamed from: p */
    private final C71422aw f87325p;

    /* renamed from: q */
    private final C32752fm f87326q;

    /* renamed from: r */
    private final C32914i f87327r;

    /* renamed from: s */
    private final boolean f87328s;

    /* renamed from: t */
    private final Closeable f87329t;

    public C32607ac(C32858d dVar, C32805b bVar, C32870p pVar, C32774c cVar, C32917b bVar2, C69626l lVar, C71422aw awVar, C32752fm fmVar, C32914i iVar, boolean z, C58889cz czVar, C32920c cVar2) {
        C69664n.m101061g(dVar, "token");
        C69664n.m101061g(bVar, "key");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(iVar, "contextDebugDataProvider");
        C69664n.m101061g(czVar, "ticker");
        C69664n.m101061g(cVar2, "streamz");
        this.f87311b = dVar;
        this.f87312c = bVar;
        this.f87313d = bVar2;
        this.f87314e = lVar;
        this.f87325p = awVar;
        this.f87326q = fmVar;
        this.f87327r = iVar;
        this.f87328s = z;
        this.f87315f = czVar;
        this.f87316g = cVar2;
        this.f87318i = C32688dc.m60589b(bVar, C32688dc.m60590c(dVar, C32691df.f87608b));
        this.f87320k = new C32763p(cVar, bVar2);
        this.f87323n = new C71816z();
        this.f87321l = new AtomicBoolean(false);
        this.f87322m = new C32762o(this, pVar);
        this.f87329t = iVar.mo38345d(this);
        C71816z zVar = new C71816z();
        this.f87324o = zVar;
        C71643cp d = C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C32755h(this, (C69577g) null), 3);
        this.f87319j = d;
        d.mo62873s(new C32756i(this));
        C32922e.m60928a(zVar, new C32757j(this));
    }

    /* renamed from: a */
    public final C32858d mo38179a() {
        return this.f87311b;
    }

    /* renamed from: b */
    public final C60870cx mo38180b(C32879y yVar, C32871q qVar) {
        Duration duration;
        C69664n.m101061g(yVar, "consumerFetchRequest");
        C69664n.m101061g(qVar, "strategy");
        long incrementAndGet = this.f87317h.incrementAndGet();
        List a = C32688dc.m60588a(incrementAndGet, this.f87318i);
        C59071e.C59072a aVar = C59071e.f157037b;
        C58976aa aaVar = C58975e.f156826a;
        C59052c a2 = C32692dg.m60595a(aVar, a);
        C32810be beVar = yVar.f88115b;
        if (beVar == null) {
            beVar = C32810be.f87993c;
        }
        C32796ar arVar = beVar.f87996b;
        if (arVar == null) {
            arVar = C32796ar.f87973c;
        }
        String b = C32602g.m60429b(arVar);
        String name = qVar.name();
        a2.mo56379ah(new C59094n(50570));
        a2.mo56354G("#fetchContext(%s, %s)", b, name);
        if ((yVar.f88114a & 8) != 0) {
            C62910ar arVar2 = yVar.f88118e;
            if (arVar2 == null) {
                arVar2 = C62910ar.f169858c;
            }
            C69664n.m101060f(arVar2, "consumerFetchRequest.timeout");
            duration = C62949a.m95468c(arVar2);
        } else {
            duration = null;
        }
        C71604be c = C71803m.m105042c(this.f87325p, (C69585o) null, (C71424ay) null, new C32769v(this, duration, new C32766s(this, a, yVar, qVar, incrementAndGet, (C69577g) null), (C69577g) null), 3);
        c.mo62873s(new C32767t(this, qVar));
        return C71663i.m104688a(c);
    }

    /* renamed from: c */
    public final C60870cx mo38181c(C32781ac acVar) {
        C69664n.m101061g(acVar, "requestedKey");
        C59071e.C59072a aVar = C59071e.f157037b;
        C58976aa aaVar = C58975e.f156826a;
        C59052c a = C32692dg.m60595a(aVar, this.f87318i);
        String a2 = C32602g.m60428a(acVar);
        a.mo56379ah(new C59094n(50571));
        a.mo56389s("#isKeySupported(%s)", a2);
        return C71663i.m104692e(this.f87325p, (C71424ay) null, new C32770w(this, (C69577g) null, this, acVar), 3);
    }

    public final void close() {
        C59052c cVar = (C59052c) f87310a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Context.Consumer");
        C69664n.m101060f(cVar, "logger.atInfo()");
        C59052c a = C32692dg.m60595a(cVar, this.f87318i);
        a.mo56379ah(new C59094n(50573));
        a.mo56386p("Close AccessSession");
        if (!this.f87321l.getAndSet(true)) {
            this.f87320k.mo38288a(this.f87318i, (Throwable) null);
            mo38188i();
        }
        this.f87319j.mo62723u((CancellationException) null);
    }

    /* renamed from: d */
    public final C60870cx mo38183d() {
        C59071e.C59072a aVar = C59071e.f157037b;
        C58976aa aaVar = C58975e.f156826a;
        C59052c a = C32692dg.m60595a(aVar, this.f87318i);
        int hashCode = this.f87312c.hashCode();
        a.mo56379ah(new C59094n(50572));
        a.mo56387q("#supportedContextKeys in AccessSession %d", hashCode);
        return C71663i.m104692e(this.f87325p, (C71424ay) null, new C32605aa(this, (C69577g) null, this), 3);
    }

    /* renamed from: e */
    public final Object mo38184e(String str, Instant instant, C69577g gVar) {
        String a = C32691df.m60594a(this.f87318i);
        return "AccessSession:\n\t" + a + "\n";
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38185f(p5462h.p5466c.C69577g r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32768u
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.search.assistant.f.a.b.u r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32768u) r0
            int r1 = r0.f87927c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87927c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.u r0 = new com.google.android.libraries.search.assistant.f.a.b.u
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f87925a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87927c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r7)
            goto L_0x0043
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x002f:
            p5462h.C69714l.m101134b(r7)
            java.util.concurrent.atomic.AtomicLong r7 = r6.f87317h
            long r4 = r7.incrementAndGet()
            com.google.android.libraries.search.assistant.f.a.b.o r7 = r6.f87322m
            r0.f87927c = r3
            java.lang.Object r7 = r7.mo38287c(r4, r0)
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            com.google.android.libraries.search.assistant.f.a.d.cw r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32855cw) r7
            com.google.android.libraries.search.assistant.f.a.b.cv r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32679cu.m60573a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32607ac.mo38185f(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: j$.time.Duration} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: com.google.android.libraries.search.assistant.f.a.b.fm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.google.android.libraries.search.assistant.f.a.b.fm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.google.android.libraries.search.assistant.f.a.b.fm} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38186g(p5462h.p5466c.C69577g r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32773z
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.libraries.search.assistant.f.a.b.z r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32773z) r0
            int r1 = r0.f87947f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87947f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.z r0 = new com.google.android.libraries.search.assistant.f.a.b.z
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f87945d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87947f
            java.lang.String r3 = "executor.schedule({}, du…), TimeUnit.MILLISECONDS)"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r2 = r0.f87944c
            java.lang.Object r6 = r0.f87943b
            java.lang.Object r7 = r0.f87942a
            goto L_0x003d
        L_0x002f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0037:
            java.lang.Object r2 = r0.f87944c
            java.lang.Object r6 = r0.f87943b
            java.lang.Object r7 = r0.f87942a
        L_0x003d:
            p5462h.C69714l.m101134b(r13)
            goto L_0x0070
        L_0x0041:
            p5462h.C69714l.m101134b(r13)
            com.google.android.libraries.search.assistant.f.a.b.fm r6 = r12.f87326q
            r7 = 24
            j$.time.Duration r13 = com.google.common.p4580v.p4582b.C60943b.m93085a(r7)
            j$.time.Duration r2 = com.google.common.p4580v.p4582b.C60943b.m93085a(r7)
            com.google.common.util.concurrent.db r7 = r6.f87884a
            com.google.android.libraries.search.assistant.f.a.b.fl r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32751fl.f87883a
            long r9 = r13.toMillis()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.cz r13 = r7.mo29164d(r8, r9, r13)
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r3)
            r0.f87942a = r12
            r0.f87943b = r6
            r0.f87944c = r2
            r0.f87947f = r5
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x00a6
            r7 = r12
        L_0x0070:
            r13 = r7
            com.google.android.libraries.search.assistant.f.a.b.ac r13 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32607ac) r13
            com.google.android.libraries.search.assistant.f.b.b r13 = r13.f87313d
            r8 = 0
            com.google.net.a.a.b r9 = com.google.net.p4726a.p4727a.C62722b.DEADLINE_EXCEEDED
            r13.mo38347b(r8, r9)
            com.google.net.a.a.b r8 = com.google.net.p4726a.p4727a.C62722b.DEADLINE_EXCEEDED
            r13.mo38349d(r8, r5)
            r13 = r6
            com.google.android.libraries.search.assistant.f.a.b.fm r13 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32752fm) r13
            com.google.common.util.concurrent.db r13 = r13.f87884a
            com.google.android.libraries.search.assistant.f.a.b.fl r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32751fl.f87883a
            r9 = r2
            j$.time.Duration r9 = (p3186j$.time.Duration) r9
            long r9 = r9.toMillis()
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.cz r13 = r13.mo29164d(r8, r9, r11)
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r3)
            r0.f87942a = r7
            r0.f87943b = r6
            r0.f87944c = r2
            r0.f87947f = r4
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x00a6
            goto L_0x0070
        L_0x00a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32607ac.mo38186g(h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.libraries.search.assistant.f.a.d.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: com.google.android.libraries.search.assistant.f.a.d.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: com.google.android.libraries.search.assistant.f.a.d.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e A[Catch:{ ce -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0101 A[SYNTHETIC, Splitter:B:56:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38187h(java.util.List r8, com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y r9, com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q r10, p5462h.p5466c.C69577g r11) {
        /*
            r7 = this;
            java.lang.String r0 = "Synchronized cache validity age cannot be smaller than "
            boolean r1 = r11 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32606ab
            if (r1 == 0) goto L_0x0015
            r1 = r11
            com.google.android.libraries.search.assistant.f.a.b.ab r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32606ab) r1
            int r2 = r1.f87309g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f87309g = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.libraries.search.assistant.f.a.b.ab r1 = new com.google.android.libraries.search.assistant.f.a.b.ab
            r1.<init>(r7, r11)
        L_0x001a:
            java.lang.Object r11 = r1.f87307e
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f87309g
            r4 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r4) goto L_0x0032
            java.lang.Object r8 = r1.f87306d
            java.lang.Object r10 = r1.f87305c
            java.lang.Object r9 = r1.f87304b
            java.lang.Object r1 = r1.f87303a
            p5462h.C69714l.m101134b(r11)     // Catch:{ ce -> 0x0109 }
            r2 = r1
            goto L_0x0063
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            p5462h.C69714l.m101134b(r11)
            com.google.android.libraries.search.assistant.f.a.d.be r11 = r9.f88115b     // Catch:{ ce -> 0x0109 }
            if (r11 != 0) goto L_0x0043
            com.google.android.libraries.search.assistant.f.a.d.be r11 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c     // Catch:{ ce -> 0x0109 }
        L_0x0043:
            com.google.android.libraries.search.assistant.f.a.d.ar r11 = r11.f87996b     // Catch:{ ce -> 0x0109 }
            if (r11 != 0) goto L_0x0049
            com.google.android.libraries.search.assistant.f.a.d.ar r11 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c     // Catch:{ ce -> 0x0109 }
        L_0x0049:
            java.lang.String r3 = "request.fetchContextRequest.contextKey"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r3)     // Catch:{ ce -> 0x0109 }
            kotlinx.coroutines.z r3 = r7.f87323n     // Catch:{ ce -> 0x0109 }
            r1.f87303a = r8     // Catch:{ ce -> 0x0109 }
            r1.f87304b = r9     // Catch:{ ce -> 0x0109 }
            r1.f87305c = r10     // Catch:{ ce -> 0x0109 }
            r1.f87306d = r11     // Catch:{ ce -> 0x0109 }
            r1.f87309g = r4     // Catch:{ ce -> 0x0109 }
            java.lang.Object r1 = r3.mo62825a(r1)     // Catch:{ ce -> 0x0109 }
            if (r1 == r2) goto L_0x0108
            r2 = r8
            r8 = r11
            r11 = r1
        L_0x0063:
            com.google.android.libraries.search.assistant.f.a.b.cv r11 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32680cv) r11     // Catch:{ ce -> 0x0109 }
            r1 = r8
            com.google.android.libraries.search.assistant.f.a.d.ar r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r1     // Catch:{ ce -> 0x0109 }
            com.google.android.libraries.search.assistant.f.a.d.cu r11 = r11.mo38240a(r1)     // Catch:{ ce -> 0x0109 }
            if (r11 == 0) goto L_0x0101
            boolean r11 = r11.f88071c     // Catch:{ ce -> 0x0109 }
            if (r11 != 0) goto L_0x00b3
            java.lang.String r11 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r11)     // Catch:{ ce -> 0x0109 }
            r11 = r9
            com.google.android.libraries.search.assistant.f.a.d.y r11 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y) r11     // Catch:{ ce -> 0x0109 }
            int r11 = r11.f88114a     // Catch:{ ce -> 0x0109 }
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0088
            r11 = r9
            com.google.android.libraries.search.assistant.f.a.d.y r11 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y) r11     // Catch:{ ce -> 0x0109 }
            boolean r11 = r11.f88116c     // Catch:{ ce -> 0x0109 }
            if (r11 != 0) goto L_0x0088
            goto L_0x00b3
        L_0x0088:
            java.lang.String r9 = "tags"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r9)     // Catch:{ ce -> 0x0109 }
            java.lang.String r9 = "key"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r9)     // Catch:{ ce -> 0x0109 }
            com.google.android.libraries.search.assistant.f.a.b.ce r9 = new com.google.android.libraries.search.assistant.f.a.b.ce     // Catch:{ ce -> 0x0109 }
            io.grpc.Status r3 = p5488io.grpc.Status.f186906d     // Catch:{ ce -> 0x0109 }
            java.lang.String r10 = "INVALID_ARGUMENT"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r10)     // Catch:{ ce -> 0x0109 }
            com.google.protos.j.a.a.b.a.a.a.a.a.b r4 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b.ERROR_ONDEVICE_ONLY_CONTEXT_KEY     // Catch:{ ce -> 0x0109 }
            java.lang.String r10 = "ContextKey is supported only on-device: "
            com.google.android.libraries.search.assistant.f.a.d.ar r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r8     // Catch:{ ce -> 0x0109 }
            java.lang.String r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r8)     // Catch:{ ce -> 0x0109 }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ ce -> 0x0109 }
            java.lang.String r5 = r10.concat(r8)     // Catch:{ ce -> 0x0109 }
            r6 = 0
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ ce -> 0x0109 }
            throw r9     // Catch:{ ce -> 0x0109 }
        L_0x00b3:
            com.google.android.libraries.search.assistant.f.a.d.q r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q.STATIC_CACHE     // Catch:{ ce -> 0x0109 }
            if (r10 != r8) goto L_0x00c9
            r8 = r9
            com.google.android.libraries.search.assistant.f.a.d.y r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y) r8     // Catch:{ ce -> 0x0109 }
            int r8 = r8.f88114a     // Catch:{ ce -> 0x0109 }
            r8 = r8 & 4
            if (r8 != 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ ce -> 0x0109 }
            java.lang.String r9 = "Static cache requests shouldn't have cache age value."
            r8.<init>(r9)     // Catch:{ ce -> 0x0109 }
            throw r8     // Catch:{ ce -> 0x0109 }
        L_0x00c9:
            r8 = r9
            com.google.android.libraries.search.assistant.f.a.d.y r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y) r8     // Catch:{ ce -> 0x0109 }
            int r8 = r8.f88114a     // Catch:{ ce -> 0x0109 }
            r8 = r8 & 4
            if (r8 == 0) goto L_0x00fe
            com.google.android.libraries.search.assistant.f.a.d.y r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y) r9     // Catch:{ ce -> 0x0109 }
            com.google.protobuf.ar r8 = r9.f88117d     // Catch:{ ce -> 0x0109 }
            if (r8 != 0) goto L_0x00da
            com.google.protobuf.ar r8 = com.google.protobuf.C62910ar.f169858c     // Catch:{ ce -> 0x0109 }
        L_0x00da:
            com.google.protobuf.ar r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.C32777d.f87948a     // Catch:{ ce -> 0x0109 }
            int r8 = com.google.protobuf.p4750c.C62948a.m95450a(r8, r9)     // Catch:{ ce -> 0x0109 }
            if (r8 < 0) goto L_0x00e3
            goto L_0x00fe
        L_0x00e3:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ ce -> 0x0109 }
            com.google.protobuf.ar r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.C32777d.f87948a     // Catch:{ ce -> 0x0109 }
            long r9 = r9.f169860a     // Catch:{ ce -> 0x0109 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ ce -> 0x0109 }
            r11.<init>(r0)     // Catch:{ ce -> 0x0109 }
            r11.append(r9)     // Catch:{ ce -> 0x0109 }
            java.lang.String r9 = " seconds."
            r11.append(r9)     // Catch:{ ce -> 0x0109 }
            java.lang.String r9 = r11.toString()     // Catch:{ ce -> 0x0109 }
            r8.<init>(r9)     // Catch:{ ce -> 0x0109 }
            throw r8     // Catch:{ ce -> 0x0109 }
        L_0x00fe:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0101:
            com.google.android.libraries.search.assistant.f.a.d.ar r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r8     // Catch:{ ce -> 0x0109 }
            com.google.android.libraries.search.assistant.f.a.b.ce r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60554f(r2, r8)     // Catch:{ ce -> 0x0109 }
            throw r8     // Catch:{ ce -> 0x0109 }
        L_0x0108:
            return r2
        L_0x0109:
            r8 = move-exception
            com.google.android.libraries.search.assistant.n.a.a.b r8 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63595b(r8)
            com.google.android.libraries.search.assistant.n.a.e r8 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63594a(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32607ac.mo38187h(java.util.List, com.google.android.libraries.search.assistant.f.a.d.y, com.google.android.libraries.search.assistant.f.a.d.q, h.c.g):java.lang.Object");
    }

    /* renamed from: i */
    public final void mo38188i() {
        if (this.f87328s) {
            this.f87327r.mo38343b();
        }
        this.f87329t.close();
    }
}
