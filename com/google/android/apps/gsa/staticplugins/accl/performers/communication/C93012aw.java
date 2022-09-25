package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.aw */
/* compiled from: PG */
public final /* synthetic */ class C93012aw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C93015az f259465a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f259466b;

    public /* synthetic */ C93012aw(C93015az azVar, C51809dy dyVar) {
        this.f259465a = azVar;
        this.f259466b = dyVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r6) {
        /*
            r5 = this;
            com.google.android.apps.gsa.staticplugins.accl.performers.communication.az r0 = r5.f259465a
            com.google.assistant.e.j.dy r1 = r5.f259466b
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r2 = 0
            if (r6 == 0) goto L_0x0092
            java.lang.String r6 = r1.f135936b
            int r1 = r6.hashCode()
            r3 = -1842781172(0xffffffff9229640c, float:-5.3450314E-28)
            r4 = 1
            if (r1 == r3) goto L_0x0029
            r3 = -1789014737(0xffffffff955dcd2f, float:-4.4792456E-26)
            if (r1 == r3) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            java.lang.String r1 = "call.REJECT"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0033
            r6 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r1 = "call.PICKUP"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0033
            r6 = 0
            goto L_0x0034
        L_0x0033:
            r6 = -1
        L_0x0034:
            java.lang.String r1 = "telecom"
            if (r6 == 0) goto L_0x006a
            if (r6 == r4) goto L_0x0045
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.UNIMPLEMENTED
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r6, r2)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            goto L_0x009c
        L_0x0045:
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C93015az.f259469a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r2 = "Reject the incoming call"
            r3 = 13200(0x3390, float:1.8497E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r3)).mo56386p(r2)
            android.content.Context r6 = r0.f259470b
            com.google.android.libraries.search.m.b.b r0 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_SERVICES_ACCL
            android.content.Context r6 = com.google.android.libraries.search.p3047m.p3054d.C39239a.m68666a(r6, r0)
            java.lang.Object r6 = r6.getSystemService(r1)
            android.telecom.TelecomManager r6 = (android.telecom.TelecomManager) r6
            r6.endCall()
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            goto L_0x009c
        L_0x006a:
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.accl.performers.communication.C93015az.f259469a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r2 = "Pick up the incoming call"
            r3 = 13199(0x338f, float:1.8496E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r3)).mo56386p(r2)
            android.content.Context r6 = r0.f259470b
            com.google.android.libraries.search.m.b.b r0 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_SERVICES_ACCL
            android.content.Context r6 = com.google.android.libraries.search.p3047m.p3054d.C39239a.m68666a(r6, r0)
            java.lang.Object r6 = r6.getSystemService(r1)
            android.telecom.TelecomManager r6 = (android.telecom.TelecomManager) r6
            r6.acceptRingingCall()
            r6.showInCallScreen(r4)
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            goto L_0x009c
        L_0x0092:
            com.google.assistant.e.j.kf r6 = com.google.assistant.p3897e.p3921j.C52235kf.PERMISSION_DENIED
            com.google.assistant.e.j.ec r6 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r6, r2)
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
        L_0x009c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.communication.C93012aw.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
