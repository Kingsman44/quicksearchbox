package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import com.google.assistant.p4008y.p4009a.C53593bz;
import java.util.List;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.p */
/* compiled from: PG */
public final /* synthetic */ class C109417p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f304724a;

    public /* synthetic */ C109417p(List list) {
        this.f304724a = list;
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
        return !this.f304724a.contains(((C53593bz) obj).f140661b);
    }
}
