package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.io.File;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.i */
/* compiled from: PG */
public final /* synthetic */ class C128229i implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ TextToSpeech f352719a;

    /* renamed from: b */
    public final /* synthetic */ String f352720b;

    /* renamed from: c */
    public final /* synthetic */ File f352721c;

    public /* synthetic */ C128229i(TextToSpeech textToSpeech, String str, File file) {
        this.f352719a = textToSpeech;
        this.f352720b = str;
        this.f352721c = file;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        TextToSpeech textToSpeech = this.f352719a;
        String str = this.f352720b;
        File file = this.f352721c;
        textToSpeech.setOnUtteranceProgressListener(new C128233m(str, textToSpeech, cVar));
        textToSpeech.synthesizeToFile("a", new Bundle(), file, str);
        return "RemoveExpiredResourceTask.downloadTts";
    }
}
