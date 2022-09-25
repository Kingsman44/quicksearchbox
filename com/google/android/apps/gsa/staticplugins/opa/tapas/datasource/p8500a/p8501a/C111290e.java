package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8501a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.common.base.C58835az;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C111290e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C113405ep f309695a;

    public /* synthetic */ C111290e(C113405ep epVar) {
        this.f309695a = epVar;
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
        C113405ep epVar = this.f309695a;
        C58835az azVar = (C58835az) obj;
        C59071e eVar = C111296k.f309706a;
        return epVar.mo100033p().isEmpty() || ((Double) azVar.f156632b).doubleValue() > C59203do.f157270a;
    }
}
