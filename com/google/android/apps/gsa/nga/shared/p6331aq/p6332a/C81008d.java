package com.google.android.apps.gsa.nga.shared.p6331aq.p6332a;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.aq.a.d */
/* compiled from: PG */
public final /* synthetic */ class C81008d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C81008d f222030a = new C81008d();

    private /* synthetic */ C81008d() {
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
