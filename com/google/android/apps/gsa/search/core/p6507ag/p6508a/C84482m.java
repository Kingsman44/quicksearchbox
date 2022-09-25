package com.google.android.apps.gsa.search.core.p6507ag.p6508a;

import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.search.core.ag.a.m */
/* compiled from: PG */
final class C84482m implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof TimeoutException) {
            C58970a aVar = (C58970a) ((C58970a) C84483n.f229908a.mo56226d()).mo56382g(th);
            aVar.mo56378ag(C38505d.f101864b, 159331515);
            ((C58970a) aVar.mo56372aa(9348)).mo56386p("Timed out accessing the server tokens.");
            return;
        }
        C58970a aVar2 = (C58970a) ((C58970a) C84483n.f229908a.mo56226d()).mo56382g(th);
        aVar2.mo56378ag(C38505d.f101864b, 147449327);
        ((C58970a) aVar2.mo56372aa(9347)).mo56386p("Error while fetching the token.");
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
    }
}
