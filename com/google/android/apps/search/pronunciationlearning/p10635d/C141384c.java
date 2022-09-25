package com.google.android.apps.search.pronunciationlearning.p10635d;

import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d.c */
/* compiled from: PG */
public final /* synthetic */ class C141384c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C141386e f383798a;

    /* renamed from: b */
    public final /* synthetic */ Locale f383799b;

    /* renamed from: c */
    public final /* synthetic */ UtteranceProgressListener f383800c;

    public /* synthetic */ C141384c(C141386e eVar, Locale locale, UtteranceProgressListener utteranceProgressListener) {
        this.f383798a = eVar;
        this.f383799b = locale;
        this.f383800c = utteranceProgressListener;
    }

    public final Object apply(Object obj) {
        C141386e eVar = this.f383798a;
        Locale locale = this.f383799b;
        UtteranceProgressListener utteranceProgressListener = this.f383800c;
        Void voidR = (Void) obj;
        TextToSpeech textToSpeech = eVar.f383804b;
        if (textToSpeech != null) {
            textToSpeech.setSpeechRate(1.0f);
            eVar.f383804b.setLanguage(locale);
            eVar.f383804b.setOnUtteranceProgressListener(utteranceProgressListener);
            return null;
        }
        ((C59052c) ((C59052c) C141386e.f383803a.mo56226d()).mo56372aa(41685)).mo56386p("tts init failed");
        return null;
    }
}
