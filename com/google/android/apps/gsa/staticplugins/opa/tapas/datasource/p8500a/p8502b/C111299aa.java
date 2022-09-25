package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.p4129b.p4136c.C54759g;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.aa */
/* compiled from: PG */
public final /* synthetic */ class C111299aa implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111305ag f309719a;

    /* renamed from: b */
    public final /* synthetic */ C48670ae f309720b;

    public /* synthetic */ C111299aa(C111305ag agVar, C48670ae aeVar) {
        this.f309719a = agVar;
        this.f309720b = aeVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C111305ag agVar = this.f309719a;
        C48670ae aeVar = this.f309720b;
        return agVar.f309733c.mo99022e((C54759g) obj, aeVar);
    }
}
