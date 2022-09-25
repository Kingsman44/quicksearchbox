package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9966a;

import com.google.assistant.p4016z.C53691ap;
import com.google.assistant.p4016z.C53692aq;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.a.d */
/* compiled from: PG */
public final /* synthetic */ class C131262d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C131262d f358911a = new C131262d();

    private /* synthetic */ C131262d() {
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
        C53691ap a = C53691ap.m86884a(((C53692aq) obj).f140943e);
        if (a == null) {
            a = C53691ap.UNSPECIFIED;
        }
        return a.equals(C53691ap.STORE);
    }
}
