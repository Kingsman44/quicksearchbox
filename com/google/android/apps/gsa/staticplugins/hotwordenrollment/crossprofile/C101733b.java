package com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile;

import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92516b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.crossprofile.b */
/* compiled from: PG */
final class C101733b implements C92515a {

    /* renamed from: a */
    final /* synthetic */ C101735d f283832a;

    public C101733b(C101735d dVar) {
        this.f283832a = dVar;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        if (z && this.f283832a.f283837b != null) {
            C59104x b = C101735d.f283836a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AlwaysOnAController");
            ((C59052c) ((C59052c) b).mo56372aa(20250)).mo56386p("Initializing AlwaysOnAdapter for new model");
            this.f283832a.f283837b.mo87275c((C92516b) null);
        }
    }

    /* renamed from: b */
    public final void mo49376b() {
    }
}
