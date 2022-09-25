package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.e */
/* compiled from: PG */
final class C92610e implements C92515a {

    /* renamed from: a */
    final /* synthetic */ C92614i f258453a;

    public C92610e(C92614i iVar) {
        this.f258453a = iVar;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        if (!z) {
            C59104x c = C92614i.f258457a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
            ((C59052c) ((C59052c) c).mo56372aa(12905)).mo56386p("Cannot connect to Hotword Adapter");
        }
        this.f258453a.mo87390f();
    }

    /* renamed from: b */
    public final void mo49376b() {
        this.f258453a.f258460d.set(true);
        this.f258453a.mo87390f();
    }
}
