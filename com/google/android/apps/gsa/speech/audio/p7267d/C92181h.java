package com.google.android.apps.gsa.speech.audio.p7267d;

import android.media.AudioManager;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.staticplugins.p8031m.C102687e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.audio.d.h */
/* compiled from: PG */
final class C92181h implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ C92183j f256978a;

    public C92181h(C92183j jVar) {
        this.f256978a = jVar;
    }

    public final void onAudioFocusChange(int i) {
        C102687e eVar;
        C59104x b = C92183j.f256984a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AudioRouter");
        ((C59052c) ((C59052c) b).mo56372aa(12159)).mo56387q("Audio focus change %d", i);
        if (i == -1 || i == -2 || i == -3) {
            synchronized (this.f256978a.f256990g) {
                eVar = this.f256978a.f256992i;
            }
            this.f256978a.f256987d.mo28212l("AudioFocusLost", new C92180g(this, eVar));
            if (((C90021c) this.f256978a.f256988e.mo27525b()).mo79746e(C90086ek.f250420cm)) {
                C92183j jVar = this.f256978a;
                synchronized (jVar.f256990g) {
                    if (jVar.f256991h) {
                        jVar.f256991h = false;
                    }
                }
            }
        }
    }
}
