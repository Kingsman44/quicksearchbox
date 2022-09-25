package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.understanding.C79162t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.ae */
/* compiled from: PG */
public final class C79168ae implements C79162t {

    /* renamed from: a */
    private final C76092h f217626a;

    /* renamed from: b */
    private final C91142g f217627b;

    /* renamed from: c */
    private final C79851ai f217628c;

    /* renamed from: d */
    private final C79290es f217629d;

    /* renamed from: e */
    private final C22871g f217630e;

    public C79168ae(C76092h hVar, C91142g gVar, C79851ai aiVar, C79290es esVar, C22871g gVar2) {
        this.f217626a = hVar;
        this.f217627b = gVar;
        this.f217628c = aiVar;
        this.f217630e = gVar2;
        this.f217629d = esVar;
    }

    /* renamed from: a */
    public final C80515d mo73713a() {
        return C80515d.TELEPORT;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0347, code lost:
        if (r0 == false) goto L_0x0349;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.common.util.concurrent.C60870cx mo73714b(java.lang.String r10, java.util.List r11, com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n r12, com.google.android.apps.gsa.nga.engine.p5913am.p5933n.C74945h r13) {
        /*
            r9 = this;
            com.google.android.apps.gsa.nga.engine.g.h r13 = r9.f217626a
            com.google.android.apps.gsa.nga.engine.g.f r13 = r13.mo72021b()
            java.util.Locale r13 = r13.mo72039e()
            java.lang.String r10 = com.google.android.apps.gsa.nga.shared.p6320al.C80884a.m128737b(r10, r13)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.es r13 = r9.f217629d
            java.util.Set r0 = r13.f217764c
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ed r1 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79275ed.f217743a
            r0.forEach(r1)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r0 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.x
            com.google.common.f.a.d r1 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79290es.f217762a
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            r0.<init>(r1)
            java.lang.String r1 = "*"
            r2 = 50
            java.lang.String r1 = com.google.common.base.C58880cq.m90966b(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "\n"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "\n\nTeleportIntentGenerator - Query: "
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r0 = r0.mo73900a(r1)
            r13.f217778q = r0
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r0 = r13.f217778q
            java.lang.String r1 = "Text Annotations"
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r0 = r0.mo73900a(r1)
            java.util.Iterator r1 = r11.iterator()
        L_0x0056:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0074
            java.lang.Object r2 = r1.next()
            com.google.android.apps.gsa.nga.shared.a.aa r2 = (com.google.android.apps.gsa.nga.shared.p6274a.C80047aa) r2
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Annotations: "
            java.lang.String r2 = r3.concat(r2)
            r0.mo73900a(r2)
            goto L_0x0056
        L_0x0074:
            com.google.android.apps.gsa.nga.engine.au.al r0 = r13.f217772k
            com.google.android.apps.gsa.nga.engine.au.ak r0 = r0.a()
            r13.f217775n = r0
            com.google.android.apps.gsa.nga.engine.au.ak r0 = r13.f217775n
            int r0 = r0.b
            r13.mo73857l()
            com.google.android.apps.gsa.nga.engine.au.bz r0 = r13.f217771j
            com.google.android.apps.gsa.nga.engine.au.av r0 = r0.a()
            r13.f217776o = r0
            com.google.android.apps.gsa.nga.engine.au.av r0 = r13.f217776o
            int r0 = r0.b
            r13.mo73857l()
            com.google.android.apps.gsa.nga.engine.au.e r0 = r13.f217773l
            com.google.android.apps.gsa.nga.engine.au.d r0 = r0.a()
            r13.f217777p = r0
            com.google.android.apps.gsa.nga.engine.au.d r0 = r13.f217777p
            int r0 = r0.a
            r13.mo73857l()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.f r10 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79298f.m127227c(r10, r11)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.f r10 = r10.mo73858d()
            r10.mo73864j()
            r13.mo73857l()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r11 = r13.f217778q
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = r10.mo73864j()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Normalized query: [%s]"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r11.mo73900a(r1)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r11 = r13.f217778q
            java.lang.String r1 = "findForegroundAppOrWebsiteInfo"
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r11 = r11.mo73900a(r1)
            j$.util.Optional r1 = r12.mo71341p()
            boolean r2 = r1.isPresent()
            if (r2 != 0) goto L_0x00e4
            java.lang.String r1 = "Foreground package missing."
            r11.mo73900a(r1)
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            goto L_0x0143
        L_0x00e4:
            com.google.android.apps.gsa.nga.engine.au.ak r2 = r13.f217775n
            com.google.common.b.ij r2 = r2.c
            java.lang.Object r4 = r1.get()
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L_0x0119
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Possible to find WebUrl for package: "
            java.lang.String r1 = r2.concat(r1)
            r11.mo73900a(r1)
            com.google.android.apps.gsa.nga.engine.am.u.o r1 = r12.mo71332g()
            com.google.common.util.concurrent.cx r1 = r1.mo71350a()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ej r2 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ej
            r2.<init>(r13, r11)
            java.util.concurrent.Executor r11 = r13.f217774m
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r11)
            goto L_0x0143
        L_0x0119:
            java.lang.Object r2 = r1.get()
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r2 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79315m.m127254a(r2)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.p r4 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.p
            r4.<init>(r2, r3)
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Foreground package: "
            java.lang.String r1 = r2.concat(r1)
            r11.mo73900a(r1)
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r4)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
        L_0x0143:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r1 = r13.f217778q
            com.google.android.apps.gsa.nga.engine.au.av r2 = r13.f217776o
            java.lang.String r4 = "com.android.vending"
            com.google.common.b.gu r2 = r2.e(r4)
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.dj r5 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dj
            r5.<init>(r10)
            j$.util.stream.Stream r2 = r2.map(r5)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.cw r5 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79240cw.f217707a
            boolean r2 = r2.anyMatch(r5)
            java.lang.String r5 = "Rejected by teleport query classifier."
            java.lang.String r6 = "RETURNING - Query Classifier triggering has passed"
            if (r2 != 0) goto L_0x0170
            java.lang.String r2 = "The query does not match an implicit install app pattern."
            r1.mo73900a(r2)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x0192
        L_0x0170:
            java.lang.String r2 = "Try implicit triggering - Install App"
            r1.mo73900a(r2)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.cb r2 = r13.f217765d
            boolean r2 = r2.mo73843a(r10, r4)
            if (r2 != 0) goto L_0x0185
            r1.mo73900a(r5)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x0192
        L_0x0185:
            r1.mo73900a(r6)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.TeleportQueryCleaner r2 = r13.f217768g
            java.lang.String r2 = r2.mo73824b(r4, r10)
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
        L_0x0192:
            boolean r7 = r2.isPresent()
            if (r7 == 0) goto L_0x01ad
            java.lang.String r10 = "RETURNING - Detected Install $app query."
            r1.mo73900a(r10)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r10 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79315m.m127254a(r4)
            java.lang.Object r0 = r2.get()
            java.lang.String r0 = (java.lang.String) r0
        L_0x01a7:
            com.google.common.util.concurrent.cx r10 = r13.mo73851e(r10, r0, r11)
            goto L_0x043c
        L_0x01ad:
            com.google.android.apps.gsa.nga.engine.au.av r2 = r13.f217776o
            java.lang.String r4 = "com.google.android.apps.docs.editors.docs"
            com.google.common.b.gu r2 = r2.e(r4)
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.de r4 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.de
            r4.<init>(r10)
            j$.util.stream.Stream r2 = r2.map(r4)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.cw r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79240cw.f217707a
            j$.util.stream.Stream r2 = r2.filter(r4)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.cn r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79231cn.f217701a
            j$.util.stream.Stream r2 = r2.map(r4)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.df r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79250df.f217717a
            j$.util.stream.Stream r2 = r2.filter(r4)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.dg r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79251dg.f217718a
            j$.util.stream.Stream r2 = r2.map(r4)
            j$.util.Optional r2 = r2.findFirst()
            boolean r4 = r2.isPresent()
            if (r4 != 0) goto L_0x01ee
            java.lang.String r2 = "The query does not match any doc search implicit pattern."
            r1.mo73900a(r2)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x01f3
        L_0x01ee:
            java.lang.String r4 = "RETURNING - Implicit triggering for Open Doc"
            r1.mo73900a(r4)
        L_0x01f3:
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x020b
            java.lang.String r10 = "RETURNING - Detected Open $doc query."
            r1.mo73900a(r10)
            java.lang.String r10 = "com.google.android.apps.docs"
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r10 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79315m.m127254a(r10)
            java.lang.Object r0 = r2.get()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01a7
        L_0x020b:
            com.google.common.b.gu r2 = r10.mo73862h()
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.dv r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79266dv.f217732a
            j$.util.stream.Stream r2 = r2.filter(r4)
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r4)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.dw r7 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dw
            r7.<init>(r13, r10)
            j$.util.stream.Stream r4 = r4.filter(r7)
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r4 = r4.collect(r7)
            com.google.common.b.gu r4 = (com.google.common.p4522b.C58485gu) r4
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x0255
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.dx r7 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dx
            r7.<init>(r4)
            j$.util.stream.Stream r2 = r2.filter(r7)
            j$.util.stream.Stream r2 = r2.distinct()
            j$.util.stream.Collector r4 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r4)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
        L_0x0255:
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.dy r4 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dy
            r4.<init>(r13, r10)
            j$.util.Optional r2 = r2.min(r4)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.dz r4 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79270dz.f217738a
            j$.util.Optional r2 = r2.flatMap(r4)
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x0293
            java.lang.Object r4 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r4 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r4
            com.google.android.apps.gsa.nga.engine.understanding.teleport.h r7 = r4.mo73870a()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.h r8 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79310h.APP
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0293
            j$.util.Optional r4 = r13.mo73854i(r4)
            boolean r4 = r4.isPresent()
            if (r4 != 0) goto L_0x0293
            java.lang.String r2 = "No triggerable Teleport-Search candidate for AppOrUrl detected"
            r1.mo73900a(r2)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x0293:
            boolean r4 = r2.isPresent()
            r7 = 2
            if (r4 == 0) goto L_0x02e0
            java.lang.Object r4 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r4 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r4
            com.google.common.b.gu r4 = r13.mo73850d(r4)
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.cl r8 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.cl
            r8.<init>(r10)
            j$.util.stream.Stream r4 = r4.map(r8)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.cw r8 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79240cw.f217707a
            boolean r4 = r4.anyMatch(r8)
            if (r4 == 0) goto L_0x02e0
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Object r8 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r8 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r8
            com.google.android.apps.gsa.nga.engine.understanding.teleport.h r8 = r8.mo73870a()
            r4[r3] = r8
            java.lang.Object r2 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r2 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r2
            java.lang.String r2 = r2.mo73873d()
            r4[r0] = r2
            java.lang.String r2 = "AppOrUrl: %s %s matched negative patterns"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            r1.mo73900a(r2)
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x02e0:
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x030a
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Object r7 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r7 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r7
            com.google.android.apps.gsa.nga.engine.understanding.teleport.h r7 = r7.mo73870a()
            r4[r3] = r7
            java.lang.Object r7 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r7 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r7
            java.lang.String r7 = r7.mo73873d()
            r4[r0] = r7
            java.lang.String r0 = "AppOrUrl: %s %s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            r1.mo73900a(r0)
            goto L_0x030f
        L_0x030a:
            java.lang.String r0 = "No Teleport-Search candidate AppOrUrl detected"
            r1.mo73900a(r0)
        L_0x030f:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.dh r0 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dh
            r0.<init>(r13, r10)
            j$.util.Optional r0 = r2.map(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r0 = r0.orElse(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x032e
            boolean r3 = r2.isPresent()
            if (r3 != 0) goto L_0x0349
        L_0x032e:
            com.google.android.apps.gsa.shared.util.v.g r3 = r13.f217766e
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90126fx.f251484jg
            boolean r3 = r3.mo85405j(r4)
            if (r3 != 0) goto L_0x0347
            java.lang.String r10 = "RETURNING - No trigger: no \"supported\" app (with entities / ngrams) in query."
            r1.mo73900a(r10)
            com.google.common.b.gu r10 = com.google.common.p4522b.C58485gu.m89845m()
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r10)
            goto L_0x043c
        L_0x0347:
            if (r0 != 0) goto L_0x042b
        L_0x0349:
            boolean r0 = r2.isPresent()
            if (r0 == 0) goto L_0x042b
            com.google.android.apps.gsa.nga.engine.understanding.teleport.cb r0 = r13.f217765d
            java.lang.Object r3 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r3 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r3
            java.lang.String r3 = r3.mo73873d()
            boolean r0 = r0.mo73844b(r3)
            if (r0 != 0) goto L_0x03e4
            java.lang.String r0 = "Try pattern based triggering"
            r1.mo73900a(r0)
            java.lang.Object r0 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r0 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r0
            a.d.a.a.af r3 = r13.mo73848a(r0)
            com.google.protobuf.cq r3 = r3.f118c
            j$.util.Optional r3 = r13.mo73852g(r10, r3)
            boolean r4 = r3.isPresent()
            java.lang.String r5 = "RETURNING - Pattern-based triggering has passed"
            if (r4 != 0) goto L_0x0388
            java.lang.String r0 = "RETURNING - Didn't match anything."
            r1.mo73900a(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x03c3
        L_0x0388:
            java.lang.Object r3 = r3.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.bq r3 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79207bq) r3
            com.google.android.apps.gsa.nga.engine.understanding.teleport.f r3 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79290es.m127206b(r3)
            boolean r4 = r3.mo73866l()
            if (r4 == 0) goto L_0x03a2
            java.lang.String r0 = "RETURNING - Extracted search text is empty."
            r1.mo73900a(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x03c3
        L_0x03a2:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.TeleportQueryCleaner r4 = r13.f217768g
            java.lang.String r0 = r0.mo73873d()
            java.lang.String r0 = r4.mo73824b(r0, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x03bc
            java.lang.String r0 = "RETURNING - Cleaned search text is empty."
            r1.mo73900a(r0)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x03c3
        L_0x03bc:
            r1.mo73900a(r5)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x03c3:
            boolean r3 = r0.isPresent()
            if (r3 == 0) goto L_0x042b
            r1.mo73900a(r5)
            java.lang.Object r10 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r10 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r10
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.apps.gsa.nga.engine.understanding.teleport.dd r1 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.dd
            r1.<init>(r13, r10, r0)
            java.util.concurrent.Executor r10 = r13.f217774m
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60922j.m93044g(r11, r1, r10)
            goto L_0x043c
        L_0x03e4:
            java.lang.String r0 = "Try query classification based triggering"
            r1.mo73900a(r0)
            java.lang.Object r3 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r3 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r3
            r1.mo73900a(r0)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.cb r0 = r13.f217765d
            java.lang.String r4 = r3.mo73873d()
            boolean r0 = r0.mo73843a(r10, r4)
            if (r0 != 0) goto L_0x0406
            r1.mo73900a(r5)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x0417
        L_0x0406:
            r1.mo73900a(r6)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.TeleportQueryCleaner r0 = r13.f217768g
            java.lang.String r3 = r3.mo73873d()
            java.lang.String r0 = r0.mo73824b(r3, r10)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x0417:
            boolean r3 = r0.isPresent()
            if (r3 == 0) goto L_0x042b
            java.lang.Object r10 = r2.get()
            com.google.android.apps.gsa.nga.engine.understanding.teleport.i r10 = (com.google.android.apps.gsa.nga.engine.understanding.teleport.C79311i) r10
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x01a7
        L_0x042b:
            java.lang.String r0 = "Running contextual logic (using foreground app/website)."
            com.google.android.apps.gsa.nga.engine.understanding.teleport.x r0 = r1.mo73900a(r0)
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ds r1 = new com.google.android.apps.gsa.nga.engine.understanding.teleport.ds
            r1.<init>(r13, r10, r0)
            java.util.concurrent.Executor r10 = r13.f217774m
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60922j.m93045h(r11, r1, r10)
        L_0x043c:
            com.google.android.apps.gsa.nga.engine.understanding.teleport.eo r11 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79286eo.f217759a
            java.util.concurrent.Executor r13 = r13.f217774m
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60922j.m93045h(r10, r11, r13)
            com.google.android.libraries.gsa.k.g r11 = r9.f217630e
            java.lang.String r13 = "[NGA]: TeleportIntentGenerator.generateImpl"
            com.google.android.apps.gsa.nga.engine.understanding.teleport.ac r0 = com.google.android.apps.gsa.nga.engine.understanding.teleport.C79166ac.f217624a
            com.google.common.util.concurrent.cx r10 = r11.mo28209i(r10, r13, r0)
            com.google.android.apps.gsa.nga.engine.x.ai r11 = r9.f217628c
            r13 = 18
            com.google.android.apps.gsa.nga.shared.v.io r12 = r12.mo71336k()
            r11.mo74253d(r13, r12, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.understanding.teleport.C79168ae.mo73714b(java.lang.String, java.util.List, com.google.android.apps.gsa.nga.engine.am.u.n, com.google.android.apps.gsa.nga.engine.am.n.h):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final boolean mo73715c() {
        C76090f b = this.f217626a.mo72021b();
        return b.mo72041f() && C81451b.m129570a(b.mo72039e(), this.f217627b.mo85403h(C90126fx.f251723oG));
    }
}
