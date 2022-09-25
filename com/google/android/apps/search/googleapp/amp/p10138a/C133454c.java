package com.google.android.apps.search.googleapp.amp.p10138a;

import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.amp.a.c */
/* compiled from: PG */
public final /* synthetic */ class C133454c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C133454c f363651a = new C133454c();

    private /* synthetic */ C133454c() {
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
        C58528ij ijVar = C133456e.f363652a;
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        if (!C133456e.f363652a.contains(str)) {
            return true;
        }
        return false;
    }
}
