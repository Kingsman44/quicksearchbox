package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8510h;

import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.c */
/* compiled from: PG */
public final /* synthetic */ class C111526c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C111527d f310204a;

    public /* synthetic */ C111526c(C111527d dVar) {
        this.f310204a = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        if (r10 == r11.getNumber()) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.d r1 = r0.f310204a
            r2 = r19
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            dagger.a r3 = r1.f310206a
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.ap r3 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap) r3
            j$.util.Optional r3 = r3.mo99538i()
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0024
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es.f314036b
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0206
        L_0x0024:
            com.google.android.libraries.f.a r4 = r1.f310207b
            long r4 = r4.mo26870b()
            j$.time.Instant r4 = p3186j$.time.Instant.ofEpochMilli(r4)
            j$.time.ZoneId r5 = p3186j$.time.ZoneId.systemDefault()
            j$.time.ZonedDateTime r4 = r4.atZone(r5)
            j$.time.LocalDateTime r4 = r4.mo43202c()
            com.google.common.b.gp r5 = com.google.common.p4522b.C58485gu.m89837e()
            java.lang.Object r3 = r3.get()
            com.google.assistant.as.ac r3 = (com.google.assistant.p3860as.C49740ac) r3
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01eb
            boolean r2 = r1.f310209d
            if (r2 == 0) goto L_0x0056
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ff r2 = r1.f310211f
            boolean r2 = r2.mo100143i()
            if (r2 == 0) goto L_0x01eb
        L_0x0056:
            com.google.assistant.as.be r2 = r3.f128434a
            if (r2 != 0) goto L_0x005c
            com.google.assistant.as.be r2 = com.google.assistant.p3860as.C49769be.f128515c
        L_0x005c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            long r6 = r1.f310210e
            com.google.protobuf.cq r8 = r2.f128518b
            java.util.Iterator r8 = r8.iterator()
        L_0x0069:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x01e6
            java.lang.Object r9 = r8.next()
            com.google.assistant.as.bc r9 = (com.google.assistant.p3860as.C49767bc) r9
            int r10 = r9.f128508a
            r11 = r10 & 4
            if (r11 == 0) goto L_0x0081
        L_0x007b:
            r16 = r1
            r17 = r2
            goto L_0x01dc
        L_0x0081:
            r11 = r10 & 16
            if (r11 != 0) goto L_0x007b
            r10 = r10 & 1
            if (r10 == 0) goto L_0x0091
            int r10 = r4.getHour()
            int r11 = r9.f128510c
            if (r10 != r11) goto L_0x007b
        L_0x0091:
            int r10 = r9.f128508a
            r10 = r10 & 2
            if (r10 == 0) goto L_0x00af
            j$.time.DayOfWeek r10 = r4.getDayOfWeek()
            int r10 = r10.getValue()
            int r11 = r9.f128511d
            com.google.cg.i r11 = com.google.p4479cg.C58077i.m88832a(r11)
            if (r11 != 0) goto L_0x00a9
            com.google.cg.i r11 = com.google.p4479cg.C58077i.DAY_OF_WEEK_UNSPECIFIED
        L_0x00a9:
            int r11 = r11.getNumber()
            if (r10 != r11) goto L_0x007b
        L_0x00af:
            com.google.protobuf.cq r9 = r9.f128509b
            java.util.Iterator r9 = r9.iterator()
        L_0x00b5:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01d8
            java.lang.Object r10 = r9.next()
            com.google.assistant.as.bg r10 = (com.google.assistant.p3860as.C49771bg) r10
            r11 = 0
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x00cb
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x01e8
        L_0x00cb:
            com.google.assistant.as.bi r11 = r10.f128523b
            if (r11 != 0) goto L_0x00d1
            com.google.assistant.as.bi r11 = com.google.assistant.p3860as.C49773bi.f128525b
        L_0x00d1:
            double r11 = r11.f128527a
            double r13 = r1.f310208c
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00dc
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00b5
        L_0x00dc:
            int r10 = r10.f128522a
            com.google.protobuf.cq r13 = r2.f128517a
            int r13 = r13.size()
            if (r10 < r13) goto L_0x00e9
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00b5
        L_0x00e9:
            com.google.protobuf.cq r13 = r2.f128517a
            java.lang.Object r10 = r13.get(r10)
            com.google.assistant.as.bm r10 = (com.google.assistant.p3860as.C49777bm) r10
            int r13 = r10.f128537b
            r14 = 1
            if (r13 == r14) goto L_0x00fc
        L_0x00f6:
            r16 = r1
            r17 = r2
            goto L_0x01d0
        L_0x00fc:
            com.google.common.f.aa r13 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r13 = r10.f128537b
            if (r13 != r14) goto L_0x0107
            java.lang.Object r10 = r10.f128538c
            com.google.assistant.as.au r10 = (com.google.assistant.p3860as.C49758au) r10
            goto L_0x0109
        L_0x0107:
            com.google.assistant.as.au r10 = com.google.assistant.p3860as.C49758au.f128490b
        L_0x0109:
            com.google.protobuf.cq r13 = r10.f128492a
            int r13 = r13.size()
            if (r13 <= 0) goto L_0x00f6
            com.google.protobuf.cq r10 = r10.f128492a
            r13 = 0
            java.lang.Object r10 = r10.get(r13)
            com.google.assistant.as.bk r10 = (com.google.assistant.p3860as.C49775bk) r10
            java.lang.String r10 = r10.f128531a
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.a r15 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.a
            r15.<init>(r10, r11)
            p3186j$.util.Collection.EL.removeIf(r3, r15)
            j$.util.stream.Stream r15 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.b r13 = new com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.b
            r13.<init>(r10)
            boolean r13 = r15.noneMatch(r13)
            if (r13 == 0) goto L_0x00f6
            com.google.assistant.ad.d.aj r13 = com.google.assistant.p3781ad.p3789d.C48576aj.f125494h
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.ad.d.ae r13 = (com.google.assistant.p3781ad.p3789d.C48571ae) r13
            com.google.assistant.ad.d.ai r15 = com.google.assistant.p3781ad.p3789d.C48575ai.PRIVATE
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.assistant.ad.d.aj r14 = (com.google.assistant.p3781ad.p3789d.C48576aj) r14
            int r15 = r15.f125493d
            r14.f125498c = r15
            int r15 = r14.f125496a
            r15 = r15 | 2
            r14.f125496a = r15
            com.google.protobuf.bv r13 = r13.build()
            com.google.assistant.ad.d.aj r13 = (com.google.assistant.p3781ad.p3789d.C48576aj) r13
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ey r14 = r1.mo100187q()
            r14.mo100164i(r10)
            r15 = 10050(0x2742, float:1.4083E-41)
            r14.mo100180y(r15)
            com.google.assistant.ad.d.an r15 = com.google.assistant.p3781ad.p3789d.C48580an.HABIT_QUERY
            r14.mo100177v(r15)
            r15 = 10001(0x2711, float:1.4014E-41)
            r14.mo100167l(r15)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.by r15 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113300by.QUERY_TEXT
            r14.mo100172q(r15)
            com.google.assistant.ad.d.al r15 = com.google.assistant.p3781ad.p3789d.C48578al.f125505d
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.assistant.ad.d.ak r15 = (com.google.assistant.p3781ad.p3789d.C48577ak) r15
            r15.copyOnWrite()
            com.google.protobuf.bv r0 = r15.instance
            com.google.assistant.ad.d.al r0 = (com.google.assistant.p3781ad.p3789d.C48578al) r0
            r10.getClass()
            r16 = r1
            int r1 = r0.f125507a
            r17 = r2
            r2 = 1
            r1 = r1 | r2
            r0.f125507a = r1
            r0.f125508b = r10
            r15.mo53158a(r13)
            com.google.protobuf.bv r0 = r15.build()
            com.google.assistant.ad.d.al r0 = (com.google.assistant.p3781ad.p3789d.C48578al) r0
            r14.mo100178w(r0)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cl[] r0 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113341cl[r2]
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.cl r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111583h.f310313a
            r2 = 0
            r0[r2] = r1
            r14.mo100171p(r0)
            r14.mo100174s(r11)
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.i r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i.DISPLAY_TEXT
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.k r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k.f311414b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.h r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112141h) r1
            java.lang.String r2 = com.google.common.base.C58890d.m90988c(r10)
            r10 = 1065353216(0x3f800000, float:1.0)
            r1.mo99420b(r2, r10)
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.k r1 = (com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112144k) r1
            com.google.common.b.hd r0 = com.google.common.p4522b.C58495hd.m89900n(r0, r1)
            r14.mo100173r(r0)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ez r0 = r14.mo100156a()
            r3.add(r0)
            r0 = -1
            long r6 = r6 + r0
        L_0x01d0:
            r0 = r18
            r1 = r16
            r2 = r17
            goto L_0x00b5
        L_0x01d8:
            r0 = r18
            goto L_0x0069
        L_0x01dc:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0 = r18
            r1 = r16
            r2 = r17
            goto L_0x0069
        L_0x01e6:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x01e8:
            r5.mo55396h(r3)
        L_0x01eb:
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.er r0 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es.m187705p()
            com.google.common.b.gu r1 = r5.mo55394f()
            java.util.Map r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj.m187496d(r1)
            com.google.common.b.hd r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj.m187495c(r1)
            r0.mo100096f(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.es r0 = r0.mo100091a()
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0206:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8510h.C111526c.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
