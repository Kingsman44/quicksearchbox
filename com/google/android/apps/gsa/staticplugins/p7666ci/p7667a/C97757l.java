package com.google.android.apps.gsa.staticplugins.p7666ci.p7667a;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.a.l */
/* compiled from: PG */
public final /* synthetic */ class C97757l implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C97758m f272945a;

    /* renamed from: b */
    public final /* synthetic */ C53422nh f272946b;

    public /* synthetic */ C97757l(C97758m mVar, C53422nh nhVar) {
        this.f272945a = mVar;
        this.f272946b = nhVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C97758m mVar = this.f272945a;
        C53422nh nhVar = this.f272946b;
        C59104x d = C97759n.f272950a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.ClientSyncHelper");
        C0118a.m114v(d, obj, "Failed to write Zero State response with error %s", 30301);
        mVar.mo90802a(nhVar);
    }
}
