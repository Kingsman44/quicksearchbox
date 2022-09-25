package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92517c;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.an */
/* compiled from: PG */
public final /* synthetic */ class C92585an implements C92517c {

    /* renamed from: a */
    public final /* synthetic */ C92591at f258368a;

    /* renamed from: b */
    public final /* synthetic */ C92518d f258369b;

    /* renamed from: c */
    public final /* synthetic */ EventForDump f258370c;

    public /* synthetic */ C92585an(C92591at atVar, C92518d dVar, EventForDump eventForDump) {
        this.f258368a = atVar;
        this.f258369b = dVar;
        this.f258370c = eventForDump;
    }

    /* renamed from: a */
    public final void mo87049a(boolean z) {
        C92591at atVar = this.f258368a;
        C92518d dVar = this.f258369b;
        EventForDump eventForDump = this.f258370c;
        if (z) {
            C58976aa aaVar = C58975e.f156826a;
            if (dVar.mo87281i()) {
                atVar.mo87363e(eventForDump);
                atVar.f258387e.mo83702b(C89849ae.DELETE_UTTERANCES_ON_DELETE_VOICE_MODEL_ALWAYS_ON);
            } else {
                atVar.f258385c.mo64739a();
            }
            dVar.mo87274b();
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        dVar.mo87284l(true, new C92588aq(dVar), eventForDump);
    }
}
