package com.google.android.apps.gsa.assist;

import android.service.voice.VoiceInteractionSession;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.assist.cd */
/* compiled from: PG */
public final /* synthetic */ class C9399cd implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ GsaVoiceInteractionSessionService f32664a;

    /* renamed from: b */
    public final /* synthetic */ NgaState f32665b;

    public /* synthetic */ C9399cd(GsaVoiceInteractionSessionService gsaVoiceInteractionSessionService, NgaState ngaState) {
        this.f32664a = gsaVoiceInteractionSessionService;
        this.f32665b = ngaState;
    }

    public final void run() {
        VoiceInteractionSession voiceInteractionSession;
        GsaVoiceInteractionSessionService gsaVoiceInteractionSessionService = this.f32664a;
        NgaState ngaState = this.f32665b;
        synchronized (gsaVoiceInteractionSessionService.f32311d) {
            if (ngaState.a() && (voiceInteractionSession = gsaVoiceInteractionSessionService.f32312e) != null) {
                voiceInteractionSession.finish();
                gsaVoiceInteractionSessionService.f32312e = null;
                if (ngaState.a()) {
                    gsaVoiceInteractionSessionService.f32313f.mo98044a();
                }
                if (gsaVoiceInteractionSessionService.f32309b.mo56113h()) {
                    ((C74720bx) gsaVoiceInteractionSessionService.f32309b.mo56107c()).mo71091h(gsaVoiceInteractionSessionService);
                }
            }
        }
    }
}
