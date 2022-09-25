package com.google.android.apps.gsa.staticplugins.p7800di.p7801a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.di.a.b */
/* compiled from: PG */
final class C99549b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ long f278538a;

    public C99549b(long j) {
        this.f278538a = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C99550c.f278539a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PBSessionCacheImpl");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(32646)).mo56388r("Failed to delete sessionId[%d] from persistence.", this.f278538a);
        int i = C90755l.f253831a;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C59104x b = C99550c.f278539a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PBSessionCacheImpl");
        ((C59052c) ((C59052c) b).mo56372aa(32647)).mo56388r("Deleted sessionId[%d] from persistence.", this.f278538a);
    }
}
