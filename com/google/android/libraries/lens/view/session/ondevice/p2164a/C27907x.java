package com.google.android.libraries.lens.view.session.ondevice.p2164a;

import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.x */
/* compiled from: PG */
public final /* synthetic */ class C27907x implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C27907x f76018a = new C27907x();

    private /* synthetic */ C27907x() {
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
        C56277cd cdVar;
        C56278ce ceVar = (C56278ce) obj;
        C58974d dVar = C27852ai.f75920a;
        if (ceVar.f149989b == 3) {
            cdVar = (C56277cd) ceVar.f149990c;
        } else {
            cdVar = C56277cd.f149981d;
        }
        return (cdVar.f149983a & 1) != 0;
    }
}
