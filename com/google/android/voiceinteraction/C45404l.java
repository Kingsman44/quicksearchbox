package com.google.android.voiceinteraction;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.voiceinteraction.l */
/* compiled from: PG */
final class C45404l implements ServiceConnection {

    /* renamed from: a */
    public boolean f118777a = true;

    /* renamed from: b */
    final /* synthetic */ GsaVoiceInteractionService f118778b;

    public C45404l(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118778b = gsaVoiceInteractionService;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r5, android.os.IBinder r6) {
        /*
            r4 = this;
            com.google.common.f.e r5 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.voiceinteraction.GsaVoiceInteractionService r5 = r4.f118778b
            com.google.android.apps.gsa.search.shared.service.g r0 = new com.google.android.apps.gsa.search.shared.service.g
            r0.<init>()
            com.google.common.o.amo r1 = com.google.common.p4552o.amo.STARTUP_RECEIVER
            r0.f239201c = r1
            java.lang.String r1 = "device_boot_or_install"
            r0.f239204f = r1
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = new com.google.android.apps.gsa.search.shared.service.ClientConfig
            r1.<init>(r0)
            com.google.android.apps.gsa.search.shared.service.d.e r5 = r5.f118647S
            com.google.android.apps.gsa.search.shared.service.j r0 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.HOTWORD_SERVICE_CONNECTED
            r0.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            r0.mo82015c(r2)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r0.mo82013a()
            long r2 = com.google.android.apps.gsa.broadcastreceiver.C74444a.f208519a
            r5.mo82004b(r1, r0, r2)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r5 = r4.f118778b
            java.lang.Object r5 = r5.f118725u
            monitor-enter(r5)
            com.google.android.voiceinteraction.GsaVoiceInteractionService r0 = r4.f118778b     // Catch:{ all -> 0x00ac }
            if (r6 != 0) goto L_0x003d
            r6 = 0
            goto L_0x0051
        L_0x003d:
            java.lang.String r1 = "com.google.android.hotword.service.IHotwordService"
            android.os.IInterface r1 = r6.queryLocalInterface(r1)     // Catch:{ all -> 0x00ac }
            boolean r2 = r1 instanceof com.google.android.hotword.service.C146591i     // Catch:{ all -> 0x00ac }
            if (r2 == 0) goto L_0x004b
            r6 = r1
            com.google.android.hotword.service.i r6 = (com.google.android.hotword.service.C146591i) r6     // Catch:{ all -> 0x00ac }
            goto L_0x0051
        L_0x004b:
            com.google.android.hotword.service.g r1 = new com.google.android.hotword.service.g     // Catch:{ all -> 0x00ac }
            r1.<init>(r6)     // Catch:{ all -> 0x00ac }
            r6 = r1
        L_0x0051:
            r0.f118661aG = r6     // Catch:{ all -> 0x00ac }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r6 = r4.f118778b     // Catch:{ all -> 0x00ac }
            boolean r0 = r6.f118713i     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0088
            com.google.android.hotword.service.i r6 = r6.f118661aG     // Catch:{ RemoteException -> 0x0064 }
            r6.mo123392d()     // Catch:{ RemoteException -> 0x0064 }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r6 = r4.f118778b     // Catch:{ all -> 0x00ac }
            r0 = 0
            r6.f118713i = r0     // Catch:{ all -> 0x00ac }
            goto L_0x0088
        L_0x0064:
            r6 = move-exception
            com.google.common.f.e r0 = com.google.android.voiceinteraction.GsaVoiceInteractionService.f118622a     // Catch:{ all -> 0x00ac }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x00ac }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "GsaVoiceInteractionSrv"
            r0.mo56378ag(r1, r2)     // Catch:{ all -> 0x00ac }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x00ac }
            com.google.common.f.x r6 = r0.mo56382g(r6)     // Catch:{ all -> 0x00ac }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x00ac }
            r0 = 54386(0xd472, float:7.6211E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r0)     // Catch:{ all -> 0x00ac }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "RemoteException during regenerateSpeakerIdModel call"
            r6.mo56386p(r0)     // Catch:{ all -> 0x00ac }
        L_0x0088:
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            com.google.android.voiceinteraction.GsaVoiceInteractionService r5 = r4.f118778b
            com.google.common.util.concurrent.db r6 = r5.f118720p
            if (r6 != 0) goto L_0x009b
            com.google.android.apps.gsa.shared.util.c.a.k r6 = r5.f118676aV
            if (r6 == 0) goto L_0x009b
            java.lang.String r0 = "HotwordBackgroundExecutor"
            com.google.common.util.concurrent.db r6 = r6.mo85208a(r0)
            r5.f118720p = r6
        L_0x009b:
            com.google.android.voiceinteraction.GsaVoiceInteractionService r5 = r4.f118778b
            com.google.common.util.concurrent.db r5 = r5.f118720p
            com.google.android.voiceinteraction.k r6 = new com.google.android.voiceinteraction.k
            r6.<init>(r4)
            java.lang.Runnable r6 = com.google.apps.tiktok.tracing.C47810es.m84977q(r6)
            r5.execute(r6)
            return
        L_0x00ac:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voiceinteraction.C45404l.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C59071e eVar = GsaVoiceInteractionService.f118622a;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f118778b.f118725u) {
            this.f118778b.f118661aG = null;
        }
    }
}
