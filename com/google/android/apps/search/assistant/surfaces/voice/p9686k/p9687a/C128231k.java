package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.k */
/* compiled from: PG */
public final /* synthetic */ class C128231k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C128235o f352724a;

    /* renamed from: b */
    public final /* synthetic */ Locale f352725b;

    /* renamed from: c */
    public final /* synthetic */ AtomicReference f352726c;

    public /* synthetic */ C128231k(C128235o oVar, Locale locale, AtomicReference atomicReference) {
        this.f352724a = oVar;
        this.f352725b = locale;
        this.f352726c = atomicReference;
    }

    public final C60870cx apply(Object obj) {
        C128235o oVar = this.f352724a;
        Locale locale = this.f352725b;
        Void voidR = (Void) obj;
        TextToSpeech textToSpeech = (TextToSpeech) this.f352726c.get();
        if (locale.equals(Locale.US)) {
            return C60866ct.f164955a;
        }
        int i = oVar.f352736d;
        oVar.f352736d = i + 1;
        String str = "InterpreterTtsDownloader" + i;
        File createTempFile = File.createTempFile(str, ".wav", oVar.f352734b.getCacheDir());
        textToSpeech.setLanguage(locale);
        C60870cx a = C2169h.m6027a(new C128229i(textToSpeech, str, createTempFile));
        C60856cj.m92911t(a, C47810es.m84974n(new C128234n(createTempFile)), oVar.f352735c);
        return a;
    }
}
