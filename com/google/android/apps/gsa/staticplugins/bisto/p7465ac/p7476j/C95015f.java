package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7476j;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.j.f */
/* compiled from: PG */
public final /* synthetic */ class C95015f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ TextToSpeech f265827a;

    /* renamed from: b */
    public final /* synthetic */ String f265828b;

    public /* synthetic */ C95015f(TextToSpeech textToSpeech, String str) {
        this.f265827a = textToSpeech;
        this.f265828b = str;
    }

    public final void run() {
        TextToSpeech textToSpeech = this.f265827a;
        String str = this.f265828b;
        Bundle bundle = new Bundle();
        double random = Math.random();
        StringBuilder sb = new StringBuilder();
        sb.append(random);
        textToSpeech.speak(str, 0, bundle, sb.toString());
    }
}
