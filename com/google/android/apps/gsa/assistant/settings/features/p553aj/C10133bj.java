package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import com.google.assistant.p3861at.adf;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.bj */
/* compiled from: PG */
public final /* synthetic */ class C10133bj implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C10134bk f34468a;

    public /* synthetic */ C10133bj(C10134bk bkVar) {
        this.f34468a = bkVar;
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
        return ((adf) obj).f129033b.equals(this.f34468a.f34470b);
    }
}
