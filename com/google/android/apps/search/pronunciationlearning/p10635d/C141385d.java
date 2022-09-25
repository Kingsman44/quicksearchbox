package com.google.android.apps.search.pronunciationlearning.p10635d;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d.d */
/* compiled from: PG */
public final /* synthetic */ class C141385d implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C141386e f383801a;

    /* renamed from: b */
    public final /* synthetic */ Context f383802b;

    public /* synthetic */ C141385d(C141386e eVar, Context context) {
        this.f383801a = eVar;
        this.f383802b = context;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        this.f383801a.f383804b = new TextToSpeech(this.f383802b, new C141383b(cVar));
        return "PronTng.PlayTts";
    }
}
