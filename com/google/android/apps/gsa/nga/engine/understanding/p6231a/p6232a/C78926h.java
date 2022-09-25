package com.google.android.apps.gsa.nga.engine.understanding.p6231a.p6232a;

import android.net.Uri;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.a.h */
/* compiled from: PG */
public final /* synthetic */ class C78926h implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C78930l f217152a;

    /* renamed from: b */
    public final /* synthetic */ Optional f217153b;

    public /* synthetic */ C78926h(C78930l lVar, Optional optional) {
        this.f217152a = lVar;
        this.f217153b = optional;
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
        C78930l lVar = this.f217152a;
        Optional optional = this.f217153b;
        return lVar.f217162a.mo73691f((Uri) obj, (Uri) optional.get());
    }
}
