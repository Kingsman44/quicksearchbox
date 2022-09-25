package com.google.android.apps.search.assistant.platform.pcp.p9324a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9337g.C124013j;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.a.q */
/* compiled from: PG */
public final /* synthetic */ class C123579q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123582t f341465a;

    public /* synthetic */ C123579q(C123582t tVar) {
        this.f341465a = tVar;
    }

    public final C60870cx apply(Object obj) {
        C123582t tVar = this.f341465a;
        Set<AccountId> set = (Set) obj;
        if (set.isEmpty()) {
            return C60866ct.f164955a;
        }
        ((C58970a) ((C58970a) tVar.f341470c.mo56224b()).mo56372aa(35165)).mo56386p("HubUi Synclet start sync.");
        ArrayList arrayList = new ArrayList();
        for (AccountId a : set) {
            C124013j Z = ((C124013j.C124014a) C47245e.m84045a(tVar.f341468a, C124013j.C124014a.class, a)).mo106230Z();
            C124100bz bzVar = tVar.f341471d;
            C53306j jVar = C53306j.OPA_HUB_UI;
            C39141kp kpVar = bzVar.f342762a;
            ((C19567d) kpVar.f102829aM.mo6453a()).mo24822a(1, String.valueOf(jVar.f139793X), "1");
            C60870cx b = Z.mo106229b(C53306j.OPA_HUB_UI, C123755bv.f341837o, Optional.empty(), true, C123777f.f341922a);
            C123581s sVar = C123581s.f341467a;
            arrayList.add(C60922j.m93045h(b, C47810es.m84966f(sVar), tVar.f341469b));
        }
        return C47638k.m84750a(arrayList).mo51521b(C123580r.f341466a, C60826bg.f164896a);
    }
}
