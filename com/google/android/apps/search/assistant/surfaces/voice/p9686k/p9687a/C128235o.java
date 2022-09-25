package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.o */
/* compiled from: PG */
public final class C128235o {

    /* renamed from: a */
    public static final C58974d f352733a = C58974d.m91135i("InterpreterTtsDownload");

    /* renamed from: b */
    public final Context f352734b;

    /* renamed from: c */
    public final Executor f352735c;

    /* renamed from: d */
    public int f352736d = 0;

    public C128235o(Context context, C60887da daVar) {
        this.f352734b = context;
        this.f352735c = new C60904dr(daVar);
    }

    /* renamed from: a */
    public static void m209320a(AtomicReference atomicReference) {
        ((TextToSpeech) atomicReference.get()).stop();
        ((TextToSpeech) atomicReference.get()).shutdown();
    }
}
