package com.google.android.apps.gsa.search.core.p6507ag.p6508a;

import com.google.common.p4522b.C58490gz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.search.core.ag.a.g */
/* compiled from: PG */
public final /* synthetic */ class C84476g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f229901a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f229902b;

    public /* synthetic */ C84476g(C60870cx cxVar, C60870cx cxVar2) {
        this.f229901a = cxVar;
        this.f229902b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f229901a;
        C60870cx cxVar2 = this.f229902b;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55433l((Map) C60856cj.m92909r(cxVar));
        gzVar.mo55433l((Map) C60856cj.m92909r(cxVar2));
        return new HashSet(gzVar.mo55427f(false).values());
    }
}
