package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.C4395as;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.contrib.work.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C46515aa implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f121662a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f121663b;

    public /* synthetic */ C46515aa(C60870cx cxVar, C60870cx cxVar2) {
        this.f121662a = cxVar;
        this.f121663b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f121662a;
        C60870cx cxVar2 = this.f121663b;
        Set set = (Set) C60856cj.m92909r(cxVar);
        C58480gp e = C58485gu.m89837e();
        for (C4395as asVar : (Collection) C60856cj.m92909r(cxVar2)) {
            AccountId a = C46528an.m82961a(asVar.f14028c);
            if (!set.contains(a)) {
                e.mo55395g(C46528an.m82963c(a));
            }
        }
        return e.mo55394f();
    }
}
