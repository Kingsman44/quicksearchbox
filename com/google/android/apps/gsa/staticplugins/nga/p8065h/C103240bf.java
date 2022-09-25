package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.android.gms.appdatasearch.SearchResults;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.bf */
/* compiled from: PG */
public final /* synthetic */ class C103240bf implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C103240bf f288015a = new C103240bf();

    private /* synthetic */ C103240bf() {
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
        return ((SearchResults) obj).mo117665a();
    }
}
