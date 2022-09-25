package com.google.android.voiceinteraction;

import android.content.BroadcastReceiver;

/* renamed from: com.google.android.voiceinteraction.o */
/* compiled from: PG */
final class C45407o extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118781a;

    public C45407o(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118781a = gsaVoiceInteractionService;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            com.google.common.f.e r8 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.voiceinteraction.GsaVoiceInteractionService r8 = r7.f118781a
            java.lang.Object r8 = r8.f118726v
            monitor-enter(r8)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r0 = r0.f118632D     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = r9.getAction()     // Catch:{ all -> 0x00e4 }
            int r1 = r0.hashCode()     // Catch:{ all -> 0x00e4 }
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            switch(r1) {
                case -2128145023: goto L_0x003d;
                case -1454123155: goto L_0x0033;
                case -426514777: goto L_0x0029;
                case 376132170: goto L_0x001f;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0047
        L_0x001f:
            java.lang.String r1 = "com.google.android.apps.now.account_update_broadcast"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = 3
            goto L_0x0048
        L_0x0029:
            java.lang.String r1 = "com.google.android.googlequicksearchbox.HOTWORD_STATUS_CHANGED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = 2
            goto L_0x0048
        L_0x0033:
            java.lang.String r1 = "android.intent.action.SCREEN_ON"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = 0
            goto L_0x0048
        L_0x003d:
            java.lang.String r1 = "android.intent.action.SCREEN_OFF"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = -1
        L_0x0048:
            if (r0 == 0) goto L_0x00cf
            if (r0 == r4) goto L_0x00bb
            if (r0 == r3) goto L_0x0059
            if (r0 == r2) goto L_0x0052
            goto L_0x00e2
        L_0x0052:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r9 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            r9.mo49433o()     // Catch:{ all -> 0x00e4 }
            goto L_0x00e2
        L_0x0059:
            java.lang.String r0 = "audio_active"
            boolean r0 = r9.getBooleanExtra(r0, r5)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "audio_source_type"
            int r9 = r9.getIntExtra(r1, r5)     // Catch:{ all -> 0x00e4 }
            com.google.common.f.e r1 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x00e4 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x00e4 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00e4 }
            java.lang.String r6 = "GsaVoiceInteractionSrv"
            r1.mo56378ag(r2, r6)     // Catch:{ all -> 0x00e4 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00e4 }
            r2 = 54389(0xd475, float:7.6215E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x00e4 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "AUDIO_STATUS_CHANGED - AudioSource Type %d; AudioActive %b"
            r1.mo56396z(r2, r9, r0)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x008f
            if (r9 == r3) goto L_0x00e2
            com.google.android.voiceinteraction.GsaVoiceInteractionService r9 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r9 = r9.f118632D     // Catch:{ all -> 0x00e4 }
            com.google.android.apps.gsa.voiceinteraction.hotword.h r9 = r9.f331147j     // Catch:{ all -> 0x00e4 }
            r9.f331163d = r4     // Catch:{ all -> 0x00e4 }
            goto L_0x00b2
        L_0x008f:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r9 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            com.google.android.apps.gsa.voiceinteraction.hotword.g r0 = r9.f118632D     // Catch:{ all -> 0x00e4 }
            com.google.android.apps.gsa.voiceinteraction.hotword.h r0 = r0.f331147j     // Catch:{ all -> 0x00e4 }
            r0.f331163d = r5     // Catch:{ all -> 0x00e4 }
            java.lang.Object r9 = r9.f118726v     // Catch:{ all -> 0x00e4 }
            monitor-enter(r9)     // Catch:{ all -> 0x00e4 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r7.f118781a     // Catch:{ all -> 0x00b8 }
            com.google.android.hotword.service.HotwordInformation r0 = r0.f118664aJ     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a9
            boolean r0 = r0.f395869A     // Catch:{ all -> 0x00b8 }
            boolean r0 = com.google.android.apps.gsa.voiceinteraction.hotword.C118726n.m197095c(r0)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r4 = 0
        L_0x00aa:
            monitor-exit(r9)     // Catch:{ all -> 0x00b8 }
            if (r4 == 0) goto L_0x00b2
            com.google.android.voiceinteraction.GsaVoiceInteractionService r9 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            r9.mo49398M()     // Catch:{ all -> 0x00e4 }
        L_0x00b2:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r9 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            r9.mo49395J()     // Catch:{ all -> 0x00e4 }
            goto L_0x00e2
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00b8 }
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00bb:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r9 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            r9.mo49448t()     // Catch:{ all -> 0x00e4 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r9 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            com.google.apps.tiktok.tracing.contrib.b.e r0 = r9.f118722r     // Catch:{ all -> 0x00e4 }
            com.google.android.voiceinteraction.n r1 = new com.google.android.voiceinteraction.n     // Catch:{ all -> 0x00e4 }
            r1.<init>(r7)     // Catch:{ all -> 0x00e4 }
            com.google.common.util.concurrent.db r9 = r9.f118720p     // Catch:{ all -> 0x00e4 }
            r0.mo51511a(r1, r9)     // Catch:{ all -> 0x00e4 }
            goto L_0x00e2
        L_0x00cf:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r9 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            r9.mo49448t()     // Catch:{ all -> 0x00e4 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r9 = r7.f118781a     // Catch:{ all -> 0x00e4 }
            com.google.apps.tiktok.tracing.contrib.b.e r0 = r9.f118722r     // Catch:{ all -> 0x00e4 }
            com.google.android.voiceinteraction.m r1 = new com.google.android.voiceinteraction.m     // Catch:{ all -> 0x00e4 }
            r1.<init>(r7)     // Catch:{ all -> 0x00e4 }
            com.google.common.util.concurrent.db r9 = r9.f118720p     // Catch:{ all -> 0x00e4 }
            r0.mo51511a(r1, r9)     // Catch:{ all -> 0x00e4 }
        L_0x00e2:
            monitor-exit(r8)     // Catch:{ all -> 0x00e4 }
            return
        L_0x00e4:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e4 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45407o.onReceive(android.content.Context, android.content.Intent):void");
    }
}
