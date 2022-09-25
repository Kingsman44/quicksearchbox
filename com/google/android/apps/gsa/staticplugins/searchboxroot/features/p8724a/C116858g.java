package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.g */
/* compiled from: PG */
public final /* synthetic */ class C116858g implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C116858g f324328a = new C116858g();

    private /* synthetic */ C116858g() {
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
        return ((RootSuggestion) obj).f108915p.equals(C41669ai.f108958g);
    }
}
