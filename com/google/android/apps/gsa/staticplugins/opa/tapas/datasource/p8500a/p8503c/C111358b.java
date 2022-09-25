package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111029bz;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.b */
/* compiled from: PG */
public final /* synthetic */ class C111358b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C111370f f309864a;

    public /* synthetic */ C111358b(C111370f fVar) {
        this.f309864a = fVar;
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
        Map.Entry entry = (Map.Entry) obj;
        return ((((C49301bt) entry.getKey()).f127425a & 128) == 0 || ((C111029bz) this.f309864a.f309890a.mo27525b()).mo99018a(((C49301bt) entry.getKey()).f127426b) == C48670ae.SUGGESTION_GROUP_FALLBACK) ? false : true;
    }
}
