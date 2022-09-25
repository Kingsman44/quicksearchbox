package com.google.android.voiceinteraction;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;

/* renamed from: com.google.android.voiceinteraction.d */
/* compiled from: PG */
public final /* synthetic */ class C45396d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GsaVoiceInteractionService f118765a;

    /* renamed from: b */
    public final /* synthetic */ HotwordResult f118766b;

    public /* synthetic */ C45396d(GsaVoiceInteractionService gsaVoiceInteractionService, HotwordResult hotwordResult) {
        this.f118765a = gsaVoiceInteractionService;
        this.f118766b = hotwordResult;
    }

    public final void run() {
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118765a;
        HotwordResult hotwordResult = this.f118766b;
        C87673aa aaVar = gsaVoiceInteractionService.f118730z;
        C88489j jVar = new C88489j(C87739bu.HOTWORD_REJECTED_AFTER_DSP_TRIGGERED);
        jVar.mo82015c(hotwordResult);
        aaVar.mo81937i(jVar.mo82013a());
    }
}
