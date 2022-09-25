package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C102916ay implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C90021c f287388a;

    public /* synthetic */ C102916ay(C90021c cVar) {
        this.f287388a = cVar;
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
        return !C102921bc.m170693j(this.f287388a, (Locale) obj);
    }
}
