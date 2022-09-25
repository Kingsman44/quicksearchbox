package com.google.android.apps.gsa.sidekick.shared.cards;

import android.text.TextUtils;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.w */
/* compiled from: PG */
public final /* synthetic */ class C91708w implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C91708w f255795a = new C91708w();

    private /* synthetic */ C91708w() {
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
