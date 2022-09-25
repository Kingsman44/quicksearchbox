package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar;

import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.d */
/* compiled from: PG */
public final /* synthetic */ class C136086d implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C136086d f370632a = new C136086d();

    private /* synthetic */ C136086d() {
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
        return ((Optional) obj).isPresent();
    }
}
