package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.suggest.C138133o;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.data.android.C61531o;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.t */
/* compiled from: PG */
public final class C138490t implements C138476f {

    /* renamed from: a */
    public static final C138477g f376709a = new C138477g();

    /* renamed from: b */
    public final C138382ad f376710b;

    /* renamed from: c */
    public final C71422aw f376711c;

    /* renamed from: d */
    private final C136832c f376712d;

    /* renamed from: e */
    private final C61531o f376713e;

    /* renamed from: f */
    private final C138403ay f376714f;

    /* renamed from: g */
    private final C138493w f376715g;

    /* renamed from: h */
    private final C21370a f376716h;

    static {
        C58974d.m91134h("CompleteServerClient");
    }

    public C138490t(C136832c cVar, C138382ad adVar, C61531o oVar, C138403ay ayVar, C138493w wVar, C21370a aVar, C71422aw awVar) {
        C69664n.m101061g(cVar, "googleUrlAnalyzer");
        C69664n.m101061g(oVar, "httpClient");
        C69664n.m101061g(wVar, "completeServerLogWriter");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f376712d = cVar;
        this.f376710b = adVar;
        this.f376713e = oVar;
        this.f376714f = ayVar;
        this.f376715g = wVar;
        this.f376716h = aVar;
        this.f376711c = awVar;
    }

    /* renamed from: e */
    static /* synthetic */ Object m224897e(C138490t tVar, boolean z, C69577g gVar, int i) {
        int i2 = i & 1;
        boolean z2 = false;
        boolean z3 = z & ((i & 2) == 0);
        if (1 == i2) {
            z2 = true;
        }
        return C71423ax.m104196a(new C138487q(z2, tVar, z3, (C69577g) null), gVar);
    }

    /* renamed from: a */
    public final C60870cx mo114290a(C138133o oVar, C58495hd hdVar) {
        C69664n.m101061g(oVar, "suggestRequest");
        C69664n.m101061g(hdVar, "cgiParams");
        return C71663i.m104688a(C71803m.m105042c(this.f376711c, (C69585o) null, (C71424ay) null, new C138479i(this, oVar, hdVar, (C69577g) null), 3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.util.Map} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c5, code lost:
        if (r7.equals("nrby") != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ef, code lost:
        if (r7.equals("map") == false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01f2, code lost:
        r7 = "m";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020b, code lost:
        r7 = com.evernote.android.state.BuildConfig.FLAVOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020d, code lost:
        r11.appendQueryParameter("ds", r7);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x011c A[LOOP:0: B:26:0x0116->B:28:0x011c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02ac  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114291b(com.google.android.apps.search.googleapp.search.suggest.C138133o r21, java.util.Map r22, p5462h.p5466c.C69577g r23) {
        /*
            r20 = this;
            r1 = r20
            r0 = r23
            boolean r2 = r0 instanceof com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138478h
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.googleapp.search.suggest.sources.a.h r2 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138478h) r2
            int r3 = r2.f376668f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f376668f = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.googleapp.search.suggest.sources.a.h r2 = new com.google.android.apps.search.googleapp.search.suggest.sources.a.h
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f376666d
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f376668f
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 1
            if (r4 == 0) goto L_0x0055
            if (r4 == r8) goto L_0x0041
            if (r4 != r5) goto L_0x0039
            java.lang.Object r3 = r2.f376664b
            com.google.frameworks.client.data.android.ae r3 = (com.google.frameworks.client.data.android.C61363ae) r3
            java.lang.Object r2 = r2.f376663a
            com.google.android.apps.search.googleapp.search.suggest.sources.a.g r2 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138477g) r2
            p5462h.C69714l.m101134b(r0)
            goto L_0x02ad
        L_0x0039:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0041:
            java.lang.Object r4 = r2.f376665c
            java.lang.Object r9 = r2.f376664b
            com.google.android.apps.search.googleapp.search.suggest.o r9 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r9
            java.lang.Object r10 = r2.f376663a
            com.google.android.apps.search.googleapp.search.suggest.sources.a.t r10 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138490t) r10
            p5462h.C69714l.m101134b(r0)
            r19 = r9
            r9 = r4
            r4 = r19
            goto L_0x00e4
        L_0x0055:
            p5462h.C69714l.m101134b(r0)
            com.google.android.apps.search.googleapp.search.suggest.sources.a.ad r0 = r1.f376710b
            com.google.android.apps.search.googleapp.search.suggest.a.b.a r4 = r0.f376472k
            com.google.common.util.concurrent.cx r16 = r4.mo114052a()
            com.google.android.apps.search.googleapp.search.suggest.d.c r4 = r0.f376469h
            java.lang.Object r9 = r4.f375671a
            monitor-enter(r9)
            com.google.common.util.concurrent.cx r10 = r4.f375678h     // Catch:{ all -> 0x02b9 }
            if (r10 != 0) goto L_0x0077
            com.google.common.util.concurrent.da r10 = r4.f375674d     // Catch:{ all -> 0x02b9 }
            com.google.android.apps.search.googleapp.search.suggest.d.b r11 = com.google.android.apps.search.googleapp.search.suggest.p10452d.C138075b.f375670a     // Catch:{ all -> 0x02b9 }
            java.util.concurrent.Callable r11 = com.google.apps.tiktok.tracing.C47810es.m84978r(r11)     // Catch:{ all -> 0x02b9 }
            com.google.common.util.concurrent.cx r10 = r10.mo19399b(r11)     // Catch:{ all -> 0x02b9 }
            r4.f375678h = r10     // Catch:{ all -> 0x02b9 }
        L_0x0077:
            com.google.common.util.concurrent.cx r10 = r4.f375678h     // Catch:{ all -> 0x02b9 }
            monitor-exit(r9)     // Catch:{ all -> 0x02b9 }
            com.google.android.apps.search.googleapp.search.suggest.d.a r9 = new com.google.android.apps.search.googleapp.search.suggest.d.a
            r9.<init>(r4)
            com.google.common.util.concurrent.da r4 = r4.f375673c
            com.google.common.base.ah r9 = com.google.apps.tiktok.tracing.C47810es.m84963c(r9)
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60922j.m93044g(r10, r9, r4)
            com.google.android.apps.search.googleapp.search.suggest.a.b.a r4 = r0.f376472k
            com.google.android.apps.search.googleapp.search.suggest.a.b.t r4 = (com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137960t) r4
            kotlinx.coroutines.aw r9 = r4.f375337a
            com.google.android.apps.search.googleapp.search.suggest.a.b.b r10 = new com.google.android.apps.search.googleapp.search.suggest.a.b.b
            r10.<init>(r4, r6)
            r4 = 3
            kotlinx.coroutines.be r9 = kotlinx.coroutines.C71803m.m105042c(r9, r6, r6, r10, r4)
            com.google.common.util.concurrent.cx r15 = kotlinx.coroutines.p5578d.C71663i.m104688a(r9)
            com.google.android.apps.search.googleapp.search.b.a r9 = r0.f376468g
            com.google.common.util.concurrent.cx r13 = r9.mo103983c()
            com.google.android.apps.gsa.w.i.c r9 = r0.f376475n
            com.google.common.util.concurrent.cx r17 = r9.mo103971a()
            com.google.android.apps.search.googleapp.search.suggest.a.b.a r9 = r0.f376472k
            com.google.common.util.concurrent.cx r18 = r9.mo114053b()
            r9 = 6
            com.google.common.util.concurrent.cx[] r9 = new com.google.common.util.concurrent.C60870cx[r9]
            r9[r7] = r16
            r9[r8] = r14
            r9[r5] = r15
            r9[r4] = r13
            r4 = 4
            r9[r4] = r17
            r4 = 5
            r9[r4] = r18
            com.google.apps.tiktok.tracing.contrib.b.j r4 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84753d(r9)
            com.google.android.apps.search.googleapp.search.suggest.sources.a.ac r9 = new com.google.android.apps.search.googleapp.search.suggest.sources.a.ac
            r11 = r9
            r12 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.util.concurrent.ExecutorService r0 = r0.f376470i
            com.google.common.util.concurrent.cx r0 = r4.mo51520a(r9, r0)
            r2.f376663a = r1
            r4 = r21
            r2.f376664b = r4
            r9 = r22
            r2.f376665c = r9
            r2.f376668f = r8
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r2)
            if (r0 == r3) goto L_0x02b8
            r10 = r1
        L_0x00e4:
            com.google.android.apps.search.googleapp.search.suggest.sources.a.ae r0 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138383ae) r0
            java.lang.String r11 = "settings"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r11)
            java.lang.String r11 = "request"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r11)
            java.lang.String r11 = "cgiParams"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r11)
            java.lang.String r11 = "requestSettings"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r11)
            com.google.android.apps.search.googleapp.o.c r11 = r10.f376712d
            int r12 = com.google.android.apps.search.googleapp.p10369o.C136832c.f372447a
            android.net.Uri$Builder r11 = r11.mo113405k()
            java.lang.String r12 = "complete"
            android.net.Uri$Builder r11 = r11.appendPath(r12)
            java.lang.String r12 = "search"
            android.net.Uri$Builder r11 = r11.appendPath(r12)
            java.util.Set r12 = r9.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0116:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0132
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            r11.appendQueryParameter(r14, r13)
            goto L_0x0116
        L_0x0132:
            com.google.android.apps.search.googleapp.search.suggest.a.b.y r12 = r0.mo114256a()
            int r12 = r12.f375354a
            r12 = r12 & r8
            if (r12 == 0) goto L_0x0180
            java.lang.String r12 = r4.f375825b
            if (r12 == 0) goto L_0x0145
            int r12 = r12.length()
            if (r12 != 0) goto L_0x014b
        L_0x0145:
            boolean r12 = r4.f375833j
            if (r12 != 0) goto L_0x014b
            r12 = 1
            goto L_0x014c
        L_0x014b:
            r12 = 0
        L_0x014c:
            com.google.android.apps.search.googleapp.search.suggest.a.b.aa r13 = r0.mo114257b()
            int r14 = r13.f375289a
            r14 = r14 & r8
            if (r14 == 0) goto L_0x015d
            if (r12 == 0) goto L_0x015e
            boolean r12 = r13.f375290b
            if (r12 == 0) goto L_0x015e
            r7 = 1
            goto L_0x015e
        L_0x015d:
            r7 = r12
        L_0x015e:
            java.lang.String r12 = r4.f375825b
            if (r12 == 0) goto L_0x0168
            int r12 = r12.length()
            if (r12 != 0) goto L_0x016a
        L_0x0168:
            if (r7 == 0) goto L_0x0180
        L_0x016a:
            com.google.android.apps.search.googleapp.search.suggest.a.b.y r7 = r0.mo114256a()
            java.lang.String r12 = "pq"
            java.lang.String r13 = r7.f375355b
            r11.appendQueryParameter(r12, r13)
            java.lang.String r12 = "pq_sec"
            long r13 = r7.f375357d
            java.lang.String r7 = java.lang.String.valueOf(r13)
            r11.appendQueryParameter(r12, r7)
        L_0x0180:
            java.lang.String r7 = r4.f375825b
            if (r7 == 0) goto L_0x018a
            int r7 = r7.length()
            if (r7 != 0) goto L_0x019f
        L_0x018a:
            java.lang.String r7 = r0.mo114260e()
            if (r7 == 0) goto L_0x019f
            int r7 = r7.length()
            if (r7 == 0) goto L_0x019f
            java.lang.String r7 = "nolsbt"
            java.lang.String r12 = r0.mo114260e()
            r11.appendQueryParameter(r7, r12)
        L_0x019f:
            int r7 = r4.f375824a
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0212
            java.lang.String r7 = r4.f375832i
            java.lang.String r12 = "request.corpusType"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r12)
            int r12 = r7.hashCode()
            switch(r12) {
                case 97610: goto L_0x0200;
                case 101486: goto L_0x01f5;
                case 107868: goto L_0x01e9;
                case 109514: goto L_0x01de;
                case 116753: goto L_0x01d3;
                case 3241743: goto L_0x01c8;
                case 3389723: goto L_0x01bf;
                case 3529462: goto L_0x01b4;
                default: goto L_0x01b3;
            }
        L_0x01b3:
            goto L_0x020b
        L_0x01b4:
            java.lang.String r12 = "shop"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x020b
            java.lang.String r7 = "sh"
            goto L_0x020d
        L_0x01bf:
            java.lang.String r12 = "nrby"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x020b
            goto L_0x01f2
        L_0x01c8:
            java.lang.String r12 = "isch"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x020b
            java.lang.String r7 = "i"
            goto L_0x020d
        L_0x01d3:
            java.lang.String r12 = "vid"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x020b
            java.lang.String r7 = "v"
            goto L_0x020d
        L_0x01de:
            java.lang.String r12 = "nws"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x020b
            java.lang.String r7 = "n"
            goto L_0x020d
        L_0x01e9:
            java.lang.String r12 = "map"
            boolean r7 = r7.equals(r12)
            if (r7 != 0) goto L_0x01f2
            goto L_0x020b
        L_0x01f2:
            java.lang.String r7 = "m"
            goto L_0x020d
        L_0x01f5:
            java.lang.String r12 = "flt"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x020b
            java.lang.String r7 = "fl"
            goto L_0x020d
        L_0x0200:
            java.lang.String r12 = "bks"
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x020b
            java.lang.String r7 = "bo"
            goto L_0x020d
        L_0x020b:
            java.lang.String r7 = ""
        L_0x020d:
            java.lang.String r12 = "ds"
            r11.appendQueryParameter(r12, r7)
        L_0x0212:
            int r7 = r4.f375824a
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0220
            java.lang.String r7 = "client"
            java.lang.String r12 = r4.f375835l
            r11.appendQueryParameter(r7, r12)
            goto L_0x0229
        L_0x0220:
            java.lang.String r7 = "client"
            java.lang.String r12 = r0.mo114264h()
            r11.appendQueryParameter(r7, r12)
        L_0x0229:
            java.lang.String r7 = "oe"
            java.lang.String r12 = "utf-8"
            android.net.Uri$Builder r7 = r11.appendQueryParameter(r7, r12)
            java.lang.String r11 = "cp"
            int r12 = r4.f375828e
            java.lang.String r12 = java.lang.String.valueOf(r12)
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r11, r12)
            java.lang.String r11 = "xhr"
            java.lang.String r12 = "t"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r11, r12)
            java.lang.String r11 = "dpr"
            java.lang.String r12 = r0.mo114259d()
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r11, r12)
            java.lang.String r11 = "hl"
            java.lang.String r12 = r0.mo114263g()
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r11, r12)
            java.lang.String r11 = "gl"
            java.lang.String r12 = r0.mo114258c()
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r11, r12)
            java.lang.String r11 = "q"
            java.lang.String r4 = r4.f375825b
            android.net.Uri$Builder r4 = r7.appendQueryParameter(r11, r4)
            java.lang.String r7 = "xssi"
            java.lang.String r11 = "t"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r7, r11)
            java.lang.String r7 = "psi"
            java.lang.String r0 = r0.mo114262f()
            android.net.Uri$Builder r0 = r4.appendQueryParameter(r7, r0)
            android.net.Uri r0 = r0.build()
            java.lang.String r4 = "builder\n      .appendQue…ssionId())\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)
            java.lang.String r4 = "gs_pcr"
            boolean r4 = r9.containsKey(r4)
            com.google.android.apps.search.googleapp.search.suggest.sources.a.g r7 = f376709a
            com.google.frameworks.client.data.android.ae r9 = new com.google.frameworks.client.data.android.ae
            r9.<init>()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            r9.f165930a = r0
            r2.f376663a = r7
            r2.f376664b = r9
            r2.f376665c = r6
            r2.f376668f = r5
            r0 = r4 ^ 1
            java.lang.Object r0 = m224897e(r10, r0, r2, r8)
            if (r0 == r3) goto L_0x02b8
            r3 = r9
        L_0x02ad:
            java.util.Map r0 = (java.util.Map) r0
            com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138477g.m224872a(r3, r0)
            com.google.frameworks.client.data.android.ag r0 = new com.google.frameworks.client.data.android.ag
            r0.<init>(r3)
            return r0
        L_0x02b8:
            return r3
        L_0x02b9:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x02b9 }
            goto L_0x02bd
        L_0x02bc:
            throw r0
        L_0x02bd:
            goto L_0x02bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138490t.mo114291b(com.google.android.apps.search.googleapp.search.suggest.o, java.util.Map, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.google.android.apps.search.googleapp.search.suggest.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: com.google.android.apps.search.googleapp.search.suggest.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.apps.search.googleapp.search.suggest.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: com.google.android.apps.search.googleapp.search.suggest.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.google.android.apps.search.googleapp.search.suggest.o} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114292c(com.google.android.apps.search.googleapp.search.suggest.C138133o r11, java.util.Map r12, p5462h.p5466c.C69577g r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138480j
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.googleapp.search.suggest.sources.a.j r0 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138480j) r0
            int r1 = r0.f376679g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376679g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.sources.a.j r0 = new com.google.android.apps.search.googleapp.search.suggest.sources.a.j
            r0.<init>(r10, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f376677e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376679g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            long r11 = r0.f376676d
            long r1 = r0.f376675c
            java.lang.Object r3 = r0.f376674b
            java.lang.Object r0 = r0.f376673a
            p5462h.C69714l.m101134b(r13)
            goto L_0x008a
        L_0x0032:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003a:
            long r11 = r0.f376675c
            java.lang.Object r2 = r0.f376674b
            java.lang.Object r4 = r0.f376673a
            p5462h.C69714l.m101134b(r13)
            r5 = r11
            r11 = r2
            goto L_0x0060
        L_0x0046:
            p5462h.C69714l.m101134b(r13)
            java.lang.String r13 = r11.f375825b
            com.google.android.libraries.f.a r13 = r10.f376716h
            long r5 = r13.mo26871c()
            r0.f376673a = r10
            r0.f376674b = r11
            r0.f376675c = r5
            r0.f376679g = r4
            java.lang.Object r13 = r10.mo114291b(r11, r12, r0)
            if (r13 == r1) goto L_0x00eb
            r4 = r10
        L_0x0060:
            com.google.frameworks.client.data.android.ag r13 = (com.google.frameworks.client.data.android.C61365ag) r13
            r12 = r4
            com.google.android.apps.search.googleapp.search.suggest.sources.a.t r12 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138490t) r12
            com.google.android.libraries.f.a r2 = r12.f376716h
            long r7 = r2.mo26871c()
            com.google.frameworks.client.data.android.o r12 = r12.f376713e
            com.google.common.util.concurrent.cx r12 = r12.mo42484a(r13)
            java.lang.String r13 = "httpClient.makeRequest(httpRequest)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            r0.f376673a = r4
            r0.f376674b = r11
            r0.f376675c = r5
            r0.f376676d = r7
            r0.f376679g = r3
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r12, r0)
            if (r13 == r1) goto L_0x00eb
            r3 = r11
            r0 = r4
            r1 = r5
            r11 = r7
        L_0x008a:
            com.google.frameworks.client.data.android.ah r13 = (com.google.frameworks.client.data.android.C61366ah) r13
            com.google.android.apps.search.googleapp.search.suggest.sources.a.t r0 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138490t) r0
            com.google.android.libraries.f.a r4 = r0.f376716h
            long r4 = r4.mo26871c()
            com.google.android.apps.search.googleapp.search.suggest.sources.a.w r6 = r0.f376715g
            com.google.android.libraries.f.a r7 = r6.f376719a
            long r7 = r7.mo26871c()
            com.google.android.apps.search.googleapp.search.suggest.d.c r9 = r6.f376720b
            boolean r9 = r9.mo114123a(r7)
            if (r9 != 0) goto L_0x00a5
            goto L_0x00cb
        L_0x00a5:
            long r7 = r7 - r1
            int r1 = (int) r7
            if (r1 < 0) goto L_0x00cb
            r2 = r3
            com.google.android.apps.search.googleapp.search.suggest.o r2 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r2
            java.lang.String r2 = r2.f375825b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00bf
            com.google.android.apps.search.googleapp.search.suggest.b.l r2 = r6.f376721c
            com.google.android.apps.search.googleapp.search.suggest.sources.a.u r6 = new com.google.android.apps.search.googleapp.search.suggest.sources.a.u
            r6.<init>(r1)
            r2.mo114101b(r6)
            goto L_0x00cb
        L_0x00bf:
            com.google.android.apps.search.googleapp.search.suggest.b.l r2 = r6.f376721c
            com.google.android.apps.search.googleapp.search.suggest.sources.a.v r7 = com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138492v.f376718a
            r2.mo114101b(r7)
            com.google.android.apps.search.googleapp.search.suggest.b.i r2 = r6.f376722d
            r2.mo114098b(r1)
        L_0x00cb:
            com.google.android.apps.search.googleapp.search.suggest.o r3 = (com.google.android.apps.search.googleapp.search.suggest.C138133o) r3
            boolean r1 = r3.f375836m
            if (r1 == 0) goto L_0x00dd
            com.google.android.apps.search.googleapp.search.suggest.sources.a.ay r0 = r0.f376714f
            com.google.android.apps.search.googleapp.search.suggest.v r11 = com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138403ay.m224818b(r13, r11, r4)
            java.lang.String r12 = "responseParser.parseServ…rResponseReceived\n      )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            return r11
        L_0x00dd:
            com.google.android.apps.search.googleapp.search.suggest.sources.a.ay r11 = r0.f376714f
            r11 = 0
            com.google.android.apps.search.googleapp.search.suggest.v r11 = com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138403ay.m224818b(r13, r11, r11)
            java.lang.String r12 = "responseParser.parseServ…estResponse(httpResponse)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            return r11
        L_0x00eb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138490t.mo114292c(com.google.android.apps.search.googleapp.search.suggest.o, java.util.Map, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114293d(java.lang.String r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138489s
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.googleapp.search.suggest.sources.a.s r0 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138489s) r0
            int r1 = r0.f376708e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f376708e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.suggest.sources.a.s r0 = new com.google.android.apps.search.googleapp.search.suggest.sources.a.s
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f376706c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f376708e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0099
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            java.lang.Object r7 = r0.f376705b
            java.lang.Object r2 = r0.f376704a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0072
        L_0x003a:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.googleapp.o.c r8 = r6.f376712d
            int r2 = com.google.android.apps.search.googleapp.p10369o.C136832c.f372447a
            android.net.Uri$Builder r8 = r8.mo113405k()
            android.net.Uri$Builder r7 = r8.encodedPath(r7)
            android.net.Uri r7 = r7.build()
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "googleUrlAnalyzer.getGoo…teUrl).build().toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            com.google.frameworks.client.data.android.ae r8 = new com.google.frameworks.client.data.android.ae
            r8.<init>()
            r7.getClass()
            r8.f165930a = r7
            r0.f376704a = r6
            r0.f376705b = r8
            r0.f376708e = r4
            r7 = 0
            r2 = 3
            java.lang.Object r7 = m224897e(r6, r7, r0, r2)
            if (r7 == r1) goto L_0x009f
            r2 = r6
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x0072:
            java.util.Map r8 = (java.util.Map) r8
            com.google.frameworks.client.data.android.ae r7 = (com.google.frameworks.client.data.android.C61363ae) r7
            com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138477g.m224872a(r7, r8)
            com.google.frameworks.client.data.android.ag r8 = new com.google.frameworks.client.data.android.ag
            r8.<init>(r7)
            com.google.android.apps.search.googleapp.search.suggest.sources.a.t r2 = (com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138490t) r2
            com.google.frameworks.client.data.android.o r7 = r2.f376713e
            com.google.common.util.concurrent.cx r7 = r7.mo42484a(r8)
            java.lang.String r8 = "httpClient.makeRequest(request)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            r8 = 0
            r0.f376704a = r8
            r0.f376705b = r8
            r0.f376708e = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r8 != r1) goto L_0x0099
            return r1
        L_0x0099:
            java.lang.String r7 = "httpClient.makeRequest(request).await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            return r8
        L_0x009f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.C138490t.mo114293d(java.lang.String, h.c.g):java.lang.Object");
    }
}
