package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8455f;

import com.google.assistant.p3994s.p3995a.C53194ew;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.f.p */
/* compiled from: PG */
public final /* synthetic */ class C110682p implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f308419a;

    public /* synthetic */ C110682p(Locale locale) {
        this.f308419a = locale;
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
        return this.f308419a.getLanguage().equals(new Locale(((C53194ew) obj).f139420c).getLanguage());
    }
}
