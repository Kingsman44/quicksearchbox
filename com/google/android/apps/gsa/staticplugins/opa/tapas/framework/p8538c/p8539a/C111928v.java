package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.v */
/* compiled from: PG */
public final /* synthetic */ class C111928v implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C111917k f310958a;

    /* renamed from: b */
    public final /* synthetic */ C111932z f310959b;

    public /* synthetic */ C111928v(C111917k kVar, C111932z zVar) {
        this.f310958a = kVar;
        this.f310959b = zVar;
    }

    public final Object get() {
        C111917k kVar = this.f310958a;
        return new C111889aa(kVar, (C58485gu) Collection.EL.stream(this.f310959b.mo99301a(kVar)).map(C111926t.f310955a).collect(C58370cn.f155946a));
    }
}
