package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.m */
/* compiled from: PG */
final class C128233m extends UtteranceProgressListener {

    /* renamed from: a */
    final /* synthetic */ String f352729a;

    /* renamed from: b */
    final /* synthetic */ TextToSpeech f352730b;

    /* renamed from: c */
    final /* synthetic */ C2164c f352731c;

    public C128233m(String str, TextToSpeech textToSpeech, C2164c cVar) {
        this.f352729a = str;
        this.f352730b = textToSpeech;
        this.f352731c = cVar;
    }

    public final void onDone(String str) {
        if (this.f352729a.equals(str)) {
            C58974d dVar = C128235o.f352733a;
            this.f352731c.mo5437b((Object) null);
        }
    }

    public final void onError(String str) {
        if (this.f352729a.equals(str)) {
            C58974d dVar = C128235o.f352733a;
            this.f352731c.mo5438c();
        }
    }

    public final void onStart(String str) {
        if (this.f352729a.equals(str)) {
            C58974d dVar = C128235o.f352733a;
            this.f352730b.stop();
            this.f352731c.mo5437b((Object) null);
        }
    }
}
