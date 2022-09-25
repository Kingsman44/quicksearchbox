package com.google.android.voicesearch.serviceapi;

import android.speech.RecognitionService;

/* renamed from: com.google.android.voicesearch.serviceapi.h */
/* compiled from: PG */
public final /* synthetic */ class C45432h implements C45435k {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f118824a;

    /* renamed from: b */
    public final /* synthetic */ int f118825b;

    public /* synthetic */ C45432h(RecognitionService.Callback callback, int i) {
        this.f118824a = callback;
        this.f118825b = i;
    }

    /* renamed from: a */
    public final void mo49558a() {
        RecognitionService.Callback callback = this.f118824a;
        int i = this.f118825b;
        int i2 = C45434j.f118828b;
        callback.error(i);
    }
}
