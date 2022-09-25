package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.text.TextUtils;
import com.google.android.apps.gsa.nga.engine.am.h.df;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.al */
/* compiled from: PG */
public final /* synthetic */ class C77013al implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C77013al f212561a = new C77013al();

    private /* synthetic */ C77013al() {
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
        C58974d dVar = C77027az.f212594a;
        return !TextUtils.isEmpty(((df) obj).b());
    }
}
