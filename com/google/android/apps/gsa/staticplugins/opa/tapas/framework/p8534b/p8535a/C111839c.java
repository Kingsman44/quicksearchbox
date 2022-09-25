package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8534b.p8535a;

import com.google.assistant.p3781ad.p3789d.p3790a.C48566s;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C111839c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f310808a;

    public /* synthetic */ C111839c(C58485gu guVar) {
        this.f310808a = guVar;
    }

    public final Object call() {
        C58485gu guVar = this.f310808a;
        C58480gp gpVar = new C58480gp(4);
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            gpVar.mo55395g((C48566s) C60856cj.m92909r((C60870cx) guVar.get(i)));
        }
        return gpVar.mo55394f();
    }
}
