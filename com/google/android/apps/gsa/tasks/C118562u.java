package com.google.android.apps.gsa.tasks;

import com.google.android.apps.gsa.assistant.shared.C73891m;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.tasks.u */
/* compiled from: PG */
public final /* synthetic */ class C118562u implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C118522by f329171a;

    public /* synthetic */ C118562u(C118522by byVar) {
        this.f329171a = byVar;
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
        C73891m mVar = (C73891m) obj;
        if (!mVar.f195194a.mo79749o(C90126fx.f250953F).contains(Integer.valueOf(this.f329171a.f329106cj))) {
            return true;
        }
        return mVar.f195195b.getBoolean("opa_enabled", true);
    }
}
