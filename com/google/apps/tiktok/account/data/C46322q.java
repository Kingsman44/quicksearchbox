package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.dataservice.C46688af;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.data.q */
/* compiled from: PG */
public final /* synthetic */ class C46322q implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f121314a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f121315b;

    public /* synthetic */ C46322q(C60870cx cxVar, C60870cx cxVar2) {
        this.f121314a = cxVar;
        this.f121315b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f121314a;
        C60870cx cxVar2 = this.f121315b;
        C46163ao aoVar = (C46163ao) C60856cj.m92909r(cxVar);
        return (aoVar.f121084a & 1) != 0 ? C46688af.m83205b((List) C60856cj.m92909r(cxVar2), aoVar.f121085b) : C46688af.f121976a;
    }
}
