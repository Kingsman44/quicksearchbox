package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.cm */
/* compiled from: PG */
public final /* synthetic */ class C35584cm implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35591ct f93409a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f93410b;

    public /* synthetic */ C35584cm(C35591ct ctVar, C51809dy dyVar) {
        this.f93409a = ctVar;
        this.f93410b = dyVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.libraries.search.assistant.performer.communication.ct r0 = r7.f93409a
            com.google.assistant.e.j.dy r1 = r7.f93410b
            j$.util.Optional r8 = (p3186j$.util.Optional) r8
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x0022
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.performer.communication.C35591ct.f93419a
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r0 = "Failed to bind to the incoming call InCallService"
            r1 = 51652(0xc9c4, float:7.238E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r1)).mo56386p(r0)
            com.google.assistant.e.j.kf r8 = com.google.assistant.p3897e.p3921j.C52235kf.ABORTED
            com.google.assistant.e.j.ec r8 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r8)
            goto L_0x00d5
        L_0x0022:
            java.lang.Object r8 = r8.get()
            com.google.android.libraries.search.assistant.performer.communication.cs r8 = (com.google.android.libraries.search.assistant.performer.communication.C35590cs) r8
            com.google.assistant.e.j.ec r2 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94545b
            java.lang.String r1 = r1.f135936b
            int r3 = r1.hashCode()
            r4 = -1842781172(0xffffffff9229640c, float:-5.3450314E-28)
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L_0x0047
            r4 = -1789014737(0xffffffff955dcd2f, float:-4.4792456E-26)
            if (r3 == r4) goto L_0x003d
            goto L_0x0051
        L_0x003d:
            java.lang.String r3 = "call.REJECT"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            r1 = 1
            goto L_0x0052
        L_0x0047:
            java.lang.String r3 = "call.PICKUP"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0051
            r1 = 0
            goto L_0x0052
        L_0x0051:
            r1 = -1
        L_0x0052:
            if (r1 == 0) goto L_0x0081
            if (r1 == r5) goto L_0x005d
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.UNIMPLEMENTED
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r1)
            goto L_0x00cd
        L_0x005d:
            android.telecom.InCallService r1 = r8.f93418b
            com.google.common.f.e r3 = com.google.android.libraries.search.assistant.performer.communication.C35591ct.f93419a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Rejecting the incoming call"
            r5 = 51657(0xc9c9, float:7.2387E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            java.util.List r1 = r1.getCalls()
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.libraries.search.assistant.performer.communication.cp r3 = com.google.android.libraries.search.assistant.performer.communication.C35587cp.f93414a
            j$.util.stream.Stream r1 = r1.filter(r3)
            com.google.android.libraries.search.assistant.performer.communication.cq r3 = com.google.android.libraries.search.assistant.performer.communication.C35588cq.f93415a
            r1.forEach(r3)
            goto L_0x00cc
        L_0x0081:
            android.telecom.InCallService r1 = r8.f93418b
            com.google.common.f.e r3 = com.google.android.libraries.search.assistant.performer.communication.C35591ct.f93419a
            com.google.common.f.x r3 = r3.mo56224b()
            java.lang.String r4 = "Picking up the incoming call"
            r5 = 51656(0xc9c8, float:7.2385E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            java.util.List r3 = r1.getCalls()
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.libraries.search.assistant.performer.communication.cl r4 = com.google.android.libraries.search.assistant.performer.communication.C35583cl.f93408a
            j$.util.stream.Stream r3 = r3.filter(r4)
            j$.util.Optional r3 = r3.findFirst()
            boolean r4 = r3.isPresent()
            if (r4 == 0) goto L_0x00cc
            java.lang.Object r3 = r3.get()
            android.telecom.Call r3 = (android.telecom.Call) r3
            r3.answer(r6)
            r3 = 8
            r1.setAudioRoute(r3)
            android.content.Context r1 = r0.f93421c
            com.google.android.libraries.search.m.b.b r3 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_ASSISTANT_ACCL
            android.content.Context r1 = com.google.android.libraries.search.p3047m.p3054d.C39239a.m68666a(r1, r3)
            java.lang.String r3 = "telecom"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.telecom.TelecomManager r1 = (android.telecom.TelecomManager) r1
            if (r1 == 0) goto L_0x00cc
            r1.showInCallScreen(r6)
        L_0x00cc:
            r1 = r2
        L_0x00cd:
            android.content.Context r0 = r0.f93421c
            android.content.ServiceConnection r8 = r8.f93417a
            r0.unbindService(r8)
            r8 = r1
        L_0x00d5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.C35584cm.apply(java.lang.Object):java.lang.Object");
    }
}
