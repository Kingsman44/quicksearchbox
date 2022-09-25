package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.d */
/* compiled from: PG */
public final /* synthetic */ class C114462d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C114469h f317368a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f317369b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f317370c;

    public /* synthetic */ C114462d(C114469h hVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f317368a = hVar;
        this.f317369b = cxVar;
        this.f317370c = cxVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0068 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r19 = this;
            r0 = r19
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.h r1 = r0.f317368a
            com.google.common.util.concurrent.cx r2 = r0.f317369b
            com.google.common.util.concurrent.cx r3 = r0.f317370c
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92909r(r3)
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r4 = r3.mo56113h()
            r5 = 8
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r3.mo56107c()
            com.google.assistant.at.b r4 = (com.google.assistant.p3861at.C49842b) r4
            int r4 = r4.f129521a
            r4 = r4 & r5
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r3.mo56107c()
            com.google.assistant.at.b r4 = (com.google.assistant.p3861at.C49842b) r4
            com.google.assistant.at.qd r4 = r4.f129524d
            if (r4 != 0) goto L_0x0035
            com.google.assistant.at.qd r4 = com.google.assistant.p3861at.C50251qd.f130676e
        L_0x0035:
            com.google.cg.k r4 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114469h.m189745a(r4)
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            boolean r7 = r3.mo56113h()
            if (r7 == 0) goto L_0x005e
            java.lang.Object r7 = r3.mo56107c()
            com.google.assistant.at.b r7 = (com.google.assistant.p3861at.C49842b) r7
            int r7 = r7.f129521a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x005e
            java.lang.Object r3 = r3.mo56107c()
            com.google.assistant.at.b r3 = (com.google.assistant.p3861at.C49842b) r3
            com.google.assistant.at.qd r3 = r3.f129525e
            if (r3 != 0) goto L_0x0059
            com.google.assistant.at.qd r3 = com.google.assistant.p3861at.C50251qd.f130676e
        L_0x0059:
            com.google.cg.k r3 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114469h.m189745a(r3)
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0068:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0298
            java.lang.Object r8 = r2.next()
            com.google.android.gms.reminders.model.Task r8 = (com.google.android.gms.reminders.model.Task) r8
            com.google.android.gms.reminders.model.Location r9 = r8.mo122074k()
            if (r9 != 0) goto L_0x008f
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114469h.f317409a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = "AssistantReminders"
            r8.mo56378ag(r9, r10)
            java.lang.String r9 = "Not a location reminder."
            r10 = 28957(0x711d, float:4.0577E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
            goto L_0x0068
        L_0x008f:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Boolean r11 = r8.mo122078o()
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0265
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            java.lang.Boolean r11 = r8.mo122079p()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00a9
            goto L_0x0265
        L_0x00a9:
            java.lang.Integer r10 = r9.mo122021l()
            r11 = 2
            r14 = 1
            if (r10 == 0) goto L_0x00c2
            java.lang.Integer r9 = r9.mo122021l()
            int r9 = r9.intValue()
            if (r9 == r14) goto L_0x00c0
            if (r9 == r11) goto L_0x00be
            goto L_0x010e
        L_0x00be:
            r10 = r3
            goto L_0x010f
        L_0x00c0:
            r10 = r4
            goto L_0x010f
        L_0x00c2:
            java.lang.Double r10 = r9.mo122019j()
            if (r10 == 0) goto L_0x010e
            java.lang.Double r10 = r9.mo122020k()
            if (r10 == 0) goto L_0x010e
            com.google.cg.k r10 = com.google.p4479cg.C58079k.f155250c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.cg.j r10 = (com.google.p4479cg.C58078j) r10
            java.lang.Double r15 = r9.mo122019j()
            double r12 = r15.doubleValue()
            r10.copyOnWrite()
            com.google.protobuf.bv r15 = r10.instance
            com.google.cg.k r15 = (com.google.p4479cg.C58079k) r15
            r15.f155252a = r12
            java.lang.Double r12 = r9.mo122020k()
            double r12 = r12.doubleValue()
            r10.copyOnWrite()
            com.google.protobuf.bv r15 = r10.instance
            com.google.cg.k r15 = (com.google.p4479cg.C58079k) r15
            r15.f155253b = r12
            com.google.protobuf.bv r10 = r10.build()
            com.google.cg.k r10 = (com.google.p4479cg.C58079k) r10
            java.lang.Integer r12 = r9.mo122022m()
            if (r12 == 0) goto L_0x010f
            java.lang.Integer r9 = r9.mo122022m()
            int r9 = r9.intValue()
            double r12 = (double) r9
            goto L_0x0111
        L_0x010e:
            r10 = 0
        L_0x010f:
            r12 = 4632233691727265792(0x4049000000000000, double:50.0)
        L_0x0111:
            if (r10 == 0) goto L_0x0068
            com.google.android.apps.gsa.reminders.a.a r9 = r1.f317415g
            android.content.Context r15 = r1.f317411c
            com.google.android.libraries.f.a r6 = r1.f317412d
            long r5 = r6.mo26870b()
            com.google.assistant.e.j.aas r5 = r9.mo77743a(r15, r8, r5)
            if (r5 == 0) goto L_0x0294
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ar r6 = r1.f317416h
            com.google.bj.b.r r8 = com.google.p4184bj.p4189b.C55901r.f148744j
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.bj.b.o r8 = (com.google.p4184bj.p4189b.C55898o) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.bj.b.r r9 = (com.google.p4184bj.p4189b.C55901r) r9
            int r15 = r9.f148746a
            r15 = r15 | 64
            r9.f148746a = r15
            r9.f148753h = r12
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.bj.b.r r9 = (com.google.p4184bj.p4189b.C55901r) r9
            int r15 = r9.f148746a
            r15 = r15 | 32
            r9.f148746a = r15
            r9.f148752g = r12
            double r12 = r10.f155252a
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.bj.b.r r9 = (com.google.p4184bj.p4189b.C55901r) r9
            int r15 = r9.f148746a
            r16 = 8
            r15 = r15 | 8
            r9.f148746a = r15
            r17 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            double r12 = r12 * r17
            int r12 = (int) r12
            r9.f148750e = r12
            double r9 = r10.f155253b
            r8.copyOnWrite()
            com.google.protobuf.bv r12 = r8.instance
            com.google.bj.b.r r12 = (com.google.p4184bj.p4189b.C55901r) r12
            int r13 = r12.f148746a
            r13 = r13 | 16
            r12.f148746a = r13
            double r9 = r9 * r17
            int r9 = (int) r9
            r12.f148751f = r9
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.bj.b.r r9 = (com.google.p4184bj.p4189b.C55901r) r9
            r9.f148748c = r14
            int r10 = r9.f148746a
            r10 = r10 | r11
            r9.f148746a = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.bj.b.r r9 = (com.google.p4184bj.p4189b.C55901r) r9
            r9.f148747b = r11
            int r10 = r9.f148746a
            r10 = r10 | r14
            r9.f148746a = r10
            com.google.android.apps.gsa.search.core.i.t r9 = r1.f317419k
            com.google.android.apps.gsa.shared.m.f r10 = com.google.android.apps.gsa.shared.p7066m.C90052dd.f248932c
            long r9 = r9.mo79743a(r10)
            j$.time.Duration r9 = p3186j$.time.Duration.ofMinutes(r9)
            long r9 = r9.toMillis()
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.bj.b.r r11 = (com.google.p4184bj.p4189b.C55901r) r11
            int r12 = r11.f148746a
            r13 = 4
            r12 = r12 | r13
            r11.f148746a = r12
            r11.f148749d = r9
            com.google.protobuf.bv r8 = r8.build()
            com.google.bj.b.r r8 = (com.google.p4184bj.p4189b.C55901r) r8
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.assistant.e.j.aaj r5 = (com.google.assistant.p3897e.p3921j.aaj) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r9 = r5.instance
            com.google.assistant.e.j.aas r9 = (com.google.assistant.p3897e.p3921j.aas) r9
            r9.f134664b = r13
            int r10 = r9.f134663a
            r10 = r10 | r14
            r9.f134663a = r10
            com.google.assistant.ag.c.hw r9 = com.google.assistant.p3803ag.p3809c.C49138hw.f127068d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.ag.c.hh r9 = (com.google.assistant.p3803ag.p3809c.C49123hh) r9
            com.google.assistant.ag.c.u r10 = com.google.assistant.p3803ag.p3809c.C49151u.f127105d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.ag.c.r r10 = (com.google.assistant.p3803ag.p3809c.C49148r) r10
            com.google.bj.b.j r11 = com.google.p4184bj.p4189b.C55893j.f148728h
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.bj.b.g r11 = (com.google.p4184bj.p4189b.C55890g) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.bj.b.j r12 = (com.google.p4184bj.p4189b.C55893j) r12
            r15 = 5
            r12.f148731b = r15
            int r15 = r12.f148730a
            r15 = r15 | r14
            r12.f148730a = r15
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.bj.b.j r12 = (com.google.p4184bj.p4189b.C55893j) r12
            r8.getClass()
            r12.f148734e = r8
            int r8 = r12.f148730a
            r8 = r8 | r13
            r12.f148730a = r8
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.assistant.ag.c.u r8 = (com.google.assistant.p3803ag.p3809c.C49151u) r8
            com.google.protobuf.bv r11 = r11.build()
            com.google.bj.b.j r11 = (com.google.p4184bj.p4189b.C55893j) r11
            r11.getClass()
            r8.f127108b = r11
            int r11 = r8.f127107a
            r11 = r11 | r14
            r8.f127107a = r11
            r9.copyOnWrite()
            com.google.protobuf.bv r8 = r9.instance
            com.google.assistant.ag.c.hw r8 = (com.google.assistant.p3803ag.p3809c.C49138hw) r8
            com.google.protobuf.bv r10 = r10.build()
            com.google.assistant.ag.c.u r10 = (com.google.assistant.p3803ag.p3809c.C49151u) r10
            r10.getClass()
            r8.f127071b = r10
            r10 = 8
            r8.f127070a = r10
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.e.j.aas r8 = (com.google.assistant.p3897e.p3921j.aas) r8
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.ag.c.hw r9 = (com.google.assistant.p3803ag.p3809c.C49138hw) r9
            r9.getClass()
            com.google.protobuf.cq r11 = r8.f134673k
            boolean r12 = r11.mo58948c()
            if (r12 != 0) goto L_0x0252
            com.google.protobuf.cq r11 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r11)
            r8.f134673k = r11
        L_0x0252:
            com.google.protobuf.cq r8 = r8.f134673k
            r8.add(r9)
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.j.aas r5 = (com.google.assistant.p3897e.p3921j.aas) r5
            com.google.common.util.concurrent.cx r5 = r6.mo101312b(r5)
            r7.add(r5)
            goto L_0x0294
        L_0x0265:
            r10 = 8
            com.google.assistant.e.j.aas r5 = com.google.assistant.p3897e.p3921j.aas.f134661u
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.e.j.aaj r5 = (com.google.assistant.p3897e.p3921j.aaj) r5
            com.google.android.gms.reminders.model.TaskId r6 = r8.mo122077n()
            java.lang.String r6 = r6.mo122058h()
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.e.j.aas r8 = (com.google.assistant.p3897e.p3921j.aas) r8
            r6.getClass()
            int r9 = r8.f134663a
            r9 = r9 | 256(0x100, float:3.59E-43)
            r8.f134663a = r9
            r8.f134670h = r6
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.e.j.aas r5 = (com.google.assistant.p3897e.p3921j.aas) r5
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ar r6 = r1.f317416h
            r6.mo101314d(r5)
        L_0x0294:
            r5 = 8
            goto L_0x0068
        L_0x0298:
            com.google.common.util.concurrent.cf r2 = com.google.common.util.concurrent.C60856cj.m92892a(r7)
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.a r3 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114371a.f317111a
            java.util.concurrent.Executor r1 = r1.f317418j
            com.google.common.util.concurrent.cx r1 = r2.mo57334a(r3, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114462d.mo18058a():com.google.common.util.concurrent.cx");
    }
}
