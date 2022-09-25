package com.google.android.apps.gsa.staticplugins.p7666ci;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.ah */
/* compiled from: PG */
public final /* synthetic */ class C97768ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C97775ao f272982a;

    public /* synthetic */ C97768ah(C97775ao aoVar) {
        this.f272982a = aoVar;
    }

    public final C60870cx apply(Object obj) {
        C97775ao aoVar = this.f272982a;
        if (!((Boolean) obj).booleanValue()) {
            C59104x d = C97775ao.f272987a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.BackgroundTask");
            C0118a.m108p(d, "No local calendar update worker enqueued on PCP", 30251, C38505d.f101863a, Integer.valueOf(C89885b.PCP_LOCAL_CALENDAR_UPDATE_WORKER_NOT_FOUND_VALUE));
            C60870cx c = aoVar.f272988b.mo106146c();
            C97773am amVar = new C97773am();
            C60856cj.m92911t(c, C47810es.m84974n(amVar), C60826bg.f164896a);
        }
        return C60866ct.f164955a;
    }
}
