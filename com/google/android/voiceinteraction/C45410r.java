package com.google.android.voiceinteraction;

import android.content.Intent;

/* renamed from: com.google.android.voiceinteraction.r */
/* compiled from: PG */
public final /* synthetic */ class C45410r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45413u f118785a;

    /* renamed from: b */
    public final /* synthetic */ Intent f118786b;

    public /* synthetic */ C45410r(C45413u uVar, Intent intent) {
        this.f118785a = uVar;
        this.f118786b = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.voiceinteraction.u r0 = r7.f118785a
            android.content.Intent r1 = r7.f118786b
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r0.f118789a
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f118655aA
            r3 = 0
            r2.set(r3)
            java.lang.Object r2 = r0.f118726v
            monitor-enter(r2)
            com.google.android.hotword.service.HotwordInformation r4 = r0.f118664aJ     // Catch:{ all -> 0x0095 }
            if (r4 != 0) goto L_0x0032
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0095 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0095 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x0095 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0095 }
            r1 = 54595(0xd543, float:7.6504E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0095 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "HotwordInformation is null, cannot stop hotword."
            r0.mo56386p(r1)     // Catch:{ all -> 0x0095 }
            monitor-exit(r2)     // Catch:{ all -> 0x0095 }
            return
        L_0x0032:
            java.lang.String r4 = "extra_disregard_voice_match"
            boolean r1 = r1.getBooleanExtra(r4, r3)     // Catch:{ all -> 0x0095 }
            com.google.android.hotword.service.HotwordInformation r4 = r0.f118664aJ     // Catch:{ all -> 0x0095 }
            boolean r4 = r4.f395869A     // Catch:{ all -> 0x0095 }
            boolean r4 = com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197095c(r4)     // Catch:{ all -> 0x0095 }
            int r5 = r0.f118703ay     // Catch:{ all -> 0x0095 }
            r6 = 2
            if (r5 != r6) goto L_0x0053
            com.google.android.hotword.service.HotwordInformation r5 = r0.f118664aJ     // Catch:{ all -> 0x0095 }
            boolean r5 = r5.f395883d     // Catch:{ all -> 0x0095 }
            if (r5 != 0) goto L_0x0053
            r0.mo49421aj(r3)     // Catch:{ all -> 0x0095 }
            r0.f118712h = r3     // Catch:{ all -> 0x0095 }
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0095 }
            goto L_0x0093
        L_0x0053:
            com.google.android.hotword.service.HotwordInformation r5 = r0.f118664aJ     // Catch:{ all -> 0x0095 }
            boolean r6 = r5.f395884e     // Catch:{ all -> 0x0095 }
            if (r6 != 0) goto L_0x005d
            if (r4 != 0) goto L_0x005d
            if (r1 == 0) goto L_0x0093
        L_0x005d:
            boolean r1 = r5.f395885f     // Catch:{ all -> 0x0095 }
            if (r1 != 0) goto L_0x0093
            boolean r1 = r5.f395893n     // Catch:{ all -> 0x0095 }
            if (r1 != 0) goto L_0x0093
            r0.mo49407V()     // Catch:{ all -> 0x0095 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0095 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r1 = r0.f118632D     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x0076
            com.google.android.apps.gsa.voiceinteraction.hotword.h r1 = r1.f331147j     // Catch:{ all -> 0x0095 }
            r1.f331166g = r3     // Catch:{ all -> 0x0095 }
            r0.mo49395J()     // Catch:{ all -> 0x0095 }
            goto L_0x0093
        L_0x0076:
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x0095 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0095 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x0095 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0095 }
            r1 = 54593(0xd541, float:7.6501E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x0095 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "Cannot stop hotword detection."
            r0.mo56386p(r1)     // Catch:{ all -> 0x0095 }
        L_0x0093:
            monitor-exit(r2)     // Catch:{ all -> 0x0095 }
            return
        L_0x0095:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0095 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45410r.run():void");
    }
}
