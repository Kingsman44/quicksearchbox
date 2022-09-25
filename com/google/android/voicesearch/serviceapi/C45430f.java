package com.google.android.voicesearch.serviceapi;

import android.speech.RecognitionService;

/* renamed from: com.google.android.voicesearch.serviceapi.f */
/* compiled from: PG */
public final /* synthetic */ class C45430f implements C45435k {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f118820a;

    /* renamed from: b */
    public final /* synthetic */ float f118821b;

    public /* synthetic */ C45430f(RecognitionService.Callback callback, float f) {
        this.f118820a = callback;
        this.f118821b = f;
    }

    /* renamed from: a */
    public final void mo49558a() {
        RecognitionService.Callback callback = this.f118820a;
        float f = this.f118821b;
        int i = C45434j.f118828b;
        callback.rmsChanged(f);
    }
}
