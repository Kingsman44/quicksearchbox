package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80586t;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C78287ai implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C78287ai f215571a = new C78287ai();

    private /* synthetic */ C78287ai() {
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
        C80586t tVar = ((C80581o) obj).f221192b;
        if (tVar == null) {
            tVar = C80586t.f221205g;
        }
        return !tVar.f221208b.isEmpty();
    }
}
