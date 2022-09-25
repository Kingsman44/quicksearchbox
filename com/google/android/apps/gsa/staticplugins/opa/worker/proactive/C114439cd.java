package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.search.core.p6491a.C84373s;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.cd */
/* compiled from: PG */
public final /* synthetic */ class C114439cd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317313a;

    /* renamed from: b */
    public final /* synthetic */ aas f317314b;

    /* renamed from: c */
    public final /* synthetic */ C84373s f317315c;

    public /* synthetic */ C114439cd(C114464db dbVar, aas aas, C84373s sVar) {
        this.f317313a = dbVar;
        this.f317314b = aas;
        this.f317315c = sVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r10) {
        /*
            r9 = this;
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.db r0 = r9.f317313a
            com.google.assistant.e.j.aas r1 = r9.f317314b
            com.google.android.apps.gsa.search.core.a.s r2 = r9.f317315c
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x001b
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.da r10 = new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.da
            com.google.assistant.e.j.e.fo r0 = com.google.assistant.p3897e.p3921j.p3926e.C51962fo.DUPLICATE
            r10.<init>(r0)
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92899h(r10)
            goto L_0x021d
        L_0x001b:
            com.google.assistant.e.j.aap r10 = r1.f134676n
            if (r10 != 0) goto L_0x0021
            com.google.assistant.e.j.aap r10 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x0021:
            int r10 = r10.f134652a
            r10 = r10 & 4
            r3 = 1
            if (r10 == 0) goto L_0x0196
            com.google.assistant.e.j.aap r10 = r1.f134676n
            if (r10 != 0) goto L_0x002e
            com.google.assistant.e.j.aap r10 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x002e:
            int r10 = r10.f134655d
            com.google.protos.f.r.c r4 = com.google.protos.p4985f.p5036r.C65317c.f176650b
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protos.f.r.a r4 = (com.google.protos.p4985f.p5036r.C65313a) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.protos.f.r.c r5 = (com.google.protos.p4985f.p5036r.C65317c) r5
            r5.f176652a = r10
            com.google.protobuf.bv r10 = r4.build()
            com.google.protos.f.r.c r10 = (com.google.protos.p4985f.p5036r.C65317c) r10
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.f317374a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "ProactiveNotifications"
            r4.mo56378ag(r5, r6)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            r5 = 29020(0x715c, float:4.0666E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            int r5 = r10.f176652a
            int r5 = com.google.protos.p4985f.p5036r.C65316b.m96666c(r5)
            if (r5 != 0) goto L_0x0067
            r5 = 1
        L_0x0067:
            java.lang.String r7 = "#getSmartspaceActionForNotification() AsyncInteractionType %s"
            java.lang.String r5 = com.google.protos.p4985f.p5036r.C65316b.m96664a(r5)
            r4.mo56389s(r7, r5)
            int r4 = r10.f176652a
            int r5 = com.google.protos.p4985f.p5036r.C65316b.m96666c(r4)
            r7 = 2
            if (r5 != 0) goto L_0x007a
            goto L_0x00a4
        L_0x007a:
            r8 = 209(0xd1, float:2.93E-43)
            if (r5 != r8) goto L_0x00a4
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.f317374a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r4, r6)
            java.lang.String r4 = "#getSmartspaceActionForNotification() Commute Notification."
            r5 = 29027(0x7163, float:4.0675E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r5)).mo56386p(r4)
            com.google.android.libraries.search.logging.d.kp r10 = r0.f317375A
            java.lang.String r4 = "COMMUTE_TIME"
            r10.mo41672F(r4)
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.d r10 = r0.f317376B
            java.lang.String r4 = "Smartspace_Commute_Notification_Received"
            com.google.android.libraries.performance.primes.au r4 = com.google.android.libraries.performance.primes.C31164au.m58092b(r4)
            r10.mo110242a(r4)
            goto L_0x0197
        L_0x00a4:
            int r5 = com.google.protos.p4985f.p5036r.C65316b.m96666c(r4)
            if (r5 != 0) goto L_0x00ab
            r5 = 1
        L_0x00ab:
            r8 = 210(0xd2, float:2.94E-43)
            if (r5 == r8) goto L_0x0171
            r8 = 230(0xe6, float:3.22E-43)
            if (r5 == r8) goto L_0x0171
            r8 = 233(0xe9, float:3.27E-43)
            if (r5 == r8) goto L_0x0171
            r8 = 231(0xe7, float:3.24E-43)
            if (r5 == r8) goto L_0x0171
            r8 = 232(0xe8, float:3.25E-43)
            if (r5 != r8) goto L_0x00c1
            goto L_0x0171
        L_0x00c1:
            int r5 = com.google.protos.p4985f.p5036r.C65316b.m96666c(r4)
            if (r5 != 0) goto L_0x00c8
            goto L_0x00cc
        L_0x00c8:
            r8 = 387(0x183, float:5.42E-43)
            if (r5 == r8) goto L_0x015e
        L_0x00cc:
            int r4 = com.google.protos.p4985f.p5036r.C65316b.m96666c(r4)
            if (r4 != 0) goto L_0x00d3
            goto L_0x00d9
        L_0x00d3:
            r5 = 388(0x184, float:5.44E-43)
            if (r4 != r5) goto L_0x00d9
            goto L_0x015e
        L_0x00d9:
            boolean r4 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.m189730l(r10)
            if (r4 == 0) goto L_0x00f3
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.f317374a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r4, r6)
            java.lang.String r4 = "#getSmartspaceActionForNotification() Flight Landing Notification."
            r5 = 29024(0x7160, float:4.0671E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0197
        L_0x00f3:
            boolean r4 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.m189731m(r10)
            if (r4 == 0) goto L_0x010d
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.f317374a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r4, r6)
            java.lang.String r4 = "#getSmartspaceActionForNotification() Hotel Notification."
            r5 = 29023(0x715f, float:4.067E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0197
        L_0x010d:
            int r10 = r10.f176652a
            int r10 = com.google.protos.p4985f.p5036r.C65316b.m96666c(r10)
            if (r10 != 0) goto L_0x0116
            goto L_0x012d
        L_0x0116:
            r4 = 397(0x18d, float:5.56E-43)
            if (r10 != r4) goto L_0x012d
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.f317374a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r4, r6)
            java.lang.String r4 = "#getSmartspaceActionForNotification() Reminder Notification."
            r5 = 29022(0x715e, float:4.0668E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0197
        L_0x012d:
            com.google.protobuf.bt r10 = com.google.assistant.p3897e.p3921j.abu.f134764l
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r1.mo58887l(r10)
            com.google.protobuf.bf r4 = r1.f169962ag
            com.google.protobuf.bs r10 = r10.f169971d
            boolean r10 = r4.mo58857o(r10)
            if (r10 == 0) goto L_0x0196
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.f317374a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r4, r6)
            java.lang.String r4 = "#getSmartspaceActionForNotification() Notification with Smartspace extension."
            r5 = 29021(0x715d, float:4.0667E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.gsa.search.core.i.t r10 = r0.f317393n
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247907aV
            boolean r10 = r10.mo79746e(r4)
            if (r10 == 0) goto L_0x0196
            r7 = 3
            goto L_0x0197
        L_0x015e:
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.f317374a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r4, r6)
            java.lang.String r4 = "#getSmartspaceActionForNotification() Grocery Notification."
            r5 = 29025(0x7161, float:4.0673E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r5)).mo56386p(r4)
            goto L_0x0197
        L_0x0171:
            com.google.common.f.e r10 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114464db.f317374a
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r4, r6)
            java.lang.String r4 = "#getSmartspaceActionForNotification() TTL Notification."
            r5 = 29026(0x7162, float:4.0674E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r5)).mo56386p(r4)
            com.google.android.libraries.search.logging.d.kp r10 = r0.f317375A
            java.lang.String r4 = "TIME_TO_LEAVE"
            r10.mo41672F(r4)
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.d r10 = r0.f317376B
            java.lang.String r4 = "Smartspace_TimeToLeave_Notification_Received"
            com.google.android.libraries.performance.primes.au r4 = com.google.android.libraries.performance.primes.C31164au.m58092b(r4)
            r10.mo110242a(r4)
            goto L_0x0197
        L_0x0196:
            r7 = 1
        L_0x0197:
            if (r7 != r3) goto L_0x019a
            goto L_0x01e2
        L_0x019a:
            com.google.android.apps.gsa.search.core.i.t r10 = r0.f317393n
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90017bw.f247934aw
            boolean r10 = r10.mo79746e(r4)
            if (r10 == 0) goto L_0x01cd
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bj r10 = r0.f317399t
            com.google.assistant.e.j.aap r4 = r1.f134676n
            if (r4 != 0) goto L_0x01ac
            com.google.assistant.e.j.aap r4 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x01ac:
            com.google.protobuf.ch r4 = r4.f134656e
            dagger.a r10 = r10.f317258d
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.libraries.phenotype.client.a.g r10 = (com.google.android.libraries.phenotype.client.p2420a.C31639g) r10
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bh r5 = com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114416bh.f317252a
            j$.util.stream.IntStream r4 = r4.mapToInt(r5)
            int[] r4 = r4.toArray()
            java.lang.String r5 = "assistant_notifications"
            java.lang.String r6 = "ANDROID_GSA"
            com.google.common.util.concurrent.cx r10 = r10.mo37290d(r4, r5, r6)
            goto L_0x01cf
        L_0x01cd:
            com.google.common.util.concurrent.cx r10 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
        L_0x01cf:
            com.google.common.util.concurrent.cx[] r3 = new com.google.common.util.concurrent.C60870cx[r3]
            r4 = 0
            r3[r4] = r10
            com.google.apps.tiktok.tracing.contrib.b.j r10 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84751b(r3)
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bv r3 = new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bv
            r3.<init>(r0, r7, r1)
            java.util.concurrent.Executor r4 = r0.f317384e
            r10.mo51521b(r3, r4)
        L_0x01e2:
            com.google.assistant.e.j.aap r10 = r1.f134676n
            if (r10 != 0) goto L_0x01e9
            com.google.assistant.e.j.aap r3 = com.google.assistant.p3897e.p3921j.aap.f134650h
            goto L_0x01ea
        L_0x01e9:
            r3 = r10
        L_0x01ea:
            int r3 = r3.f134652a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x01ff
            if (r10 != 0) goto L_0x01f4
            com.google.assistant.e.j.aap r10 = com.google.assistant.p3897e.p3921j.aap.f134650h
        L_0x01f4:
            int r10 = r10.f134655d
            r3 = 364(0x16c, float:5.1E-43)
            if (r10 != r3) goto L_0x01ff
            com.google.android.apps.gsa.search.core.al.db.b r10 = r0.f317403x
            r10.mo78852e(r1)
        L_0x01ff:
            dagger.a r10 = r0.f317397r
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.libraries.search.assistant.proactive.g.b r10 = (com.google.android.libraries.search.assistant.proactive.p2775g.C36281b) r10
            r10.mo40091c(r1)
            com.google.common.util.concurrent.cx r10 = r0.mo101325b(r1)
            com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ci r3 = new com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ci
            r3.<init>(r0, r1, r2)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r3)
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60922j.m93045h(r10, r1, r0)
        L_0x021d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114439cd.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
