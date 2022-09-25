package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.search.shared.service.C87682aj;

/* renamed from: com.google.android.voiceinteraction.z */
/* compiled from: PG */
final class C45418z implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118793a;

    public C45418z(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118793a = gsaVoiceInteractionService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        return;
     */
    /* renamed from: fM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData r6) {
        /*
            r5 = this;
            com.google.android.apps.gsa.search.shared.service.b.uo r6 = r6.f236959a
            int r6 = r6.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r6)
            if (r6 != 0) goto L_0x000c
            com.google.android.apps.gsa.search.shared.service.b.um r6 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x000c:
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ON_SERVICE_CONNECTED
            if (r6 != r0) goto L_0x00a0
            com.google.common.f.e r6 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.voiceinteraction.GsaVoiceInteractionService r6 = r5.f118793a
            r6.mo49400O()
            com.google.android.voiceinteraction.GsaVoiceInteractionService r6 = r5.f118793a
            java.lang.Object r6 = r6.f118726v
            monitor-enter(r6)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r5.f118793a     // Catch:{ all -> 0x009d }
            com.google.android.hotword.service.HotwordInformation r1 = r0.f118664aJ     // Catch:{ all -> 0x009d }
            r2 = 6
            r3 = 4
            if (r1 != 0) goto L_0x0034
            com.google.android.voiceinteraction.ao r0 = r0.f118660aF     // Catch:{ all -> 0x009d }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x009d }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r5.f118793a     // Catch:{ all -> 0x009d }
            com.google.android.voiceinteraction.ao r0 = r0.f118660aF     // Catch:{ all -> 0x009d }
            r0.sendEmptyMessage(r2)     // Catch:{ all -> 0x009d }
            monitor-exit(r6)     // Catch:{ all -> 0x009d }
            return
        L_0x0034:
            boolean r4 = r1.f395885f     // Catch:{ all -> 0x009d }
            if (r4 != 0) goto L_0x008a
            boolean r4 = r1.f395893n     // Catch:{ all -> 0x009d }
            if (r4 != 0) goto L_0x008a
            com.google.android.apps.gsa.voiceinteraction.hotword.g r4 = r0.f118632D     // Catch:{ all -> 0x009d }
            if (r4 == 0) goto L_0x0047
            com.google.android.apps.gsa.voiceinteraction.hotword.h r4 = r4.f331147j     // Catch:{ all -> 0x009d }
            boolean r4 = r4.f331166g     // Catch:{ all -> 0x009d }
            if (r4 == 0) goto L_0x0047
            goto L_0x008a
        L_0x0047:
            boolean r1 = r1.f395883d     // Catch:{ all -> 0x009d }
            if (r1 != 0) goto L_0x005a
            int r0 = r0.f118703ay     // Catch:{ all -> 0x009d }
            r1 = 2
            if (r0 != r1) goto L_0x0051
            goto L_0x005a
        L_0x0051:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r5.f118793a     // Catch:{ all -> 0x009d }
            com.google.android.voiceinteraction.ao r0 = r0.f118660aF     // Catch:{ all -> 0x009d }
            r0.sendEmptyMessage(r2)     // Catch:{ all -> 0x009d }
            monitor-exit(r6)     // Catch:{ all -> 0x009d }
            return
        L_0x005a:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r5.f118793a     // Catch:{ all -> 0x009d }
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r1 = r0.f118729y     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0070
            com.google.android.voiceinteraction.ao r0 = r0.f118660aF     // Catch:{ all -> 0x009d }
            r0.removeMessages(r3)     // Catch:{ all -> 0x009d }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r5.f118793a     // Catch:{ all -> 0x009d }
            r0.mo49443p()     // Catch:{ all -> 0x009d }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r5.f118793a     // Catch:{ all -> 0x009d }
            r0.mo49446s()     // Catch:{ all -> 0x009d }
            goto L_0x009b
        L_0x0070:
            boolean r1 = r0.f118704az     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x009b
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f118718n     // Catch:{ all -> 0x009d }
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x009b
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r5.f118793a     // Catch:{ all -> 0x009d }
            r1 = 16000(0x3e80, float:2.2421E-41)
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r1 = r0.mo49428j(r1)     // Catch:{ all -> 0x009d }
            r0.mo49389D(r1)     // Catch:{ all -> 0x009d }
            goto L_0x009b
        L_0x008a:
            com.google.android.apps.gsa.shared.speech.hotword.HotwordResult r1 = r0.f118729y     // Catch:{ all -> 0x009d }
            if (r1 == 0) goto L_0x0096
            r0.mo49443p()     // Catch:{ all -> 0x009d }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r5.f118793a     // Catch:{ all -> 0x009d }
            r0.mo49446s()     // Catch:{ all -> 0x009d }
        L_0x0096:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r5.f118793a     // Catch:{ all -> 0x009d }
            r0.mo49396K()     // Catch:{ all -> 0x009d }
        L_0x009b:
            monitor-exit(r6)     // Catch:{ all -> 0x009d }
            return
        L_0x009d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x009d }
            throw r0
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45418z.mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }
}
