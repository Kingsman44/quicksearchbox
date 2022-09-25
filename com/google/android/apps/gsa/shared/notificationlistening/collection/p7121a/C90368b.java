package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import com.google.android.apps.gsa.shared.notificationlistening.common.BundledMessageNotification;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.b */
/* compiled from: PG */
public final /* synthetic */ class C90368b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C90374h f252396a;

    /* renamed from: b */
    public final /* synthetic */ Duration f252397b;

    public /* synthetic */ C90368b(C90374h hVar, Duration duration) {
        this.f252396a = hVar;
        this.f252397b = duration;
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
        C90374h hVar = this.f252396a;
        Duration duration = this.f252397b;
        BundledMessageNotification bundledMessageNotification = (BundledMessageNotification) obj;
        String i = bundledMessageNotification.mo84119i();
        return hVar.f252407c.containsKey(i) && hVar.f252408d.mo26870b() - ((Long) hVar.f252407c.get(i)).longValue() <= duration.toMillis() && bundledMessageNotification.mo84124n();
    }
}
