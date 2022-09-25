package com.google.android.libraries.lens.view.p2056af;

import com.google.common.p4526f.p4527a.C58974d;
import java.io.File;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.af.be */
/* compiled from: PG */
public final /* synthetic */ class C25060be implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C25060be f68305a = new C25060be();

    private /* synthetic */ C25060be() {
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
        C58974d dVar = C25068bm.f68315a;
        return ((File) obj).getName().matches("cpu[0-9]+");
    }
}
