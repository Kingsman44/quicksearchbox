package com.google.android.apps.gsa.assist;

import android.app.VoiceInteractor;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.assist.bz */
/* compiled from: PG */
final class C9385bz extends C9396ca {

    /* renamed from: d */
    private final VoiceInteractionSession.PickOptionRequest f32549d;

    public C9385bz(C9397cb cbVar, VoiceInteractionSession.PickOptionRequest pickOptionRequest) {
        super(cbVar, pickOptionRequest);
        this.f32549d = pickOptionRequest;
    }

    /* renamed from: a */
    public final int mo17556a() {
        return 4;
    }

    /* renamed from: b */
    public final VoiceInteractor.Prompt mo17557b() {
        return this.f32549d.getVoicePrompt();
    }

    /* renamed from: i */
    public final void mo17575i(List list, Bundle bundle) {
        if (mo17592m()) {
            this.f32549d.sendIntermediatePickOptionResult((VoiceInteractor.PickOptionRequest.Option[]) list.toArray(new VoiceInteractor.PickOptionRequest.Option[0]), bundle);
        }
    }

    /* renamed from: j */
    public final void mo17576j(List list, Bundle bundle) {
        if (mo17592m()) {
            this.f32549d.sendPickOptionResult((VoiceInteractor.PickOptionRequest.Option[]) list.toArray(new VoiceInteractor.PickOptionRequest.Option[0]), bundle);
        }
    }

    /* renamed from: k */
    public final VoiceInteractor.PickOptionRequest.Option[] mo17577k() {
        return this.f32549d.getOptions();
    }
}
