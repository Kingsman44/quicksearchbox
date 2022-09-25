package com.google.android.apps.gsa.nga.engine.p6042l;

import com.google.assistant.p3897e.p3929l.p3930a.C52748d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.l.k */
/* compiled from: PG */
public final /* synthetic */ class C76242k implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C76242k f211255a = new C76242k();

    private /* synthetic */ C76242k() {
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
        return (((C52748d) obj).f138423a & 256) != 0;
    }
}
