package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.i.e */
/* compiled from: PG */
public final /* synthetic */ class C10926e implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C10926e f36035a = new C10926e();

    private /* synthetic */ C10926e() {
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
        C29689e a = C29689e.m54781a(((C29690f) obj).f80415f);
        if (a == null) {
            a = C29689e.UNSPECIFIED;
        }
        return a == C29689e.PENDING;
    }
}
