package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.as */
/* compiled from: PG */
public final /* synthetic */ class C97779as implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C97783aw f273005a;

    /* renamed from: b */
    public final /* synthetic */ C118476ak f273006b;

    public /* synthetic */ C97779as(C97783aw awVar, C118476ak akVar) {
        this.f273005a = awVar;
        this.f273006b = akVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C97783aw awVar = this.f273005a;
        C118476ak akVar = this.f273006b;
        C59104x d = C97783aw.f273010a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.AutoBgTask");
        C0118a.m114v(d, obj, "Failed to write Zero State response with error %s", 30258);
        awVar.mo90812b(akVar, awVar.f273013d);
    }
}
