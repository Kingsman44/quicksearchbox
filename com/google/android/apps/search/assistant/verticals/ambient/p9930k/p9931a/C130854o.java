package com.google.android.apps.search.assistant.verticals.ambient.p9930k.p9931a;

import com.google.android.apps.search.assistant.verticals.ambient.p9930k.C130883x;
import com.google.assistant.p4016z.C53708bf;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.k.a.o */
/* compiled from: PG */
public final /* synthetic */ class C130854o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C130857r f358116a;

    /* renamed from: b */
    public final /* synthetic */ C130883x f358117b;

    public /* synthetic */ C130854o(C130857r rVar, C130883x xVar) {
        this.f358116a = rVar;
        this.f358117b = xVar;
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
        C130857r rVar = this.f358116a;
        C130883x xVar = this.f358117b;
        C53708bf bfVar = (C53708bf) obj;
        ((C58970a) ((C58970a) rVar.f358127d.mo56224b()).mo56372aa(38984)).mo56389s("scored place distance: %f", Double.valueOf(bfVar.f140999f));
        return bfVar.f140999f <= xVar.mo109848e().doubleValue();
    }
}
