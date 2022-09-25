package com.google.android.apps.search.pronunciationlearning.p10635d;

import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.pronunciationlearning.d.e */
/* compiled from: PG */
public final class C141386e implements C141382a {

    /* renamed from: a */
    public static final C59071e f383803a = C59071e.m91332i("com.google.android.apps.search.pronunciationlearning.d.e");

    /* renamed from: b */
    public TextToSpeech f383804b;

    /* renamed from: c */
    private final C60870cx f383805c;

    /* renamed from: d */
    private final C60887da f383806d;

    public C141386e(Context context, C60887da daVar) {
        this.f383805c = C2169h.m6027a(new C141385d(this, context));
        this.f383806d = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo116398a(Locale locale, UtteranceProgressListener utteranceProgressListener) {
        C60870cx cxVar = this.f383805c;
        C141384c cVar = new C141384c(this, locale, utteranceProgressListener);
        return C60922j.m93044g(cxVar, C47810es.m84963c(cVar), this.f383806d);
    }

    /* renamed from: b */
    public final void mo116399b(CharSequence charSequence, Bundle bundle, String str) {
        TextToSpeech textToSpeech;
        if (((C2168g) this.f383805c).f6144b.isDone() && (textToSpeech = this.f383804b) != null) {
            textToSpeech.speak(charSequence, 0, bundle, str);
        }
    }

    /* renamed from: c */
    public final void mo116400c() {
        TextToSpeech textToSpeech;
        if (((C2168g) this.f383805c).f6144b.isDone() && (textToSpeech = this.f383804b) != null) {
            textToSpeech.stop();
        }
    }
}
