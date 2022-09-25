package com.google.android.apps.gsa.staticplugins.opa.translator.offline;

import android.os.Bundle;
import android.speech.RecognitionListener;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113611x;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113613z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.translator.offline.s */
/* compiled from: PG */
public final class C113640s implements RecognitionListener {

    /* renamed from: a */
    public final String f314693a;

    /* renamed from: b */
    public final String f314694b;

    /* renamed from: c */
    public final boolean f314695c;

    /* renamed from: d */
    final /* synthetic */ OfflineSubController f314696d;

    /* renamed from: e */
    public final C113611x f314697e;

    public C113640s(OfflineSubController offlineSubController, C113611x xVar, String str, String str2, boolean z) {
        this.f314696d = offlineSubController;
        this.f314697e = xVar;
        this.f314693a = str;
        this.f314694b = str2;
        this.f314695c = z;
    }

    /* renamed from: a */
    private static final Optional m188128a(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(stringArrayList.get(0));
    }

    public final void onBeginningOfSpeech() {
    }

    public final void onBufferReceived(byte[] bArr) {
    }

    public final void onEndOfSpeech() {
    }

    public final void onError(int i) {
        ((C59052c) ((C59052c) OfflineSubController.f314597a.mo56226d()).mo56372aa(28100)).mo56387q("RecognitionListener onError %d", i);
    }

    public final void onEvent(int i, Bundle bundle) {
    }

    public final void onPartialResults(Bundle bundle) {
        Optional a = m188128a(bundle);
        C113611x xVar = this.f314697e;
        Objects.requireNonNull(xVar);
        a.ifPresent(new C113638q(xVar));
    }

    public final void onReadyForSpeech(Bundle bundle) {
        C113611x xVar = this.f314697e;
        C59071e eVar = C113613z.f314555a;
        C58976aa aaVar = C58975e.f156826a;
        xVar.f314553b.mo19698B(3);
    }

    public final void onResults(Bundle bundle) {
        m188128a(bundle).ifPresent(new C113639r(this));
    }

    public final void onRmsChanged(float f) {
        C113611x xVar = this.f314697e;
        float min = Math.min(Math.max(f, -2.0f), 10.0f);
        C59071e eVar = C113613z.f314555a;
        C58976aa aaVar = C58975e.f156826a;
        xVar.f314553b.f314577e.f299387a = (int) (((min + 2.0f) * 100.0f) / 12.0f);
    }
}
