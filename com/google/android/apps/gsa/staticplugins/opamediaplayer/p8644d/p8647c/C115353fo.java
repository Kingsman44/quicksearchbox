package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import com.google.android.apps.gsa.search.core.p6788g.p6789a.C85773c;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p5285d.p5290b.p5291a.p5292a.C68185bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.fo */
/* compiled from: PG */
public final /* synthetic */ class C115353fo implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115368gc f320066a;

    /* renamed from: b */
    public final /* synthetic */ C68185bu f320067b;

    public /* synthetic */ C115353fo(C115368gc gcVar, C68185bu buVar) {
        this.f320066a = gcVar;
        this.f320067b = buVar;
    }

    public final void run() {
        C115368gc gcVar = this.f320066a;
        C68185bu buVar = this.f320067b;
        if (!((Boolean) ((C23251a) gcVar.f320085f.mo102027b()).f63720e).booleanValue()) {
            if (!gcVar.f320089j.containsKey(gcVar.f320083d)) {
                C59104x d = C115368gc.f320080a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SpeakrVoiceSelectionC");
                ((C59052c) ((C59052c) d).mo56372aa(29889)).mo56389s("No voice selection guidance for language %s.", gcVar.f320083d);
                return;
            }
            TtsRequest ttsRequest = new TtsRequest((String) gcVar.f320089j.get(gcVar.f320083d), false);
            ttsRequest.f236282f = true;
            ttsRequest.f236286j = buVar.f184499a;
            ttsRequest.f236285i = gcVar.f320083d;
            gcVar.f320081b.mo104043d(new C115348fj(gcVar));
            gcVar.f320081b.mo104042c(new C115356fr(gcVar));
            C115215al alVar = gcVar.f320090k;
            if (!alVar.f319747c) {
                alVar.f319748d = C58833ax.m90834k(new AudioFocusRequest.Builder(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(alVar.f319746b).setWillPauseWhenDucked(true).build());
                if (alVar.f319745a.requestAudioFocus((AudioFocusRequest) alVar.f319748d.mo56107c()) == 1) {
                    alVar.f319747c = true;
                } else {
                    return;
                }
            }
            ((C85773c) gcVar.f320082c.mo56107c()).mo79433c(ttsRequest, ttsRequest.f236285i, gcVar.f320092m, gcVar.f320091l, 2);
        }
    }
}
