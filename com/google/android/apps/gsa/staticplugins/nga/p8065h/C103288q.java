package com.google.android.apps.gsa.staticplugins.nga.p8065h;

import com.google.p4500cm.p4501a.p4506b.p4507a.C58146d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.h.q */
/* compiled from: PG */
public final /* synthetic */ class C103288q implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C103288q f288088a = new C103288q();

    private /* synthetic */ C103288q() {
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
        C58146d dVar = (C58146d) obj;
        if (!"identifier".equals(dVar.f155446b) || dVar.f155449e.size() <= 0 || ((String) dVar.f155449e.get(0)).isEmpty()) {
            return false;
        }
        return true;
    }
}
