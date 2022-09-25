package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.h */
/* compiled from: PG */
public final /* synthetic */ class C128228h implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public final /* synthetic */ C2164c f352718a;

    public /* synthetic */ C128228h(C2164c cVar) {
        this.f352718a = cVar;
    }

    public final void onInit(int i) {
        C2164c cVar = this.f352718a;
        C58974d dVar = C128235o.f352733a;
        if (i == 0) {
            cVar.mo5437b((Object) null);
        } else {
            cVar.mo5439d(new RuntimeException("TTS Init Failed"));
        }
    }
}
