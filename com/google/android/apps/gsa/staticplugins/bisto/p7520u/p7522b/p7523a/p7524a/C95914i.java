package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95355bf;
import com.google.android.apps.gsa.staticplugins.bisto.p7515q.C95848i;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.i */
/* compiled from: PG */
class C95914i extends C95909d {

    /* renamed from: c */
    private static final C59071e f268556c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.i");

    /* renamed from: d */
    private final C95355bf f268557d;

    /* renamed from: e */
    private final C89492cd f268558e;

    /* renamed from: f */
    private final C95848i f268559f;

    public C95914i(C95346ax axVar, C96023bs bsVar, String str, C89492cd cdVar, C95848i iVar, C95850a aVar) {
        super(bsVar, str, axVar, cdVar, aVar);
        this.f268557d = axVar;
        this.f268558e = cdVar;
        this.f268559f = iVar;
    }

    /* renamed from: k */
    public void mo89853k() {
        super.mo89853k();
        C59104x b = f268556c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConnectedDeviceLCState");
        C95883aa.m158980a(b, this, "onVoiceLocaleChanged", 15830);
        this.f268559f.mo89816a();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo89848l(android.content.Intent r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.getAction()
            r0.getClass()
            java.lang.String r1 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "ConnectedDeviceLCState"
            r3 = 1
            if (r1 == 0) goto L_0x0057
            com.google.android.apps.gsa.shared.bisto.a.cd r1 = r7.f268558e
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r4 = r7.f268557d
            java.lang.String r4 = r4.mo89270k()
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r1 = r1.mo83401b(r4)
            if (r1 != 0) goto L_0x0037
            com.google.common.f.e r0 = f268556c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Null bistoDeviceInfo"
            r2 = 15838(0x3dde, float:2.2194E-41)
            com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa.m158980a(r0, r7, r1, r2)
            boolean r8 = super.mo89848l(r8)
            return r8
        L_0x0037:
            com.google.android.apps.search.assistant.surfaces.bisto.d.e r1 = r1.mo106508g()
            com.google.android.apps.search.assistant.surfaces.bisto.d.e r4 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e.INPUT_ONLY_MODE
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0044
            goto L_0x0057
        L_0x0044:
            com.google.common.f.e r8 = f268556c
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r0, r2)
            java.lang.String r0 = "ACL_DISCONNECTED for input-only device when connected. Ignoring"
            r1 = 15837(0x3ddd, float:2.2192E-41)
            com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa.m158980a(r8, r7, r0, r1)
            return r3
        L_0x0057:
            boolean r1 = super.mo89848l(r8)
            if (r1 == 0) goto L_0x005e
            return r3
        L_0x005e:
            int r1 = r0.hashCode()
            r4 = 3
            r5 = -1
            r6 = 2
            switch(r1) {
                case -535726315: goto L_0x0087;
                case 94921639: goto L_0x007d;
                case 1383482656: goto L_0x0073;
                case 2116862345: goto L_0x0069;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x0091
        L_0x0069:
            java.lang.String r1 = "android.bluetooth.device.action.BOND_STATE_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0091
            r0 = 3
            goto L_0x0092
        L_0x0073:
            java.lang.String r1 = "enable_mini_dump"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0091
            r0 = 0
            goto L_0x0092
        L_0x007d:
            java.lang.String r1 = "crash"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0091
            r0 = 2
            goto L_0x0092
        L_0x0087:
            java.lang.String r1 = "trigger_mini_dump"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0091
            r0 = 1
            goto L_0x0092
        L_0x0091:
            r0 = -1
        L_0x0092:
            r1 = 6
            if (r0 == 0) goto L_0x010e
            if (r0 == r3) goto L_0x00d7
            if (r0 == r6) goto L_0x00d4
            if (r0 == r4) goto L_0x009c
            goto L_0x00cf
        L_0x009c:
            java.lang.String r0 = "android.bluetooth.device.extra.BOND_STATE"
            int r0 = r8.getIntExtra(r0, r5)
            com.google.common.f.e r1 = f268556c
            com.google.common.f.x r4 = r1.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r2)
            java.lang.String r5 = "bondState: %d"
            r6 = 15835(0x3ddb, float:2.219E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56387q(r5, r0)
            r4 = 10
            if (r0 != r4) goto L_0x00cf
            com.google.common.f.x r8 = r1.mo56224b()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r0, r2)
            java.lang.String r0 = "UNBOUND; going to DISCONNECTING"
            r1 = 15836(0x3ddc, float:2.2191E-41)
            com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa.m158980a(r8, r7, r0, r1)
            java.lang.String r8 = "DisconnectingState"
            r0 = 0
            r7.mo89847j(r8, r0)
            return r3
        L_0x00cf:
            boolean r8 = super.mo89848l(r8)
            return r8
        L_0x00d4:
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return r3
        L_0x00d7:
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r8 = r7.f268557d
            com.google.android.d.fi r0 = com.google.android.p10712d.C142438fi.f386510d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.d.fh r0 = (com.google.android.p10712d.C142437fh) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.d.fi r2 = (com.google.android.p10712d.C142438fi) r2
            int r4 = r2.f386512a
            r4 = r4 | r3
            r2.f386512a = r4
            r2.f386513b = r3
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.d.fi r2 = (com.google.android.p10712d.C142438fi) r2
            int r4 = r2.f386512a
            r4 = r4 | r6
            r2.f386512a = r4
            r2.f386514c = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.d.fi r0 = (com.google.android.p10712d.C142438fi) r0
            byte[] r0 = r0.toByteArray()
            r2 = 7
            r8.mo89257D(r1, r2, r0)
            return r3
        L_0x010e:
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r8 = r7.f268557d
            com.google.android.d.fg r0 = com.google.android.p10712d.C142436fg.f386506c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.d.ff r0 = (com.google.android.p10712d.C142435ff) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.d.fg r2 = (com.google.android.p10712d.C142436fg) r2
            int r4 = r2.f386508a
            r4 = r4 | r3
            r2.f386508a = r4
            r2.f386509b = r3
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.d.fg r0 = (com.google.android.p10712d.C142436fg) r0
            byte[] r0 = r0.toByteArray()
            r8.mo89257D(r1, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95914i.mo89848l(android.content.Intent):boolean");
    }
}
