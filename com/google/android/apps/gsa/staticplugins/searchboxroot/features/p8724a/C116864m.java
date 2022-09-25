package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import com.google.assistant.p3825an.p3830c.p3831a.C49270ap;
import com.google.assistant.p3825an.p3830c.p3831a.C49308c;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.m */
/* compiled from: PG */
public final /* synthetic */ class C116864m implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C116864m f324345a = new C116864m();

    private /* synthetic */ C116864m() {
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
        C49270ap apVar = (C49270ap) obj;
        if (apVar.f127356b.isEmpty()) {
            return false;
        }
        C49308c cVar = apVar.f127359e;
        if (cVar == null) {
            cVar = C49308c.f127443c;
        }
        return !cVar.f127445a.isEmpty();
    }
}
