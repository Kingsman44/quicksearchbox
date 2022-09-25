package com.google.android.apps.gsa.staticplugins.microdetection;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.speech.microdetection.C92530c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.h */
/* compiled from: PG */
public final /* synthetic */ class C102852h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ MicroDetectionWorker f287271a;

    /* renamed from: b */
    public final /* synthetic */ C92530c f287272b;

    /* renamed from: c */
    public final /* synthetic */ long f287273c;

    public /* synthetic */ C102852h(MicroDetectionWorker microDetectionWorker, C92530c cVar, long j) {
        this.f287271a = microDetectionWorker;
        this.f287272b = cVar;
        this.f287273c = j;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        MicroDetectionWorker microDetectionWorker = this.f287271a;
        C92530c cVar = this.f287272b;
        long j = this.f287273c;
        Exception exc = (Exception) obj;
        C59104x d = MicroDetectionWorker.f286928a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MicroDetectionWorker");
        ((C59052c) ((C59052c) d).mo56372aa(21106)).mo56386p("Failed to cancel the ongoing transcription");
        microDetectionWorker.mo93429A(cVar, j);
    }
}
