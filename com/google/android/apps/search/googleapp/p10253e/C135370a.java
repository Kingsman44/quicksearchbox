package com.google.android.apps.search.googleapp.p10253e;

import android.content.SharedPreferences;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.e.a */
/* compiled from: PG */
public final /* synthetic */ class C135370a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ SharedPreferences f368836a;

    public /* synthetic */ C135370a(SharedPreferences sharedPreferences) {
        this.f368836a = sharedPreferences;
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
        return this.f368836a.contains((String) obj);
    }
}
