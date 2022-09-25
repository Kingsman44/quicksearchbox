package com.google.android.apps.gsa.staticplugins.p7967h;

import com.google.android.apps.gsa.opa.p6443g.p6445b.C83683b;
import com.google.android.apps.gsa.opa.p6443g.p6445b.C83687f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.h.k */
/* compiled from: PG */
public final /* synthetic */ class C101475k implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C101475k f283124a = new C101475k();

    private /* synthetic */ C101475k() {
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
        int i = C101483s.f283139m;
        int i2 = ((C83683b) obj).f228108b;
        int a = C83687f.m133251a(i2);
        if (a != 0 && a == 3) {
            return true;
        }
        int a2 = C83687f.m133251a(i2);
        return a2 != 0 && a2 == 4;
    }
}
