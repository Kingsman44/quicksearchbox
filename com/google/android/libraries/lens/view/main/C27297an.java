package com.google.android.libraries.lens.view.main;

import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.main.an */
/* compiled from: PG */
public final /* synthetic */ class C27297an implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C27297an f74707a = new C27297an();

    private /* synthetic */ C27297an() {
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
        return !Locale.ENGLISH.toLanguageTag().equals((String) obj);
    }
}
