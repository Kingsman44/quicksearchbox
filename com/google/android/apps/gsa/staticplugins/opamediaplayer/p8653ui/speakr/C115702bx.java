package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.apps.gsa.shared.monet.p7114f.C90324b;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115446p;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.bx */
/* compiled from: PG */
final class C115702bx extends C90324b {

    /* renamed from: a */
    final /* synthetic */ C22945j f320900a;

    /* renamed from: b */
    final /* synthetic */ C115446p f320901b;

    public C115702bx(C22945j jVar, C115446p pVar) {
        this.f320900a = jVar;
        this.f320901b = pVar;
    }

    /* renamed from: c */
    public final void mo84008c() {
        C59104x b = C115711cf.f320912e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
        ((C59052c) ((C59052c) b).mo56372aa(29995)).mo56386p("Activity resumed.");
        if (this.f320900a.mo28316z()) {
            this.f320901b.mo101927s();
        }
    }

    /* renamed from: e */
    public final void mo84010e() {
        C59104x b = C115711cf.f320912e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
        ((C59052c) ((C59052c) b).mo56372aa(29996)).mo56386p("Activity stopped.");
        if (this.f320900a.mo28316z()) {
            this.f320901b.mo101928t();
        }
    }
}
