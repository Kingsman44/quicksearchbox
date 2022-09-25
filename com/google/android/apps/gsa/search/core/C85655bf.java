package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.search.core.bf */
/* compiled from: PG */
public final /* synthetic */ class C85655bf implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C85655bf f231521a = new C85655bf();

    private /* synthetic */ C85655bf() {
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
        return Objects.nonNull((C79570b) obj);
    }
}
