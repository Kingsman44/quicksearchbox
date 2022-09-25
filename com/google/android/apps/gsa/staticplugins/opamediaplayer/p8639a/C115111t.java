package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8639a;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85333k;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.a.t */
/* compiled from: PG */
public final /* synthetic */ class C115111t implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C115111t f319510a = new C115111t();

    private /* synthetic */ C115111t() {
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
        return ((C85333k) obj).f231110e.contains(Locale.getDefault().toLanguageTag());
    }
}
