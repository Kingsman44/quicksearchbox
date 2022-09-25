package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bv */
/* compiled from: PG */
public final /* synthetic */ class C14834bv implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C14842cc f44669a;

    /* renamed from: b */
    public final /* synthetic */ List f44670b;

    public /* synthetic */ C14834bv(C14842cc ccVar, List list) {
        this.f44669a = ccVar;
        this.f44670b = list;
    }

    public final Object call() {
        C14842cc ccVar = this.f44669a;
        List<C60870cx> list = this.f44670b;
        ArrayList arrayList = new ArrayList();
        for (C60870cx r : list) {
            C14826bn bnVar = (C14826bn) C60856cj.m92909r(r);
            arrayList.add(bnVar);
            ccVar.mo21771m(bnVar.mo21730a(), false);
        }
        return arrayList;
    }
}
