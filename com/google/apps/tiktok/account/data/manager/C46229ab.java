package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46161am;
import com.google.apps.tiktok.account.data.C46164ap;
import com.google.apps.tiktok.account.data.C46165aq;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.apps.tiktok.account.p3606d.C46102t;
import com.google.apps.tiktok.account.p3606d.C46106x;
import com.google.apps.tiktok.account.p3606d.C46107y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.account.data.manager.ab */
/* compiled from: PG */
public final /* synthetic */ class C46229ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46232ae f121193a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f121194b;

    public /* synthetic */ C46229ab(C46232ae aeVar, AccountId accountId) {
        this.f121193a = aeVar;
        this.f121194b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C46232ae aeVar = this.f121193a;
        AccountId accountId = this.f121194b;
        C46227h b = C46301i.m82576b((C46222c) obj, accountId);
        int a = C46161am.m82384a(b.f121188d);
        if (a != 0 && a == 2) {
            return C60866ct.f164955a;
        }
        C46165aq aqVar = new C46165aq(accountId, ((C46164ap) C46232ae.m82472h(b)).f121087a);
        Set<C46102t> set = (Set) aeVar.f121200c.mo17428b();
        ArrayList arrayList = new ArrayList(set.size());
        for (C46102t tVar : set) {
            try {
                C46107y yVar = tVar.f120991a;
                arrayList.add(yVar.f120998a.mo19398a(new C46106x(yVar, aqVar.f121090a)));
            } catch (Exception e) {
                arrayList.add(C60856cj.m92899h(e));
            }
        }
        return C60922j.m93045h(C60856cj.m92894c(arrayList).mo57335b(C47810es.m84965e(new C46317y(aeVar, accountId)), C60826bg.f164896a), C47810es.m84966f(new C46318z(aeVar, aqVar)), C60826bg.f164896a);
    }
}
