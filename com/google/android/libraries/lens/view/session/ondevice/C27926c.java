package com.google.android.libraries.lens.view.session.ondevice;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.c */
/* compiled from: PG */
public final /* synthetic */ class C27926c implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C27926c f76075a = new C27926c();

    private /* synthetic */ C27926c() {
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
        C58974d dVar = C27968f.f76129a;
        C24446ah a = C24446ah.m45519a(((C24440ab) obj).f66922d);
        if (a == null) {
            a = C24446ah.STATUS_UNKNOWN;
        }
        return a == C24446ah.STATUS_DOWNLOADED;
    }
}
