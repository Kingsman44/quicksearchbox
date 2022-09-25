package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.android.libraries.search.assistant.notification.data.C34890k;
import com.google.android.libraries.search.assistant.notification.p2709a.C34837a;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aev;
import com.google.assistant.p3897e.p3921j.aex;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.j */
/* compiled from: PG */
public final /* synthetic */ class C35649j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35657r f93525a;

    /* renamed from: b */
    public final /* synthetic */ boolean f93526b;

    /* renamed from: c */
    public final /* synthetic */ C34837a f93527c;

    public /* synthetic */ C35649j(C35657r rVar, boolean z, C34837a aVar) {
        this.f93525a = rVar;
        this.f93526b = z;
        this.f93527c = aVar;
    }

    public final C60870cx apply(Object obj) {
        C35657r rVar = this.f93525a;
        boolean z = this.f93526b;
        C34837a aVar = this.f93527c;
        C58833ax axVar = (C58833ax) obj;
        if (z) {
            return C60856cj.m92900i(C36180b.f94545b);
        }
        aev aev = (aev) aex.f134969f.createBuilder();
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C36180b.m64577a("notification_fetch_result", "assistant.api.client_op.NotificationFetchResult", aev.build()));
        }
        C60870cx b = aVar.mo20104b(((C34890k) axVar.mo56107c()).mo39602a(), false);
        C35654o oVar = new C35654o(aev);
        return C60922j.m93044g(b, C47810es.m84963c(oVar), rVar.f93535b);
    }
}
