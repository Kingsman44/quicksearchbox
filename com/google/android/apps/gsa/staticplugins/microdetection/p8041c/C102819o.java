package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.o */
/* compiled from: PG */
public final /* synthetic */ class C102819o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C102819o f287097a = new C102819o();

    private /* synthetic */ C102819o() {
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
        C29689e a = C29689e.m54781a(((C29690f) obj).f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        return a == C29689e.PENDING;
    }
}
