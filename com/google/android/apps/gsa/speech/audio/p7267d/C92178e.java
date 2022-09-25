package com.google.android.apps.gsa.speech.audio.p7267d;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.audio.d.e */
/* compiled from: PG */
public final /* synthetic */ class C92178e implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C92183j f256974a;

    public /* synthetic */ C92178e(C92183j jVar) {
        this.f256974a = jVar;
    }

    public final void run() {
        int i;
        C92183j jVar = this.f256974a;
        synchronized (jVar.f256990g) {
            if (!jVar.f256991h) {
                int i2 = 3;
                int i3 = true != ((C90021c) jVar.f256988e.mo27525b()).mo79746e(C90014bt.f247276eB) ? 4 : 3;
                if (true == jVar.mo86838A()) {
                    i2 = 0;
                }
                C59104x b = C92183j.f256984a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "AudioRouter");
                ((C59052c) ((C59052c) b).mo56372aa(12173)).mo56393w("Requesting audio focus: %d, stream: %d", i3, i2);
                AudioAttributes r = jVar.mo86839r(jVar.mo86838A());
                AudioFocusRequest.Builder builder = jVar.f256989f;
                if (builder == null || r == null) {
                    i = jVar.f256986c.requestAudioFocus(jVar.f256985b, i2, i3);
                } else {
                    builder.setFocusGain(i3).setAudioAttributes(r);
                    C59104x b2 = C92183j.f256984a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "AudioRouter");
                    ((C59052c) ((C59052c) b2).mo56372aa(12176)).mo56395y("focusType: %d, AudioAttributes: %s", i3, r);
                    i = jVar.f256986c.requestAudioFocus(jVar.f256989f.build());
                }
                if (i == 1) {
                    C59104x b3 = C92183j.f256984a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "AudioRouter");
                    ((C59052c) ((C59052c) b3).mo56372aa(12175)).mo56386p("Audio focus obtained");
                    jVar.f256991h = true;
                } else {
                    C59104x d = C92183j.f256984a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "AudioRouter");
                    ((C59052c) ((C59052c) d).mo56372aa(12174)).mo56387q("Unable to obtain audio focus for stream: %d", i2);
                }
            }
        }
    }
}
