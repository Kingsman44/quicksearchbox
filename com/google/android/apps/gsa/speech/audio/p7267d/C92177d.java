package com.google.android.apps.gsa.speech.audio.p7267d;

import android.media.audiofx.LoudnessEnhancer;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.audio.d.d */
/* compiled from: PG */
public final /* synthetic */ class C92177d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ int f256973a;

    public /* synthetic */ C92177d(int i) {
        this.f256973a = i;
    }

    public final void run() {
        int i = this.f256973a;
        C92182i a = C92182i.m151314a();
        a.mo86836b();
        if (a.mo86837c()) {
            try {
                synchronized (a.f256980a) {
                    a.f256981b = new LoudnessEnhancer(i);
                    a.f256981b.setTargetGain(SimpleSnackbar.LENGTH_SHORT);
                    a.f256981b.setEnabled(true);
                    C58976aa aaVar = C58975e.f156826a;
                }
            } catch (RuntimeException e) {
                C59104x c = C92183j.f256984a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AudioRouter");
                C59052c cVar = (C59052c) c;
                cVar.mo56378ag(C58975e.f156826a, "LoudnessEnhancerProxy");
                ((C59052c) ((C59052c) cVar.mo56382g(e)).mo56372aa(12161)).mo56386p("Error when enabling loudness enhancer");
                a.mo86836b();
            }
        }
    }
}
