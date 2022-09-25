package com.google.android.apps.gsa.staticplugins.opa.tapas.p8566n;

import com.google.android.apps.gsa.staticplugins.opa.tapas.C113585w;
import com.google.android.apps.gsa.staticplugins.opa.tapas.C113586x;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.n.a */
/* compiled from: PG */
public final /* synthetic */ class C112985a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f313110a;

    public /* synthetic */ C112985a(int i) {
        this.f313110a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f313110a;
        C113585w wVar = (C113585w) ((C113586x) obj).toBuilder();
        wVar.copyOnWrite();
        C113586x xVar = (C113586x) wVar.instance;
        xVar.f314504a |= 1;
        xVar.f314505b = i;
        return (C113586x) wVar.build();
    }
}
