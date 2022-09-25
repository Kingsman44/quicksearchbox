package com.google.android.apps.gsa.staticplugins.microdetection;

import com.google.android.apps.gsa.shared.speech.p7140b.C90531a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.z */
/* compiled from: PG */
public final /* synthetic */ class C102870z implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102792ac f287306a;

    /* renamed from: b */
    public final /* synthetic */ C90531a f287307b;

    /* renamed from: c */
    public final /* synthetic */ boolean f287308c;

    /* renamed from: d */
    public final /* synthetic */ C102790aa f287309d;

    public /* synthetic */ C102870z(C102792ac acVar, C90531a aVar, boolean z, C102790aa aaVar) {
        this.f287306a = acVar;
        this.f287307b = aVar;
        this.f287308c = z;
        this.f287309d = aaVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C102792ac acVar = this.f287306a;
        C90531a aVar = this.f287307b;
        boolean z = this.f287308c;
        C102790aa aaVar = this.f287309d;
        Exception exc = (Exception) obj;
        C59104x d = C102792ac.f287014a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MicroDetector");
        ((C59052c) ((C59052c) d).mo56372aa(21151)).mo56386p("Failed to get stopListeningSeamlessHotwordData");
        acVar.mo93458f(aVar, z, aaVar, C58836b.f156633a);
    }
}
