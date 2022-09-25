package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46161am;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.account.data.manager.p */
/* compiled from: PG */
public final /* synthetic */ class C46308p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46232ae f121294a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f121295b;

    public /* synthetic */ C46308p(C46232ae aeVar, AccountId accountId) {
        this.f121294a = aeVar;
        this.f121295b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C46232ae aeVar = this.f121294a;
        AccountId accountId = this.f121295b;
        C46227h b = C46301i.m82576b((C46222c) obj, accountId);
        int i = b.f121188d;
        int a = C46161am.m82384a(i);
        if (a != 0 && a == 3) {
            return C60866ct.f164955a;
        }
        int a2 = C46161am.m82384a(i);
        if (a2 == 0 || a2 == 1) {
            return aeVar.mo50280p(accountId, 3);
        }
        return C60922j.m93045h(aeVar.f121198a.mo46039a(new C46306n(accountId), C60826bg.f164896a), C47810es.m84966f(new C46307o(aeVar, accountId, b)), aeVar.f121199b);
    }
}
