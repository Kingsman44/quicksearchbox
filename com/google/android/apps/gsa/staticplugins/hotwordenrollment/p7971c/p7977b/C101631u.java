package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.u */
/* compiled from: PG */
public final class C101631u implements C92515a {

    /* renamed from: a */
    final /* synthetic */ C92518d f283597a;

    /* renamed from: b */
    final /* synthetic */ C101633w f283598b;

    public C101631u(C101633w wVar, C92518d dVar) {
        this.f283598b = wVar;
        this.f283597a = dVar;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        if (z) {
            this.f283598b.f283604d = this.f283597a.mo87281i();
            C101633w wVar = this.f283598b;
            boolean z2 = false;
            if (this.f283597a.mo87279g() && this.f283597a.mo87282j()) {
                z2 = true;
            }
            wVar.f283605e = z2;
            C59104x b = C101633w.f283601a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PhoneDspEnroll");
            C101633w wVar2 = this.f283598b;
            ((C59052c) ((C59052c) b).mo56372aa(20368)).mo56358K("hardwareVoiceTriggerSupported: %b, hardwareEnabled: %b", wVar2.f283604d, wVar2.f283605e);
        }
    }

    /* renamed from: b */
    public final void mo49376b() {
    }
}
