package com.google.android.apps.search.assistant.verticals.ambient.p9930k;

import com.google.common.p4543n.p4551g.C59443c;
import java.util.Map;
import p3186j$.util.function.Predicate;
import p3186j$.util.stream.Collector;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.m */
/* compiled from: PG */
public final /* synthetic */ class C130872m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130883x f358151a;

    public /* synthetic */ C130872m(C130883x xVar) {
        this.f358151a = xVar;
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
        C130883x xVar = this.f358151a;
        Collector collector = C130881v.f358160a;
        return ((C59443c) ((Map.Entry) obj).getValue()).mo56958a() <= xVar.mo109850f().doubleValue();
    }
}
