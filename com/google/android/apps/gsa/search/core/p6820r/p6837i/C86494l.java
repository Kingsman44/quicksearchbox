package com.google.android.apps.gsa.search.core.p6820r.p6837i;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118947a;
import com.google.android.apps.gsa.search.core.p6820r.C86388aj;
import com.google.android.apps.gsa.search.core.p6820r.C86389b;
import com.google.android.apps.gsa.search.core.p6820r.C86394c;
import com.google.android.apps.gsa.search.core.p6820r.C86575u;
import com.google.android.apps.gsa.search.core.p6820r.C86577w;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.r.i.l */
/* compiled from: PG */
public final class C86494l implements C86577w {

    /* renamed from: a */
    public static final C59071e f233731a = C59071e.m91332i("com.google.android.apps.gsa.search.core.r.i.l");

    /* renamed from: b */
    public static final C60870cx f233732b = C60856cj.m92898g();

    /* renamed from: c */
    public static final C60870cx f233733c = C118826c.f331423b;

    /* renamed from: d */
    public final C89356b f233734d;

    /* renamed from: e */
    public final Query f233735e;

    /* renamed from: f */
    public final C22871g f233736f;

    /* renamed from: g */
    public final C86389b f233737g;

    /* renamed from: h */
    public final C86394c f233738h;

    /* renamed from: i */
    public final C86388aj f233739i;

    /* renamed from: j */
    public final Object f233740j = new Object();

    /* renamed from: k */
    public C86575u f233741k;

    /* renamed from: l */
    public final C58485gu f233742l;

    /* renamed from: m */
    private final C22871g f233743m;

    /* renamed from: n */
    private final C22871g f233744n;

    /* renamed from: o */
    private final C68214a f233745o;

    /* renamed from: p */
    private boolean f233746p = false;

    /* renamed from: q */
    private C60870cx f233747q;

    /* renamed from: r */
    private final C118947a f233748r;

    public C86494l(C89356b bVar, Query query, C86575u uVar, List list, C86389b bVar2, C86394c cVar, C86388aj ajVar, C22871g gVar, C22871g gVar2, C22871g gVar3, C68214a aVar, C118947a aVar2) {
        this.f233734d = bVar;
        this.f233735e = query;
        this.f233741k = uVar;
        this.f233738h = cVar;
        this.f233739i = ajVar;
        this.f233736f = gVar;
        this.f233743m = gVar2;
        this.f233744n = gVar3;
        this.f233745o = aVar;
        this.f233737g = bVar2;
        this.f233742l = C58485gu.m89842j(list);
        this.f233748r = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r0 = new com.google.android.apps.gsa.search.core.p6820r.p6837i.C86493k(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (com.google.android.libraries.gsa.p1876k.C22872h.m42744d(com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class) == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0 = r0.mo80177b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r0 = r4.f233736f.mo28202b("Start new search", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        r1.mo57358p(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo80180a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f233740j
            monitor-enter(r0)
            com.google.common.util.concurrent.cx r1 = r4.f233747q     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return r1
        L_0x0009:
            boolean r1 = r4.f233746p     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0013
            com.google.common.util.concurrent.cx r1 = f233732b     // Catch:{ all -> 0x0039 }
            r4.f233747q = r1     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return r1
        L_0x0013:
            com.google.common.util.concurrent.SettableFuture r1 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x0039 }
            r1.<init>()     // Catch:{ all -> 0x0039 }
            r4.f233747q = r1     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            com.google.android.apps.gsa.search.core.r.i.k r0 = new com.google.android.apps.gsa.search.core.r.i.k
            r0.<init>(r4)
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r2 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            boolean r2 = com.google.android.libraries.gsa.p1876k.C22872h.m42744d(r2)
            if (r2 == 0) goto L_0x002d
            com.google.common.util.concurrent.cx r0 = r0.mo17947a()
            goto L_0x0035
        L_0x002d:
            com.google.android.libraries.gsa.k.g r2 = r4.f233736f
            java.lang.String r3 = "Start new search"
            com.google.common.util.concurrent.cx r0 = r2.mo28202b(r3, r0)
        L_0x0035:
            r1.mo57358p(r0)
            return r1
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6820r.p6837i.C86494l.mo80180a():com.google.common.util.concurrent.cx");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (r6.f233735e.mo84430dK() == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (com.google.android.libraries.gsa.p1876k.C22872h.m42744d(com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r6.f233737g.mo80107a(r6.f233735e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        r6.f233736f.mo28212l("Log abandoned search", new com.google.android.apps.gsa.search.core.p6820r.p6837i.C86485c(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r0.mo54566a(), ((com.google.android.apps.gsa.search.core.p6805i.C86124t) r6.f233745o.mo27525b()).mo79743a(com.google.android.apps.gsa.shared.p7066m.C90120fr.f250765E), java.util.concurrent.TimeUnit.MILLISECONDS, r6.f233743m);
        r6.f233744n.mo28211k(r0, "Log search shutdown", new com.google.android.apps.gsa.shared.util.p7159c.C90952r("ForegroundSearchRunner", "Log search shutdown", "Search didn't shutdown correctly."));
        com.google.android.apps.gsa.shared.util.p7159c.C90875ai.m148465b(new com.google.android.apps.gsa.search.core.p6820r.p6837i.C86483a(r6), r0, r6.f233736f, "Run extra search callbacks after search shutdown").mo85223a(new com.google.android.apps.gsa.search.core.p6820r.p6837i.C86484b(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo80181b() {
        /*
            r6 = this;
            com.google.android.apps.gsa.shared.bb.b r0 = r6.f233734d
            com.google.cd.d.f r0 = r0.mo83286e()
            java.lang.Object r1 = r6.f233740j
            monitor-enter(r1)
            boolean r2 = r6.f233746p     // Catch:{ all -> 0x0097 }
            if (r2 == 0) goto L_0x0013
            com.google.common.util.concurrent.cx r0 = r0.mo54566a()     // Catch:{ all -> 0x0097 }
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            return r0
        L_0x0013:
            com.google.android.apps.gsa.shared.search.Query r2 = r6.f233735e     // Catch:{ all -> 0x0097 }
            boolean r2 = r2.mo84420dA()     // Catch:{ all -> 0x0097 }
            r3 = 1
            if (r2 == 0) goto L_0x0021
            com.google.android.apps.gsa.z.d.a.a r2 = r6.f233748r     // Catch:{ all -> 0x0097 }
            r2.mo91281a(r3)     // Catch:{ all -> 0x0097 }
        L_0x0021:
            r6.f233746p = r3     // Catch:{ all -> 0x0097 }
            r2 = 0
            r6.f233741k = r2     // Catch:{ all -> 0x0097 }
            com.google.common.util.concurrent.cx r2 = r6.f233747q     // Catch:{ all -> 0x0097 }
            if (r2 != 0) goto L_0x0030
            com.google.common.util.concurrent.cx r0 = r0.mo54566a()     // Catch:{ all -> 0x0097 }
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            return r0
        L_0x0030:
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            com.google.android.apps.gsa.shared.search.Query r1 = r6.f233735e
            boolean r1 = r1.mo84430dK()
            if (r1 == 0) goto L_0x0055
            java.lang.Class<com.google.android.apps.gsa.search.core.service.a.a> r1 = com.google.android.apps.gsa.search.core.service.p6842a.C86593a.class
            boolean r1 = com.google.android.libraries.gsa.p1876k.C22872h.m42744d(r1)
            if (r1 == 0) goto L_0x0049
            com.google.android.apps.gsa.search.core.r.b r1 = r6.f233737g
            com.google.android.apps.gsa.shared.search.Query r2 = r6.f233735e
            r1.mo80107a(r2)
            goto L_0x0055
        L_0x0049:
            com.google.android.libraries.gsa.k.g r1 = r6.f233736f
            com.google.android.apps.gsa.search.core.r.i.c r2 = new com.google.android.apps.gsa.search.core.r.i.c
            r2.<init>(r6)
            java.lang.String r3 = "Log abandoned search"
            r1.mo28212l(r3, r2)
        L_0x0055:
            com.google.common.util.concurrent.cx r0 = r0.mo54566a()
            dagger.a r1 = r6.f233745o
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r1 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r1
            com.google.android.apps.gsa.shared.m.f r2 = com.google.android.apps.gsa.shared.p7066m.C90120fr.f250765E
            long r1 = r1.mo79743a(r2)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.gsa.k.g r4 = r6.f233743m
            com.google.common.util.concurrent.cx r0 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148471e(r0, r1, r3, r4)
            com.google.android.libraries.gsa.k.g r1 = r6.f233744n
            com.google.android.apps.gsa.shared.util.c.r r2 = new com.google.android.apps.gsa.shared.util.c.r
            java.lang.String r3 = "ForegroundSearchRunner"
            java.lang.String r4 = "Log search shutdown"
            java.lang.String r5 = "Search didn't shutdown correctly."
            r2.<init>(r3, r4, r5)
            java.lang.String r3 = "Log search shutdown"
            r1.mo28211k(r0, r3, r2)
            com.google.android.libraries.gsa.k.g r1 = r6.f233736f
            com.google.android.apps.gsa.search.core.r.i.a r2 = new com.google.android.apps.gsa.search.core.r.i.a
            r2.<init>(r6)
            java.lang.String r3 = "Run extra search callbacks after search shutdown"
            com.google.android.apps.gsa.shared.util.c.ag r1 = com.google.android.apps.gsa.shared.util.p7159c.C90875ai.m148465b(r2, r0, r1, r3)
            com.google.android.apps.gsa.search.core.r.i.b r2 = new com.google.android.apps.gsa.search.core.r.i.b
            r2.<init>(r6)
            r1.mo85223a(r2)
            return r0
        L_0x0097:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0097 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6820r.p6837i.C86494l.mo80181b():com.google.common.util.concurrent.cx");
    }
}
