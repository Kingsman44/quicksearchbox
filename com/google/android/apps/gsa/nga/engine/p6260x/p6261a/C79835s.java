package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.s */
/* compiled from: PG */
public final /* synthetic */ class C79835s implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f218906a;

    public /* synthetic */ C79835s(String str) {
        this.f218906a = str;
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
        return this.f218906a.toLowerCase(Locale.ROOT).startsWith(((String) obj).toLowerCase(Locale.ROOT));
    }
}
