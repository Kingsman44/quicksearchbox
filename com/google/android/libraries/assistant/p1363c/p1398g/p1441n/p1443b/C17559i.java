package com.google.android.libraries.assistant.p1363c.p1398g.p1441n.p1443b;

import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17477am;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.assistant.c.g.n.b.i */
/* compiled from: PG */
public final /* synthetic */ class C17559i implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public final /* synthetic */ C17477am f50614a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f50615b;

    public /* synthetic */ C17559i(C17477am amVar, AtomicReference atomicReference) {
        this.f50614a = amVar;
        this.f50615b = atomicReference;
    }

    public final void onInit(int i) {
        C17477am amVar = this.f50614a;
        AtomicReference atomicReference = this.f50615b;
        if (i != 0) {
            C59104x d = C17565o.f50627a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
            ((C59052c) ((C59052c) d).mo56372aa(42787)).mo56389s("On-device TTS engine init failed for sessionToken %s", C17377g.m34655c(amVar));
            ((C2164c) atomicReference.get()).mo5439d(new Throwable(String.valueOf(i)));
            return;
        }
        C59104x b = C17565o.f50627a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
        ((C59052c) ((C59052c) b).mo56372aa(42786)).mo56389s("On-device TTS engine init success for sessionToken %s", C17377g.m34655c(amVar));
        ((C2164c) atomicReference.get()).mo5437b((Object) null);
    }
}
