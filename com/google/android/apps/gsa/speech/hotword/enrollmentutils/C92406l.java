package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92516b;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.l */
/* compiled from: PG */
public final /* synthetic */ class C92406l implements C92516b {

    /* renamed from: a */
    public final /* synthetic */ C92518d f257698a;

    /* renamed from: b */
    public final /* synthetic */ C91097g f257699b;

    /* renamed from: c */
    public final /* synthetic */ EventForDump f257700c;

    public /* synthetic */ C92406l(C92518d dVar, C91097g gVar, EventForDump eventForDump) {
        this.f257698a = dVar;
        this.f257699b = gVar;
        this.f257700c = eventForDump;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        C92518d dVar = this.f257698a;
        C91097g gVar = this.f257699b;
        EventForDump eventForDump = this.f257700c;
        if (z) {
            dVar.mo87285m(gVar, new C92405k(dVar, eventForDump));
            return;
        }
        ((C59052c) ((C59052c) C92408n.f257704a.mo56225c()).mo56372aa(12515)).mo56386p("#reEnrollAlwaysOn - failed to initialize always-on hotword adapter.");
        dVar.mo87274b();
    }
}
