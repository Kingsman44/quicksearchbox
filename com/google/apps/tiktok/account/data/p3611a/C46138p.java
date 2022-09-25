package com.google.apps.tiktok.account.data.p3611a;

import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.p4522b.C58480gp;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.account.data.a.p */
/* compiled from: PG */
public final /* synthetic */ class C46138p implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f121036a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f121037b;

    public /* synthetic */ C46138p(List list, C58480gp gpVar) {
        this.f121036a = list;
        this.f121037b = gpVar;
    }

    public final Object call() {
        List<C60870cx> list = this.f121036a;
        C58480gp gpVar = this.f121037b;
        for (C60870cx r : list) {
            C46215j jVar = (C46215j) C60856cj.m92909r(r);
            if (jVar != null) {
                gpVar.mo55395g(jVar);
            }
        }
        return gpVar.mo55394f();
    }
}
