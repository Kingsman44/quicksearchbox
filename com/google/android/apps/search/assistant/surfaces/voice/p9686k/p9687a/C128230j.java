package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.j */
/* compiled from: PG */
public final /* synthetic */ class C128230j implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C128235o f352722a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f352723b;

    public /* synthetic */ C128230j(C128235o oVar, AtomicReference atomicReference) {
        this.f352722a = oVar;
        this.f352723b = atomicReference;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        this.f352723b.set(new TextToSpeech(this.f352722a.f352734b, new C128228h(cVar)));
        return "InterpreterDownloadSubController.InitTts";
    }
}
