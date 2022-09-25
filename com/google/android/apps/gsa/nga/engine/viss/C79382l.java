package com.google.android.apps.gsa.nga.engine.viss;

import android.service.voice.VoiceInteractionSession;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.viss.l */
/* compiled from: PG */
public final /* synthetic */ class C79382l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ NgaVoiceInteractionSessionService f218001a;

    public /* synthetic */ C79382l(NgaVoiceInteractionSessionService ngaVoiceInteractionSessionService) {
        this.f218001a = ngaVoiceInteractionSessionService;
    }

    public final void run() {
        NgaVoiceInteractionSessionService ngaVoiceInteractionSessionService = this.f218001a;
        synchronized (ngaVoiceInteractionSessionService.f217968o) {
            VoiceInteractionSession voiceInteractionSession = ngaVoiceInteractionSessionService.f217971r;
            if (voiceInteractionSession != null) {
                ngaVoiceInteractionSessionService.f217971r = null;
                voiceInteractionSession.finish();
            }
        }
    }
}
