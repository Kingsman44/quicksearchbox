package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.b */
/* compiled from: PG */
public final /* synthetic */ class C111494b implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ BiFunction f310142a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f310143b;

    /* renamed from: c */
    public final /* synthetic */ C54229ar f310144c;

    public /* synthetic */ C111494b(BiFunction biFunction, C113405ep epVar, C54229ar arVar) {
        this.f310142a = biFunction;
        this.f310143b = epVar;
        this.f310144c = arVar;
    }

    public final Object get() {
        BiFunction biFunction = this.f310142a;
        C113405ep epVar = this.f310143b;
        C54229ar arVar = this.f310144c;
        int i = C111495c.f310145a;
        return (C113408es) biFunction.apply(epVar, arVar);
    }
}
