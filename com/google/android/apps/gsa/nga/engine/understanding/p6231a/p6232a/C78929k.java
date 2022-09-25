package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import android.net.Uri;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.k */
/* compiled from: PG */
public final /* synthetic */ class C78929k implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C78930l f217156a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f217157b;

    public /* synthetic */ C78929k(C78930l lVar, C58495hd hdVar) {
        this.f217156a = lVar;
        this.f217157b = hdVar;
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
        return ((Boolean) this.f217156a.mo73702i("com.android.chrome", Optional.m71637of((Uri) obj)).map(new C78923e(this.f217157b)).map(C78924f.f217150a).orElse(false)).booleanValue();
    }
}
