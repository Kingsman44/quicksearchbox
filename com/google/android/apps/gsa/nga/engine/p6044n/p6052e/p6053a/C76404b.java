package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76438k;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C76404b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C76428z f211543a;

    /* renamed from: b */
    public final /* synthetic */ C76590bg f211544b;

    /* renamed from: c */
    public final /* synthetic */ C77426t f211545c;

    public /* synthetic */ C76404b(C76428z zVar, C76590bg bgVar, C77426t tVar) {
        this.f211543a = zVar;
        this.f211544b = bgVar;
        this.f211545c = tVar;
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
        return this.f211543a.mo72188a(this.f211544b, this.f211545c, (C76438k) obj);
    }
}
