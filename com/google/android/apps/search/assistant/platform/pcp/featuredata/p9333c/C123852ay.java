package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.UUID;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.ay */
/* compiled from: PG */
final class C123852ay implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f342126a;

    /* renamed from: b */
    final /* synthetic */ C123853az f342127b;

    public C123852ay(C123853az azVar, String str) {
        this.f342127b = azVar;
        this.f342126a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58970a aVar = (C58970a) this.f342127b.f342134e.mo56226d();
        aVar.mo56378ag(C38505d.f101863a, Integer.valueOf(C89885b.PCP_FAIL_TO_ENQUEUE_LOCAL_CALENDAR_UPDATE_WORKER_VALUE));
        ((C58970a) ((C58970a) aVar.mo56382g(th)).mo56372aa(35290)).mo56389s("Failed to enqueue local calendar update worker with uniquess key %s", this.f342126a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        UUID uuid = (UUID) obj;
    }
}
