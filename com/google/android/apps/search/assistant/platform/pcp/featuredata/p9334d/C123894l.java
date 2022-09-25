package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.gms.reminders.C145775d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.l */
/* compiled from: PG */
public final /* synthetic */ class C123894l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123904v f342214a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f342215b;

    public /* synthetic */ C123894l(C123904v vVar, AccountId accountId) {
        this.f342214a = vVar;
        this.f342215b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C123904v vVar = this.f342214a;
        AccountId accountId = this.f342215b;
        String str = (String) obj;
        if (C58837ba.m90859h(str)) {
            C59104x d = C123904v.f342237a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
            ((C59052c) ((C59052c) d).mo56372aa(35331)).mo56386p("Account name null or empty when fetching reminders.");
            return C60866ct.f164955a;
        }
        C123883a aVar = vVar.f342239c;
        str.getClass();
        Optional b = aVar.mo106154b(str);
        long b2 = vVar.f342243g.f342252b.mo26870b();
        C145775d dVar = new C145775d();
        dVar.f394141h = 1;
        dVar.f394135b = Long.valueOf(b2);
        dVar.f394136c = Long.valueOf(b2 + C123906x.f342251a);
        dVar.mo121945c(1);
        C60870cx a = aVar.mo106153a(b, dVar.mo121943a());
        C123623b a2 = C123624c.m202992a(vVar.f342241e, accountId);
        C60870cx p = C60856cj.m92907p(a2.f341552d.mo106065i(a2.f341550b, 100013, C58485gu.m89845m()), a);
        C123892j jVar = new C123892j(vVar, accountId);
        return C60922j.m93045h(p, C47810es.m84966f(jVar), vVar.f342242f);
    }
}
