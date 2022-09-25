package com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b;

import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.io.File;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.google.android.libraries.assistant.c.g.o.b.h */
/* compiled from: PG */
final class C17582h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ TextToSpeech f50684a;

    /* renamed from: b */
    final /* synthetic */ Locale f50685b;

    /* renamed from: c */
    final /* synthetic */ Context f50686c;

    public C17582h(TextToSpeech textToSpeech, Locale locale, Context context) {
        this.f50684a = textToSpeech;
        this.f50685b = locale;
        this.f50686c = context;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C17584j.f50687a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(42799)).mo56386p("Cancellation/Failure in textToSpeechInitFuture.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f50684a.setLanguage(this.f50685b);
        try {
            File createTempFile = File.createTempFile("tmpsynthesize", ".wav", this.f50686c.getCacheDir());
            this.f50684a.synthesizeToFile("42", new Bundle(), createTempFile, "dummytext");
            createTempFile.deleteOnExit();
        } catch (IOException e) {
            C59104x d = C17584j.f50687a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(42800)).mo56386p("Failed to prewarm on-device TTS engine");
        }
    }
}
