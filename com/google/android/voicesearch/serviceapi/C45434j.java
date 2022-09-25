package com.google.android.voicesearch.serviceapi;

import android.os.Bundle;
import android.os.RemoteException;
import android.speech.RecognitionListener;
import android.speech.RecognitionService;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Objects;

/* renamed from: com.google.android.voicesearch.serviceapi.j */
/* compiled from: PG */
final class C45434j implements RecognitionListener {

    /* renamed from: b */
    public static final /* synthetic */ int f118828b = 0;

    /* renamed from: a */
    final /* synthetic */ RecognitionService.Callback f118829a;

    public C45434j(RecognitionService.Callback callback) {
        this.f118829a = callback;
    }

    /* renamed from: a */
    private static final void m81063a(C45435k kVar) {
        try {
            kVar.mo49558a();
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C45436l.f118830a.mo56225c()).mo56382g(e)).mo56372aa(54673)).mo56384n();
        }
    }

    public final void onBeginningOfSpeech() {
        RecognitionService.Callback callback = this.f118829a;
        Objects.requireNonNull(callback);
        m81063a(new C45427c(callback));
    }

    public final void onBufferReceived(byte[] bArr) {
        m81063a(new C45426b(this.f118829a, bArr));
    }

    public final void onEndOfSpeech() {
        RecognitionService.Callback callback = this.f118829a;
        Objects.requireNonNull(callback);
        m81063a(new C45428d(callback));
    }

    public final void onError(int i) {
        m81063a(new C45432h(this.f118829a, i));
    }

    public final void onEvent(int i, Bundle bundle) {
    }

    public final void onPartialResults(Bundle bundle) {
        m81063a(new C45429e(this.f118829a, bundle));
    }

    public final void onReadyForSpeech(Bundle bundle) {
        m81063a(new C45433i(this.f118829a, bundle));
    }

    public final void onResults(Bundle bundle) {
        m81063a(new C45431g(this.f118829a, bundle));
    }

    public final void onRmsChanged(float f) {
        m81063a(new C45430f(this.f118829a, f));
    }
}
