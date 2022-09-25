package com.google.android.voicesearch.serviceapi;

import android.os.Bundle;
import android.speech.RecognitionService;

/* renamed from: com.google.android.voicesearch.serviceapi.i */
/* compiled from: PG */
public final /* synthetic */ class C45433i implements C45435k {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f118826a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f118827b;

    public /* synthetic */ C45433i(RecognitionService.Callback callback, Bundle bundle) {
        this.f118826a = callback;
        this.f118827b = bundle;
    }

    /* renamed from: a */
    public final void mo49558a() {
        RecognitionService.Callback callback = this.f118826a;
        Bundle bundle = this.f118827b;
        int i = C45434j.f118828b;
        callback.readyForSpeech(bundle);
    }
}
