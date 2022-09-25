package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gp */
/* compiled from: PG */
final class C96247gp extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C96248gq f269384a;

    public C96247gp(C96248gq gqVar) {
        this.f269384a = gqVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96248gq.f269387m
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "HerbieAuxLoadingFrag"
            r6.mo56378ag(r0, r1)
            java.lang.String r0 = r7.getAction()
            r2 = 17003(0x426b, float:2.3826E-41)
            java.lang.String r3 = "received action=%s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r2)).mo56389s(r3, r0)
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gq r6 = r5.f269384a
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ay r6 = r6.f269400u
            java.lang.String r6 = r6.f269039a
            if (r6 != 0) goto L_0x0033
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96248gq.f269387m
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r1)
            java.lang.String r7 = "No bluetooth device defined"
            r0 = 17007(0x426f, float:2.3832E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56386p(r7)
            return
        L_0x0033:
            java.lang.String r0 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r0 = r7.getParcelableExtra(r0)
            android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            if (r0 != 0) goto L_0x0050
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96248gq.f269387m
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r7, r1)
            java.lang.String r7 = "intentDevice null"
            r0 = 17006(0x426e, float:2.383E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r0)).mo56386p(r7)
            return
        L_0x0050:
            java.lang.String r2 = r0.getAddress()
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x0101
            java.lang.String r6 = r7.getAction()
            int r7 = r6.hashCode()
            r2 = -377527494(0xffffffffe97f633a, float:-1.9296542E25)
            r3 = 0
            r4 = 1
            if (r7 == r2) goto L_0x0079
            r2 = 1821585647(0x6c9330ef, float:1.4235454E27)
            if (r7 == r2) goto L_0x006f
            goto L_0x0083
        L_0x006f:
            java.lang.String r7 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0083
            r6 = 0
            goto L_0x0084
        L_0x0079:
            java.lang.String r7 = "android.bluetooth.device.action.UUID"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0083
            r6 = 1
            goto L_0x0084
        L_0x0083:
            r6 = -1
        L_0x0084:
            r7 = 5
            if (r6 == 0) goto L_0x00f3
            if (r6 == r4) goto L_0x008b
            goto L_0x0101
        L_0x008b:
            android.os.ParcelUuid[] r6 = r0.getUuids()
            if (r6 != 0) goto L_0x00a4
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96248gq.f269387m
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r1)
            java.lang.String r1 = "uuids null"
            r2 = 17005(0x426d, float:2.3829E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x00c3
        L_0x00a4:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96248gq.f269387m
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 17004(0x426c, float:2.3828E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            int r1 = r6.length
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gq r2 = r5.f269384a
            int r2 = r2.f269402w
            java.lang.String r3 = "received UUID action length=%d, state=%d"
            r0.mo56393w(r3, r1, r2)
        L_0x00c3:
            boolean r6 = com.google.android.apps.gsa.shared.bisto.C89681t.m146047m(r6)
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gq r0 = r5.f269384a
            int r1 = r0.f269402w
            if (r1 == r4) goto L_0x00e4
            r2 = 2
            if (r1 == r2) goto L_0x00e4
            if (r1 == r7) goto L_0x00d6
            com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96248gq.m159545p(r7, r1)
            return
        L_0x00d6:
            if (r6 == 0) goto L_0x00db
            r1 = 11
            goto L_0x00e0
        L_0x00db:
            boolean r6 = r0.f269401v
            if (r6 == 0) goto L_0x00e0
            r1 = 6
        L_0x00e0:
            r0.mo90021q(r1)
            return
        L_0x00e4:
            com.google.android.libraries.gsa.k.g r6 = r0.f269398s
            long r0 = com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96248gq.f269389o
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.go r7 = new com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.go
            r7.<init>(r5)
            java.lang.String r2 = "delaySendRebootSignal"
            r6.mo28213m(r2, r0, r7)
            return
        L_0x00f3:
            com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gq r6 = r5.f269384a
            int r0 = r6.f269402w
            r1 = 4
            if (r0 == r1) goto L_0x00fe
            com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96248gq.m159545p(r3, r0)
            return
        L_0x00fe:
            r6.mo90021q(r7)
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe.C96247gp.onReceive(android.content.Context, android.content.Intent):void");
    }
}
