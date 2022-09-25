package com.google.android.apps.search.assistant.surfaces.dictation.service.p9429a;

import android.content.Context;
import android.speech.SpeechRecognizer;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.a.cj */
/* compiled from: PG */
final class C125246cj implements Callable {

    /* renamed from: a */
    final /* synthetic */ Context f345508a;

    public C125246cj(Context context) {
        this.f345508a = context;
    }

    public final /* synthetic */ Object call() {
        return SpeechRecognizer.createOnDeviceSpeechRecognizer(this.f345508a);
    }
}
