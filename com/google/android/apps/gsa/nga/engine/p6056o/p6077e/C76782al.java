package com.google.android.apps.gsa.nga.engine.p6056o.p6077e;

import android.text.TextUtils;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p4883as.p4884a.C63775d;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.al */
/* compiled from: PG */
public final /* synthetic */ class C76782al implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C76782al f212164a = new C76782al();

    private /* synthetic */ C76782al() {
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
        C58974d dVar = C76795ay.f212177a;
        return !TextUtils.isEmpty(((C63775d) obj).f172523d);
    }
}
