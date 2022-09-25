package com.google.android.voicesearch.serviceapi;

import android.os.Bundle;
import android.speech.RecognitionService;

/* renamed from: com.google.android.voicesearch.serviceapi.e */
/* compiled from: PG */
public final /* synthetic */ class C45429e implements C45435k {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f118818a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f118819b;

    public /* synthetic */ C45429e(RecognitionService.Callback callback, Bundle bundle) {
        this.f118818a = callback;
        this.f118819b = bundle;
    }

    /* renamed from: a */
    public final void mo49558a() {
        RecognitionService.Callback callback = this.f118818a;
        Bundle bundle = this.f118819b;
        int i = C45434j.f118828b;
        callback.partialResults(bundle);
    }
}
