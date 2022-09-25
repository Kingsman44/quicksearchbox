package com.google.android.apps.search.assistant.platform.pcp.p9324a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95883aa;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.a.h */
/* compiled from: PG */
public final /* synthetic */ class C123570h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123576n f341445a;

    public /* synthetic */ C123570h(C123576n nVar) {
        this.f341445a = nVar;
    }

    public final C60870cx apply(Object obj) {
        C123576n nVar = this.f341445a;
        if (!((Boolean) obj).booleanValue()) {
            C95883aa.m158983d(nVar.f341460j.mo56226d(), "No local calendar update worker enqueued on PCP", 35164, C38505d.f101863a, Integer.valueOf(C89885b.PCP_LOCAL_CALENDAR_UPDATE_WORKER_NOT_FOUND_VALUE));
            C60870cx c = nVar.f341457g.mo106146c();
            C123574l lVar = new C123574l(nVar);
            C60856cj.m92911t(c, C47810es.m84974n(lVar), C60826bg.f164896a);
        }
        return C60866ct.f164955a;
    }
}
