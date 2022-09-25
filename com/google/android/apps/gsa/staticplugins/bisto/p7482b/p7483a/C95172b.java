package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7483a;

import android.content.Context;
import android.speech.tts.TextToSpeech;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C95172b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95173c f266274a;

    /* renamed from: b */
    public final /* synthetic */ Context f266275b;

    public /* synthetic */ C95172b(C95173c cVar, Context context) {
        this.f266274a = cVar;
        this.f266275b = context;
    }

    public final void run() {
        TextToSpeech textToSpeech;
        C95173c cVar = this.f266274a;
        Context context = this.f266275b;
        synchronized (cVar.f266279d) {
            textToSpeech = cVar.f266282g;
        }
        if (textToSpeech == null) {
            cVar.mo89083d(context);
        }
    }
}
