package com.google.apps.tiktok.account.data;

import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.data.ai */
/* compiled from: PG */
public final /* synthetic */ class C46157ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f121075a;

    public /* synthetic */ C46157ai(List list) {
        this.f121075a = list;
    }

    public final Object call() {
        List<C60870cx> list = this.f121075a;
        C58480gp e = C58485gu.m89837e();
        for (C60870cx r : list) {
            e.mo55396h((Iterable) C60856cj.m92909r(r));
        }
        return e.mo55394f();
    }
}
