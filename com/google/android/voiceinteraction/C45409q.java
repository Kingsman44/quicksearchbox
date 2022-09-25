package com.google.android.voiceinteraction;

import android.content.Intent;

/* renamed from: com.google.android.voiceinteraction.q */
/* compiled from: PG */
public final /* synthetic */ class C45409q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C45413u f118783a;

    /* renamed from: b */
    public final /* synthetic */ Intent f118784b;

    public /* synthetic */ C45409q(C45413u uVar, Intent intent) {
        this.f118783a = uVar;
        this.f118784b = intent;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.voiceinteraction.u r0 = r7.f118783a
            android.content.Intent r1 = r7.f118784b
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r0.f118789a
            java.lang.Object r2 = r0.f118726v
            monitor-enter(r2)
            com.google.android.hotword.service.HotwordInformation r3 = r0.f118664aJ     // Catch:{ all -> 0x013f }
            if (r3 != 0) goto L_0x002c
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x013f }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x013f }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013f }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            r1 = 54589(0xd53d, float:7.6495E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "HotwordInformation is null, cannot start hotword."
            r0.mo56386p(r1)     // Catch:{ all -> 0x013f }
            monitor-exit(r2)     // Catch:{ all -> 0x013f }
            return
        L_0x002c:
            java.lang.String r3 = "extra_disregard_voice_match"
            r4 = 0
            boolean r1 = r1.getBooleanExtra(r3, r4)     // Catch:{ all -> 0x013f }
            com.google.android.hotword.service.HotwordInformation r3 = r0.f118664aJ     // Catch:{ all -> 0x013f }
            boolean r3 = r3.f395869A     // Catch:{ all -> 0x013f }
            boolean r3 = com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197095c(r3)     // Catch:{ all -> 0x013f }
            com.google.common.f.e r4 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x013f }
            com.google.common.f.x r4 = r4.mo56224b()     // Catch:{ all -> 0x013f }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013f }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r4.mo56378ag(r5, r6)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x013f }
            r5 = 54582(0xd536, float:7.6486E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x013f }
            java.lang.String r5 = "disregardVoiceMatch: %b"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x013f }
            r4.mo56389s(r5, r6)     // Catch:{ all -> 0x013f }
            com.google.android.hotword.service.HotwordInformation r4 = r0.f118664aJ     // Catch:{ all -> 0x013f }
            boolean r4 = r4.f395881b     // Catch:{ all -> 0x013f }
            if (r4 != 0) goto L_0x0083
            if (r1 != 0) goto L_0x0083
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x013f }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x013f }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013f }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            r1 = 54588(0xd53c, float:7.6494E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "Cannot start hotword, hotword has been explicitly disabled."
            r0.mo56386p(r1)     // Catch:{ all -> 0x013f }
            goto L_0x013d
        L_0x0083:
            int r4 = r0.f118703ay     // Catch:{ all -> 0x013f }
            r5 = 2
            r6 = 1
            if (r4 != r5) goto L_0x00ff
            com.google.android.hotword.service.HotwordInformation r4 = r0.f118664aJ     // Catch:{ all -> 0x013f }
            boolean r5 = r4.f395882c     // Catch:{ all -> 0x013f }
            if (r5 != 0) goto L_0x0093
            if (r3 != 0) goto L_0x0093
            if (r1 == 0) goto L_0x00ff
        L_0x0093:
            boolean r4 = r4.f395883d     // Catch:{ all -> 0x013f }
            if (r4 != 0) goto L_0x00ff
            android.service.voice.AlwaysOnHotwordDetector r1 = r0.f118702ax     // Catch:{ all -> 0x013f }
            if (r1 != 0) goto L_0x00cd
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f118655aA     // Catch:{ all -> 0x013f }
            r1.set(r6)     // Catch:{ all -> 0x013f }
            java.lang.Object r1 = r0.f118701aw     // Catch:{ all -> 0x013f }
            monitor-enter(r1)     // Catch:{ all -> 0x013f }
            java.lang.String r3 = r0.f118658aD     // Catch:{ all -> 0x00ca }
            java.lang.String r4 = r0.f118659aE     // Catch:{ all -> 0x00ca }
            r0.mo49418ag(r3, r4, r6)     // Catch:{ all -> 0x00ca }
            monitor-exit(r1)     // Catch:{ all -> 0x00ca }
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x013f }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x013f }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013f }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            r1 = 54587(0xd53b, float:7.6493E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "creating AlwaysOnHotwordDetector before starting hotword."
            r0.mo56386p(r1)     // Catch:{ all -> 0x013f }
            goto L_0x013d
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x013f }
        L_0x00cd:
            boolean r1 = r0.mo49420ai()     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x013d
            r0.f118712h = r6     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r1 = r0.f118632D     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x00dd
            r1.mo103910b()     // Catch:{ all -> 0x013f }
            goto L_0x013d
        L_0x00dd:
            boolean r0 = r0.f118704az     // Catch:{ all -> 0x013f }
            if (r0 != 0) goto L_0x013d
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x013f }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x013f }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013f }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            r1 = 54586(0xd53a, float:7.6491E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "Missing hotword detector."
            r0.mo56386p(r1)     // Catch:{ all -> 0x013f }
            goto L_0x013d
        L_0x00ff:
            com.google.android.hotword.service.HotwordInformation r4 = r0.f118664aJ     // Catch:{ all -> 0x013f }
            boolean r5 = r4.f395884e     // Catch:{ all -> 0x013f }
            if (r5 != 0) goto L_0x0109
            if (r3 != 0) goto L_0x0109
            if (r1 == 0) goto L_0x013d
        L_0x0109:
            boolean r1 = r4.f395885f     // Catch:{ all -> 0x013f }
            if (r1 != 0) goto L_0x013d
            boolean r1 = r4.f395893n     // Catch:{ all -> 0x013f }
            if (r1 != 0) goto L_0x013d
            r0.mo49397L()     // Catch:{ all -> 0x013f }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r1 = r0.f118632D     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x0120
            com.google.android.apps.gsa.voiceinteraction.hotword.h r1 = r1.f331147j     // Catch:{ all -> 0x013f }
            r1.f331166g = r6     // Catch:{ all -> 0x013f }
            r0.mo49395J()     // Catch:{ all -> 0x013f }
            goto L_0x013d
        L_0x0120:
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x013f }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x013f }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x013f }
            java.lang.String r3 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r3)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            r1 = 54584(0xd538, float:7.6488E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)     // Catch:{ all -> 0x013f }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "Cannot start hotword detection."
            r0.mo56386p(r1)     // Catch:{ all -> 0x013f }
        L_0x013d:
            monitor-exit(r2)     // Catch:{ all -> 0x013f }
            return
        L_0x013f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x013f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45409q.run():void");
    }
}
