package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92603b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.d */
/* compiled from: PG */
final class C92609d extends C92603b {

    /* renamed from: a */
    final /* synthetic */ C92614i f258452a;

    public C92609d(C92614i iVar) {
        this.f258452a = iVar;
    }

    /* renamed from: a */
    public final void mo64739a() {
        this.f258452a.mo87391g();
    }

    /* renamed from: b */
    public final void mo87383b(boolean z) {
        C92518d dVar;
        C92614i iVar = this.f258452a;
        C58976aa aaVar = C58975e.f156826a;
        if (iVar.f258460d.get() || !iVar.f258458b.mo83817f() || (dVar = iVar.f258459c) == null) {
            C59104x b = C92614i.f258457a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AlwaysOnHotwordCntrlr");
            ((C59052c) ((C59052c) b).mo56372aa(12915)).mo56386p("Not setting recognition state, using HDM.");
            return;
        }
        dVar.mo87276d(new C92612g(iVar, z));
    }
}
