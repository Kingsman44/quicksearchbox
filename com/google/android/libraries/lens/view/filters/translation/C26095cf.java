package com.google.android.libraries.lens.view.filters.translation;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.cf */
/* compiled from: PG */
public final /* synthetic */ class C26095cf implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C26095cf f70907a = new C26095cf();

    private /* synthetic */ C26095cf() {
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
        C25327c cVar = (C25327c) obj;
        return cVar.equals(C25327c.QUEUED) || cVar.equals(C25327c.BACKGROUND_QUEUED);
    }
}
