package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.k */
/* compiled from: PG */
public final /* synthetic */ class C102815k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C102821q f287093a;

    public /* synthetic */ C102815k(C102821q qVar) {
        this.f287093a = qVar;
    }

    public final Object apply(Object obj) {
        C102821q qVar = this.f287093a;
        C59104x c = C102821q.f287099a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(21185)).mo56386p("MobileDataDownload-based update failed! Please check Task logs for error.");
        qVar.mo93465e();
        qVar.mo93466f(C89849ae.HOTWORD_MODEL_MDD_FAILED);
        return C118826c.f331422a;
    }
}
