package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96026d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.d */
/* compiled from: PG */
class C95909d extends C96026d {

    /* renamed from: c */
    private static final C59071e f268538c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.d");

    /* renamed from: d */
    private final C95346ax f268539d;

    /* renamed from: e */
    private final C89492cd f268540e;

    public C95909d(C96023bs bsVar, String str, C95346ax axVar, C89492cd cdVar, C95850a aVar) {
        super(bsVar, str, aVar);
        this.f268540e = cdVar;
        this.f268539d = axVar;
    }

    /* renamed from: ip */
    public void mo89286ip(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z && !this.f268868a.equals("ClassicIdleState") && !this.f268868a.equals("DisconnectingState")) {
            C124715m mVar = C124715m.UNKNOWN_CONNECTIVITY_STATUS;
            int ordinal = this.f268539d.mo89263d().ordinal();
            if (ordinal != 1) {
                if (ordinal == 2 || ordinal == 5) {
                    C59104x b = f268538c.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "BaseClassicDeviceLCS");
                    C95883aa.m158980a(b, this, "AUDIO_ONLY; going to WAITING_TO_RECONNECT", 15807);
                    mo89847j("WaitingToReconnectState", (Intent) null);
                    return;
                }
                C59104x c = f268538c.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BaseClassicDeviceLCS");
                C95883aa.m158980a(c, this, "DEFAULT. Going to DISCONNECTING", 15806);
                mo89847j("DisconnectingState", (Intent) null);
            } else if (!this.f268539d.mo89272m()) {
                C59104x b2 = f268538c.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "BaseClassicDeviceLCS");
                C95883aa.m158980a(b2, this, "!IsAudioRequired; going to CONNECTING", 15809);
                mo89847j("ConnectingLCState", (Intent) null);
            } else {
                C59104x b3 = f268538c.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "BaseClassicDeviceLCS");
                C95883aa.m158980a(b3, this, "not connected; going to DISCONNECTING", 15808);
                mo89847j("DisconnectingState", (Intent) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo89848l(android.content.Intent r10) {
        /*
            r9 = this;
            boolean r0 = super.mo89848l(r10)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = r10.getAction()
            r0.getClass()
            int r2 = r0.hashCode()
            r3 = -1530327060(0xffffffffa4c90fec, float:-8.719683E-17)
            r4 = -1
            r5 = 2
            r6 = 0
            if (r2 == r3) goto L_0x003a
            r3 = 1244161670(0x4a286686, float:2759073.5)
            if (r2 == r3) goto L_0x0030
            r3 = 1821585647(0x6c9330ef, float:1.4235454E27)
            if (r2 == r3) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            java.lang.String r2 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x0030:
            java.lang.String r2 = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x003a:
            java.lang.String r2 = "android.bluetooth.adapter.action.STATE_CHANGED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0044
            r0 = 2
            goto L_0x0045
        L_0x0044:
            r0 = -1
        L_0x0045:
            r2 = 0
            java.lang.String r3 = "BaseClassicDeviceLCS"
            java.lang.String r7 = "ClassicIdleState"
            java.lang.String r8 = "DisconnectingState"
            if (r0 == 0) goto L_0x00b8
            if (r0 == r1) goto L_0x0089
            if (r0 == r5) goto L_0x0053
            return r6
        L_0x0053:
            java.lang.String r0 = "android.bluetooth.adapter.extra.STATE"
            int r10 = r10.getIntExtra(r0, r5)
            r0 = 10
            if (r10 == r0) goto L_0x0063
            r0 = 13
            if (r10 != r0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            return r6
        L_0x0063:
            java.lang.String r10 = r9.f268868a
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L_0x0088
            java.lang.String r10 = r9.f268868a
            boolean r10 = r10.equals(r8)
            if (r10 != 0) goto L_0x0088
            com.google.common.f.e r10 = f268538c
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r0, r3)
            java.lang.String r0 = "BT adapter is off; going to DISCONNECTING"
            r3 = 15812(0x3dc4, float:2.2157E-41)
            com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa.m158980a(r10, r9, r0, r3)
            r9.mo89847j(r8, r2)
        L_0x0088:
            return r1
        L_0x0089:
            java.lang.String r0 = "android.bluetooth.profile.extra.STATE"
            int r10 = r10.getIntExtra(r0, r4)
            if (r10 != 0) goto L_0x00b7
            java.lang.String r10 = r9.f268868a
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L_0x00b6
            java.lang.String r10 = r9.f268868a
            boolean r10 = r10.equals(r8)
            if (r10 != 0) goto L_0x00b6
            com.google.common.f.e r10 = f268538c
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r0, r3)
            java.lang.String r0 = "A2DP disconnected; going to DISCONNECTING"
            r3 = 15811(0x3dc3, float:2.2156E-41)
            com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa.m158980a(r10, r9, r0, r3)
            r9.mo89847j(r8, r2)
        L_0x00b6:
            return r1
        L_0x00b7:
            return r6
        L_0x00b8:
            java.lang.String r10 = r9.f268868a
            boolean r10 = r10.equals(r7)
            if (r10 != 0) goto L_0x00dd
            java.lang.String r10 = r9.f268868a
            boolean r10 = r10.equals(r8)
            if (r10 != 0) goto L_0x00dd
            com.google.common.f.e r10 = f268538c
            com.google.common.f.x r10 = r10.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r0, r3)
            java.lang.String r0 = "ACL_DISCONNECTED; going to DISCONNECTING"
            r3 = 15810(0x3dc2, float:2.2155E-41)
            com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa.m158980a(r10, r9, r0, r3)
            r9.mo89847j(r8, r2)
        L_0x00dd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95909d.mo89848l(android.content.Intent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo89852m() {
        C58976aa aaVar = C58975e.f156826a;
        String k = this.f268539d.mo89270k();
        this.f268540e.mo83394aj(k, (C124636bb) null, C124633az.OOBE_NOT_FINISHED);
        this.f268540e.mo83415u(k);
    }
}
