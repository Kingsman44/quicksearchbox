package com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c;

import android.service.notification.StatusBarNotification;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.t.b.c.n */
/* compiled from: PG */
public final /* synthetic */ class C36490n implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C36480d f95243a;

    public /* synthetic */ C36490n(C36480d dVar) {
        this.f95243a = dVar;
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
        return this.f95243a.f95221b.contains(((StatusBarNotification) obj).getNotification().category);
    }
}
