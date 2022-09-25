package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import java.util.List;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.g.cw */
/* compiled from: PG */
public final /* synthetic */ class C112532cw implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f312105a;

    public /* synthetic */ C112532cw(List list) {
        this.f312105a = list;
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
        List list = this.f312105a;
        C121537f fVar = C112548dl.f312129a;
        return list.contains(((C48634bw) ((Map.Entry) obj).getKey()).toString());
    }
}
