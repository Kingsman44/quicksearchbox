package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58485gu;
import java.util.Map;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.at */
/* compiled from: PG */
public final /* synthetic */ class C112475at implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58485gu f311994a;

    /* renamed from: b */
    public final /* synthetic */ Set f311995b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f311996c;

    public /* synthetic */ C112475at(C58485gu guVar, Set set, C58485gu guVar2) {
        this.f311994a = guVar;
        this.f311995b = set;
        this.f311996c = guVar2;
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
        C58485gu guVar = this.f311994a;
        Set set = this.f311995b;
        C58485gu guVar2 = this.f311996c;
        Map.Entry entry = (Map.Entry) obj;
        C121537f fVar = C112519cj.f312068a;
        return guVar.contains(entry.getKey()) && !set.contains(entry.getKey()) && !guVar2.contains(entry.getKey());
    }
}
