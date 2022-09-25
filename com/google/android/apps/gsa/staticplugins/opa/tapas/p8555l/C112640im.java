package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.im */
/* compiled from: PG */
public final /* synthetic */ class C112640im implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C112640im f312249a = new C112640im();

    private /* synthetic */ C112640im() {
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
        int i = C112643ip.f312252a;
        return ((C113415ez) obj).mo100211k() != C48672ag.HABIT_RECENT_QUERIES;
    }
}
