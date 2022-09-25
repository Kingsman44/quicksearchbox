package com.google.android.apps.gsa.speech.hotword.enrollmentutils;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92516b;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92517c;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.speech.hotword.enrollmentutils.k */
/* compiled from: PG */
public final /* synthetic */ class C92405k implements C92517c {

    /* renamed from: a */
    public final /* synthetic */ C92518d f257696a;

    /* renamed from: b */
    public final /* synthetic */ EventForDump f257697b;

    public /* synthetic */ C92405k(C92518d dVar, EventForDump eventForDump) {
        this.f257696a = dVar;
        this.f257697b = eventForDump;
    }

    /* renamed from: a */
    public final void mo87049a(boolean z) {
        C92518d dVar = this.f257696a;
        EventForDump eventForDump = this.f257697b;
        if (z) {
            dVar.mo87284l(true, (C92516b) null, eventForDump);
        } else {
            ((C59052c) ((C59052c) C92408n.f257704a.mo56225c()).mo56372aa(12513)).mo56386p("#reEnrollAlwaysOn - failed to re-enroll always-on.");
        }
        dVar.mo87274b();
    }
}
