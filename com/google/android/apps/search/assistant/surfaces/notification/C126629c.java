package com.google.android.apps.search.assistant.surfaces.notification;

import android.content.Intent;

/* renamed from: com.google.android.apps.search.assistant.surfaces.notification.c */
/* compiled from: PG */
public final /* synthetic */ class C126629c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126630d f348725a;

    /* renamed from: b */
    public final /* synthetic */ Intent f348726b;

    public /* synthetic */ C126629c(C126630d dVar, Intent intent) {
        this.f348725a = dVar;
        this.f348726b = intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.apps.search.assistant.surfaces.notification.d r0 = r10.f348725a
            android.content.Intent r1 = r10.f348726b
            com.google.android.libraries.search.assistant.proactive.d r0 = r0.f348728b
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.surfaces.notification.C126630d.f348727a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "NTF.IntentProcessor"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "# Build cross-device timer client input"
            r5 = 37065(0x90c9, float:5.1939E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r3)
            java.lang.String r2 = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.EXTRA_ACTION_TO_EXECUTE"
            java.lang.String r2 = r1.getStringExtra(r2)
            java.lang.String r3 = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.EXTRA_TIMER_ID"
            java.lang.String r1 = r1.getStringExtra(r3)
            if (r2 == 0) goto L_0x01f3
            if (r1 == 0) goto L_0x01f3
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.surfaces.notification.C126630d.f348727a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r5, r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r5 = 37067(0x90cb, float:5.1942E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r5)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.String r5 = "# getCrossDeviceTimerFunctionCall with actionType: %s and timerId: %s"
            r3.mo56354G(r5, r2, r1)
            int r3 = r2.hashCode()
            r5 = -1880037160(0xffffffff8ff0e8d8, float:-2.3755515E-29)
            r6 = 1
            if (r3 == r5) goto L_0x0060
            r5 = 2127795215(0x7ed3940f, float:1.4061794E38)
            if (r3 == r5) goto L_0x0056
            goto L_0x006a
        L_0x0056:
            java.lang.String r3 = "addOneMinuteAction"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x006a
            r3 = 0
            goto L_0x006b
        L_0x0060:
            java.lang.String r3 = "stopAction"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x006a
            r3 = 1
            goto L_0x006b
        L_0x006a:
            r3 = -1
        L_0x006b:
            if (r3 == 0) goto L_0x00b6
            if (r3 != r6) goto L_0x0097
            com.google.knowledge.a.a.n r2 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.knowledge.a.a.m r2 = (com.google.knowledge.p4661a.p4662a.C61751m) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.knowledge.a.a.n r3 = (com.google.knowledge.p4661a.p4662a.C61752n) r3
            int r4 = r3.f166810a
            r4 = r4 | 4
            r3.f166810a = r4
            java.lang.String r4 = "Delete_timer"
            r3.f166811b = r4
            com.google.knowledge.a.a.h r1 = com.google.android.apps.search.assistant.surfaces.notification.C126630d.m207049b(r1)
            r2.mo58185d(r1)
            com.google.protobuf.bv r1 = r2.build()
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
            goto L_0x0175
        L_0x0097:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.notification.C126630d.f348727a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "Invalid action type: %s"
            r3 = 37068(0x90cc, float:5.1943E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r1, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid action type: "
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            com.google.knowledge.a.a.n r2 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.knowledge.a.a.m r2 = (com.google.knowledge.p4661a.p4662a.C61751m) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.knowledge.a.a.n r3 = (com.google.knowledge.p4661a.p4662a.C61752n) r3
            int r4 = r3.f166810a
            r4 = r4 | 4
            r3.f166810a = r4
            java.lang.String r4 = "Increment_timer"
            r3.f166811b = r4
            com.google.knowledge.a.a.h r1 = com.google.android.apps.search.assistant.surfaces.notification.C126630d.m207049b(r1)
            r2.mo58185d(r1)
            com.google.knowledge.a.a.h r1 = com.google.knowledge.p4661a.p4662a.C61746h.f166791g
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.knowledge.a.a.g r1 = (com.google.knowledge.p4661a.p4662a.C61745g) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.knowledge.a.a.h r3 = (com.google.knowledge.p4661a.p4662a.C61746h) r3
            int r4 = r3.f166793a
            r4 = r4 | 2
            r3.f166793a = r4
            java.lang.String r4 = "time_to_add"
            r3.f166796d = r4
            com.google.knowledge.a.a.j r3 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.knowledge.a.a.i r3 = (com.google.knowledge.p4661a.p4662a.C61747i) r3
            com.google.protos.an.b.k r4 = com.google.protos.p4850an.p4853b.C63367k.f171252c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.protos.an.b.j r4 = (com.google.protos.p4850an.p4853b.C63366j) r4
            com.google.protos.an.b.x r5 = com.google.protos.p4850an.p4853b.C63380x.f171276d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.protos.an.b.w r5 = (com.google.protos.p4850an.p4853b.C63379w) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.protos.an.b.x r7 = (com.google.protos.p4850an.p4853b.C63380x) r7
            r8 = 5
            r7.f171280c = r8
            int r8 = r7.f171278a
            r8 = r8 | 2
            r7.f171278a = r8
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.protos.an.b.x r7 = (com.google.protos.p4850an.p4853b.C63380x) r7
            int r8 = r7.f171278a
            r8 = r8 | r6
            r7.f171278a = r8
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7.f171279b = r8
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.protos.an.b.k r7 = (com.google.protos.p4850an.p4853b.C63367k) r7
            com.google.protobuf.bv r5 = r5.build()
            com.google.protos.an.b.x r5 = (com.google.protos.p4850an.p4853b.C63380x) r5
            r5.getClass()
            r7.f171255b = r5
            int r5 = r7.f171254a
            r5 = r5 | r6
            r7.f171254a = r5
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.knowledge.a.a.j r5 = (com.google.knowledge.p4661a.p4662a.C61748j) r5
            com.google.protobuf.bv r4 = r4.build()
            com.google.protos.an.b.k r4 = (com.google.protos.p4850an.p4853b.C63367k) r4
            r4.getClass()
            r5.f166803b = r4
            r4 = 8
            r5.f166802a = r4
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.knowledge.a.a.h r4 = (com.google.knowledge.p4661a.p4662a.C61746h) r4
            com.google.protobuf.bv r3 = r3.build()
            com.google.knowledge.a.a.j r3 = (com.google.knowledge.p4661a.p4662a.C61748j) r3
            r3.getClass()
            r4.f166797e = r3
            int r3 = r4.f166793a
            r3 = r3 | 4
            r4.f166793a = r3
            r2.mo58184c(r1)
            com.google.protobuf.bv r1 = r2.build()
            com.google.knowledge.a.a.n r1 = (com.google.knowledge.p4661a.p4662a.C61752n) r1
        L_0x0175:
            com.google.assistant.e.j.hd r2 = com.google.assistant.p3897e.p3921j.C52152hd.f136850c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.hc r2 = (com.google.assistant.p3897e.p3921j.C52151hc) r2
            com.google.protobuf.z r1 = r1.toByteString()
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.hd r3 = (com.google.assistant.p3897e.p3921j.C52152hd) r3
            r1.getClass()
            int r4 = r3.f136852a
            r4 = r4 | r6
            r3.f136852a = r4
            r3.f136853b = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.hd r1 = (com.google.assistant.p3897e.p3921j.C52152hd) r1
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.jz r2 = (com.google.assistant.p3897e.p3921j.C52228jz) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3
            int r4 = r3.f137059a
            r4 = r4 | r6
            r3.f137059a = r4
            java.lang.String r4 = "assistant.api.client_input.IntentInput"
            r3.f137060b = r4
            com.google.protobuf.z r1 = r1.toByteString()
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.ka r3 = (com.google.assistant.p3897e.p3921j.C52230ka) r3
            r1.getClass()
            int r4 = r3.f137059a
            r4 = r4 | 2
            r3.f137059a = r4
            r3.f137061c = r1
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.ka r1 = (com.google.assistant.p3897e.p3921j.C52230ka) r1
            com.google.assistant.e.j.du r2 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.ds r2 = (com.google.assistant.p3897e.p3921j.C51803ds) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.e.j.du r3 = (com.google.assistant.p3897e.p3921j.C51805du) r3
            int r4 = r3.f135926a
            r4 = r4 | r6
            r3.f135926a = r4
            java.lang.String r4 = "asst_input.INTENT"
            r3.f135927b = r4
            java.lang.String r3 = "intent_input"
            r2.mo53729a(r3, r1)
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.du r1 = (com.google.assistant.p3897e.p3921j.C51805du) r1
            r0.mo40072b(r1)
            return
        L_0x01f3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "actionType or timerId is null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.notification.C126629c.run():void");
    }
}
