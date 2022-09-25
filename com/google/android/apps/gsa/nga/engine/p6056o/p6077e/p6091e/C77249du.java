package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.du */
/* compiled from: PG */
public final /* synthetic */ class C77249du implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77249du f213098a = new C77249du();

    private /* synthetic */ C77249du() {
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
        return !TextUtils.isEmpty((String) obj);
    }
}
