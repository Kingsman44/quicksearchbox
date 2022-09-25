package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fy */
/* compiled from: PG */
public final /* synthetic */ class C112452fy implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112452fy f311969a = new C112452fy();

    private /* synthetic */ C112452fy() {
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
        int i = C112453fz.f311970a;
        return ((C113415ez) obj).mo100211k().equals(C48672ag.TAPAS_SERVER);
    }
}
