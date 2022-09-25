package com.google.android.apps.search.podcasts.p10549a;

import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.podcasts.a.b */
/* compiled from: PG */
final class C139957b implements Callable {

    /* renamed from: a */
    final /* synthetic */ List f380422a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f380423b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f380424c;

    /* renamed from: d */
    final /* synthetic */ C60870cx f380425d;

    /* renamed from: e */
    final /* synthetic */ C60870cx f380426e;

    /* renamed from: f */
    final /* synthetic */ C139958c f380427f;

    /* renamed from: g */
    final /* synthetic */ C60870cx f380428g;

    /* renamed from: h */
    final /* synthetic */ C60870cx f380429h;

    public C139957b(List list, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, C139958c cVar, C60870cx cxVar5, C60870cx cxVar6) {
        this.f380422a = list;
        this.f380423b = cxVar;
        this.f380424c = cxVar2;
        this.f380425d = cxVar3;
        this.f380426e = cxVar4;
        this.f380427f = cVar;
        this.f380428g = cxVar5;
        this.f380429h = cxVar6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.google.android.apps.search.podcasts.o.ab} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r23 = this;
            r0 = r23
            java.util.List r1 = r0.f380422a
            com.google.common.util.concurrent.cx r2 = r0.f380423b
            com.google.common.util.concurrent.cx r3 = r0.f380424c
            com.google.common.util.concurrent.cx r4 = r0.f380425d
            com.google.common.util.concurrent.cx r5 = r0.f380426e
            com.google.android.apps.search.podcasts.a.c r6 = r0.f380427f
            com.google.common.util.concurrent.cx r7 = r0.f380428g
            com.google.common.util.concurrent.cx r8 = r0.f380429h
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = p5462h.p5463a.C69540x.m100804k(r1, r10)
            r9.<init>(r10)
            java.util.Iterator r1 = r1.iterator()
        L_0x0021:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x02da
            java.lang.Object r10 = r1.next()
            com.google.protos.ac.a.j r10 = (com.google.protos.p4757ac.p4758a.C63111j) r10
            com.google.protos.ac.a.l r11 = r10.f170360k
            if (r11 != 0) goto L_0x0033
            com.google.protos.ac.a.l r11 = com.google.protos.p4757ac.p4758a.C63113l.f170365p
        L_0x0033:
            java.lang.String r12 = "it.showMetadata"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            java.lang.Object r12 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            java.lang.String r13 = "getDone(favoriteData)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            com.google.android.apps.search.podcasts.b.g.x r12 = (com.google.android.apps.search.podcasts.p10550b.p10557g.C140160x) r12
            java.lang.Object r13 = com.google.common.util.concurrent.C60856cj.m92909r(r3)
            java.lang.String r14 = "getDone(reactions)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            com.google.android.apps.search.podcasts.o.ae r13 = (com.google.android.apps.search.podcasts.p10590o.C140704ae) r13
            java.lang.Object r15 = com.google.common.util.concurrent.C60856cj.m92909r(r4)
            java.lang.String r0 = "getDone(preference)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r0)
            com.google.android.apps.search.podcasts.l.al r15 = (com.google.android.apps.search.podcasts.p10576l.C140450al) r15
            com.google.android.apps.search.podcasts.m.b.b r0 = com.google.android.apps.search.podcasts.p10549a.C139959d.m227604a(r11, r12, r13, r15)
            com.google.android.apps.search.podcasts.m.a.b r11 = com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b.f381972o
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.apps.search.podcasts.m.a.a r11 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140640a) r11
            java.lang.String r12 = r10.f170356g
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r13 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r13
            r12.getClass()
            r13.f381975b = r12
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r12 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r12
            r0.getClass()
            r12.f381974a = r0
            java.lang.String r12 = r10.f170352c
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r13 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r13
            r12.getClass()
            r13.f381977d = r12
            java.lang.String r12 = r10.f170363n
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r13 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r13
            r12.getClass()
            r13.f381979f = r12
            java.lang.String r12 = r10.f170353d
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r13 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r13
            r12.getClass()
            r13.f381978e = r12
            long r12 = r10.f170358i
            r11.copyOnWrite()
            com.google.protobuf.bv r15 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r15 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r15
            r15.f381980g = r12
            java.lang.Object r12 = com.google.common.util.concurrent.C60856cj.m92909r(r5)
            com.google.android.apps.search.podcasts.b.f.ac r12 = (com.google.android.apps.search.podcasts.p10550b.p10556f.C140088ac) r12
            r16 = 0
            if (r12 == 0) goto L_0x0119
            java.lang.String r15 = r0.f381995a
            java.lang.String r13 = r0.f382001g
            r19 = r1
            java.lang.String r1 = r10.f170356g
            com.google.android.apps.gsa.staticplugins.cl.b.j r20 = com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j.f273426e
            com.google.protobuf.bn r20 = r20.createBuilder()
            r21 = r2
            r2 = r20
            com.google.android.apps.gsa.staticplugins.cl.b.i r2 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97919i) r2
            r2.copyOnWrite()
            r20 = r4
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.staticplugins.cl.b.j r4 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j) r4
            r13.getClass()
            r22 = r5
            int r5 = r4.f273428a
            r18 = 2
            r5 = r5 | 2
            r4.f273428a = r5
            r4.f273430c = r13
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.staticplugins.cl.b.j r4 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j) r4
            r1.getClass()
            int r5 = r4.f273428a
            r5 = r5 | 4
            r4.f273428a = r5
            r4.f273431d = r1
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.gsa.staticplugins.cl.b.j r1 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j) r1
            r15.getClass()
            int r4 = r1.f273428a
            r5 = 1
            r4 = r4 | r5
            r1.f273428a = r4
            r1.f273429b = r15
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.apps.gsa.staticplugins.cl.b.j r1 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j) r1
            boolean r1 = r12.mo115451i(r1)
            goto L_0x0122
        L_0x0119:
            r19 = r1
            r21 = r2
            r20 = r4
            r22 = r5
            r1 = 0
        L_0x0122:
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r2 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r2
            r2.f381985l = r1
            java.lang.String r1 = r10.f170351b
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r2 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r2
            r1.getClass()
            r2.f381976c = r1
            long r1 = r10.f170355f
            r11.copyOnWrite()
            com.google.protobuf.bv r4 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r4 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r4
            r4.f381981h = r1
            com.google.protos.ac.a.d r1 = r10.f170364o
            if (r1 != 0) goto L_0x014a
            com.google.protos.ac.a.d r1 = com.google.protos.p4757ac.p4758a.C63105d.f170333c
        L_0x014a:
            java.lang.String r1 = r1.f170336b
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r2 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r2
            r1.getClass()
            r2.f381982i = r1
            int r1 = r10.f170361l
            int r1 = com.google.protos.p4757ac.p4758a.C63103b.m96180a(r1)
            if (r1 != 0) goto L_0x0162
        L_0x0160:
            r5 = 0
            goto L_0x0166
        L_0x0162:
            r2 = 2
            if (r1 != r2) goto L_0x0160
            r5 = 1
        L_0x0166:
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r1 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r1
            r1.f381983j = r5
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r3)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r14)
            com.google.android.apps.search.podcasts.o.ae r1 = (com.google.android.apps.search.podcasts.p10590o.C140704ae) r1
            java.lang.String r2 = r10.f170356g
            java.lang.String r4 = "it.guid"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            java.lang.String r4 = r0.f381995a
            com.google.android.apps.search.podcasts.o.ab r5 = com.google.android.apps.search.podcasts.p10590o.C140701ab.f382113c
            r4.getClass()
            com.google.protobuf.dn r1 = r1.f382120a
            boolean r12 = r1.containsKey(r4)
            if (r12 == 0) goto L_0x0195
            java.lang.Object r1 = r1.get(r4)
            r5 = r1
            com.google.android.apps.search.podcasts.o.ab r5 = (com.google.android.apps.search.podcasts.p10590o.C140701ab) r5
        L_0x0195:
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            com.google.android.apps.search.podcasts.o.u r1 = com.google.android.apps.search.podcasts.p10590o.C140728u.f382156c
            r2.getClass()
            com.google.protobuf.dn r4 = r5.f382116b
            boolean r5 = r4.containsKey(r2)
            if (r5 == 0) goto L_0x01ab
            java.lang.Object r1 = r4.get(r2)
            com.google.android.apps.search.podcasts.o.u r1 = (com.google.android.apps.search.podcasts.p10590o.C140728u) r1
        L_0x01ab:
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            int r1 = r1.f382159b
            com.google.at.j.a.w r1 = com.google.p4017at.p4082j.p4083a.C54458w.m87383a(r1)
            if (r1 != 0) goto L_0x01b8
            com.google.at.j.a.w r1 = com.google.p4017at.p4082j.p4083a.C54458w.UNRECOGNIZED
        L_0x01b8:
            java.lang.String r2 = "reactions\n      .getByFe…     .episodeReactionType"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r2 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r2
            int r1 = r1.getNumber()
            r2.f381986m = r1
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r7)
            com.google.android.apps.search.podcasts.player.e r1 = (com.google.android.apps.search.podcasts.player.C140787e) r1
            if (r1 == 0) goto L_0x01df
            com.google.android.apps.search.podcasts.m.a.b r2 = r1.f382282c
            if (r2 == 0) goto L_0x01df
            boolean r2 = com.google.android.apps.search.podcasts.p10601r.C140976e.m228931d(r2, r11)
            r4 = 1
            if (r2 != r4) goto L_0x01df
            r15 = 1
            goto L_0x01e0
        L_0x01df:
            r15 = 0
        L_0x01e0:
            r4 = 0
            if (r15 == 0) goto L_0x01fd
            long r12 = com.google.android.apps.search.podcasts.player.C140752a.m228544d(r1)
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x01fd
            j$.time.Duration r2 = p3186j$.time.Duration.ofMillis(r12)
            long r12 = r2.getSeconds()
            r11.copyOnWrite()
            com.google.protobuf.bv r2 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r2 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r2
            r2.f381981h = r12
        L_0x01fd:
            com.google.android.apps.search.podcasts.m.a.e r2 = com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e.f381988d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.search.podcasts.m.a.d r2 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140643d) r2
            if (r15 == 0) goto L_0x020e
            android.support.v4.media.session.PlaybackStateCompat r1 = r1.f382280a
            if (r1 == 0) goto L_0x020e
            int r1 = r1.f994a
            goto L_0x020f
        L_0x020e:
            r1 = 0
        L_0x020f:
            r2.copyOnWrite()
            com.google.protobuf.bv r12 = r2.instance
            com.google.android.apps.search.podcasts.m.a.e r12 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e) r12
            r12.f381991b = r1
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r8)
            com.google.android.apps.search.podcasts.b.e.q r1 = (com.google.android.apps.search.podcasts.p10550b.p10555e.C140075q) r1
            java.lang.String r12 = r0.f382001g
            java.lang.String r13 = r10.f170356g
            long r14 = r10.f170355f
            androidx.c.n r1 = r1.f380669a
            java.lang.Object r1 = r1.get(r12)
            com.google.android.apps.search.podcasts.b.e.p r1 = (com.google.android.apps.search.podcasts.p10550b.p10555e.C140074p) r1
            r12 = 0
            if (r1 == 0) goto L_0x026a
            androidx.c.n r1 = r1.f380666a
            java.lang.Object r1 = r1.get(r13)
            com.google.android.apps.gsa.staticplugins.cl.b.ak r1 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak) r1
            if (r1 == 0) goto L_0x026a
            boolean r13 = r1.f273310d
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x0242
            r12 = 1065353216(0x3f800000, float:1.0)
            goto L_0x026c
        L_0x0242:
            float r5 = r1.f273312f
            int r13 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r13 <= 0) goto L_0x024a
            r12 = r5
            goto L_0x026c
        L_0x024a:
            long r12 = r1.f273309c
            r16 = 0
            int r1 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x0262
            float r1 = (float) r12
            r12 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r12
            float r12 = (float) r14
            float r1 = r1 / r12
            float r1 = java.lang.Math.min(r1, r4)
            r4 = 0
            float r12 = java.lang.Math.max(r1, r4)
            goto L_0x026c
        L_0x0262:
            r4 = 0
            int r1 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x026b
            r12 = 1056964608(0x3f000000, float:0.5)
            goto L_0x026c
        L_0x026a:
            r4 = 0
        L_0x026b:
            r12 = 0
        L_0x026c:
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.search.podcasts.m.a.e r1 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e) r1
            r1.f381990a = r12
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r8)
            com.google.android.apps.search.podcasts.b.e.q r1 = (com.google.android.apps.search.podcasts.p10550b.p10555e.C140075q) r1
            java.lang.String r0 = r0.f382001g
            java.lang.String r4 = r10.f170356g
            long r0 = r1.mo115426b(r0, r4)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.search.podcasts.m.a.e r4 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e) r4
            r4.f381992c = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.apps.search.podcasts.m.a.e r0 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140644e) r0
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r1 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r1
            r0.getClass()
            r1.f381984k = r0
            com.google.android.apps.search.podcasts.b.b.ao r0 = r6.f380430a
            com.google.android.apps.gsa.staticplugins.cl.b.j r1 = com.google.android.apps.search.podcasts.p10601r.C140968d.m228923a(r11)
            com.google.common.base.ax r0 = r0.mo115395a(r1)
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x02c0
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.staticplugins.cl.b.d r0 = (com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97914d) r0
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.android.apps.search.podcasts.m.a.b r1 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r1
            r0.getClass()
            r1.f381987n = r0
        L_0x02c0:
            com.google.protobuf.bv r0 = r11.build()
            java.lang.String r1 = "episodeItemBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.apps.search.podcasts.m.a.b r0 = (com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b) r0
            r9.add(r0)
            r0 = r23
            r1 = r19
            r4 = r20
            r2 = r21
            r5 = r22
            goto L_0x0021
        L_0x02da:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.podcasts.p10549a.C139957b.call():java.lang.Object");
    }
}
