package com.google.android.libraries.search.assistant.performer.communication.p2736d;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aet;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.r */
/* compiled from: PG */
public final class C35657r {

    /* renamed from: a */
    public static final C59071e f93534a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.d.r");

    /* renamed from: b */
    public final ScheduledExecutorService f93535b;

    public C35657r(ScheduledExecutorService scheduledExecutorService) {
        this.f93535b = scheduledExecutorService;
    }

    /* renamed from: a */
    public final C60870cx mo39782a(C35656q qVar) {
        C60870cx cxVar;
        if (!qVar.mo39761d().f134962b) {
            cxVar = C60856cj.m92900i(C58733pz.f156496a);
        } else if (qVar.mo39762e().mo56113h()) {
            C35609ab abVar = (C35609ab) qVar.mo39762e().mo56107c();
            aet a = aet.m86300a(qVar.mo39761d().f134963c);
            if (a == null) {
                a = aet.DEFAULT;
            }
            cxVar = abVar.mo39740a(a);
        } else {
            cxVar = C60856cj.m92900i(C58733pz.f156496a);
        }
        C35651l lVar = new C35651l(this, qVar);
        return C60922j.m93045h(cxVar, C47810es.m84966f(lVar), this.f93535b);
    }
}
