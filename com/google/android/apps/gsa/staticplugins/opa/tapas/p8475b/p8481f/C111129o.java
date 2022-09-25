package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123768ch;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.o */
/* compiled from: PG */
public final /* synthetic */ class C111129o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C111129o f309382a = new C111129o();

    private /* synthetic */ C111129o() {
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
        C123762cb a = C123762cb.m203107a(((C123768ch) obj).f341898c);
        if (a == null) {
            a = C123762cb.AFFINITY_TYPE_UNSPECIFIED;
        }
        return a == C123762cb.CALL;
    }
}
