package com.google.android.libraries.assistant.p1363c.p1398g.p1444o.p1446b;

import android.speech.tts.TextToSpeech;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.assistant.c.g.o.b.e */
/* compiled from: PG */
public final /* synthetic */ class C17579e implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f50681a;

    public /* synthetic */ C17579e(AtomicReference atomicReference) {
        this.f50681a = atomicReference;
    }

    public final void onInit(int i) {
        AtomicReference atomicReference = this.f50681a;
        if (i != 0) {
            C59104x d = C17584j.f50687a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TTS.OnDevice");
            ((C59052c) ((C59052c) d).mo56372aa(42803)).mo56386p("TextToSpeech init failed");
            ((C2164c) atomicReference.get()).mo5439d(new Throwable(String.valueOf(i)));
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        ((C2164c) atomicReference.get()).mo5437b((Object) null);
    }
}
