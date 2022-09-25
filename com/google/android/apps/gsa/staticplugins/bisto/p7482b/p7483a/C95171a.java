package com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7483a;

import android.content.Context;
import android.media.AudioAttributes;
import android.speech.tts.TextToSpeech;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C95171a implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public final /* synthetic */ C95173c f266272a;

    /* renamed from: b */
    public final /* synthetic */ Context f266273b;

    public /* synthetic */ C95171a(C95173c cVar, Context context) {
        this.f266272a = cVar;
        this.f266273b = context;
    }

    public final void onInit(int i) {
        C95173c cVar = this.f266272a;
        Context context = this.f266273b;
        if (i != 0) {
            synchronized (cVar.f266279d) {
                cVar.f266282g = null;
            }
            C59104x c = C95173c.f266276a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BaseTts");
            ((C59052c) ((C59052c) c).mo56372aa(14573)).mo56387q("Could not init TTS engine. Error code: %d", i);
            long j = cVar.f266284i;
            if (j > 0) {
                cVar.f266284i = j - 1;
                cVar.f266280e.mo29164d(new C95172b(cVar, context), C95173c.f266277b, TimeUnit.MILLISECONDS);
                return;
            }
            C89655j.m145957a("Could not init TTS engine after retries. Error code: " + i);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        synchronized (cVar.f266279d) {
            TextToSpeech textToSpeech = cVar.f266282g;
            if (!cVar.f266283h) {
                if (textToSpeech != null) {
                    double q = cVar.f266281f.mo83562q();
                    if (q > C59203do.f157270a) {
                        textToSpeech.setSpeechRate((float) q);
                    }
                    textToSpeech.setLanguage(Locale.getDefault());
                    textToSpeech.setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setLegacyStreamType(3).setUsage(1).build());
                    cVar.f266283h = true;
                    cVar.mo89084e(context);
                }
            }
        }
    }
}
