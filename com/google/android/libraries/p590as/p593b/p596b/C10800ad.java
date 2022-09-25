package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.ad */
/* compiled from: PG */
public final /* synthetic */ class C10800ad implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C10800ad f35831a = new C10800ad();

    private /* synthetic */ C10800ad() {
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
        C58974d dVar = C10812ap.f35848a;
        int h = ((C10882h) obj).mo19290h();
        if (h != 0) {
            return h != 3;
        }
        throw null;
    }
}
