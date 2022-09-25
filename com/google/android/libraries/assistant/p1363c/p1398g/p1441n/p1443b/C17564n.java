package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import android.speech.tts.TextToSpeech;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.n */
/* compiled from: PG */
final class C17564n {

    /* renamed from: a */
    public final TextToSpeech f50625a;

    /* renamed from: b */
    private final boolean f50626b;

    public C17564n(TextToSpeech textToSpeech, boolean z) {
        this.f50625a = textToSpeech;
        this.f50626b = z;
    }

    /* renamed from: a */
    public final void mo23394a(C17477am amVar) {
        if (this.f50626b) {
            C59104x b = C17565o.f50627a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
            ((C59052c) ((C59052c) b).mo56372aa(42779)).mo56389s("Do not shut down the cached TTS engine for session token %s since it is shared.", C17377g.m34655c(amVar));
            return;
        }
        C59104x b2 = C17565o.f50627a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) b2).mo56372aa(42778)).mo56389s("Shutting down TTS engine for session token %s.", C17377g.m34655c(amVar));
        this.f50625a.shutdown();
    }
}
