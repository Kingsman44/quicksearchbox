package com.google.android.apps.search.pronunciationlearning.p10635d;

import android.speech.tts.UtteranceProgressListener;
import com.google.android.libraries.search.p2904c.C37346ak;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d.p */
/* compiled from: PG */
final class C141397p extends UtteranceProgressListener {

    /* renamed from: a */
    final /* synthetic */ C141399r f383820a;

    public C141397p(C141399r rVar) {
        this.f383820a = rVar;
    }

    public final void onDone(String str) {
        C37346ak akVar = C141399r.f383822a;
        this.f383820a.mo116409b(str);
    }

    public final void onError(String str) {
        C37346ak akVar = C141399r.f383822a;
        this.f383820a.mo116409b(str);
    }

    public final void onStart(String str) {
        C37346ak akVar = C141399r.f383822a;
    }
}
