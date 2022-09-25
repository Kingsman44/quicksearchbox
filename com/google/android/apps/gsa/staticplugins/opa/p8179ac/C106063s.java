package com.google.android.apps.gsa.staticplugins.opa.p8179ac;

import com.google.assistant.p3897e.p3899b.p3901b.C50890q;
import com.google.common.p4526f.C59071e;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ac.s */
/* compiled from: PG */
public final /* synthetic */ class C106063s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C50890q f296104a;

    public /* synthetic */ C106063s(C50890q qVar) {
        this.f296104a = qVar;
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
        C50890q qVar = this.f296104a;
        C59071e eVar = C106025ax.f295983a;
        return ((String) ((Map.Entry) obj).getValue()).equals(qVar.f132496b);
    }
}
