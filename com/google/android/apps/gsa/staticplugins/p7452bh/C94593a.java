package com.google.android.apps.gsa.staticplugins.p7452bh;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.microdetection.p8041c.C102826v;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bh.a */
/* compiled from: PG */
public final /* synthetic */ class C94593a implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C94595c f264575a;

    /* renamed from: b */
    public final /* synthetic */ long f264576b;

    public /* synthetic */ C94593a(C94595c cVar, long j) {
        this.f264575a = cVar;
        this.f264576b = j;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C94595c cVar = this.f264575a;
        long j = this.f264576b;
        C102826v vVar = (C102826v) cVar.f264581f.mo27525b();
        C59104x b = C102826v.f287124a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ModelDnldProcssHelpr");
        ((C59052c) ((C59052c) b).mo56372aa(21229)).mo56388r("#handleDownloadComplete, downloadId=%d", j);
        vVar.mo93473c(j, "pending_hotword_model_download_info");
        vVar.mo93473c(j, "pending_xgoogle_hotword_model_download_info");
        return C118826c.f331423b;
    }
}
