package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.apps.gsa.search.shared.p6928f.C87550f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ah */
/* compiled from: PG */
final class C108210ah implements C87550f {

    /* renamed from: a */
    final /* synthetic */ C108212aj f300973a;

    /* renamed from: b */
    private final C87545a f300974b;

    public C108210ah(C108212aj ajVar, C87545a aVar) {
        this.f300973a = ajVar;
        this.f300974b = aVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81667a(java.lang.String r11, java.util.Map r12) {
        /*
            r10 = this;
            java.lang.String r0 = "animation_duration"
            java.lang.String r1 = "height_diff"
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r2 = r10.f300973a
            com.google.at.h.b.a.r r2 = r2.f300979e
            java.lang.String r3 = "ZeroStateSaveState"
            if (r2 != 0) goto L_0x0014
            boolean r2 = r11.equals(r3)
            if (r2 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            return
        L_0x0014:
            int r2 = r11.hashCode()
            r4 = 1
            r5 = 0
            java.lang.String r6 = "LockscreenPermissionPromoDecline"
            java.lang.String r7 = "JustInTimeDeviceInfoConsent"
            java.lang.String r8 = "LockscreenPermissionPromo"
            java.lang.String r9 = "AcknowledgeDisclosuresAction"
            switch(r2) {
                case -2062973216: goto L_0x005a;
                case -363190165: goto L_0x0052;
                case -258276855: goto L_0x004a;
                case 359472179: goto L_0x0040;
                case 462612792: goto L_0x0038;
                case 695569981: goto L_0x002e;
                case 1668304045: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0062
        L_0x0026:
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L_0x0062
            r11 = 4
            goto L_0x0063
        L_0x002e:
            java.lang.String r2 = "CardHeightChanged"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x0062
            r11 = 1
            goto L_0x0063
        L_0x0038:
            boolean r11 = r11.equals(r7)
            if (r11 == 0) goto L_0x0062
            r11 = 6
            goto L_0x0063
        L_0x0040:
            java.lang.String r2 = "CardStateChanged"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L_0x0062
            r11 = 0
            goto L_0x0063
        L_0x004a:
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x0062
            r11 = 3
            goto L_0x0063
        L_0x0052:
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L_0x0062
            r11 = 2
            goto L_0x0063
        L_0x005a:
            boolean r11 = r11.equals(r9)
            if (r11 == 0) goto L_0x0062
            r11 = 5
            goto L_0x0063
        L_0x0062:
            r11 = -1
        L_0x0063:
            switch(r11) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x0086;
                case 2: goto L_0x0080;
                case 3: goto L_0x007a;
                case 4: goto L_0x0074;
                case 5: goto L_0x006e;
                case 6: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x012e
        L_0x0068:
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r11 = r10.f300973a
            r11.mo96595b(r7, r12)
            return
        L_0x006e:
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r11 = r10.f300973a
            r11.mo96595b(r9, r12)
            return
        L_0x0074:
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r11 = r10.f300973a
            r11.mo96595b(r6, r12)
            return
        L_0x007a:
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r11 = r10.f300973a
            r11.mo96595b(r8, r12)
            return
        L_0x0080:
            java.lang.String r11 = "ZeroStateSaveStateActionName"
            r12.containsKey(r11)
            return
        L_0x0086:
            boolean r11 = r12.containsKey(r1)     // Catch:{ NumberFormatException -> 0x00af }
            if (r11 == 0) goto L_0x012e
            java.lang.Object r11 = r12.get(r1)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x00af }
            boolean r11 = r12.containsKey(r0)     // Catch:{ NumberFormatException -> 0x00af }
            if (r11 == 0) goto L_0x00a5
            java.lang.Object r11 = r12.get(r0)     // Catch:{ NumberFormatException -> 0x00af }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x00af }
            int r5 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x00af }
        L_0x00a5:
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r11 = r10.f300973a     // Catch:{ NumberFormatException -> 0x00af }
            com.google.android.apps.gsa.staticplugins.opa.chatui.ai r11 = r11.f300982h     // Catch:{ NumberFormatException -> 0x00af }
            if (r11 == 0) goto L_0x012e
            r11.mo96594c(r5)     // Catch:{ NumberFormatException -> 0x00af }
            return
        L_0x00af:
            r11 = move-exception
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj.f300975a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.x r11 = r12.mo56382g(r11)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            r12 = 23940(0x5d84, float:3.3547E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r12)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            java.lang.String r12 = "#CardUpdateListener: invalid params for height change for card: %s"
            com.google.android.apps.gsa.search.shared.f.a r0 = r10.f300974b
            r11.mo56389s(r12, r0)
            return
        L_0x00ce:
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r11 = r10.f300973a     // Catch:{ ct -> 0x0110 }
            com.google.at.h.b.a.r r12 = r11.f300979e     // Catch:{ ct -> 0x0110 }
            r12.getClass()
            com.google.protobuf.bn r12 = r12.toBuilder()     // Catch:{ ct -> 0x0110 }
            com.google.at.h.b.a.q r12 = (com.google.p4017at.p4060h.p4068b.p4069a.C54200q) r12     // Catch:{ ct -> 0x0110 }
            com.google.android.apps.gsa.search.shared.f.a r0 = r10.f300974b     // Catch:{ ct -> 0x0110 }
            byte[] r0 = r0.mo77518e()     // Catch:{ ct -> 0x0110 }
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0110 }
            com.google.bq.d r2 = com.google.p4271bq.C56425d.f150537g     // Catch:{ ct -> 0x0110 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0110 }
            com.google.bq.d r0 = (com.google.p4271bq.C56425d) r0     // Catch:{ ct -> 0x0110 }
            r12.copyOnWrite()     // Catch:{ ct -> 0x0110 }
            com.google.protobuf.bv r1 = r12.instance     // Catch:{ ct -> 0x0110 }
            com.google.at.h.b.a.r r1 = (com.google.p4017at.p4060h.p4068b.p4069a.C54201r) r1     // Catch:{ ct -> 0x0110 }
            r0.getClass()     // Catch:{ ct -> 0x0110 }
            r1.f142246b = r0     // Catch:{ ct -> 0x0110 }
            int r0 = r1.f142245a     // Catch:{ ct -> 0x0110 }
            r0 = r0 | r4
            r1.f142245a = r0     // Catch:{ ct -> 0x0110 }
            com.google.protobuf.bv r12 = r12.build()     // Catch:{ ct -> 0x0110 }
            com.google.at.h.b.a.r r12 = (com.google.p4017at.p4060h.p4068b.p4069a.C54201r) r12     // Catch:{ ct -> 0x0110 }
            r11.f300979e = r12     // Catch:{ ct -> 0x0110 }
            com.google.android.apps.gsa.staticplugins.opa.chatui.aj r11 = r10.f300973a     // Catch:{ ct -> 0x0110 }
            com.google.android.apps.gsa.staticplugins.opa.chatui.ai r12 = r11.f300982h     // Catch:{ ct -> 0x0110 }
            if (r12 == 0) goto L_0x012e
            r12.mo96593b(r11)     // Catch:{ ct -> 0x0110 }
            return
        L_0x0110:
            r11 = move-exception
            com.google.common.f.e r12 = com.google.android.apps.gsa.staticplugins.opa.chatui.C108212aj.f300975a
            com.google.common.f.x r12 = r12.mo56226d()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.x r11 = r12.mo56382g(r11)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            r12 = 23939(0x5d83, float:3.3546E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r12)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            java.lang.String r12 = "#CardUpdateListener: invalid save state for card: %s"
            com.google.android.apps.gsa.search.shared.f.a r0 = r10.f300974b
            r11.mo56389s(r12, r0)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108210ah.mo81667a(java.lang.String, java.util.Map):void");
    }
}
