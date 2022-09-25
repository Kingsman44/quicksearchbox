package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.view.View;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.ba */
/* compiled from: PG */
public final /* synthetic */ class C81991ba implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f224146a;

    /* renamed from: b */
    public final /* synthetic */ View f224147b;

    public /* synthetic */ C81991ba(int i, View view) {
        this.f224146a = i;
        this.f224147b = view;
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
        int i = this.f224146a;
        View view = this.f224147b;
        C81992bb bbVar = (C81992bb) obj;
        int i2 = C81992bb.f224148d;
        return bbVar.f224151c == i && bbVar.f224149a.equals(view);
    }
}
