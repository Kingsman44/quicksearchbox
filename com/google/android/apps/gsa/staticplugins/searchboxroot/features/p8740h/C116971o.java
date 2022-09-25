package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8740h;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.h.o */
/* compiled from: PG */
public final /* synthetic */ class C116971o implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C116971o f324732a = new C116971o();

    private /* synthetic */ C116971o() {
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
        String str = (String) obj;
        if (str.length() != 1) {
            return true;
        }
        int type = Character.getType(str.charAt(0));
        if (type == 21 || type == 22 || type == 29 || type == 30 || type == 23 || type == 20 || type == 24) {
            return false;
        }
        return true;
    }
}
