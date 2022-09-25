package com.google.android.apps.search.assistant.verticals.p9880a.p9884c.p9886b;

import android.app.DirectAction;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.c.b.a */
/* compiled from: PG */
public final /* synthetic */ class C130349a implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f357255a;

    public /* synthetic */ C130349a(String str) {
        this.f357255a = str;
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
        String str = this.f357255a;
        C32836cd cdVar = C130352d.f357258a;
        return ((DirectAction) obj).getId().equals(str);
    }
}
