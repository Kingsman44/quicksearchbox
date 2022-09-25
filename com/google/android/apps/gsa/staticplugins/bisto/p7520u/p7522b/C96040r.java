package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.r */
/* compiled from: PG */
public final /* synthetic */ class C96040r implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Optional f268907a;

    public /* synthetic */ C96040r(Optional optional) {
        this.f268907a = optional;
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
        Optional optional = this.f268907a;
        C59071e eVar = C96017bm.f268828a;
        return ((NodeParcelable) obj).f395613a.equals(optional.get());
    }
}
