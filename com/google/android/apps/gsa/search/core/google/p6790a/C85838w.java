package com.google.android.apps.gsa.search.core.google.p6790a;

import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21546c;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.w */
/* compiled from: PG */
public final /* synthetic */ class C85838w implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C85841z f232088a;

    public /* synthetic */ C85838w(C85841z zVar) {
        this.f232088a = zVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int i;
        C85841z zVar = this.f232088a;
        Exception exc = (Exception) obj;
        C59104x c = C85841z.f232095a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "CarrierParamsFiller");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(7938)).mo56386p("Failed to fetch carrier plan information");
        if (exc instanceof C21546c) {
            i = 4;
        } else {
            i = exc instanceof TimeoutException ? 3 : 5;
        }
        return zVar.mo79475f(i, "Failed on getCarrierPlanId API call: ".concat(String.valueOf(exc.getMessage())));
    }
}
