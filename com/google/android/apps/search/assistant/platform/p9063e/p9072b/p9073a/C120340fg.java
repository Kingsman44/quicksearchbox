package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120510g;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.libraries.search.p2904c.p2990z.p2991a.C38287c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.fg */
/* compiled from: PG */
final class C120340fg implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C120510g f334800a;

    /* renamed from: b */
    final /* synthetic */ C120342fi f334801b;

    public C120340fg(C120342fi fiVar, C120510g gVar) {
        this.f334801b = fiVar;
        this.f334800a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C120511h hVar = (C120511h) obj;
        C38287c cVar = this.f334801b.f334815j;
        if (cVar != null) {
            cVar.mo41357a();
            C59104x b = C120342fi.f334807b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            ((C59052c) ((C59052c) b).mo56372aa(34704)).mo56386p("Closing AudioRecordWriter, finalizing the stored audio.");
        }
        hVar.mo104773e(this.f334800a);
    }
}
