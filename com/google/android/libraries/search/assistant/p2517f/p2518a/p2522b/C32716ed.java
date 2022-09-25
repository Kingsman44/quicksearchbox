package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.apps.gsa.binaries.satin.app.amv;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32881e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32598c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32599d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32600e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32848cp;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32850cr;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32851cs;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32852ct;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32853cu;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32914i;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32916k;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32920c;
import com.google.android.libraries.search.assistant.p2703l.C34793g;
import com.google.android.libraries.search.assistant.p2703l.C34794h;
import com.google.android.libraries.search.assistant.p2703l.C34798l;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58471gg;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71646cs;
import kotlinx.coroutines.C71671dg;
import kotlinx.coroutines.C71683ds;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.C71816z;
import p3186j$.time.Duration;
import p5304e.p5305a.p5306a.p5369g.p5373b.p5374a.C68755s;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ed */
/* compiled from: PG */
public final class C32716ed implements C32881e, C71422aw, C32916k {

    /* renamed from: a */
    public static final C32707dv f87684a = new C32707dv();
    @Deprecated

    /* renamed from: b */
    public static final C59071e f87685b = C59071e.m91331h();

    /* renamed from: c */
    public final C71604be f87686c;

    /* renamed from: d */
    public final List f87687d;

    /* renamed from: e */
    public final C32680cv f87688e;

    /* renamed from: f */
    public final C32750fk f87689f;

    /* renamed from: g */
    private final C69585o f87690g;

    /* renamed from: h */
    private final List f87691h;

    /* renamed from: i */
    private final Closeable f87692i;

    /* renamed from: j */
    private final C32849cq f87693j;

    /* renamed from: k */
    private final C34794h f87694k;

    /* renamed from: l */
    private final C71646cs f87695l = new C71683ds();

    public C32716ed(C32718ef efVar, C69626l lVar, C58471gg ggVar, int i, C69585o oVar, C34798l lVar2, amv amv, C32914i iVar) {
        C58471gg ggVar2 = ggVar;
        C69585o oVar2 = oVar;
        C34798l lVar3 = lVar2;
        amv amv2 = amv;
        C32914i iVar2 = iVar;
        C69664n.m101061g(ggVar2, "contextProviders");
        C69664n.m101061g(oVar2, "lightweightContext");
        C69664n.m101061g(lVar3, "serviceRegistry");
        C69664n.m101061g(amv2, "sourceServiceImplFactory");
        C69664n.m101061g(iVar2, "contextDebugDataProvider");
        this.f87690g = oVar2;
        this.f87686c = C71803m.m105042c(this, (C69585o) null, (C71424ay) null, new C32711dz(lVar, (C69577g) null), 3);
        C69664n.m101061g(ggVar2, "contextProviders");
        C69664n.m101061g(ggVar2, "contextProviders");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C58800sl lA = ggVar.iterator();
        while (lA.hasNext()) {
            C32836cd d = ((C32597b) lA.next()).mo38174d();
            C32796ar arVar = d.f88043b;
            if (linkedHashSet.contains(arVar == null ? C32796ar.f87973c : arVar)) {
                C32796ar arVar2 = d.f88043b;
                throw new IllegalArgumentException("Duplicate context key found: ".concat(String.valueOf(C32602g.m60429b(arVar2 == null ? C32796ar.f87973c : arVar2))));
            }
            C32796ar arVar3 = d.f88043b;
            if (arVar3 == null) {
                arVar3 = C32796ar.f87973c;
            }
            C69664n.m101060f(arVar3, "key.contextKey");
            linkedHashSet.add(arVar3);
        }
        C58490gz gzVar = new C58490gz(4);
        C58800sl lA2 = ggVar.iterator();
        while (lA2.hasNext()) {
            C32597b bVar = (C32597b) lA2.next();
            C32796ar arVar4 = bVar.mo38174d().f88043b;
            if (arVar4 == null) {
                arVar4 = C32796ar.f87973c;
            }
            gzVar.mo55429h(arVar4, bVar);
        }
        C32598c cVar = new C32598c(gzVar.mo55427f(false));
        C69664n.m101061g(ggVar2, "contextProviders");
        ArrayList arrayList = new ArrayList(C69540x.m100804k(ggVar2, 10));
        Iterator it = ggVar.iterator();
        while (it.hasNext()) {
            C32597b bVar2 = (C32597b) it.next();
            C32852ct ctVar = (C32852ct) C32853cu.f88067f.createBuilder();
            C69664n.m101060f(ctVar, "newBuilder()");
            C69664n.m101061g(ctVar, "builder");
            boolean z = bVar2.mo38173c() != null;
            ctVar.copyOnWrite();
            C32853cu cuVar = (C32853cu) ctVar.instance;
            cuVar.f88069a |= 4;
            cuVar.f88072d = z;
            C32836cd d2 = bVar2.mo38174d();
            C32796ar arVar5 = d2.f88043b;
            arVar5 = arVar5 == null ? C32796ar.f87973c : arVar5;
            C69664n.m101060f(arVar5, "providerContextKey.contextKey");
            C69664n.m101061g(arVar5, "value");
            ctVar.copyOnWrite();
            C32853cu cuVar2 = (C32853cu) ctVar.instance;
            arVar5.getClass();
            cuVar2.f88070b = arVar5;
            cuVar2.f88069a |= 1;
            if ((d2.f88042a & 2) != 0) {
                boolean z2 = d2.f88044c;
                ctVar.copyOnWrite();
                C32853cu cuVar3 = (C32853cu) ctVar.instance;
                cuVar3.f88069a |= 2;
                cuVar3.f88071c = z2;
            }
            if ((d2.f88042a & 4) != 0) {
                boolean z3 = d2.f88045d;
                ctVar.copyOnWrite();
                C32853cu cuVar4 = (C32853cu) ctVar.instance;
                cuVar4.f88069a |= 8;
                cuVar4.f88073e = z3;
            }
            C62942bv build = ctVar.build();
            C69664n.m101060f(build, "_builder.build()");
            arrayList.add((C32853cu) build);
        }
        C32680cv cvVar = new C32680cv(arrayList);
        this.f87688e = cvVar;
        C71816z zVar = new C71816z();
        C71604be c = C71803m.m105042c(this, (C69585o) null, (C71424ay) null, new C32713ea(this, zVar, (C69577g) null), 3);
        C32750fk fkVar = new C32750fk(zVar, c, cvVar, cVar, i, (C71422aw) amv2.f197992a.a.H.mo17428b(), (C21370a) amv2.f197992a.a.i.mo17428b(), (C32914i) amv2.f197992a.a.b.f200095dC.mo17428b(), C68755s.m99247b(amv2.f197992a.b.f198009I), ((C46897i) amv2.f197992a.b.f198009I.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45374916").mo50907f(), ((C46897i) amv2.f197992a.b.f198009I.mo17428b()).mo50901a("com.google.android.apps.search.assistant.user 45378613").mo50907f(), (C58889cz) amv2.f197992a.a.bB.mo17428b(), (C32920c) amv2.f197992a.b.f198136cC.mo17428b(), amv2.f197992a.b.mo66237eX());
        this.f87689f = fkVar;
        C34794h a = lVar3.mo39515a(fkVar);
        this.f87694k = a;
        try {
            C32850cr crVar = (C32850cr) C32851cs.f88063c.createBuilder();
            C69664n.m101060f(crVar, "newBuilder()");
            C69664n.m101061g(crVar, "builder");
            C34793g gVar = a.f92324a;
            C69664n.m101060f(gVar, "sourceRegistration.endpoint()");
            C69664n.m101061g(gVar, "value");
            crVar.copyOnWrite();
            gVar.getClass();
            ((C32851cs) crVar.instance).f88065a = gVar;
            String str = efVar.f87696a;
            C69664n.m101061g(str, "value");
            crVar.copyOnWrite();
            str.getClass();
            ((C32851cs) crVar.instance).f88066b = str;
            C62942bv build2 = crVar.build();
            C69664n.m101060f(build2, "_builder.build()");
            C32848cp cpVar = (C32848cp) C32849cq.f88059c.createBuilder();
            C69664n.m101060f(cpVar, "newBuilder()");
            C69664n.m101061g(cpVar, "builder");
            C63088z byteString = ((C32851cs) build2).toByteString();
            C69664n.m101060f(byteString, "internals.toByteString()");
            C69664n.m101061g(byteString, "value");
            cpVar.copyOnWrite();
            C32849cq cqVar = (C32849cq) cpVar.instance;
            byteString.getClass();
            cqVar.f88061a |= 1;
            cqVar.f88062b = byteString;
            C62942bv build3 = cpVar.build();
            C69664n.m101060f(build3, "_builder.build()");
            C32849cq cqVar2 = (C32849cq) build3;
            this.f87693j = cqVar2;
            List d3 = C32688dc.m60591d(cqVar2, C32691df.f87608b);
            this.f87687d = d3;
            zVar.mo62909P(cqVar2);
            C69664n.m101061g(d3, "tags");
            C69664n.m101061g(ggVar2, "contextProviders");
            C69664n.m101061g(fkVar, "sourceService");
            ArrayList<Closeable> arrayList2 = new ArrayList<>();
            try {
                C58800sl lA3 = ggVar.iterator();
                while (lA3.hasNext()) {
                    C32597b bVar3 = (C32597b) lA3.next();
                    C32601f c2 = bVar3.mo38173c();
                    if (c2 != null) {
                        C32796ar arVar6 = bVar3.mo38174d().f88043b;
                        arVar6 = arVar6 == null ? C32796ar.f87973c : arVar6;
                        C69664n.m101060f(arVar6, "provider.supportedContextKey.contextKey");
                        C32599d dVar = new C32599d(new C32706du(d3, arVar6, this, fkVar));
                        synchronized (c2.f87296b) {
                            c2.f87295a.add(dVar);
                        }
                        arrayList2.add(new C32600e(c2, dVar));
                    }
                }
                this.f87691h = arrayList2;
                this.f87692i = iVar2.mo38345d(this);
                C71803m.m105043d(this, (C69585o) null, (C71424ay) null, new C32701dp(c, this, (C69577g) null), 3);
                C71803m.m105043d(this, (C69585o) null, (C71424ay) null, new C32702dq(this, (C69577g) null), 3);
            } catch (Throwable th) {
                for (Closeable close : arrayList2) {
                    close.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f87694k.close();
            zVar.mo63050j(th2);
            throw th2;
        }
    }

    /* renamed from: b */
    public final C32849cq mo38265b() {
        if (this.f87695l.mo62867mj()) {
            return this.f87693j;
        }
        throw new IllegalStateException("Session closed.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38266c(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32715ec
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.f.a.b.ec r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32715ec) r0
            int r1 = r0.f87683d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87683d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.ec r0 = new com.google.android.libraries.search.assistant.f.a.b.ec
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f87681b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87683d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x002b:
            java.lang.Object r0 = r0.f87680a
            p5462h.C69714l.m101134b(r6)     // Catch:{ all -> 0x0031 }
            goto L_0x0044
        L_0x0031:
            r6 = move-exception
            goto L_0x004c
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.assistant.f.a.b.fk r6 = r5.f87689f     // Catch:{ all -> 0x004a }
            r0.f87680a = r5     // Catch:{ all -> 0x004a }
            r0.f87683d = r3     // Catch:{ all -> 0x004a }
            java.lang.Object r6 = r6.mo38277j(r0)     // Catch:{ all -> 0x004a }
            if (r6 != r1) goto L_0x0043
            return r1
        L_0x0043:
            r0 = r5
        L_0x0044:
            h.e r6 = new h.e     // Catch:{ all -> 0x0031 }
            r6.<init>()     // Catch:{ all -> 0x0031 }
            throw r6     // Catch:{ all -> 0x0031 }
        L_0x004a:
            r6 = move-exception
            r0 = r5
        L_0x004c:
            java.lang.Object r6 = p5462h.C69714l.m101133a(r6)
            java.lang.Throwable r1 = p5462h.C69702k.m101124a(r6)
            if (r1 == 0) goto L_0x00a9
            boolean r2 = r1 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L_0x0077
            com.google.common.f.e$a r1 = com.google.common.p4526f.C59071e.f157037b
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.search.assistant.f.a.b.ed r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32716ed) r0
            java.util.List r0 = r0.f87687d
            com.google.common.f.c r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r1, r0)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 50599(0xc5a7, float:7.0904E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Cache size logging stopped"
            r0.mo56386p(r1)
            goto L_0x00a9
        L_0x0077:
            com.google.common.f.e r2 = f87685b
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "Context.Source"
            r2.mo56378ag(r3, r4)
            com.google.common.f.x r1 = r2.mo56382g(r1)
            java.lang.String r2 = "logger.atWarning().withCause(it)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.android.libraries.search.assistant.f.a.b.ed r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32716ed) r0
            java.util.List r0 = r0.f87687d
            com.google.common.f.c r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r1, r0)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 50598(0xc5a6, float:7.0903E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Cache size logging failed"
            r0.mo56386p(r1)
        L_0x00a9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32716ed.mo38266c(h.c.g):java.lang.Object");
    }

    public final void close() {
        C59052c cVar = (C59052c) f87685b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Context.Source");
        C69664n.m101060f(cVar, "logger.atInfo()");
        C59052c a = C32692dg.m60595a(cVar, this.f87687d);
        a.mo56379ah(new C59094n(50600));
        a.mo56386p("Close Session");
        this.f87694k.close();
        this.f87692i.close();
        this.f87695l.mo62723u((CancellationException) null);
        for (Closeable close : this.f87691h) {
            close.close();
        }
        C71803m.m105043d(this, C71671dg.f191128a, (C71424ay) null, new C32709dx(this, (C69577g) null), 2);
    }

    /* renamed from: d */
    public final void mo38268d(Duration duration) {
        C69664n.m101061g(duration, "contextApiLatency");
        C71803m.m105043d(this, (C69585o) null, (C71424ay) null, new C32714eb(this, duration, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38184e(java.lang.String r18, p3186j$.time.Instant r19, p5462h.p5466c.C69577g r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32710dy
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.libraries.search.assistant.f.a.b.dy r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32710dy) r2
            int r3 = r2.f87669f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f87669f = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.f.a.b.dy r2 = new com.google.android.libraries.search.assistant.f.a.b.dy
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f87667d
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f87669f
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0053
            if (r4 == r6) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            java.lang.Object r3 = r2.f87665b
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.Object r2 = r2.f87664a
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            p5462h.C69714l.m101134b(r1)
            goto L_0x014a
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.Object r4 = r2.f87666c
            java.lang.Object r6 = r2.f87665b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.f87664a
            com.google.android.libraries.search.assistant.f.a.b.ed r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32716ed) r7
            p5462h.C69714l.m101134b(r1)
            r16 = r7
            r7 = r4
            r4 = r6
            r6 = r16
            goto L_0x006b
        L_0x0053:
            p5462h.C69714l.m101134b(r1)
            kotlinx.coroutines.be r1 = r0.f87686c
            r2.f87664a = r0
            r4 = r18
            r2.f87665b = r4
            r7 = r19
            r2.f87666c = r7
            r2.f87669f = r6
            java.lang.Object r1 = r1.mo62825a(r2)
            if (r1 == r3) goto L_0x0159
            r6 = r0
        L_0x006b:
            com.google.android.libraries.search.assistant.f.a.b.dw r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32708dw) r1
            r8 = 0
            if (r1 == 0) goto L_0x0073
            com.google.android.libraries.search.assistant.f.a.d.cq r1 = r1.f87661b
            goto L_0x0074
        L_0x0073:
            r1 = r8
        L_0x0074:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r11 = "\t"
            java.lang.String r10 = r10.concat(r11)
            java.util.List r12 = r6.f87687d
            java.lang.String r12 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.m60594a(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            java.lang.String r14 = "Session:\n"
            r13.append(r14)
            r13.append(r10)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r9.append(r12)
            r12 = 10
            r9.append(r12)
            if (r1 == 0) goto L_0x00b5
            java.util.List r13 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87608b
            java.util.List r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32688dc.m60591d(r1, r13)
            java.lang.String r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.m60594a(r1)
            goto L_0x00b6
        L_0x00b5:
            r1 = r8
        L_0x00b6:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            java.lang.String r4 = "Parent Session:\n"
            r13.append(r4)
            r13.append(r10)
            r13.append(r1)
            java.lang.String r1 = r13.toString()
            r9.append(r1)
            r9.append(r12)
            java.lang.String r1 = "SupportedContextKeys:"
            java.lang.String r1 = r10.concat(r1)
            r9.append(r1)
            r9.append(r12)
            com.google.android.libraries.search.assistant.f.a.b.cv r1 = r6.f87688e
            java.util.List r1 = r1.f87586b
            java.util.Iterator r1 = r1.iterator()
        L_0x00e7:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0135
            java.lang.Object r4 = r1.next()
            com.google.android.libraries.search.assistant.f.a.d.cu r4 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32853cu) r4
            com.google.android.libraries.search.assistant.f.a.d.ar r13 = r4.f88070b
            if (r13 != 0) goto L_0x00f9
            com.google.android.libraries.search.assistant.f.a.d.ar r13 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
        L_0x00f9:
            java.lang.String r13 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r13)
            boolean r14 = r4.f88071c
            boolean r15 = r4.f88072d
            boolean r4 = r4.f88073e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            r5.append(r11)
            r5.append(r13)
            java.lang.String r13 = ". CanBeSentToServer: "
            r5.append(r13)
            r5.append(r14)
            java.lang.String r13 = ". SupportsCacheInvalidations: "
            r5.append(r13)
            r5.append(r15)
            java.lang.String r13 = ". IsCachedIndefinitely: "
            r5.append(r13)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r9.append(r4)
            r9.append(r12)
            r5 = 2
            goto L_0x00e7
        L_0x0135:
            com.google.android.libraries.search.assistant.f.a.b.fk r1 = r6.f87689f
            r2.f87664a = r9
            r2.f87665b = r9
            r2.f87666c = r8
            r4 = 2
            r2.f87669f = r4
            j$.time.Instant r7 = (p3186j$.time.Instant) r7
            java.lang.Object r1 = r1.mo38184e(r10, r7, r2)
            if (r1 == r3) goto L_0x0159
            r2 = r9
            r3 = r2
        L_0x014a:
            java.lang.String r1 = (java.lang.String) r1
            r3.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            return r1
        L_0x0159:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32716ed.mo38184e(java.lang.String, j$.time.Instant, h.c.g):java.lang.Object");
    }

    /* renamed from: lZ */
    public final C69585o mo5702lZ() {
        return this.f87690g.plus(this.f87695l);
    }
}
