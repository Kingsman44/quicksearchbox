package com.google.apps.tiktok.tracing.contrib.p3685a.p3686a;

import android.os.Bundle;
import android.speech.RecognitionListener;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.a.a.a */
/* compiled from: PG */
public final class C47592a implements RecognitionListener {

    /* renamed from: a */
    private final RecognitionListener f123511a;

    /* renamed from: b */
    private final C47816ey f123512b;

    public C47592a(RecognitionListener recognitionListener, C47816ey eyVar) {
        this.f123511a = recognitionListener;
        this.f123512b = eyVar;
    }

    public final void onBeginningOfSpeech() {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        try {
            this.f123511a.onBeginningOfSpeech();
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onBufferReceived(byte[] bArr) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        C47831fm.m85013h(e.f123841a);
    }

    public final void onEndOfSegmentedSession() {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        C47831fm.m85013h(e.f123841a);
    }

    public final void onEndOfSpeech() {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        C47831fm.m85013h(e.f123841a);
    }

    public final void onError(int i) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        try {
            this.f123511a.onError(i);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onEvent(int i, Bundle bundle) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        C47831fm.m85013h(e.f123841a);
    }

    public final void onPartialResults(Bundle bundle) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        try {
            this.f123511a.onPartialResults(bundle);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onReadyForSpeech(Bundle bundle) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        try {
            this.f123511a.onReadyForSpeech(bundle);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onResults(Bundle bundle) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        C47831fm.m85013h(e.f123841a);
    }

    public final void onRmsChanged(float f) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        try {
            this.f123511a.onRmsChanged(f);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }

    public final void onSegmentResults(Bundle bundle) {
        C47816ey e = C47816ey.m84990e();
        C47831fm.m85013h(this.f123512b.f123841a);
        try {
            this.f123511a.onSegmentResults(bundle);
        } finally {
            C47831fm.m85013h(e.f123841a);
        }
    }
}
