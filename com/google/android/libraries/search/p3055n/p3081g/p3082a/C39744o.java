package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.p590as.p593b.p596b.C10950l;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.n.g.a.o */
/* compiled from: PG */
public final /* synthetic */ class C39744o implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f104565a;

    public /* synthetic */ C39744o(Locale locale) {
        this.f104565a = locale;
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
        Locale locale = this.f104565a;
        C58974d dVar = C39751v.f104571a;
        return ((C10950l) obj).mo19321a().mo19289g().equals(locale);
    }
}
