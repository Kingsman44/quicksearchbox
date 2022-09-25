package com.google.android.apps.gsa.nga.engine.bisto.p5993b;

import android.speech.SpeechRecognizer;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.bisto.b.z */
/* compiled from: PG */
public final /* synthetic */ class C75308z implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ ac f209783a;

    public /* synthetic */ C75308z(ac acVar) {
        this.f209783a = acVar;
    }

    public final void run() {
        ac acVar = this.f209783a;
        SpeechRecognizer speechRecognizer = acVar.c;
        if (speechRecognizer != null) {
            speechRecognizer.stopListening();
            acVar.c.destroy();
            acVar.c = null;
        }
    }
}
