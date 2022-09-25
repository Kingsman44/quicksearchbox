package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.gms.wearable.internal.NodeParcelable;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.mv */
/* compiled from: PG */
public final /* synthetic */ class C96415mv implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f269728a;

    public /* synthetic */ C96415mv(String str) {
        this.f269728a = str;
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
        return ((NodeParcelable) obj).f395613a.equals(this.f269728a);
    }
}
