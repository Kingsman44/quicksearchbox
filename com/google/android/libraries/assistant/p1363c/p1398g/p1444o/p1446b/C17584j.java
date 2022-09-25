package com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2169h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.g.o.b.j */
/* compiled from: PG */
public final class C17584j {

    /* renamed from: a */
    public static final C59071e f50687a = C59071e.m91332i("com.google.android.libraries.assistant.c.g.o.b.j");

    /* renamed from: b */
    public final AtomicReference f50688b = new AtomicReference(Optional.empty());

    /* renamed from: c */
    private final Context f50689c;

    /* renamed from: d */
    private final Executor f50690d;

    public C17584j(Context context, Executor executor) {
        this.f50689c = context;
        this.f50690d = executor;
    }

    /* renamed from: a */
    public final void mo23402a(Locale locale) {
        C59104x b = f50687a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) b).mo56372aa(42804)).mo56389s("Prewarming on-device TTS synthesis engine for locale: %s", locale);
        Context context = this.f50689c;
        Executor executor = this.f50690d;
        AtomicReference atomicReference = new AtomicReference();
        C60870cx a = C2169h.m6027a(new C17581g(atomicReference));
        TextToSpeech textToSpeech = new TextToSpeech(context, new C17579e(atomicReference));
        C60856cj.m92911t(a, C47810es.m84974n(new C17582h(textToSpeech, locale, context)), executor);
        ((Optional) this.f50688b.getAndSet(Optional.m71637of(new C17575a(textToSpeech, locale)))).ifPresent(C17580f.f50682a);
    }
}
