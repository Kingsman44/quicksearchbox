package com.google.android.apps.search.sceneviewer.modelviewer;

import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.sceneviewer.modelviewer.r */
/* compiled from: PG */
public final /* synthetic */ class C141608r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Boolean f384397a;

    public /* synthetic */ C141608r(Boolean bool) {
        this.f384397a = bool;
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
        return this.f384397a.equals((Boolean) obj);
    }
}
