package com.google.android.libraries.search.assistant.performer.communication;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ck */
/* compiled from: PG */
public final /* synthetic */ class C35582ck implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35591ct f93406a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f93407b;

    public /* synthetic */ C35582ck(C35591ct ctVar, C51809dy dyVar) {
        this.f93406a = ctVar;
        this.f93407b = dyVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.libraries.search.assistant.performer.communication.ct r0 = r6.f93406a
            com.google.assistant.e.j.dy r1 = r6.f93407b
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x00e7
            android.content.ComponentName r7 = new android.content.ComponentName
            android.content.Context r2 = r0.f93421c
            java.lang.String r2 = r2.getPackageName()
            java.lang.Class<com.google.android.libraries.search.assistant.performer.communication.IncomingCallInCallService> r3 = com.google.android.libraries.search.assistant.performer.communication.IncomingCallInCallService.class
            java.lang.String r3 = r3.getName()
            r7.<init>(r2, r3)
            android.content.Context r2 = r0.f93421c
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            int r7 = r2.getComponentEnabledSetting(r7)
            r2 = 1
            if (r7 != r2) goto L_0x006e
            android.content.Intent r7 = new android.content.Intent
            android.content.Context r2 = r0.f93421c
            java.lang.Class<com.google.android.libraries.search.assistant.performer.communication.IncomingCallInCallService> r3 = com.google.android.libraries.search.assistant.performer.communication.IncomingCallInCallService.class
            r7.<init>(r2, r3)
            java.lang.String r2 = "local_incallservice_intent"
            r7.setAction(r2)
            com.google.android.libraries.search.assistant.performer.communication.cn r2 = new com.google.android.libraries.search.assistant.performer.communication.cn
            r2.<init>(r0, r7)
            com.google.common.util.concurrent.cx r7 = androidx.p104d.p105a.C2169h.m6027a(r2)
            j$.time.Duration r2 = com.google.android.libraries.search.assistant.performer.communication.C35591ct.f93420b
            long r2 = r2.toMillis()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.common.util.concurrent.db r5 = r0.f93422d
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92908q(r7, r2, r4, r5)
            com.google.android.libraries.search.assistant.performer.communication.co r2 = com.google.android.libraries.search.assistant.performer.communication.C35586co.f93413a
            com.google.common.util.concurrent.db r3 = r0.f93422d
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            java.lang.Class<java.util.concurrent.TimeoutException> r4 = java.util.concurrent.TimeoutException.class
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60846c.m92878g(r7, r4, r2, r3)
            com.google.android.libraries.search.assistant.performer.communication.cm r2 = new com.google.android.libraries.search.assistant.performer.communication.cm
            r2.<init>(r0, r1)
            com.google.common.util.concurrent.db r0 = r0.f93422d
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r1, r0)
            goto L_0x00f1
        L_0x006e:
            com.google.common.f.e r7 = com.google.android.libraries.search.assistant.performer.communication.C35591ct.f93419a
            com.google.common.f.x r7 = r7.mo56224b()
            java.lang.String r3 = "Fallback to legacy execution as the InCallService is not enabled."
            r4 = 51654(0xc9c6, float:7.2383E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r4)).mo56386p(r3)
            java.lang.String r7 = r1.f135936b
            int r1 = r7.hashCode()
            r3 = -1842781172(0xffffffff9229640c, float:-5.3450314E-28)
            r4 = 0
            if (r1 == r3) goto L_0x0098
            r3 = -1789014737(0xffffffff955dcd2f, float:-4.4792456E-26)
            if (r1 == r3) goto L_0x008e
            goto L_0x00a2
        L_0x008e:
            java.lang.String r1 = "call.REJECT"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00a2
            r7 = 1
            goto L_0x00a3
        L_0x0098:
            java.lang.String r1 = "call.PICKUP"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x00a2
            r7 = 0
            goto L_0x00a3
        L_0x00a2:
            r7 = -1
        L_0x00a3:
            java.lang.String r1 = "telecom"
            if (r7 == 0) goto L_0x00cc
            if (r7 == r2) goto L_0x00b4
            com.google.assistant.e.j.kf r7 = com.google.assistant.p3897e.p3921j.C52235kf.UNIMPLEMENTED
            com.google.assistant.e.j.ec r7 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r7)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            goto L_0x00f1
        L_0x00b4:
            android.content.Context r7 = r0.f93421c
            com.google.android.libraries.search.m.b.b r0 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_ASSISTANT_ACCL
            android.content.Context r7 = com.google.android.libraries.search.p3047m.p3054d.C39239a.m68666a(r7, r0)
            java.lang.Object r7 = r7.getSystemService(r1)
            android.telecom.TelecomManager r7 = (android.telecom.TelecomManager) r7
            r7.endCall()
            com.google.assistant.e.j.ec r7 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94545b
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            goto L_0x00f1
        L_0x00cc:
            android.content.Context r7 = r0.f93421c
            com.google.android.libraries.search.m.b.b r0 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_ASSISTANT_ACCL
            android.content.Context r7 = com.google.android.libraries.search.p3047m.p3054d.C39239a.m68666a(r7, r0)
            java.lang.Object r7 = r7.getSystemService(r1)
            android.telecom.TelecomManager r7 = (android.telecom.TelecomManager) r7
            r7.acceptRingingCall()
            r7.showInCallScreen(r4)
            com.google.assistant.e.j.ec r7 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.f94545b
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            goto L_0x00f1
        L_0x00e7:
            com.google.assistant.e.j.kf r7 = com.google.assistant.p3897e.p3921j.C52235kf.PERMISSION_DENIED
            com.google.assistant.e.j.ec r7 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r7)
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
        L_0x00f1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.C35582ck.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
