package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.assistant.p3890d.p3893b.p3894a.p3895a.p3896a.C50862b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.an */
/* compiled from: PG */
public final /* synthetic */ class C110976an implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Map f309153a;

    public /* synthetic */ C110976an(Map map) {
        this.f309153a = map;
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
        return ((C58495hd) this.f309153a).keySet().equals(C58528ij.m90006F(((C50862b) obj).f132436b));
    }
}
