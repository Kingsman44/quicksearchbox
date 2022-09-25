package com.google.android.libraries.lens.view.p2070an.p2071a;

import android.graphics.PointF;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.lens.view.an.a.e */
/* compiled from: PG */
public final /* synthetic */ class C25356e implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C24195n f69057a;

    /* renamed from: b */
    public final /* synthetic */ C25333i f69058b;

    public /* synthetic */ C25356e(C24195n nVar, C25333i iVar) {
        this.f69057a = nVar;
        this.f69058b = iVar;
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
        return C28185a.m52697o(this.f69057a, (PointF) obj, this.f69058b);
    }
}
