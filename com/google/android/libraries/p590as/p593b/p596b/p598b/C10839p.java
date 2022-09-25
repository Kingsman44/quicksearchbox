package com.google.android.libraries.p590as.p593b.p596b.p598b;

import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.b.p */
/* compiled from: PG */
public final /* synthetic */ class C10839p implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C10839p f35882a = new C10839p();

    private /* synthetic */ C10839p() {
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
        C58974d dVar = C10844u.f35894a;
        int h = ((C10882h) obj).mo19290h();
        if (h != 0) {
            return h != 3;
        }
        throw null;
    }
}
