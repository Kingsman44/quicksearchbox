package com.google.android.apps.search.googleapp.discover.feedback;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.googleapp.discover.feedback.b */
/* compiled from: PG */
final class C134300b implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C134301c.f365821a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "DebugRequestSender");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(40337)).mo56386p("Failed to send debug request.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C59104x b = C134301c.f365821a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DebugRequestSender");
        ((C59052c) ((C59052c) b).mo56372aa(40338)).mo56386p("Successfully sent debug request");
    }
}
