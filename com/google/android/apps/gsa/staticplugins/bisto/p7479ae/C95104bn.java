package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.os.Handler;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bn */
/* compiled from: PG */
final class C95104bn extends Handler {

    /* renamed from: a */
    private final WeakReference f266067a;

    public C95104bn(C95105bo boVar) {
        this.f266067a = new WeakReference(boVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r6) {
        /*
            r5 = this;
            java.lang.ref.WeakReference r0 = r5.f266067a
            java.lang.Object r0 = r0.get()
            com.google.android.apps.gsa.staticplugins.bisto.ae.bo r0 = (com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95105bo) r0
            if (r0 != 0) goto L_0x000e
            super.handleMessage(r6)
            return
        L_0x000e:
            int r1 = r6.what
            if (r1 == 0) goto L_0x0016
            super.handleMessage(r6)
            return
        L_0x0016:
            android.os.Bundle r6 = r6.peekData()
            r1 = 0
            if (r6 != 0) goto L_0x0021
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x001f:
            r6 = r1
            goto L_0x004b
        L_0x0021:
            java.lang.String r2 = "bisto_sdk_payload"
            byte[] r6 = r6.getByteArray(r2)
            if (r6 != 0) goto L_0x002c
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x001f
        L_0x002c:
            com.google.android.d.hj r2 = com.google.android.p10712d.C142493hj.f386682b     // Catch:{ ct -> 0x0035 }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r6)     // Catch:{ ct -> 0x0035 }
            com.google.android.d.hj r6 = (com.google.android.p10712d.C142493hj) r6     // Catch:{ ct -> 0x0035 }
            goto L_0x004b
        L_0x0035:
            r6 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95105bo.f266068d
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "SdkConnnection"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Failed to parse payload"
            r4 = 18060(0x468c, float:2.5307E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r6)).mo56372aa(r4)).mo56386p(r3)
            goto L_0x001f
        L_0x004b:
            if (r6 == 0) goto L_0x0082
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.d.ek r2 = com.google.android.p10712d.C142413ek.UNKNOWN
            int r6 = r6.f386684a
            r2 = 2
            r3 = 1
            if (r6 == 0) goto L_0x0064
            if (r6 == r3) goto L_0x0062
            if (r6 == r2) goto L_0x0060
            r4 = 3
            if (r6 == r4) goto L_0x0065
            r4 = 0
            goto L_0x0065
        L_0x0060:
            r4 = 2
            goto L_0x0065
        L_0x0062:
            r4 = 1
            goto L_0x0065
        L_0x0064:
            r4 = 4
        L_0x0065:
            int r6 = r4 + -1
            if (r4 == 0) goto L_0x0081
            if (r6 == 0) goto L_0x007c
            if (r6 == r3) goto L_0x0076
            if (r6 == r2) goto L_0x0070
            goto L_0x0082
        L_0x0070:
            com.google.android.apps.gsa.staticplugins.bisto.ae.a r6 = r0.f266101b
            r6.mo88944u()
            return
        L_0x0076:
            com.google.android.apps.gsa.staticplugins.bisto.ae.a r6 = r0.f266101b
            r6.mo88945v()
            return
        L_0x007c:
            r6 = 6
            r0.mo89034i(r1, r6)
            return
        L_0x0081:
            throw r1
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95104bn.handleMessage(android.os.Message):void");
    }
}
