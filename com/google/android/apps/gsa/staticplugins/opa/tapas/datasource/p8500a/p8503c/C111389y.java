package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.y */
/* compiled from: PG */
public final /* synthetic */ class C111389y implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f309928a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f309929b;

    public /* synthetic */ C111389y(C58528ij ijVar, C58485gu guVar) {
        this.f309928a = ijVar;
        this.f309929b = guVar;
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
        C58528ij ijVar = this.f309928a;
        C58485gu guVar = this.f309929b;
        C49301bt btVar = (C49301bt) obj;
        C59071e eVar = C111346ao.f309833a;
        return !ijVar.contains(btVar.f127426b) || guVar.contains(btVar.f127426b);
    }
}
