package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92516b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.v */
/* compiled from: PG */
final class C101632v implements C92515a {

    /* renamed from: a */
    final /* synthetic */ C2164c f283599a;

    /* renamed from: b */
    final /* synthetic */ C101633w f283600b;

    public C101632v(C101633w wVar, C2164c cVar) {
        this.f283600b = wVar;
        this.f283599a = cVar;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        if (z) {
            C59104x b = C101633w.f283601a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PhoneDspEnroll");
            ((C59052c) ((C59052c) b).mo56372aa(20370)).mo56386p("Set recognition state to true");
            this.f283600b.f283602b.mo87284l(true, (C92516b) null, EventForDump.m147676e(8, "#handleEnrollResult"));
            this.f283599a.mo5437b(true);
            return;
        }
        C59104x c = C101633w.f283601a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PhoneDspEnroll");
        ((C59052c) ((C59052c) c).mo56372aa(20369)).mo56386p("Set recognition state failure.");
        this.f283599a.mo5437b(false);
    }

    /* renamed from: b */
    public final void mo49376b() {
    }
}
