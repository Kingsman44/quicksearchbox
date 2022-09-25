package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92515a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.m */
/* compiled from: PG */
final class C92407m implements C92515a {

    /* renamed from: a */
    final /* synthetic */ C92518d f257701a;

    /* renamed from: b */
    final /* synthetic */ C91097g f257702b;

    /* renamed from: c */
    final /* synthetic */ EventForDump f257703c;

    public C92407m(C92518d dVar, C91097g gVar, EventForDump eventForDump) {
        this.f257701a = dVar;
        this.f257702b = gVar;
        this.f257703c = eventForDump;
    }

    /* renamed from: a */
    public final void mo49375a(boolean z) {
        if (z) {
            C92518d dVar = this.f257701a;
            dVar.mo87275c(new C92406l(dVar, this.f257702b, this.f257703c));
            return;
        }
        ((C59052c) ((C59052c) C92408n.f257704a.mo56225c()).mo56372aa(12516)).mo56386p("#reEnrollAlwaysOn - failed to connect to always-on hotword adapter.");
    }

    /* renamed from: b */
    public final void mo49376b() {
    }
}
