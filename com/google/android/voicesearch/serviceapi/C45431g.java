package com.google.android.voicesearch.serviceapi;

import android.os.Bundle;
import android.speech.RecognitionService;

/* renamed from: com.google.android.voicesearch.serviceapi.g */
/* compiled from: PG */
public final /* synthetic */ class C45431g implements C45435k {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f118822a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f118823b;

    public /* synthetic */ C45431g(RecognitionService.Callback callback, Bundle bundle) {
        this.f118822a = callback;
        this.f118823b = bundle;
    }

    /* renamed from: a */
    public final void mo49558a() {
        RecognitionService.Callback callback = this.f118822a;
        Bundle bundle = this.f118823b;
        int i = C45434j.f118828b;
        callback.results(bundle);
    }
}
