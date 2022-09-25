package com.google.android.apps.search.podcasts.p10550b.p10556f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97920j;
import java.util.HashSet;
import java.util.Set;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.podcasts.b.f.ab */
/* compiled from: PG */
final class C140087ab implements Predicate {

    /* renamed from: a */
    final Set f380701a = new HashSet();

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

    public final /* bridge */ /* synthetic */ boolean test(Object obj) {
        C97920j jVar = (C97920j) obj;
        Set set = this.f380701a;
        String str = jVar.f273429b;
        String str2 = jVar.f273431d;
        return set.add(str + " " + str2);
    }
}
