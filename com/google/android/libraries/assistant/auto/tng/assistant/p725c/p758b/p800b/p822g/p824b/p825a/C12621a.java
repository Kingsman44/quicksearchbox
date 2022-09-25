package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.p824b.p825a;

import android.content.AttributionSource;
import android.os.Bundle;
import android.speech.RecognitionListener;
import androidx.core.p094f.C1888a;
import com.google.android.apps.search.transcription.p10670f.p10678g.C141908u;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.g.b.a.a */
/* compiled from: PG */
final class C12621a implements C141908u {

    /* renamed from: a */
    final /* synthetic */ C12622b f39601a;

    public C12621a(C12622b bVar) {
        this.f39601a = bVar;
    }

    /* renamed from: a */
    public final AttributionSource mo20696a() {
        return null;
    }

    /* renamed from: b */
    public final void mo20697b() {
        RecognitionListener recognitionListener = this.f39601a.f39604c;
        if (recognitionListener == null) {
            ((C59052c) ((C59052c) C12622b.f39602a.mo56226d()).mo56372aa(44340)).mo56386p("RecognitionListener not set for RecognitionService callback.");
        } else {
            recognitionListener.onBeginningOfSpeech();
        }
    }

    /* renamed from: c */
    public final void mo20698c() {
        RecognitionListener recognitionListener = this.f39601a.f39604c;
        if (recognitionListener == null) {
            ((C59052c) ((C59052c) C12622b.f39602a.mo56226d()).mo56372aa(44341)).mo56386p("RecognitionListener not set for RecognitionService callback.");
        } else if (C1888a.m5150d()) {
            recognitionListener.onEndOfSegmentedSession();
        }
    }

    /* renamed from: d */
    public final void mo20699d() {
        if (this.f39601a.f39604c == null) {
            ((C59052c) ((C59052c) C12622b.f39602a.mo56226d()).mo56372aa(44342)).mo56386p("RecognitionListener not set for RecognitionService callback.");
        }
    }

    /* renamed from: e */
    public final void mo20700e(int i) {
        RecognitionListener recognitionListener = this.f39601a.f39604c;
        if (recognitionListener == null) {
            ((C59052c) ((C59052c) C12622b.f39602a.mo56226d()).mo56372aa(44343)).mo56386p("RecognitionListener not set for RecognitionService callback.");
        } else {
            recognitionListener.onError(i);
        }
    }

    /* renamed from: f */
    public final void mo20701f(Bundle bundle) {
        RecognitionListener recognitionListener = this.f39601a.f39604c;
        if (recognitionListener == null) {
            ((C59052c) ((C59052c) C12622b.f39602a.mo56226d()).mo56372aa(44344)).mo56386p("RecognitionListener not set for RecognitionService callback.");
        } else {
            recognitionListener.onPartialResults(bundle);
        }
    }

    /* renamed from: g */
    public final void mo20702g(Bundle bundle) {
        RecognitionListener recognitionListener = this.f39601a.f39604c;
        if (recognitionListener == null) {
            ((C59052c) ((C59052c) C12622b.f39602a.mo56226d()).mo56372aa(44345)).mo56386p("RecognitionListener not set for RecognitionService callback.");
        } else {
            recognitionListener.onReadyForSpeech(bundle);
        }
    }

    /* renamed from: h */
    public final void mo20703h(Bundle bundle) {
        if (this.f39601a.f39604c == null) {
            ((C59052c) ((C59052c) C12622b.f39602a.mo56226d()).mo56372aa(44346)).mo56386p("RecognitionListener not set for RecognitionService callback.");
        }
    }

    /* renamed from: i */
    public final void mo20704i(float f) {
        RecognitionListener recognitionListener = this.f39601a.f39604c;
        if (recognitionListener == null) {
            ((C59052c) ((C59052c) C12622b.f39602a.mo56226d()).mo56372aa(44347)).mo56386p("RecognitionListener not set for RecognitionService callback.");
        } else {
            recognitionListener.onRmsChanged(f);
        }
    }

    /* renamed from: j */
    public final void mo20705j(Bundle bundle) {
        RecognitionListener recognitionListener = this.f39601a.f39604c;
        if (recognitionListener == null) {
            ((C59052c) ((C59052c) C12622b.f39602a.mo56226d()).mo56372aa(44348)).mo56386p("RecognitionListener not set for RecognitionService callback.");
            return;
        }
        bundle.putBoolean("final_result", true);
        recognitionListener.onPartialResults(bundle);
        if (C1888a.m5150d()) {
            recognitionListener.onSegmentResults(bundle);
        }
    }
}
