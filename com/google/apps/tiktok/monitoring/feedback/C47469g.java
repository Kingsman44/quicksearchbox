package com.google.apps.tiktok.monitoring.feedback;

import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.monitoring.feedback.g */
/* compiled from: PG */
public final /* synthetic */ class C47469g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f123269a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f123270b;

    public /* synthetic */ C47469g(C60870cx cxVar, C60870cx cxVar2) {
        this.f123269a = cxVar;
        this.f123270b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f123269a;
        C60870cx cxVar2 = this.f123270b;
        C46108a aVar = (C46108a) C60856cj.m92909r(cxVar);
        boolean b = C46180e.m82417b(aVar);
        boolean equals = "pseudonymous".equals(aVar.mo50210b().f121165j);
        if (b || equals) {
            return C58833ax.m90834k("anonymous");
        }
        return C58833ax.m90833j((String) C60856cj.m92909r(cxVar2));
    }
}
