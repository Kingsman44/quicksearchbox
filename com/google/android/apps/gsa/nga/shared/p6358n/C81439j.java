package com.google.android.apps.gsa.nga.shared.p6358n;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80393f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80394g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.n.j */
/* compiled from: PG */
public final /* synthetic */ class C81439j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C81439j f222848a = new C81439j();

    private /* synthetic */ C81439j() {
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
        C60870cx cxVar = C81442m.f222851a;
        return C80393f.m128125a(((C80394g) obj).f220647a) == 3;
    }
}
