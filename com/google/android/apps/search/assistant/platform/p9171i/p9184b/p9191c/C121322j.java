package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9191c;

import android.text.TextUtils;
import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.c.j */
/* compiled from: PG */
public final /* synthetic */ class C121322j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C121322j f336911a = new C121322j();

    private /* synthetic */ C121322j() {
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
        return TextUtils.equals(((C58146d) obj).f155446b, "image");
    }
}
