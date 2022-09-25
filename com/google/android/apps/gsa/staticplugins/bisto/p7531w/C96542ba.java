package com.google.android.apps.gsa.staticplugins.bisto.p7531w;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95352bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.w.ba */
/* compiled from: PG */
final class C96542ba implements C95352bc {

    /* renamed from: a */
    final /* synthetic */ C96547bf f270084a;

    public C96542ba(C96547bf bfVar) {
        this.f270084a = bfVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r2.equals(com.google.android.p10712d.C142461ge.OTA_SUCCESS) == false) goto L_0x005b;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89254E(java.lang.String r2, int r3, int r4, byte[] r5) {
        /*
            r1 = this;
            com.google.android.apps.gsa.staticplugins.bisto.w.bf r0 = r1.f270084a
            com.google.android.apps.gsa.staticplugins.bisto.g.bf r0 = r0.f270138p
            java.lang.String r0 = r0.mo89270k()
            boolean r2 = r0.equals(r2)
            r0 = 0
            if (r2 != 0) goto L_0x0010
            return r0
        L_0x0010:
            r2 = 3
            if (r3 != r2) goto L_0x007f
            com.google.android.d.fz r2 = com.google.android.p10712d.C142455fz.OTA_RESPONSE
            int r2 = r2.f386567k
            if (r2 != r4) goto L_0x007f
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x006b }
            com.google.android.d.gf r3 = com.google.android.p10712d.C142462gf.f386596c     // Catch:{ ct -> 0x006b }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r5, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x006b }
            com.google.android.d.gf r2 = (com.google.android.p10712d.C142462gf) r2     // Catch:{ ct -> 0x006b }
            int r3 = r2.f386598a     // Catch:{ ct -> 0x006b }
            com.google.android.d.fz r3 = com.google.android.p10712d.C142455fz.m231083a(r3)     // Catch:{ ct -> 0x006b }
            if (r3 != 0) goto L_0x002f
            com.google.android.d.fz r3 = com.google.android.p10712d.C142455fz.OTA_UNKNOWN     // Catch:{ ct -> 0x006b }
        L_0x002f:
            com.google.android.d.fz r4 = com.google.android.p10712d.C142455fz.OTA_DATA     // Catch:{ ct -> 0x006b }
            boolean r3 = r3.equals(r4)     // Catch:{ ct -> 0x006b }
            if (r3 != 0) goto L_0x005b
            int r3 = r2.f386598a     // Catch:{ ct -> 0x006b }
            com.google.android.d.fz r3 = com.google.android.p10712d.C142455fz.m231083a(r3)     // Catch:{ ct -> 0x006b }
            if (r3 != 0) goto L_0x0041
            com.google.android.d.fz r3 = com.google.android.p10712d.C142455fz.OTA_UNKNOWN     // Catch:{ ct -> 0x006b }
        L_0x0041:
            com.google.android.d.fz r4 = com.google.android.p10712d.C142455fz.OTA_APPLY     // Catch:{ ct -> 0x006b }
            boolean r3 = r3.equals(r4)     // Catch:{ ct -> 0x006b }
            if (r3 == 0) goto L_0x007f
            int r2 = r2.f386599b     // Catch:{ ct -> 0x006b }
            com.google.android.d.ge r2 = com.google.android.p10712d.C142461ge.m231085a(r2)     // Catch:{ ct -> 0x006b }
            if (r2 != 0) goto L_0x0053
            com.google.android.d.ge r2 = com.google.android.p10712d.C142461ge.OTA_STATUS_UNKNOWN     // Catch:{ ct -> 0x006b }
        L_0x0053:
            com.google.android.d.ge r3 = com.google.android.p10712d.C142461ge.OTA_SUCCESS     // Catch:{ ct -> 0x006b }
            boolean r2 = r2.equals(r3)     // Catch:{ ct -> 0x006b }
            if (r2 != 0) goto L_0x007f
        L_0x005b:
            com.google.android.apps.gsa.staticplugins.bisto.w.bf r2 = r1.f270084a     // Catch:{ ct -> 0x006b }
            com.google.android.libraries.gsa.k.g r2 = r2.f270141s     // Catch:{ ct -> 0x006b }
            com.google.android.apps.gsa.staticplugins.bisto.w.az r3 = new com.google.android.apps.gsa.staticplugins.bisto.w.az     // Catch:{ ct -> 0x006b }
            r3.<init>(r1)     // Catch:{ ct -> 0x006b }
            java.lang.String r4 = "apply_ota_failure"
            r2.mo28212l(r4, r3)     // Catch:{ ct -> 0x006b }
            r2 = 1
            return r2
        L_0x006b:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96547bf.f270092a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "OtaStateApplySent"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "unable to parse ota response"
            r4 = 16601(0x40d9, float:2.3263E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7531w.C96542ba.mo89254E(java.lang.String, int, int, byte[]):boolean");
    }
}
