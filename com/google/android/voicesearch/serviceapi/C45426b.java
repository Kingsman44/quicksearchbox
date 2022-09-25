package com.google.android.voicesearch.serviceapi;

import android.speech.RecognitionService;

/* renamed from: com.google.android.voicesearch.serviceapi.b */
/* compiled from: PG */
public final /* synthetic */ class C45426b implements C45435k {

    /* renamed from: a */
    public final /* synthetic */ RecognitionService.Callback f118814a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f118815b;

    public /* synthetic */ C45426b(RecognitionService.Callback callback, byte[] bArr) {
        this.f118814a = callback;
        this.f118815b = bArr;
    }

    /* renamed from: a */
    public final void mo49558a() {
        RecognitionService.Callback callback = this.f118814a;
        byte[] bArr = this.f118815b;
        int i = C45434j.f118828b;
        callback.bufferReceived(bArr);
    }
}
