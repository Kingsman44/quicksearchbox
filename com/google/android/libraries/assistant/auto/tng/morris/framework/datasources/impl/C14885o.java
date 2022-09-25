package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.assistant.p3994s.p3995a.C53435nu;
import com.google.assistant.p3994s.p3995a.C53437nw;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.o */
/* compiled from: PG */
public final /* synthetic */ class C14885o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C14885o f44782a = new C14885o();

    private /* synthetic */ C14885o() {
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
        C53437nw nwVar = ((C53435nu) obj).f140247l;
        if (nwVar == null) {
            nwVar = C53437nw.f140250i;
        }
        return nwVar.f140253b == 1;
    }
}
