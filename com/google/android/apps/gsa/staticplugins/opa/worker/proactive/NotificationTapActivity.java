package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public final class NotificationTapActivity extends C114499x {

    /* renamed from: l */
    private static final C59071e f317109l = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.NotificationTapActivity");

    /* renamed from: k */
    public C87568k f317110k;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r0 = r7.getAction()
            android.content.Intent r1 = r6.getIntent()
            r1.getAction()
            boolean r1 = com.google.common.base.C58837ba.m90859h(r0)
            if (r1 == 0) goto L_0x0019
            return
        L_0x0019:
            android.content.Context r1 = r6.getApplicationContext()
            int r2 = r0.hashCode()
            r3 = -178070048(0xfffffffff562dde0, float:-2.875877E32)
            java.lang.String r4 = "com.google.android.search.core.action.OPA_PROACTIVE_NOTIFICATION_TAPPED"
            r5 = 1
            if (r2 == r3) goto L_0x0037
            r3 = 1032973869(0x3d91ee2d, float:0.071255066)
            if (r2 == r3) goto L_0x002f
            goto L_0x0041
        L_0x002f:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0041
            r0 = 0
            goto L_0x0042
        L_0x0037:
            java.lang.String r2 = "com.google.android.libraries.search.assistant.proactive.EXECUTE_CLIENT_INPUT_ACTION"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = -1
        L_0x0042:
            if (r0 == 0) goto L_0x0079
            if (r0 == r5) goto L_0x0047
            goto L_0x00a7
        L_0x0047:
            java.lang.String r0 = "client_input"
            byte[] r7 = r7.getByteArrayExtra(r0)
            if (r7 != 0) goto L_0x005d
            com.google.common.f.e r7 = f317109l
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r0 = "Received an intent with null clientInput."
            r1 = 29012(0x7154, float:4.0654E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            goto L_0x00a7
        L_0x005d:
            com.google.android.apps.gsa.search.shared.h.h r0 = new com.google.android.apps.gsa.search.shared.h.h
            r0.<init>()
            r0.f236517U = r7
            r0.f236560f = r5
            r0.f236509M = r5
            com.google.android.apps.gsa.assistant.shared.l.e r7 = com.google.android.apps.gsa.assistant.shared.l.e.bi
            r0.f236556b = r7
            android.os.Bundle r7 = r0.mo81685a()
            com.google.android.apps.gsa.search.shared.h.k r0 = r6.f317110k
            r2 = 268468224(0x10008000, float:2.5342157E-29)
            r0.mo81689c(r1, r7, r2)
            goto L_0x00a7
        L_0x0079:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            r0.putExtras(r7)
            android.content.Intent r7 = r0.setAction(r4)
            android.content.Context r1 = r6.getApplicationContext()
            java.lang.String r2 = "com.google.android.apps.gsa.search.core.service.SearchService"
            r7.setClassName(r1, r2)
            r0.toURI()
            android.content.Context r7 = r6.getApplicationContext()     // Catch:{ IllegalStateException -> 0x0099 }
            r7.startService(r0)     // Catch:{ IllegalStateException -> 0x0099 }
            goto L_0x00a7
        L_0x0099:
            r7 = move-exception
            com.google.common.f.e r0 = f317109l
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Failed to start search service."
            r2 = 29011(0x7153, float:4.0653E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r7)).mo56372aa(r2)).mo56386p(r1)
        L_0x00a7:
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.NotificationTapActivity.onCreate(android.os.Bundle):void");
    }
}
