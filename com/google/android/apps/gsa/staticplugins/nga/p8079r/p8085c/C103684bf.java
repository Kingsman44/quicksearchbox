package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89123d;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.p6981a.C89125f;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bf */
/* compiled from: PG */
public final /* synthetic */ class C103684bf implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C103684bf f288789a = new C103684bf();

    private /* synthetic */ C103684bf() {
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
        return ((C89123d) obj).mo83106a().equals(C89125f.ASSISTANT_ON_LOCKSCREEN);
    }
}
