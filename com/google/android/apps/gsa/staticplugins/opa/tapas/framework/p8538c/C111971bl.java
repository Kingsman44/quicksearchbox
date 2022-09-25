package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111877bo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111885bw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112982q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112474as;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113123ah;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113164bv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113165bw;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113167by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58889cz;
import com.google.common.base.C58890d;
import com.google.common.p4520a.C58204ak;
import com.google.common.p4520a.C58206am;
import com.google.common.p4520a.C58234bn;
import com.google.common.p4520a.C58254i;
import com.google.common.p4520a.C58259n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bl */
/* compiled from: PG */
public final class C111971bl {

    /* renamed from: a */
    public static final C121537f f311053a = C121537f.m200840b("Tapas/SuggestionManager", C121511c.f337208a);

    /* renamed from: b */
    public static final Duration f311054b = Duration.ofSeconds(30);

    /* renamed from: c */
    public static final Duration f311055c = Duration.ofSeconds(20);

    /* renamed from: n */
    private static final C59071e f311056n = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bl");

    /* renamed from: d */
    public final C58889cz f311057d;

    /* renamed from: e */
    public final C86124t f311058e;

    /* renamed from: f */
    public final C22871g f311059f;

    /* renamed from: g */
    public final C68214a f311060g;

    /* renamed from: h */
    public final C111877bo f311061h;

    /* renamed from: i */
    public final C68214a f311062i;

    /* renamed from: j */
    public final C111248k f311063j;

    /* renamed from: k */
    public final C113190cu f311064k;

    /* renamed from: l */
    public final C112982q f311065l;

    /* renamed from: m */
    public final C58259n f311066m;

    /* renamed from: o */
    private final C22871g f311067o;

    /* renamed from: p */
    private final Executor f311068p;

    /* renamed from: q */
    private final C111993x f311069q;

    /* renamed from: r */
    private final int f311070r;

    /* renamed from: s */
    private final List f311071s = new ArrayList();

    public C111971bl(C58889cz czVar, C86124t tVar, C22871g gVar, C22871g gVar2, Executor executor, C68214a aVar, C111993x xVar, C111877bo boVar, C68214a aVar2, C111248k kVar, C112982q qVar, C113190cu cuVar) {
        this.f311057d = czVar;
        this.f311058e = tVar;
        this.f311059f = gVar;
        this.f311067o = gVar2;
        this.f311068p = executor;
        this.f311060g = aVar;
        this.f311069q = xVar;
        this.f311061h = boVar;
        this.f311062i = aVar2;
        this.f311063j = kVar;
        this.f311065l = qVar;
        this.f311064k = cuVar;
        this.f311070r = Math.max(1, (int) tVar.mo79743a(C90063do.f249467eA));
        C58254i iVar = new C58254i();
        iVar.mo54823g(1000);
        iVar.mo54824h(czVar);
        iVar.mo54822f(f311054b.toMillis(), TimeUnit.MILLISECONDS);
        this.f311066m = iVar.mo54818b(new C111968bi(this));
    }

    /* renamed from: c */
    public static C113165bw m185827c(C113405ep epVar) {
        String p = epVar.mo100033p();
        return new C113123ah(C113190cu.m187216d(C58890d.m90988c(p)), epVar.mo100022f(), epVar.mo100028k(), epVar.mo100023g(), epVar.mo100024h(), epVar.mo100031n());
    }

    /* renamed from: a */
    public final C111970bk mo99322a(C113405ep epVar) {
        C121509q qVar;
        Throwable th;
        C60870cx cxVar;
        Throwable th2;
        C48672ag agVar;
        C113405ep epVar2 = epVar;
        this.f311065l.mo99805f(epVar.mo100016a(), epVar.mo100033p());
        C121537f fVar = f311053a;
        C121509q l = fVar.mo105243l("issueFetch");
        try {
            C111993x xVar = this.f311069q;
            C121492b a = C111993x.f311125b.mo105233a("fetchCandidates");
            xVar.f311137n.mo99804e(epVar.mo100016a(), C112976k.DATA_SOURCE_FETCH);
            C60870cx b = ((C112474as) xVar.f311130g.mo27525b()).mo99548b(C113164bv.m187180a(epVar.mo100022f().f53688p));
            C111992w wVar = new C111992w();
            C60856cj.m92911t(b, C47810es.m84974n(wVar), xVar.f311127d);
            if (xVar.f311126c.mo79746e(C90063do.f249586gN)) {
                try {
                    C89356b b2 = xVar.f311140q.mo78026b("TapasEngine fetch suggestions", C118575h.GRAPH_TAPAS_SUGGESTION_FETCH, C118575h.GRAPH_TAPAS_SUGGESTION_FETCH);
                    C111994y yVar = (C111994y) xVar.f311132i.mo17428b();
                    yVar.mo68958b(b2);
                    yVar.mo68959c(epVar2);
                    cxVar = yVar.mo68957a().mo99330b();
                    qVar = l;
                } catch (Throwable th3) {
                    th = th3;
                    qVar = l;
                    try {
                        qVar.close();
                    } catch (Throwable th4) {
                        C111950ar.m185805a(th, th4);
                    }
                    throw th;
                }
            } else {
                C58485gu<C48672ag> a2 = xVar.f311131h.mo99271a(epVar2);
                xVar.f311135l.mo99235a(epVar.mo100016a(), epVar.mo100033p());
                xVar.f311135l.mo99236b(epVar.mo100016a());
                C58490gz gzVar = new C58490gz(4);
                C58490gz gzVar2 = new C58490gz(4);
                for (C48672ag agVar2 : a2) {
                    C69464a b3 = xVar.f311131h.mo99272b(agVar2);
                    if (b3 != null) {
                        C111993x xVar2 = xVar;
                        C111987r rVar = r2;
                        C48672ag agVar3 = agVar2;
                        qVar = l;
                        C113167by byVar = xVar.f311138o;
                        C48672ag agVar4 = agVar2;
                        try {
                            C111987r rVar2 = new C111987r(xVar2, agVar3, b3, epVar, gzVar);
                            C60870cx b4 = byVar.mo99894b("fetch each source in parallel", rVar);
                            if (!C113409et.m187721r(agVar4)) {
                                agVar = agVar4;
                                gzVar2.mo55429h(agVar, b4);
                            } else {
                                agVar = agVar4;
                            }
                            gzVar.mo55429h(agVar, b4);
                            l = qVar;
                        } catch (Throwable th5) {
                            th = th5;
                            th = th;
                            qVar.close();
                            throw th;
                        }
                    }
                }
                qVar = l;
                xVar.f311139p.mo99332a(gzVar.mo55427f(false));
                cxVar = xVar.f311133j.mo99328a(gzVar2.mo55427f(false), epVar.mo100033p(), C111885bw.m185717c(epVar));
            }
            C60870cx g = C60922j.m93044g(cxVar, new C111988s(xVar, epVar2), C60826bg.f164896a);
            C90873ag agVar5 = new C90873ag(g, xVar.f311128e, "log when all responses finish loading", new C111989t(xVar, epVar2, a));
            agVar5.mo85224b(TimeoutException.class, new C111990u(xVar, epVar2, a));
            agVar5.mo85223a(new C111991v(xVar, epVar2, a));
            fVar.mo105244m("createCandidates", g);
            long a3 = this.f311057d.mo26884a();
            C111972c cVar = new C111972c(g, new C111958az(this, epVar2, g), a3, a3 + f311055c.toNanos(), this.f311059f.mo28209i(g, "taking time", new C111960ba(this, a3)));
            if (!this.f311058e.mo79746e(C90063do.f249393cg)) {
                cVar.mo99319f();
            }
            g.mo4106b(new C111961bb(this, epVar2), this.f311068p);
            C121537f fVar2 = f311053a;
            fVar2.mo105240i("fetch_issued");
            C121509q l2 = fVar2.mo105243l("cancelExceedingFetches");
            try {
                synchronized (this.f311071s) {
                    List list = this.f311071s;
                    C111951as asVar = C111951as.f311020a;
                    int i = 0;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj = list.get(i2);
                        if (!asVar.test(obj)) {
                            list.set(i, obj);
                            i++;
                        }
                    }
                    while (list.size() > i) {
                        list.remove(list.size() - 1);
                    }
                    while (this.f311071s.size() >= this.f311070r) {
                        C58976aa aaVar = C58975e.f156826a;
                        ((C60870cx) this.f311071s.remove(0)).cancel(true);
                        f311053a.mo105240i("fetch_canceled");
                    }
                    this.f311071s.add(g);
                }
                l2.close();
                qVar.close();
                return cVar;
            } catch (Throwable th6) {
                th2 = th6;
                l2.close();
                throw th2;
            }
        } catch (Throwable th7) {
            th = th7;
            qVar = l;
            th = th;
            qVar.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final C111970bk mo99323b(C113165bw bwVar) {
        return (C111970bk) ((C58206am) this.f311066m).f155647a.mo54792f(bwVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e A[Catch:{ ExecutionException -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5 A[Catch:{ ExecutionException -> 0x00de }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo99324d(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep r10) {
        /*
            r9 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r9.f311058e
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249445df
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x0013
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bk r10 = r9.mo99322a(r10)
            com.google.common.util.concurrent.cx r10 = r10.mo99319f()
            return r10
        L_0x0013:
            com.google.android.apps.gsa.staticplugins.opa.tapas.q.bw r0 = m185827c(r10)     // Catch:{ ExecutionException -> 0x00de }
            boolean r1 = r9.mo99327g(r0)     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.a.n r2 = r9.f311066m     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.a.ak r2 = (com.google.common.p4520a.C58204ak) r2     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.a.bn r2 = r2.f155647a     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.a.l r3 = r2.f155752u     // Catch:{ ExecutionException -> 0x00de }
            java.lang.Object r2 = r2.mo54791e(r0, r3)     // Catch:{ ExecutionException -> 0x00de }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bk r2 = (com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111970bk) r2     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.util.concurrent.cx r3 = r2.mo99319f()     // Catch:{ ExecutionException -> 0x00de }
            long r4 = r2.mo99276b()     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.base.cz r6 = r9.f311057d     // Catch:{ ExecutionException -> 0x00de }
            long r6 = r6.mo26884a()     // Catch:{ ExecutionException -> 0x00de }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0047
            com.google.android.libraries.gsa.k.g r4 = r9.f311067o     // Catch:{ ExecutionException -> 0x00de }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bg r5 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bg     // Catch:{ ExecutionException -> 0x00de }
            r5.<init>(r9, r0)     // Catch:{ ExecutionException -> 0x00de }
            java.lang.String r6 = "refresh"
            r4.mo28212l(r6, r5)     // Catch:{ ExecutionException -> 0x00de }
        L_0x0047:
            boolean r4 = r3.isCancelled()     // Catch:{ ExecutionException -> 0x00de }
            if (r4 == 0) goto L_0x0057
            com.google.common.a.n r1 = r9.f311066m     // Catch:{ ExecutionException -> 0x00de }
            r1.mo54714d(r0)     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.util.concurrent.cx r10 = r9.mo99324d(r10)     // Catch:{ ExecutionException -> 0x00de }
            return r10
        L_0x0057:
            if (r1 == 0) goto L_0x00bf
            boolean r1 = r2.mo99320g()     // Catch:{ ExecutionException -> 0x00de }
            r4 = 1
            if (r1 == 0) goto L_0x006b
            com.google.android.apps.gsa.search.core.i.t r5 = r9.f311058e     // Catch:{ ExecutionException -> 0x00de }
            boolean r5 = r2.mo99321h(r5)     // Catch:{ ExecutionException -> 0x00de }
            if (r5 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r5 = 0
            goto L_0x006c
        L_0x006b:
            r5 = 1
        L_0x006c:
            if (r1 == 0) goto L_0x00b3
            com.google.android.apps.search.assistant.platform.i.e.a.f r1 = f311053a     // Catch:{ ExecutionException -> 0x00de }
            if (r4 == r5) goto L_0x0075
            java.lang.String r4 = "cached_suggestions_invalid"
            goto L_0x0077
        L_0x0075:
            java.lang.String r4 = "cached_suggestions_valid"
        L_0x0077:
            r1.mo105240i(r4)     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.util.concurrent.cx r1 = r2.mo99278d()     // Catch:{ ExecutionException -> 0x00de }
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r1)     // Catch:{ ExecutionException -> 0x00de }
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.p r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111985p) r1     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.b.ij r1 = r1.mo99313c()     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.b.sl r1 = r1.iterator()     // Catch:{ ExecutionException -> 0x00de }
        L_0x008c:
            boolean r2 = r1.hasNext()     // Catch:{ ExecutionException -> 0x00de }
            if (r2 == 0) goto L_0x00b3
            java.lang.Object r2 = r1.next()     // Catch:{ ExecutionException -> 0x00de }
            com.google.assistant.ad.d.b.ag r2 = (com.google.assistant.p3781ad.p3789d.p3791b.C48672ag) r2     // Catch:{ ExecutionException -> 0x00de }
            com.google.android.apps.search.assistant.platform.i.e.a.f r4 = f311053a     // Catch:{ ExecutionException -> 0x00de }
            java.lang.String r2 = r2.name()     // Catch:{ ExecutionException -> 0x00de }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ExecutionException -> 0x00de }
            r6.<init>()     // Catch:{ ExecutionException -> 0x00de }
            java.lang.String r7 = "late_source_"
            r6.append(r7)     // Catch:{ ExecutionException -> 0x00de }
            r6.append(r2)     // Catch:{ ExecutionException -> 0x00de }
            java.lang.String r2 = r6.toString()     // Catch:{ ExecutionException -> 0x00de }
            r4.mo105240i(r2)     // Catch:{ ExecutionException -> 0x00de }
            goto L_0x008c
        L_0x00b3:
            if (r5 != 0) goto L_0x00bf
            com.google.common.a.n r1 = r9.f311066m     // Catch:{ ExecutionException -> 0x00de }
            r1.mo54714d(r0)     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.util.concurrent.cx r10 = r9.mo99324d(r10)     // Catch:{ ExecutionException -> 0x00de }
            return r10
        L_0x00bf:
            r9.mo99326f()     // Catch:{ ExecutionException -> 0x00de }
            boolean r0 = r3.isDone()     // Catch:{ ExecutionException -> 0x00de }
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r3)     // Catch:{ ExecutionException -> 0x00de }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r0 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es) r0     // Catch:{ ExecutionException -> 0x00de }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.er r0 = r0.mo100119b()     // Catch:{ ExecutionException -> 0x00de }
            r0.mo100095e(r10)     // Catch:{ ExecutionException -> 0x00de }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r0 = r0.mo100091a()     // Catch:{ ExecutionException -> 0x00de }
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r0)     // Catch:{ ExecutionException -> 0x00de }
            return r10
        L_0x00de:
            r0 = move-exception
            com.google.common.f.e r1 = f311056n
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "SuggestionManager"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = r10.mo100033p()
            r3 = 27465(0x6b49, float:3.8487E-41)
            java.lang.String r4 = "Failed to fetch suggestions for prefix %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56389s(r4, r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es.f314036b
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.er r0 = r0.mo100119b()
            r0.mo100095e(r10)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r0 = r0.mo100091a()
            com.google.common.util.concurrent.cx r3 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0108:
            com.google.android.libraries.gsa.k.g r0 = r9.f311059f
            com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bh r1 = new com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.bh
            r1.<init>(r10)
            java.lang.String r10 = "update_request_in_response"
            com.google.common.util.concurrent.cx r10 = r0.mo28209i(r3, r10, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.C111971bl.mo99324d(com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ep):com.google.common.util.concurrent.cx");
    }

    /* renamed from: e */
    public final C60870cx mo99325e(C113405ep epVar) {
        if (!this.f311058e.mo79746e(C90063do.f249445df)) {
            return C118826c.f331423b;
        }
        try {
            C113165bw c = m185827c(epVar);
            boolean g = mo99327g(c);
            C58234bn bnVar = ((C58204ak) this.f311066m).f155647a;
            C111970bk bkVar = (C111970bk) bnVar.mo54791e(c, bnVar.f155752u);
            C60870cx d = bkVar.mo99278d();
            if (bkVar.mo99276b() < this.f311057d.mo26884a()) {
                this.f311067o.mo28212l("refresh", new C111955aw(this, c));
                return C118826c.f331423b;
            } else if (d.isCancelled()) {
                this.f311066m.mo54714d(c);
                return mo99325e(epVar);
            } else if (!g || bkVar.mo99321h(this.f311058e)) {
                mo99326f();
                return this.f311059f.mo28209i(d, "SignalDonePrefetch", C111956ax.f311027a);
            } else {
                this.f311066m.mo54714d(c);
                return mo99325e(epVar);
            }
        } catch (ExecutionException e) {
            C59104x c2 = f311056n.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "SuggestionManager");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(27466)).mo56389s("Failed to prefetch suggestions for prefix %s", epVar.mo100033p());
            return C118826c.f331423b;
        }
    }

    /* renamed from: f */
    public final void mo99326f() {
        if (this.f311063j.mo99077b()) {
            this.f311067o.mo28212l("refreshDebugPanel", new C111952at(this));
        }
    }

    /* renamed from: g */
    public final boolean mo99327g(C113165bw bwVar) {
        return mo99323b(bwVar) != null;
    }
}
